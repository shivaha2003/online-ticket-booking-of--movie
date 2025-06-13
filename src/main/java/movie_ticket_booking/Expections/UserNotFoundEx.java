package movie_ticket_booking.Expections;

public class UserNotFoundEx extends RuntimeException{
    public UserNotFoundEx(String message) {
        super(message);
    }
}
