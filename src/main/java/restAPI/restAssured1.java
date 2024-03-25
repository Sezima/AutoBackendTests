package restAPI;


import groovy.json.JsonOutput;
import io.restassured.RestAssured;

public class restAssured1 {
    /**
     * all methods in RestAssured are static methods
     *
     * given - is used for pre-conditions
     *when - for crud
     * then - for validation
     * auth
     * headers line content type
     * accept
     * query param
     * request param
     * uri
     * baseUri - is a method that is used for specifying the base URI
     *
     *
     */


    //all methods are changed in restAssured
    public static void main(String[] args) {
        RestAssured
                .given()
                .baseUri("https://dummy.restapiexample.com")
                .when()
                .get("/employee")
                .then().statusCode(200);


        System.out.println("Successfully sent a request ");
    }



}
