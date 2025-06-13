package movie_ticket_booking.repositories;

import movie_ticket_booking.models.SeatType;
import movie_ticket_booking.models.ShowSeat;
import movie_ticket_booking.models.Shows;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShowSeatTypeRepo extends JpaRepository<ShowSeat, Long> {

    List<SeatType> findByShow(Shows show);
}
