public abstract  class Employee implements IDepartment{
    private String employeeName;
    private final int  employeeId;
    private double baseSalary;

    private String department;


    public Employee(int employeeId, String employeeName, double baseSalary) {
        this.employeeId = employeeId;

    }

    public Employee(int employeeId, String name, double baseSalary, int employeeId1) {

        this.employeeId = employeeId1;
    }


    public abstract double calculateSalary();


    public void display(){
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + employeeName);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Department: " + getDepartmentDetails());
        System.out.println("Calculated Salary: " + calculateSalary());
    }


    public  String  getEmployeeName(){
        return employeeName;
    }


    public void setEmployeeName(String employeeName){
        if(employeeName == null || employeeName.isEmpty()){
            throw new IllegalArgumentException("Name cannot empty");
        }
        this.employeeName = employeeName;
    }
    public double getBaseSalary(){
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }


    public  int getEmployeeId(){
        return employeeId;
    }

    @Override
    public void assignDepartment(String departmentName){
        this.department = departmentName;
    }

    public String getDepartmentDetails() {
       return department == null ? "not assign " : department;
    }
}


