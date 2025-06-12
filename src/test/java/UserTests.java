import Base.BaseTest;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class UserTests extends BaseTest {

    @Test(description = "Get - /v2/user - User Info", priority = 2)
    public void GetUser() {
        Get(URL + "/v2/user/nesringurr");
    }

    @Test(description = "Post - /v2/user - user create ", priority = 1)
    public void CreateUser() {

        Map<String, Object> headerPayload = new HashMap<>();
        headerPayload.put("accept", "application/json");
        headerPayload.put("Content-Type", "application/json");


        Map<String, Object> bodyPayload = new HashMap<>();
        bodyPayload.put("id", "32145685224");
        bodyPayload.put("username", "nesringurr");
        bodyPayload.put("firstName", "serkan2olmadı");
        bodyPayload.put("lastName", "gür2");
        bodyPayload.put("email", "denemeSerkan2@gmail.com");
        bodyPayload.put("password", "Deneme-2");
        bodyPayload.put("phone", "5555555227");
        bodyPayload.put("userStatus", "1");

        Post(URL + "/v2/user", bodyPayload, headerPayload);
    }

    @Test(description = "Put - /v2/user/ - Update User ", priority = 3)
    public void UpdateUser() {
        Map<String, Object> headerPayload = new HashMap<>();
        headerPayload.put("accept", "application/json");
        headerPayload.put("Content-Type", "application/json");


        Map<String, Object> bodyPayload = new HashMap<>();
        bodyPayload.put("id", "32145685224");
        bodyPayload.put("username", "nesringurrnew");
        bodyPayload.put("firstName", "serkan2");
        bodyPayload.put("lastName", "gür2");
        bodyPayload.put("email", "denemeSerkan2@gmail.com");
        bodyPayload.put("password", "Deneme-2");
        bodyPayload.put("phone", "5555555227");
        bodyPayload.put("userStatus", "1");

        Put(URL + "/v2/user/nesringurr", bodyPayload, headerPayload);
    }

    @Test(description = "delete - /v2/user/ - Delete User", priority = 4)
    public void DeleteUser() {
        Delete(URL + "/v2/user/nesringurrnew");
    }

    @Test(description = "Get - /v2/user/login - login ")
    public void Login() {
        Map<String, Object> queryParamsPayLoad = new HashMap<>();
        queryParamsPayLoad.put("username", "nesringurr");
        queryParamsPayLoad.put("password", "Deneme-2");

        Get(URL + "/v2/user/login", queryParamsPayLoad);
    }

    @Test(description = "Get - /v2/user/logout - Logout ")
    public void Logout() {
        Get(URL + "/v2/user/logout");

    }
}
