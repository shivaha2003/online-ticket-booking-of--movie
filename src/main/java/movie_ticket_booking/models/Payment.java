package movie_ticket_booking.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Payment extends BaseModel{
    int amount;
    @Enumerated(EnumType.ORDINAL)
    private List<PaymentType> paymentType;
    @Enumerated(EnumType.ORDINAL)
    private PaymentStatus paymentStatus;
   @Enumerated(EnumType.ORDINAL)
    private PaymentProvider paymentProvider;
    private String paymentId;
    private Date time;
    @ManyToOne
    private Ticket ticket;

}
