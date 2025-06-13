package movie_ticket_booking.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
public class Auditorium extends BaseModel{
    private String auditoriumName;
    private int totalSeats;
    private int totalRows;
    private int totalColumns;
    @OneToMany
    private List<Seats> seats;
    @Enumerated(EnumType.STRING)
    @ElementCollection
    private List<Feature> features;



}