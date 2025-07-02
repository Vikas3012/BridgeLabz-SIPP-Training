public class PartTimeEmployee extends Employee{
    private int hourlyWork;
    private double hourlyRate;
    public PartTimeEmployee(int employeeId, String employeeName, double hourlyRate, int hoursWork) {
        super( employeeId,employeeName , hourlyRate,hoursWork);
        setHourlyRate(hourlyRate);
        setHoursWorked(hoursWork);
    }

    @Override
    public double calculateSalary() {
        return hourlyWork * hourlyRate;
    }

    @Override
    public String departmentDetails() {
        return getDepartmentDetails();

    }

    public void setHoursWorked(int hoursWorked) {
        if(hoursWorked < 0) {
            throw new IllegalArgumentException("Hours worked cannot be negative.");
        }
        this.hourlyWork = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;

    }

    public void setHourlyRate(double hourlyRate) {
        if(hourlyRate < 0) {
            throw new IllegalArgumentException("Hourly rate cannot be negative.");
        }
        this.hourlyRate = hourlyRate;
    }


}
