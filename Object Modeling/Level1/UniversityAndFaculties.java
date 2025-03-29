class University {
    private String name;
    private Department[] departments;
    private int deptCount;
    private Faculty[] faculties;
    private int facultyCount;

    public University(String name, int maxDepartments, int maxFaculties) {
        this.name = name;
        this.departments = new Department[maxDepartments];
        this.deptCount = 0;
        this.faculties = new Faculty[maxFaculties];
        this.facultyCount = 0;
    }

    public void addDepartment(String deptName) {
        if (deptCount < departments.length) {
            departments[deptCount] = new Department(deptName);
            deptCount++;
        } else {
            System.out.println("Cannot add more departments.");
        }
    }

    public void addFaculty(Faculty faculty) {
        if (facultyCount < faculties.length) {
            faculties[facultyCount] = faculty;
            facultyCount++;
        } else {
            System.out.println("Cannot add more faculty members.");
        }
    }

    public void displayUniversityDetails() {
        System.out.println("University: " + name);
        System.out.println("Departments:");
        for (int i = 0; i < deptCount; i++) {
            departments[i].displayDepartment();
        }
        System.out.println("Faculties:");
        for (int i = 0; i < facultyCount; i++) {
            System.out.println("  Faculty: " + faculties[i].getName());
        }
    }

    public void closeUniversity() {
        for (int i = 0; i < deptCount; i++) {
            departments[i] = null;
        }
        deptCount = 0;
        System.out.println("University " + name + " is closed. All departments are deleted.");
    }

    private class Department {
        private String name;

        public Department(String name) {
            this.name = name;
        }

        public void displayDepartment() {
            System.out.println("  - " + name);
        }
    }
}

class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class UniversityAndFaculties {
    public static void main(String[] args) {
        University university = new University("Tech University", 2, 3);

        Faculty f1 = new Faculty("Dr. Smith");
        Faculty f2 = new Faculty("Prof. Johnson");

        university.addDepartment("Computer Science");
        university.addDepartment("Mathematics");

        university.addFaculty(f1);
        university.addFaculty(f2);

        university.displayUniversityDetails();
        university.closeUniversity();
    }
}