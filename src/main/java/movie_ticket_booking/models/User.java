package movie_ticket_booking.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class User extends BaseModel {
    private int age;
    private String name;
    private String email;
    private String password;
    private String phoneNumber;

}
