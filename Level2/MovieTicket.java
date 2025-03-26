class MovieTicket {
    private String movieName;
    private int seatNumber;
    private double price;
    private boolean isBooked;

    public MovieTicket(String movieName) {
        this.movieName = movieName;
        this.isBooked = false;
    }

    public void bookTicket(int seatNumber, double price) {
        if (!isBooked) {
            this.seatNumber = seatNumber;
            this.price = price;
            this.isBooked = true;
            System.out.println("Ticket booked successfully!");
        } else {
            System.out.println("Seat already booked.");
        }
    }

    public void displayTicket() {
        if (isBooked) {
            System.out.println("Movie: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: ₹" + price);
        } else {
            System.out.println("No ticket booked.");
        }
    }

    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket("Inception");
        ticket.displayTicket();

        ticket.bookTicket(12, 250.0);
        ticket.displayTicket();

        ticket.bookTicket(15, 300.0);
    }
}