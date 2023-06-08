package booking;
import org.testng.ITestContext;
import utility.Routes;
import utility.restResource;
import utility.specBuilder;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import java.io.File;

import  static io.restassured.RestAssured.*;

public class createBooking {
    public String bookingIdNumber;
@Test
    public void createNewBooking(ITestContext context){
        File file = new File("src/main/resources/createBookingPayload.json");
        Response response = restResource.post(file, Routes.BOOKING_PATH);
        JsonPath js = new JsonPath(response.asString());
        bookingIdNumber =js.getString("bookingid");
        context.setAttribute("id", bookingIdNumber);
        System.out.println("Booking Id is -"+bookingIdNumber);
}

}
