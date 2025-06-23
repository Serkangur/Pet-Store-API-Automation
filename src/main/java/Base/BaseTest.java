package Base;


import io.restassured.RestAssured;


public class BaseTest extends BaseLibrary {


    public void BeforeTest(){
        RestAssured.baseURI = URL;
    }
}
