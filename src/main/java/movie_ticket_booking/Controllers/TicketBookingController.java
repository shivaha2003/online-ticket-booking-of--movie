package movie_ticket_booking.Controllers;

import lombok.Getter;
import lombok.Setter;
import movie_ticket_booking.Dto.BookMovieReqDto;
import movie_ticket_booking.Dto.BookMovieResDto;
import movie_ticket_booking.models.Booking;
import movie_ticket_booking.models.BookingStatus;
import movie_ticket_booking.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Setter
@Getter
@RestController
@Controller
@RequestMapping("/ticket")
public class TicketBookingController {
    @Autowired
    BookService bookService;
    public BookMovieResDto BookingTicket(BookMovieReqDto  bookMovieReqDto) {
        BookMovieResDto res = new BookMovieResDto();
        try
        {
            Booking book=bookService.bookMovie(bookMovieReqDto.getUserId(),bookMovieReqDto.getShowId(),bookMovieReqDto.getShowSeatIds());
              res.setBookingId(book.getId());
              res.setAmount(book.getTotalPrice());
              res.setTicketStatus(BookingStatus.COMPLETED);
        }
        catch(RuntimeException e)
        {
            res.setTicketStatus(BookingStatus.CANCELLED);
        }
        return  res;
    }

}
