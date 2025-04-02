abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public abstract double calculateRentalCost(int days);
}

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

class Car extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    public double calculateInsurance() {
        return 3000;
    }

    public String getInsuranceDetails() {
        return "Policy: " + insurancePolicyNumber + ", Coverage: Full";
    }
}

class Bike extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Bike(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Bike", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    public double calculateInsurance() {
        return 1000;
    }

    public String getInsuranceDetails() {
        return "Policy: " + insurancePolicyNumber + ", Coverage: Basic";
    }
}

class Truck extends Vehicle {
    public Truck(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Truck", rentalRate);
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days + 500 * days;
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car("TN01AB1234", 1500, "CAR123POLICY"),
            new Bike("TN09XY4321", 500, "BIKE456POLICY"),
            new Truck("TN10TR0987", 2500)
        };

        for (Vehicle v : vehicles) {
            double rentalCost = v.calculateRentalCost(5);
            System.out.println(v.getType() + " " + v.getVehicleNumber() + " - Rental: " + rentalCost);
            if (v instanceof Insurable) {
                Insurable i = (Insurable) v;
                System.out.println("Insurance: " + i.calculateInsurance());
                System.out.println("Details: " + i.getInsuranceDetails());
            }
        }
    }
}