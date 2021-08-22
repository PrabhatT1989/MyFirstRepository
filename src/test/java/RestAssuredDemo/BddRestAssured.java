package RestAssuredDemo;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.*;

import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;


import org.testng.annotations.Test;

public class BddRestAssured 
{
	
	
	  @Test(priority='2',  testName = "Test whether get call is sucessfull.") 
	  public void ergastDemo()
	   {
	  RestAssured.given().when().get("https://reqres.in/api/users/2")
	  .then().assertThat().statusCode(200).statusLine("HTTP/1.1 200 OK");
	  
	   
	   }
	 

@Test(priority = 1)
public void postDemo()
{
	   RestAssured.given().when().body("{\r\n"
	   		+ "    \"name\": \"Mathew Hyden\",\r\n"
	   		+ "    \"job\": \"leader\"\r\n"
	   		+ "}"
		).post("https://reqres.in/api/users").then().assertThat().log().status().and().assertThat().extract().asPrettyString();
	   
	   
	   


}








}
