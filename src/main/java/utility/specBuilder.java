package utility;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class specBuilder {

    public static RequestSpecification reqestSpecBuilder() {

        return new RequestSpecBuilder().
                setBaseUri("https://restful-booker.herokuapp.com").
                setContentType(ContentType.JSON).log(LogDetail.ALL).build();
    }

    public static RequestSpecification requestspecBuilderWithToken(){
        return  new RequestSpecBuilder().
                setBaseUri("https://restful-booker.herokuapp.com").
                addHeader("Cookie","token="+ getToken.responseToken).
                setContentType(ContentType.JSON).log(LogDetail.ALL).build();
    }

    public static ResponseSpecification responseSpecBuilder() {
        return new ResponseSpecBuilder().log(LogDetail.ALL).build();

    }
}
