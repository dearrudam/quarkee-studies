package com.airhacks.full.boundary;

import io.quarkus.test.junit.QuarkusTest;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import org.junit.jupiter.api.Test;

@QuarkusTest
public class PingResourceTest {

    @Test    
    public void testHelloEndpoint() {
        given()
          .when().get("/ping")
          .then()
             .statusCode(200)    
             .body(is("hello"));
    }

    
    
}