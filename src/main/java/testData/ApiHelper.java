package testData;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ApiHelper {

    public static String getFirstName() {

        Response response = RestAssured.get("https://jsonplaceholder.typicode.com/users/1");
        return response.jsonPath().getString("name").split(" ")[0];
    }

    public static String getLastName() {
        Response response = RestAssured.get("https://jsonplaceholder.typicode.com/users/1");
        return response.jsonPath().getString("name").split(" ")[1];
    }

    public static String getZipCode() {
        Response response = RestAssured.get("https://jsonplaceholder.typicode.com/users/1");
        return response.jsonPath().getString("address.zipcode");
    }
}
