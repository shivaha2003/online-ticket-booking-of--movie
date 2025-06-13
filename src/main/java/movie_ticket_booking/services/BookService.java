package movie_ticket_booking.services;

import lombok.Getter;
import lombok.Setter;
import movie_ticket_booking.Expections.ShowNotFoundEx;
import movie_ticket_booking.Expections.UserNotFoundEx;
import movie_ticket_booking.models.*;
import movie_ticket_booking.repositories.ShowRepo;
import movie_ticket_booking.repositories.ShowSeatRepo;
import movie_ticket_booking.repositories.UserRepo;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Getter
@Setter
@Service
@RestController
@RequestMapping("/book")
public class BookService {
    ShowSeatRepo showSeatRepo;
    ShowRepo showRepo;
    UserRepo userRepo;
    PriceCalculatorService priceCalculatorService;

    public BookService(ShowSeatRepo showSeatRepo, ShowRepo showRepo, UserRepo userRepo,
                       PriceCalculatorService priceCalculatorService) {
        this.showSeatRepo = showSeatRepo;
        this.showRepo = showRepo;
        this.userRepo = userRepo;
        this.priceCalculatorService = priceCalculatorService;
    }
@RequestMapping("book/bookMovie")

public Booking bookMovie(Long userId, Long showId, List<Long> showSeatIds) {

    Optional<User> user = userRepo.findById(userId);
    if (user.isEmpty()) {
        throw new UserNotFoundEx("User not found");
    }
    User user1 = user.get();
    Optional<Shows> show = showRepo.findById(showId);
    if (show.isEmpty()) {
        throw new ShowNotFoundEx("Show not found");
    }
    Shows show1 = show.get();
    List<ShowSeat> seats = showSeatRepo.findAllById(showSeatIds);
    for (ShowSeat seat : seats) {
        if (!seat.ShowSeatStatus.equals(ShowSeatStatus.AVAILABLE)) {
            throw new ShowNotFoundEx("Seat not available");
        }
    }
    ArrayList<ShowSeat> BookedSeats = new ArrayList<>();
    for (ShowSeat seat : seats) {

seat.setShowSeatStatus(ShowSeatStatus.BOOKED);
        BookedSeats.add(showSeatRepo.save(seat));

    }
    return new Booking(user1, show1, seats);

}


}
