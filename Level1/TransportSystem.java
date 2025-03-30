class Vehicle{
    double maxSpeed;
    String fuelType;

    void displayInfo(){
        System.out.println("Max Speed: "+maxSpeed);
        System.out.println("Fuel Type: "+fuelType);
    }
}

class Car extends Vehicle {
    int seatCapacity;

    Car(double maxSpeed, String fuelType, int seatCapacity) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
        this.seatCapacity = seatCapacity;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}

class Truck extends Vehicle {
    double loadCapacity;

    Truck(double maxSpeed, String fuelType, double loadCapacity) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
        this.loadCapacity = loadCapacity;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}

class Motorcycle extends Vehicle {
    boolean hasCarrier;

    Motorcycle(double maxSpeed, String fuelType, boolean hasCarrier) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
        this.hasCarrier = hasCarrier;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Has Carrier: " + (hasCarrier ? "Yes" : "No"));
    }
}

public class TransportSystem {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car(180, "Petrol", 5);
        vehicles[1] = new Truck(120, "Diesel", 15);
        vehicles[2] = new Motorcycle(100, "Petrol", true);

        for (Vehicle v : vehicles) {
            v.displayInfo();
        }
    }
}