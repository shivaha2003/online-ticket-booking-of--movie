package movie_ticket_booking.services;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.testng.Assert.*;
@SpringBootTest
public class TestNGTest {
    @Test
    public void test() {
        System.out.println("TestNGTest");
        String s="TestNGTe";
        assertEquals("TestNGTest",s);
    }

}