class Employee{
    private static String companyName = "Mex";
    private String name;
    private final int id;
    private String designation;
    private static int totalEmployees;

    Employee(String name, int id, String designation){
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    public void displayDetails(){
        System.out.println("\nEmployee Name: "+name);
        System.out.println("Employee ID: "+id);
        System.out.println("Employee Designation: "+designation);
    }
    public static void displayTotalEmployees(){
        System.out.println("\nTotal employees: "+totalEmployees);
    }

    public static void main(String[] args){
        System.out.println("Company Name: "+companyName);
        Employee emp1 = new Employee("Sid", 8271, "Senior Analyst");
        Employee emp2 = new Employee("Alisa", 928, "Accountant");
        if (emp1 instanceof Employee) emp1.displayDetails();
        if (emp2 instanceof Employee) emp2.displayDetails();
        displayTotalEmployees();
    }
}