public class VehicleRentalSystemMain {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car("KA01AB1234", 1000, "CAR789");
        vehicles[1] = new Bike("KA02XY4567", 300, "BIKE456");
        vehicles[2] = new Truck("KA03TR8901", 2500);

        int rentalDays = 5;

        for (Vehicle v : vehicles) {
            System.out.println("Vehicle: " + v.getType() + " (" + v.getVehicleNumber() + ")");
            double rentalCost = v.calculateRentalCost(rentalDays);
            System.out.println("Rental for " + rentalDays + " days: ₹" + rentalCost);

            if (v instanceof Insurable) {
                Insurable ins = (Insurable) v;
                System.out.println("Insurance: ₹" + ins.calculateInsurance());
                System.out.println(ins.getInsuranceDetails());
            } else {
                System.out.println("Insurance: Not Applicable");
            }

        }
    }
}
