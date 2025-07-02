public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Car("C101", "Alice", 12.5);
        Vehicle v2 = new Bike("B202", "Bob", 8.0);
        Vehicle v3 = new Auto("A303", "Charlie", 10.0);

        printFare(v1, 15);
        printFare(v2, 15);
        printFare(v3, 15);
    }

    public static void printFare(Vehicle vehicle, double distance) {
        System.out.println(vehicle.getVehicleDetails());
        System.out.println("Fare for " + distance + " km: " + vehicle.calculateFare(distance));
    }
}