package movie_ticket_booking.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Seats extends BaseModel {
    private String seatNumber;
     @Column(name = "rowzz")
    private int rowNumber;
     @Column(name = "columnzz")
    private int columnNumber;
    @ManyToOne
    private SeatType seatType;
   
    private ShowSeatStatus showSeatStatus;
}
