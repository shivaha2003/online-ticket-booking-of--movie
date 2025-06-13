package movie_ticket_booking.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
public class Shows extends BaseModel{

    private Date start_time;
    private Date end_time;
    @ManyToOne
    private Auditorium auditorium;
    @ManyToOne
    private Movie movie;
    @Enumerated(EnumType.ORDINAL)
    private Language language;
}



