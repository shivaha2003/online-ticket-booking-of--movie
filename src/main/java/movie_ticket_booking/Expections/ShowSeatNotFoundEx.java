package movie_ticket_booking.Expections;

public class ShowSeatNotFoundEx extends RuntimeException{
    public ShowSeatNotFoundEx(String message) {
        super(message);
    }
}
