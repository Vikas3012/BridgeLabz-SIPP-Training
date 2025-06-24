public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;

    // Constructors
    public CarRental() {
        this("Unknown", "Sedan", 1);
    }

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Calculate cost
    public double calculateCost() {
        double ratePerDay = switch (carModel.toLowerCase()) {
            case "suv" -> 1000.0;
            case "sedan" -> 800.0;
            case "hatchback" -> 600.0;
            default -> 500.0;
        };
        return ratePerDay * rentalDays;
    }

    public void display() {
        System.out.println("Customer: " + customerName + ", Car: " + carModel + ", Days: " + rentalDays +
                ", Total Cost: ₹" + calculateCost());
    }
}
