class Hospital {
    private String name;
    private Doctor[] doctors;
    private int doctorCount;
    private Patient[] patients;
    private int patientCount;

    public Hospital(String name, int maxDoctors, int maxPatients) {
        this.name = name;
        this.doctors = new Doctor[maxDoctors];
        this.doctorCount = 0;
        this.patients = new Patient[maxPatients];
        this.patientCount = 0;
    }

    public void addDoctor(Doctor doctor) {
        if (doctorCount < doctors.length) {
            doctors[doctorCount] = doctor;
            doctorCount++;
        } else {
            System.out.println("Cannot add more doctors.");
        }
    }

    public void addPatient(Patient patient) {
        if (patientCount < patients.length) {
            patients[patientCount] = patient;
            patientCount++;
        } else {
            System.out.println("Cannot add more patients.");
        }
    }

    public void displayHospitalDetails() {
        System.out.println("Hospital: " + name);
        System.out.println("Doctors:");
        for (int i = 0; i < doctorCount; i++) {
            System.out.println("  - " + doctors[i].getName());
        }
        System.out.println("Patients:");
        for (int i = 0; i < patientCount; i++) {
            System.out.println("  - " + patients[i].getName());
        }
    }
}

class Doctor {
    private String name;
    private Patient[] patients;
    private int patientCount;

    public Doctor(String name, int maxPatients) {
        this.name = name;
        this.patients = new Patient[maxPatients];
        this.patientCount = 0;
    }

    public void consult(Patient patient) {
        if (patientCount < patients.length) {
            patients[patientCount] = patient;
            patient.addDoctor(this); // Register doctor in patient
            patientCount++;
            System.out.println("Dr. " + name + " is consulting patient " + patient.getName());
        } else {
            System.out.println("Dr. " + name + " cannot take more patients.");
        }
    }

    public String getName() {
        return name;
    }
}

class Patient {
    private String name;
    private Doctor[] doctors;
    private int doctorCount;

    public Patient(String name, int maxDoctors) {
        this.name = name;
        this.doctors = new Doctor[maxDoctors];
        this.doctorCount = 0;
    }

    public void addDoctor(Doctor doctor) {
        if (doctorCount < doctors.length) {
            doctors[doctorCount] = doctor;
            doctorCount++;
        }
    }

    public String getName() {
        return name;
    }
}

public class HospitalManagement {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("City Hospital", 2, 3);

        Doctor d1 = new Doctor("Smith", 2);
        Doctor d2 = new Doctor("Jones", 2);

        Patient p1 = new Patient("Alice", 2);
        Patient p2 = new Patient("Bob", 2);

        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p1);

        hospital.addDoctor(d1);
        hospital.addDoctor(d2);
        hospital.addPatient(p1);
        hospital.addPatient(p2);

        hospital.displayHospitalDetails();
    }
}