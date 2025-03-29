class Company {
    private String name;
    private Department[] departments;
    private int deptCount;

    public Company(String name, int maxDepartments) {
        this.name = name;
        this.departments = new Department[maxDepartments];
        this.deptCount = 0;
    }

    public void addDepartment(String deptName, int maxEmployees) {
        if (deptCount < departments.length) {
            departments[deptCount] = new Department(deptName, maxEmployees);
            deptCount++;
        } else {
            System.out.println("Cannot add more departments.");
        }
    }

    public void displayCompanyDetails() {
        System.out.println("Company: " + name);
        for (int i = 0; i < deptCount; i++) {
            departments[i].displayDepartmentDetails();
        }
    }

    public void closeCompany() {
        for (int i = 0; i < deptCount; i++) {
            departments[i] = null;
        }
        deptCount = 0;
        System.out.println("Company " + name + " is closed. All departments and employees are removed.");
    }

    private class Department {
        private String name;
        private Employee[] employees;
        private int empCount;

        public Department(String name, int maxEmployees) {
            this.name = name;
            this.employees = new Employee[maxEmployees];
            this.empCount = 0;
        }

        public void addEmployee(String empName) {
            if (empCount < employees.length) {
                employees[empCount] = new Employee(empName);
                empCount++;
            } else {
                System.out.println("Cannot add more employees to " + name + " department.");
            }
        }

        public void displayDepartmentDetails() {
            System.out.println("  Department: " + name);
            for (int i = 0; i < empCount; i++) {
                System.out.println("    Employee: " + employees[i].getName());
            }
        }

        private class Employee {
            private String name;

            public Employee(String name) {
                this.name = name;
            }

            public String getName() {
                return name;
            }
        }
    }

    public static void main(String[] args) {
        Company company = new Company("TechCorp", 2);
        company.addDepartment("IT", 2);
        company.addDepartment("HR", 2);

        company.departments[0].addEmployee("Alice");
        company.departments[0].addEmployee("Bob");
        company.departments[1].addEmployee("Charlie");

        company.displayCompanyDetails();
        company.closeCompany();
    }
}