package movie_ticket_booking.models;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class Booking extends BaseModel{

    private List<ShowSeat> showSeats;
    private User    user;
    private double  totalPrice;
    private List<Payment> payments;
    @Enumerated(EnumType.ORDINAL)
    private BookingStatus status;

    public Booking(User user, Shows show    , List<ShowSeat> seats) {
        super();
    }
}
