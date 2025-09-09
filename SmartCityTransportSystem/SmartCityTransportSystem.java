import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class SmartCityTransportSystem {
    static class Location {
        final String name;
        final double lat;
        final double lon;
        Location(String name, double lat, double lon) { this.name = name; this.lat = lat; this.lon = lon; }
        public String toString() { return name; }
    }
    static class Schedule {
        final String serviceId;
        final LocalDateTime departure;
        final LocalDateTime arrival;
        final double fare;
        final Location from;
        final Location to;
        Schedule(String serviceId, LocalDateTime departure, LocalDateTime arrival, double fare, Location from, Location to) {
            this.serviceId = serviceId; this.departure = departure; this.arrival = arrival; this.fare = fare; this.from = from; this.to = to;
        }
        boolean isPeak() {
            LocalTime t = departure.toLocalTime();
            return (t.isAfter(LocalTime.of(6,59)) && t.isBefore(LocalTime.of(10,1)))
                    || (t.isAfter(LocalTime.of(16,59)) && t.isBefore(LocalTime.of(20,1)));
        }
        public String toString() {
            return String.format("[%s] %s -> %s depart:%s fare:%.2f", serviceId, from, to, departure.toLocalTime(), fare);
        }
    }
    static class Booking {
        final String bookingId;
        final String serviceId;
        final String userId;
        final LocalDateTime bookedAt;
        final double fare;
        Booking(String bookingId, String serviceId, String userId, LocalDateTime bookedAt, double fare) {
            this.bookingId = bookingId; this.serviceId = serviceId; this.userId = userId; this.bookedAt = bookedAt; this.fare = fare;
        }
    }
    interface GeoUtils {
        static double calculateDistance(Location a, Location b) {
            double dx = a.lat - b.lat;
            double dy = a.lon - b.lon;
            return Math.sqrt(dx*dx + dy*dy) * 111.0;
        }
    }
    @FunctionalInterface
    interface FareCalculator { double calculateFare(Location from, Location to, double baseFare); }
    interface EmergencyService { }
    interface TransportService {
        String getId();
        String getType();
        List<Schedule> getSchedules();
        default void printServiceDetails() {
            System.out.println("Service: " + getId() + " Type: " + getType());
            getSchedules().forEach(System.out::println);
        }
    }
    static abstract class AbstractService implements TransportService {
        final String id;
        final String type;
        final List<Schedule> schedules = new ArrayList<>();
        AbstractService(String id, String type) { this.id = id; this.type = type; }
        public String getId() { return id; }
        public String getType() { return type; }
        public List<Schedule> getSchedules() { return schedules; }
    }
    static class BusService extends AbstractService { BusService(String id) { super(id, "BUS"); } }
    static class MetroService extends AbstractService { MetroService(String id) { super(id, "METRO"); } }
    static class TaxiService extends AbstractService { TaxiService(String id) { super(id, "TAXI"); } }
    static class AmbulanceService extends AbstractService implements EmergencyService { AmbulanceService(String id) { super(id, "AMBULANCE"); } }
    static class FerryService extends AbstractService { FerryService(String id) { super(id, "FERRY"); } }
    static class TransportRegistry {
        final List<TransportService> services = new ArrayList<>();
        final List<Booking> bookings = new ArrayList<>();
        void register(TransportService s) { services.add(s); }
        List<TransportService> getAllServices() { return Collections.unmodifiableList(services); }
        void addBooking(Booking b) { bookings.add(b); }
        List<Booking> getBookings() { return Collections.unmodifiableList(bookings); }
    }
    public static void main(String[] args) {
        Location A = new Location("Central", 28.61, 77.20);
        Location B = new Location("North", 28.70, 77.14);
        Location C = new Location("East", 28.60, 77.30);
        TransportRegistry registry = new TransportRegistry();
        BusService bus1 = new BusService("BUS-100");
        bus1.getSchedules().add(new Schedule(bus1.getId(), LocalDateTime.now().plusMinutes(15), LocalDateTime.now().plusMinutes(45), 20.0, A, B));
        bus1.getSchedules().add(new Schedule(bus1.getId(), LocalDateTime.now().plusHours(2), LocalDateTime.now().plusHours(2).plusMinutes(30), 18.0, A, C));
        MetroService metro1 = new MetroService("METRO-1");
        metro1.getSchedules().add(new Schedule(metro1.getId(), LocalDateTime.now().plusMinutes(10), LocalDateTime.now().plusMinutes(25), 15.0, A, B));
        metro1.getSchedules().add(new Schedule(metro1.getId(), LocalDateTime.now().plusHours(1), LocalDateTime.now().plusHours(1).plusMinutes(15), 12.0, B, C));
        TaxiService taxi1 = new TaxiService("TAXI-500");
        taxi1.getSchedules().add(new Schedule(taxi1.getId(), LocalDateTime.now().plusMinutes(5), LocalDateTime.now().plusMinutes(40), 120.0, A, C));
        AmbulanceService amb1 = new AmbulanceService("AMB-11");
        amb1.getSchedules().add(new Schedule(amb1.getId(), LocalDateTime.now().plusMinutes(2), LocalDateTime.now().plusMinutes(20), 0.0, A, B));
        FerryService ferry1 = new FerryService("FERRY-9");
        ferry1.getSchedules().add(new Schedule(ferry1.getId(), LocalDateTime.now().plusHours(3), LocalDateTime.now().plusHours(4), 40.0, B, C));
        registry.register(bus1); registry.register(metro1); registry.register(taxi1); registry.register(amb1); registry.register(ferry1);
        FareCalculator distanceBasedFare = (from, to, base) -> {
            double km = GeoUtils.calculateDistance(from, to);
            return base + 2.0 * km;
        };
        double maxFare = 100.0;
        LocalDateTime desiredDepartureEarliest = LocalDateTime.now();
        List<Schedule> allSchedules = registry.getAllServices().stream().flatMap(s -> s.getSchedules().stream()).collect(Collectors.toList());
        List<Schedule> candidate = allSchedules.stream()
                .filter(s -> s.departure.isAfter(desiredDepartureEarliest.minusSeconds(1)))
                .filter(s -> s.fare <= maxFare)
                .sorted(Comparator.comparing(s -> s.departure))
                .collect(Collectors.toList());
        candidate.forEach(System.out::println);
        registry.getAllServices().forEach(service -> { service.printServiceDetails(); System.out.println("----"); });
        if (!candidate.isEmpty()) {
            Schedule chosen = candidate.get(0);
            double computedFare = distanceBasedFare.calculateFare(chosen.from, chosen.to, chosen.fare);
            Booking book = new Booking(UUID.randomUUID().toString(), chosen.serviceId, "user-42", LocalDateTime.now(), computedFare);
            registry.addBooking(book);
            System.out.println("Booked: " + book.bookingId + " on " + book.serviceId + " fare:" + String.format("%.2f", book.fare));
        }
        registry.addBooking(new Booking(UUID.randomUUID().toString(), "BUS-100", "user-1", LocalDateTime.now().minusHours(1), 20.0));
        registry.addBooking(new Booking(UUID.randomUUID().toString(), "METRO-1", "user-2", LocalDateTime.now().minusMinutes(30), 15.0));
        registry.addBooking(new Booking(UUID.randomUUID().toString(), "TAXI-500", "user-3", LocalDateTime.now().minusMinutes(10), 120.0));
        registry.addBooking(new Booking(UUID.randomUUID().toString(), "FERRY-9", "user-4", LocalDateTime.now().minusMinutes(5), 40.0));
        Map<String, List<Booking>> bookingsByService = registry.getBookings().stream().collect(Collectors.groupingBy(b -> b.serviceId));
        bookingsByService.forEach((svc, list) -> {
            double total = list.stream().mapToDouble(b -> b.fare).sum();
            double avg = list.stream().mapToDouble(b -> b.fare).average().orElse(0.0);
            System.out.printf("Service: %s bookings:%d totalRevenue:%.2f avgFare:%.2f%n", svc, list.size(), total, avg);
        });
        Map<Boolean, List<Booking>> peakPartition = registry.getBookings().stream().collect(Collectors.partitioningBy(b -> {
            Optional<Schedule> s = allSchedules.stream().filter(sc -> sc.serviceId.equals(b.serviceId)).findFirst();
            return s.map(Schedule::isPeak).orElse(false);
        }));
        System.out.println("Peak bookings count: " + peakPartition.get(true).size() + " Non-peak: " + peakPartition.get(false).size());
        DoubleSummaryStatistics stats = registry.getBookings().stream().collect(Collectors.summarizingDouble(b -> b.fare));
        System.out.println("Fare summary: count=" + stats.getCount() + " sum=" + stats.getSum() + " avg=" + stats.getAverage() + " max=" + stats.getMax());
        List<TransportService> emergencyServices = registry.getAllServices().stream().filter(svc -> svc instanceof EmergencyService).collect(Collectors.toList());
        emergencyServices.forEach(s -> System.out.println("Emergency service available: " + s.getId()));
        registry.getAllServices().stream().filter(svc -> svc instanceof EmergencyService).flatMap(svc -> svc.getSchedules().stream()).forEach(schedule -> System.out.println("Prioritizing emergency schedule: " + schedule));
        registry.getAllServices().stream().filter(svc -> "FERRY".equals(svc.getType())).forEach(TransportService::printServiceDetails);
        Consumer<String> logger = System.out::println;
        logger.accept("System summary complete. Services: " + registry.getAllServices().size());
        double d = GeoUtils.calculateDistance(A, C);
        System.out.printf("Distance between %s and %s ≈ %.2f km%n", A, C, d);
    }
}