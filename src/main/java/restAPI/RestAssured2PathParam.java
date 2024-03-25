package restAPI;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;

public class RestAssured2PathParam {
    /**
     * er set the base URI useing static baseURI field
     *
     * pretty print -> prints out the response body in pretty format (person readable format)
     */

    public static void main(String[] args) {
        RestAssured.baseURI= "https://dummy.restapiexample.com/api/v1";
        given()
                .pathParam("id", 1)
                .when()
                .get("/employee/{id}").prettyPrint();


    }
}
