public class Car extends Vehicle implements Insurable {
    public Car(String vehicleNumber, double rentalRate, String insuranceNumber) {
        super(vehicleNumber, "Car", rentalRate);
        setInsurancePolicyNumber(insuranceNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 1500.0;
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Policy: " + getInsurancePolicyNumber();
    }
}
