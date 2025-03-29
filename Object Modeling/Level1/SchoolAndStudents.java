class School {
    private String name;
    private Student[] students;
    private int studentCount;

    public School(String name, int maxStudents) {
        this.name = name;
        this.students = new Student[maxStudents];
        this.studentCount = 0;
    }

    public void addStudent(Student student) {
        if (studentCount < students.length) {
            students[studentCount] = student;
            studentCount++;
        } else {
            System.out.println("Cannot add more students.");
        }
    }

    public void displayStudents() {
        System.out.println("School: " + name);
        for (int i = 0; i < studentCount; i++) {
            students[i].displayCourses();
        }
    }
}

class Student {
    private String name;
    private Course[] courses;
    private int courseCount;

    public Student(String name, int maxCourses) {
        this.name = name;
        this.courses = new Course[maxCourses];
        this.courseCount = 0;
    }

    public void enrollCourse(Course course) {
        if (courseCount < courses.length) {
            courses[courseCount] = course;
            course.addStudent(this);
            courseCount++;
        } else {
            System.out.println(name + " cannot enroll in more courses.");
        }
    }

    public void displayCourses() {
        System.out.println("Student: " + name);
        for (int i = 0; i < courseCount; i++) {
            System.out.println("  Enrolled in: " + courses[i].getName());
        }
    }

    public String getName() {
        return name;
    }
}

class Course {
    private String name;
    private Student[] students;
    private int studentCount;

    public Course(String name, int maxStudents) {
        this.name = name;
        this.students = new Student[maxStudents];
        this.studentCount = 0;
    }

    public void addStudent(Student student) {
        if (studentCount < students.length) {
            students[studentCount] = student;
            studentCount++;
        } else {
            System.out.println("Course " + name + " is full.");
        }
    }

    public void displayStudents() {
        System.out.println("Course: " + name);
        for (int i = 0; i < studentCount; i++) {
            System.out.println("  Student: " + students[i].getName());
        }
    }

    public String getName() {
        return name;
    }
}

public class SchoolAndStudents {
    public static void main(String[] args) {
        School school = new School("Greenwood High", 3);

        Student s1 = new Student("Alice", 2);
        Student s2 = new Student("Bob", 2);

        Course c1 = new Course("Math", 3);
        Course c2 = new Course("Science", 3);

        s1.enrollCourse(c1);
        s1.enrollCourse(c2);
        s2.enrollCourse(c1);

        school.addStudent(s1);
        school.addStudent(s2);

        school.displayStudents();
        c1.displayStudents();
        c2.displayStudents();
    }
}