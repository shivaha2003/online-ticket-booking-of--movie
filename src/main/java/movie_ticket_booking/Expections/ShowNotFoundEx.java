package movie_ticket_booking.Expections;

public class ShowNotFoundEx extends RuntimeException{
    public ShowNotFoundEx(String message) {
        super(message);
    }
}
