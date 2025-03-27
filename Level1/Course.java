class Course {
    String courseName;
    int duration;
    double fee;
    static String instituteName = "Tech Academy";

    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: $" + fee);
        System.out.println("Institute: " + instituteName);
    }

    static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java Programming", 3, 500);
        Course c2 = new Course("Web Development", 4, 700);

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        updateInstituteName("Global Tech Institute");

        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
