package movie_ticket_booking.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ShowSeat extends BaseModel{
    public movie_ticket_booking.models.ShowSeatStatus ShowSeatStatus;
    @ManyToOne
    private Shows show;
    @ManyToOne
    private Seats seat;
    @Enumerated(EnumType.ORDINAL)
    @Column(insertable = false, updatable = false)
    private ShowSeatStatus showSeatStatus;

    private int price;
}
