package booking;
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
    public static String bookingIdNumber;
@Test
    public void createNewBooking(){
        File file = new File("src/main/resources/createBookingPayload.json");
        Response response = restResource.post(file, Routes.BOOKING_PATH);
    JsonPath js = new JsonPath(response.asString());
    bookingIdNumber =js.getString("bookingid");
    System.out.println("Booking Id is -"+bookingIdNumber);
}

}
