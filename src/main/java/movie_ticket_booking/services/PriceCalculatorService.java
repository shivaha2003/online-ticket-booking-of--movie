package movie_ticket_booking.services;

import movie_ticket_booking.models.SeatType;
import movie_ticket_booking.models.ShowSeat;
import movie_ticket_booking.models.Shows;
import movie_ticket_booking.repositories.ShowSeatTypeRepo;
;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PriceCalculatorService {
   ShowSeatTypeRepo showSeatTypeRepo;
    public PriceCalculatorService(ShowSeatTypeRepo showSeatRepo) {
        this.showSeatTypeRepo = showSeatRepo;
    }
    public int calculator(List<ShowSeat> showSeats, Shows show)
    {
        int price = 0;
        List<SeatType> SeatType = showSeatTypeRepo.findByShow(show);
        for (ShowSeat showSeat: showSeats) {
            for(SeatType seatTypes: SeatType)
            {
                if(showSeat.getSeat().equals(seatTypes.getSeatType()))
                {
                    showSeat.setPrice(seatTypes.getPrice());
                }
            }
            price += showSeat.getPrice();
        }
        return price;
    }


}
