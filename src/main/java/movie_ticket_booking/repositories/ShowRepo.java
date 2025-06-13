package movie_ticket_booking.repositories;

import movie_ticket_booking.models.Shows;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;
@Repository

public interface ShowRepo extends JpaRepository<Shows, Long> {
}
