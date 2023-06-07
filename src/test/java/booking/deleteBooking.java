package booking;
import utility.Routes;
import utility.restResource;
import utility.specBuilder;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
public class deleteBooking {
@Test
    public void deleteBooking(){
    String path= Routes.BOOKING_PATH+"/"+createBooking.bookingIdNumber;
    System.out.println("Path is -"+path);
    restResource.delete(path);
    }
}
