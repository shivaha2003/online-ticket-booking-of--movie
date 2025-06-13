package movie_ticket_booking.repositories;

import movie_ticket_booking.models.ShowSeat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface ShowSeatRepo extends JpaRepository<ShowSeat, Long> {
}
