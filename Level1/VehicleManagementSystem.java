interface Refuelable {
    void refuel();
}

class Vehicle {
    int maxSpeed;
    String model;

    Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

class ElectricVehicle extends Vehicle {
    int batteryCapacity;

    ElectricVehicle(int maxSpeed, String model, int batteryCapacity) {
        super(maxSpeed, model);
        this.batteryCapacity = batteryCapacity;
    }

    void charge() {
        System.out.println("Charging Electric Vehicle");
        displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {
    int fuelCapacity;

    PetrolVehicle(int maxSpeed, String model, int fuelCapacity) {
        super(maxSpeed, model);
        this.fuelCapacity = fuelCapacity;
    }

    public void refuel() {
        System.out.println("Refueling Petrol Vehicle");
        displayDetails();
        System.out.println("Fuel Capacity: " + fuelCapacity + " liters");
    }
}

class Main {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle(180, "Tesla Model 3", 75);
        PetrolVehicle pv = new PetrolVehicle(200, "Honda Civic", 50);

        ev.charge();
        System.out.println();
        pv.refuel();
    }
}
