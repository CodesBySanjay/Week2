class Vehicle {
    String ownerName;
    String vehicleType;

    static double registrationFee = 500.0;

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: $" + registrationFee);
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        Vehicle car = new Vehicle("Alice", "Car");
        car.displayVehicleDetails();

        System.out.println("\nUpdating registration fee...");
        Vehicle.updateRegistrationFee(600.0);

        Vehicle bike = new Vehicle("Bob", "Bike");
        bike.displayVehicleDetails();
    }
}