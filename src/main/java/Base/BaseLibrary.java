package Base;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import java.util.HashMap;
import java.util.Map;

public class BaseLibrary extends Data {


    public void Get(String urlPath) {
        RestAssured.get(urlPath).then().statusCode(200);
    }

    public void Post(String urlPath, Map<String, Object> bodyPayload, Map<String, Object> headerPayload) {
        RestAssured.given().body(bodyPayload).headers(headerPayload).contentType(ContentType.JSON).when()
                .post(urlPath).then().statusCode(200);
    }

    public void Put(String urlPath, Map<String, Object> bodyPayload, Map<String, Object> headerPayload) {
        RestAssured.given().body(bodyPayload).headers(headerPayload).contentType(ContentType.JSON).when()
                .put(urlPath).then().statusCode(200);
    }


    public void Delete(String urlPath) {
        RestAssured.delete(urlPath).then().statusCode(200);
    }

    public void Get(String urlPath, Map<String, Object> queryParamsPayLoad) {
        RestAssured.given().queryParams(queryParamsPayLoad).when()
                .get(urlPath).then().statusCode(200);
    }
}
