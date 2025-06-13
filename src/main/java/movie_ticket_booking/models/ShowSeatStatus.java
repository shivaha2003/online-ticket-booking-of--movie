package movie_ticket_booking.models;

import lombok.Getter;
import lombok.Setter;


public enum ShowSeatStatus {
    AVAILABLE,
    BOOKED,
    BLOCKED,
    RESERVED,
    NOT_AVAILABLE,
}
