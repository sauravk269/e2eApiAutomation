package booking;
import org.testng.ITestContext;
import utility.Routes;
import utility.restResource;
import utility.specBuilder;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
public class deleteBooking {
@Test
    public void deleteBooking(ITestContext context){
    String path= Routes.BOOKING_PATH+"/"+context.getAttribute("id");
    System.out.println("Path is -"+path);
    restResource.delete(path);
    }
}
