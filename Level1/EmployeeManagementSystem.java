abstract class Employee{
    private int employeeId;
    private String name;
    private double baseSalary;

    public int getEmployeeId(){
        return employeeId;
    }
    public void setEmployeeId(int employeeId){
        this.employeeId = employeeId;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public double getBaseSalary(){
        return baseSalary;
    }
    public void setBaseSalary(double baseSalary){
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();

    public void displayDetails(){
        System.out.println("Employee ID: "+employeeId);
        System.out.println("Name: "+name);
        System.out.println("Base Salary: "+baseSalary);
    }
}

interface Department{
    void assignDepartment();
    void getDepartmentDetails();
}

class FullTimeEmployee extends Employee implements Department{
    @Override
    public double calculateSalary(){
        return getBaseSalary();
    }
    @Override
    public void assignDepartment(){
        System.out.println("Assigned to: Development");
    }

    @Override
    public void getDepartmentDetails(){
        System.out.println("Department: Development");
    }
}

class PartTimeEmployee extends Employee implements Department{
    private int hoursWorked;
    private double hourlyRate;
    
    @Override
    public double calculateSalary(){
        return getHoursWorked() * getHourlyRate();
    }

    @Override
    public void assignDepartment(){
        System.out.println("Assigned to: Support");
    }

    @Override
    public void getDepartmentDetails(){
        System.out.println("Department: Support");
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}

class Main{
    public static void main(String[] args) {
        Employee[] employees = new Employee[2];

        FullTimeEmployee perm = new FullTimeEmployee();
        perm.setEmployeeId(1);
        perm.setName("Robert");
        perm.setBaseSalary(15000);

        PartTimeEmployee temp = new PartTimeEmployee();
        temp.setEmployeeId(2);
        temp.setName("Garrett");
        temp.setBaseSalary(0);
        temp.setHoursWorked(78);
        temp.setHourlyRate(20.5);

        employees[0] = perm;
        employees[1] = temp;

        for(Employee emp : employees){
            emp.displayDetails();
            System.out.println("Employee Salary: "+emp.calculateSalary());
            Department dept = (Department) emp;
            dept.assignDepartment();
            dept.getDepartmentDetails();
        }
    }
}