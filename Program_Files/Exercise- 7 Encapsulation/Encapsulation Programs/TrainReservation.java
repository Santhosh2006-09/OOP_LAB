class TrainTicket {
    private String trainNumber;
    private int availableSeats;

    public TrainTicket(String trainNumber, int availableSeats) {
        this.trainNumber = trainNumber;
        this.availableSeats = availableSeats;
    }

    public String getTrainNumber() {
        return trainNumber;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void bookTicket(int seats) {
        if (seats > 0 && seats <= availableSeats) {
            availableSeats -= seats;
            System.out.println(seats + " ticket(s) booked successfully.");
        } else {
            System.out.println("Not enough seats available.");
        }
    }
}

public class TrainReservation {
    public static void main(String[] args) {
        TrainTicket ticket = new TrainTicket("TR123", 50);

        System.out.println("Train: " + ticket.getTrainNumber());
        System.out.println("Available Seats: " + ticket.getAvailableSeats());

        ticket.bookTicket(5);
        System.out.println("Updated Available Seats: " + ticket.getAvailableSeats());
    }
}
