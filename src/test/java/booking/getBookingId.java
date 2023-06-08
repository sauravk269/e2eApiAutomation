package booking;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.ITestContext;
import org.testng.annotations.Test;
import utility.Routes;
import utility.restResource;
import static org.testng.Assert.assertEquals;

public class getBookingId {
@Test
public void getBookingIds(ITestContext context){
    Response response=restResource.get(Routes.BOOKING_PATH+"/"+context.getAttribute("id"));
    JsonPath js = new JsonPath(response.asString());
    String firstName = js.getString("firstname");
    System.out.println("First name is"+firstName);
    assertEquals(firstName,"saurav");
}


}
