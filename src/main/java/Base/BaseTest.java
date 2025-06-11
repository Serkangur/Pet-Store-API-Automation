package Base;

import com.fasterxml.jackson.databind.ser.Serializers;
import io.restassured.RestAssured;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends BaseLibrary {


    public void BeforeTest(){
        RestAssured.baseURI = URL;
    }
}
