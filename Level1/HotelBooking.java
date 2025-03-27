class HotelBooking{
    String guestName;
    String roomType;
    int nights;

    HotelBooking(){
        this.guestName = "Mark";
        this.roomType = "VIP Suite";
        this.nights = 5;
    }

    HotelBooking(String guestName, String roomType, int nights){
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    HotelBooking(HotelBooking nextGuest){
        this.guestName = nextGuest.guestName;
        this.roomType = nextGuest.roomType;
        this.nights = nextGuest.nights;
    }

    void display(){
        System.out.println("Guest name : "+guestName);
        System.out.println("Room type : "+roomType);
        System.out.println("Nights : "+nights);
    }

    public static void main(String[] args) {
        HotelBooking guest1 = new HotelBooking();
        guest1.display();
        HotelBooking guest2 = new HotelBooking("Sara", "Premium", 2);
        guest2.display();
        HotelBooking guest3 = new HotelBooking(guest2);
        guest3.display();
    }
}