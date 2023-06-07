package utility;

import static io.restassured.RestAssured.*;

import utility.specBuilder;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.HashMap;

public class getToken {
    public static String responseToken;
    @Test
    public void GetToken(){
        HashMap<String,String> hm = new HashMap<String,String>();
        hm.put("username","admin");
        hm.put("password", "password123");
        Response response = given(specBuilder.reqestSpecBuilder()).body(hm).when()
                .post(Routes.TOKEN).then().spec(specBuilder.responseSpecBuilder()).assertThat().statusCode(200).extract().response();
        JsonPath js =new JsonPath(response.asString());
       responseToken= js.getString("token");
        System.out.println("Response token that we are getting is "+responseToken);

    }
}
