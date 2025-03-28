class Vehicle{
    private static double registrationFee = 100.0;
    private String ownerName;
    private String vehicleType;
    private double fees;
    private final int registrationNumber;

    Vehicle(String ownerName, String vehicleType, int registrationNumber){
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
        updateRegistrationFee(vehicleType);
    }

    public void displayDetails(){
        System.out.println("\nName: "+ownerName);
        System.out.println("Registration Number: "+registrationNumber);
        System.out.println("Vehicle Type: "+vehicleType);
        System.out.println("Registration Fees: "+fees);
    }

    public void updateRegistrationFee(String vehicleType){
        if(vehicleType.equalsIgnoreCase("Car")) fees = registrationFee + 2000.0;
        else if(vehicleType.equalsIgnoreCase("Bike")) fees = registrationFee + 1500.0;
        else fees = registrationFee + 1000.0;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("James", "Car", 8634);
        Vehicle v2 = new Vehicle("Maurice", "Truck", 7271);
        Vehicle v3 = new Vehicle("Sana", "Bike", 1001);
        if (v1 instanceof Vehicle) v1.displayDetails();
        if (v2 instanceof Vehicle) v2.displayDetails();
    }
}
