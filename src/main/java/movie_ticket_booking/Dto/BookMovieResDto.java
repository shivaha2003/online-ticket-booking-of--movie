package movie_ticket_booking.Dto;

import lombok.Getter;
import lombok.Setter;
import movie_ticket_booking.models.BookingStatus;
import movie_ticket_booking.models.TicketStatus;
@Setter
@Getter


public class BookMovieResDto {
    private Long bookingId;
    private double amount;
    private BookingStatus ticketStatus;

}
