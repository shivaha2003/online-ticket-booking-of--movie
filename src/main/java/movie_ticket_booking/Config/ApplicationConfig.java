package movie_ticket_booking.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
@Component

public class ApplicationConfig {
    @Bean
    private RestTemplate createRestTemplate()
    {
        return new RestTemplate();
    }
}
