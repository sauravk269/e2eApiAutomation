package utility;

import io.restassured.response.Response;

import java.io.File;

import static io.restassured.RestAssured.*;
public class restResource {

    public static Response get(String path){
 return  given(specBuilder.reqestSpecBuilder())
         .when().get(path).then().
         spec(specBuilder.responseSpecBuilder()).extract().response();
    }
public static Response post(File file, String path){
      return given(specBuilder.reqestSpecBuilder()).body(file)
              .when().post(path).
              then().spec(specBuilder.responseSpecBuilder()).extract().response();
}

public static void delete(String path){
        given(specBuilder.requestspecBuilderWithToken()).
                when().delete(path).then().
                spec(specBuilder.responseSpecBuilder()).assertThat().statusCode(201);
}
}
