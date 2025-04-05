class RideBooking {
    void bookRide(String destination) {
        System.out.println("Booking ride to " + destination);
    }

    void bookRide(String pickup, String destination) {
        System.out.println("Booking ride from " + pickup + " to " + destination);
    }

    void bookRide(String pickup, String destination, String type) {
        System.out.println("Booking " + type + " ride from " + pickup + " to " + destination);
    }
}

public class RideApp {
    public static void main(String[] args) {
        RideBooking ride = new RideBooking();

        ride.bookRide("Downtown");
        ride.bookRide("Home", "Downtown");
        ride.bookRide("Home", "Downtown", "Luxury");
    }
}
