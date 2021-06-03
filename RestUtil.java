package rest;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestUtil {

    public static String getAdminToken() {
        RequestSpecification specification = RestAssured.given();

        specification.body("{\n" +
                "  \"password\": \"admin\",\n" +
                "  \"username\": \"admin\"\n" +
                "}");
        specification.contentType(ContentType.JSON);

        Response response = specification.request(Method.POST, "/auth/login");
        JsonPath jsonPath = response.getBody().jsonPath();

        String token = jsonPath.getString("token");
        System.out.println("RECEIVED TOKEN: " + token);

        return "Bearer_" + token;
    }
}
