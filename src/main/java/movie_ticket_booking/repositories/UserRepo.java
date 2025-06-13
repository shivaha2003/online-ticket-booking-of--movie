package movie_ticket_booking.repositories;

import movie_ticket_booking.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long>
{
    User findByEmail(String email);
    User findByPhoneNumber(String phoneNumber);
    User findByEmailAndPassword(String email, String password);
    User findByPhoneNumberAndPassword(String phoneNumber, String password);
}
