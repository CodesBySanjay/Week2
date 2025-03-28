class Student{
    private static String universityName = "SRM";
    private static int totalStudents;
    private String name;
    private final int rollNumber;
    private char grade;

    Student(String name, int rollNumber, char grade){
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    public void displayDetails(){
        System.out.println("\nName: "+name);
        System.out.println("Roll Number: "+rollNumber);
        System.out.println("Grade: "+grade);
    }

    public static void displayTotalStudents(){
        System.out.println("\nTotal number of students: "+totalStudents);
    }

    public static void main(String[] args) {
        System.out.println("University: "+universityName);
        Student s1 = new Student("Alice", 1, 'A');
        Student s2 = new Student("Mark", 2, 'F');
        Student s3 = new Student("Bob", 3, 'C');
        if (s1 instanceof Student) s1.displayDetails();
        if (s2 instanceof Student) s2.displayDetails();
        if (s3 instanceof Student) s3.displayDetails();
        displayTotalStudents();
    }
}
