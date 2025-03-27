class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    public void displayInfo() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
    }
}
public class EmployeeRecords {
    public static void main(String[] args) {
        Manager mgr = new Manager(101, "HR", 50000.0);
        mgr.displayInfo();
        mgr.setSalary(55000.0);
        System.out.println("Updated Salary: " + mgr.getSalary());
    }
}