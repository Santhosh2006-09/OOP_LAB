interface FlightBooking {
    void bookTicket(String destination);
}

class DomesticFlight implements FlightBooking {
    public void bookTicket(String destination) {
        System.out.println("Domestic flight booked to: " + destination);
    }
}

class InternationalFlight implements FlightBooking {
    public void bookTicket(String destination) {
        System.out.println("International flight booked to: " + destination);
    }
}

public class FlightReservationSystem {
    public static void main(String[] args) {
        FlightBooking domestic = new DomesticFlight();
        FlightBooking international = new InternationalFlight();

        domestic.bookTicket("New York");
        international.bookTicket("London");
    }
}
