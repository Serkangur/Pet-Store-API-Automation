package Base;

import io.qameta.allure.Step;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

import static org.testng.Assert.assertEquals;

public class BaseLibrary extends Data {


    @Step("{urlPath} GET isteği gönderilir")
    public Response Get(String urlPath) {
        Response response = RestAssured.get(urlPath);
        System.out.println("Response: " + response.getBody().asString());
        return response;
    }

    @Step("{urlPath} POST isteği gönderilir")
    public Response Post(String urlPath, Map<String, Object> bodyPayload, Map<String, Object> headerPayload) {
        Response response = RestAssured.given().body(bodyPayload).headers(headerPayload).contentType(ContentType.JSON).when()
                .post(urlPath);
        System.out.println("Response: " + response.getBody().asString());
        return response;
    }

    @Step("{urlPath} PUT isteği gönderilir")
    public Response Put(String urlPath, Map<String, Object> bodyPayload, Map<String, Object> headerPayload) {
        Response response = RestAssured.given().body(bodyPayload).headers(headerPayload).contentType(ContentType.JSON).when()
                .put(urlPath);
        System.out.println("Response: " + response.getBody().asString());
        return response;

    }


    @Step("{urlPath} DELETE isteği gönderilir")
    public Response Delete(String urlPath) {
        Response response = RestAssured.delete(urlPath);
        System.out.println("Response: " + response.getBody().asString());
        return response;

    }




    @Step("{urlPath} GET isteği gönderilir")
    public Response Get(String urlPath, Map<String, Object> queryParamsPayLoad) {
        Response response = RestAssured.given().queryParams(queryParamsPayLoad).when()
                .get(urlPath);
        System.out.println("Response: " + response.getBody().asString());
        return response;
    }


    @Step("Assert kontrolü sağlanır")
    public void AssertEquals(String expected, String actual) {
        assertEquals(actual, expected);
    }
}
