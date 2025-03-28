class Patient{
    private static String hospitalName = "SIMS Global";
    private static int totalPatients;
    private String name;
    private int age;
    private String ailment;
    private final int patientID;;

    Patient(String name, int age, String ailment, int patientID){
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    public void displayDetails(){
        System.out.println("\nName: "+name);
        System.out.println("Age: "+age);
        System.out.println("Ailment: "+ailment);
    }

    public static void getTotalPatients(){
        System.out.println("\nTotal number of patients: "+totalPatients);
    }

    public static void main(String[] args) {
        System.out.println("Hospital: "+hospitalName);
        Patient p1 = new Patient("Alice", 1, "Fever",9273);
        Patient p2 = new Patient("Mark", 2, "Cough",27382);
        Patient p3 = new Patient("Bob", 3, "Headache",7634);
        if (p1 instanceof Patient) p1.displayDetails();
        if (p2 instanceof Patient) p2.displayDetails();
        if (p3 instanceof Patient) p3.displayDetails();
        getTotalPatients();
    }
}
