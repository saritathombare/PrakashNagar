package Practice;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import Files.Payload;

public class Basics 
{
	public static void main(String[] args) 
	{
		//VALIDATE ADD PLACE (POST) API IS WORKING OR NOT
		//given-- parameters,headers,body,//when --submit the API - resource, method 
		//then -- apply assert and validate response
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
		given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body(Payload.Addplace())
		.when().post("maps/api/place/add/json")
		.then().log().all().assertThat().statusCode(200).body("scope", equalTo("APP"))
		.header("Server", "Apache/2.4.18 (Ubuntu)");
		
		
		//Add Place --> Update Place with new address --> Get place to validate if new address is present in response
		
	}

}
