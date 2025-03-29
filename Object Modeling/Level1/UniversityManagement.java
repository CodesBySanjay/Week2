class University {
    private String name;
    private Student[] students;
    private int studentCount;
    private Professor[] professors;
    private int professorCount;

    public University(String name, int maxStudents, int maxProfessors) {
        this.name = name;
        this.students = new Student[maxStudents];
        this.studentCount = 0;
        this.professors = new Professor[maxProfessors];
        this.professorCount = 0;
    }

    public void addStudent(Student student) {
        if (studentCount < students.length) {
            students[studentCount] = student;
            studentCount++;
        } else {
            System.out.println("Cannot add more students.");
        }
    }

    public void addProfessor(Professor professor) {
        if (professorCount < professors.length) {
            professors[professorCount] = professor;
            professorCount++;
        } else {
            System.out.println("Cannot add more professors.");
        }
    }

    public void displayDetails() {
        System.out.println("University: " + name);
        System.out.println("Students:");
        for (int i = 0; i < studentCount; i++) {
            System.out.println("  - " + students[i].getName());
        }
        System.out.println("Professors:");
        for (int i = 0; i < professorCount; i++) {
            System.out.println("  - " + professors[i].getName());
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
            System.out.println(name + " enrolled in " + course.getName());
        } else {
            System.out.println(name + " cannot enroll in more courses.");
        }
    }

    public String getName() {
        return name;
    }
}

class Professor {
    private String name;
    private Course[] courses;
    private int courseCount;

    public Professor(String name, int maxCourses) {
        this.name = name;
        this.courses = new Course[maxCourses];
        this.courseCount = 0;
    }

    public void assignCourse(Course course) {
        if (courseCount < courses.length) {
            courses[courseCount] = course;
            course.setProfessor(this);
            courseCount++;
            System.out.println(name + " is assigned to teach " + course.getName());
        } else {
            System.out.println(name + " cannot teach more courses.");
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
    private Professor professor;

    public Course(String name, int maxStudents) {
        this.name = name;
        this.students = new Student[maxStudents];
        this.studentCount = 0;
    }

    public void addStudent(Student student) {
        if (studentCount < students.length) {
            students[studentCount] = student;
            studentCount++;
        }
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getName() {
        return name;
    }
}

class UniversityManagement {
    public static void main(String[] args) {
        University university = new University("Tech University", 2, 2);

        Student s1 = new Student("Alice", 2);
        Student s2 = new Student("Bob", 2);

        Professor p1 = new Professor("Dr. Smith", 2);
        Professor p2 = new Professor("Prof. Johnson", 2);

        Course c1 = new Course("Math", 3);
        Course c2 = new Course("Science", 3);

        s1.enrollCourse(c1);
        s1.enrollCourse(c2);
        s2.enrollCourse(c1);

        p1.assignCourse(c1);
        p2.assignCourse(c2);

        university.addStudent(s1);
        university.addStudent(s2);
        university.addProfessor(p1);
        university.addProfessor(p2);

        university.displayDetails();
    }
}