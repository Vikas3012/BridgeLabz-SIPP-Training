public abstract class Vehicle {
    private final String vehicleNumber;
    private String type;
    private double rentalRate;
    private String insurancePolicyNumber;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        setType(type);
        setRentalRate(rentalRate);
    }

    public abstract double calculateRentalCost(int days);

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (type == null || type.isEmpty()) throw new IllegalArgumentException("Invalid type");
        this.type = type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        if (rentalRate < 0) throw new IllegalArgumentException("Invalid rate");
        this.rentalRate = rentalRate;
    }

    protected void setInsurancePolicyNumber(String number) {
        if (number == null || number.isEmpty()) throw new IllegalArgumentException("Invalid insurance number");
        this.insurancePolicyNumber = number;
    }

    protected String getInsurancePolicyNumber() {
        return insurancePolicyNumber;
    }
}
