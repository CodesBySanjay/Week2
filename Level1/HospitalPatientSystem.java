import java.util.*;

abstract class Patient {
    private int patientId;
    private String name;
    private int age;
    private String diagnosis;
    private List<String> medicalHistory = new ArrayList<>();

    public Patient(int patientId, String name, int age, String diagnosis) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    public String getPatientDetails() {
        return "ID: " + patientId + ", Name: " + name + ", Age: " + age + ", Diagnosis: " + diagnosis;
    }

    public void addToHistory(String record) {
        medicalHistory.add(record);
    }

    public List<String> getMedicalHistory() {
        return medicalHistory;
    }

    public abstract double calculateBill();
}

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private double dailyRate;

    public InPatient(int patientId, String name, int age, String diagnosis, int daysAdmitted, double dailyRate) {
        super(patientId, name, age, diagnosis);
        this.daysAdmitted = daysAdmitted;
        this.dailyRate = dailyRate;
    }

    public double calculateBill() {
        return daysAdmitted * dailyRate;
    }

    public void addRecord(String record) {
        addToHistory(record);
    }

    public void viewRecords() {
        for (String rec : getMedicalHistory()) {
            System.out.println(rec);
        }
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;

    public OutPatient(int patientId, String name, int age, String diagnosis, double consultationFee) {
        super(patientId, name, age, diagnosis);
        this.consultationFee = consultationFee;
    }

    public double calculateBill() {
        return consultationFee;
    }

    public void addRecord(String record) {
        addToHistory(record);
    }

    public void viewRecords() {
        for (String rec : getMedicalHistory()) {
            System.out.println(rec);
        }
    }
}

public class HospitalPatientSystem {
    public static void main(String[] args) {
        Patient inPatient = new InPatient(101, "Sanjay", 30, "Appendicitis", 4, 1500);
        Patient outPatient = new OutPatient(102, "Asha", 25, "Flu", 300);

        MedicalRecord record1 = (MedicalRecord) inPatient;
        MedicalRecord record2 = (MedicalRecord) outPatient;

        record1.addRecord("Appendix surgery completed.");
        record2.addRecord("Flu medication prescribed.");

        System.out.println(inPatient.getPatientDetails());
        System.out.println("InPatient Bill: ₹" + inPatient.calculateBill());
        record1.viewRecords();

        System.out.println();

        System.out.println(outPatient.getPatientDetails());
        System.out.println("OutPatient Bill: ₹" + outPatient.calculateBill());
        record2.viewRecords();
    }
}
