package movie_ticket_booking.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class SeatType extends  BaseModel{
    @ManyToOne
    private Shows show;
    private String seatTypeName;
    private int price;

    public Seats getSeatType() {
        return null;
    }
}
