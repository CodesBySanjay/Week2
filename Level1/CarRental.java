class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double dailyRate;

    CarRental(String customerName, String carModel, int rentalDays, double dailyRate) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.dailyRate = dailyRate;
    }

    double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    void displayDetails() {
        System.out.println("Customer: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: $" + calculateTotalCost());
    }

    public static void main(String[] args) {
        CarRental rental = new CarRental("John Doe", "Toyota Camry", 5, 40.0);
        rental.displayDetails();
    }
}