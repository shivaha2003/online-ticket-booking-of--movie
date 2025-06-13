package movie_ticket_booking.Dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Setter
@Getter

public class BookMovieReqDto {
    Long UserId;
    Long showId;
    List<Long> showSeatIds;

}
