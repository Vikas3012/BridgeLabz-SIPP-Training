public class Bike extends Vehicle implements Insurable {
    public Bike(String vehicleNumber, double rentalRate, String insuranceNumber) {
        super(vehicleNumber, "Bike", rentalRate);
        setInsurancePolicyNumber(insuranceNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 500.0;
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Policy: " + getInsurancePolicyNumber();
    }
}
