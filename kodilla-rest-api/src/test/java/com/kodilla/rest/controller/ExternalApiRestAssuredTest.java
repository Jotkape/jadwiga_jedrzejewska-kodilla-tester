package com.kodilla.rest.controller;

import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.equalTo;
import static io.restassured.RestAssured.given;



public class ExternalApiRestAssuredTest {

    @Test
    void testGetPostShouldReturnStatus200AndValidateResponse() {
        String updatedPostJson = """
            {
               "id": 1,
               "title": "Updated Title",
               "body": "Updated body content",
               "userId": 1
            }
            """;

        given()
                .header("Content-Type", "application/json")
                .body(updatedPostJson)
                .when()
                .put("https://jsonplaceholder.typicode.com/posts/1")
                .then()
                .assertThat()
                .statusCode(200)
                .body("id", equalTo(1))
                .body("title", equalTo("Updated Title"))
                .body("body", equalTo("Updated body content"))
                .body("userId", equalTo(1))
                .log().all();
    }

}
