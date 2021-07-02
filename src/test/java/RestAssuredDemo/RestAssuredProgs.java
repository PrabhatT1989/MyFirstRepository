package RestAssuredDemo;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
//import io.restassured.RestAssured;
import io.restassured.response.Response;

import static org.hamcrest.Matchers.*;

public class RestAssuredProgs {
	
	/*
	 * @Test public void restResource() {
	 * 
	 * 
	 * Response resource = get("http://localhost:8080/lotto/3");
	 * 
	 * System.out.println("Status Code : " + (resource.getStatusCode())); ;
	 * System.out.println("SessionID :: " + (resource.getSessionId()));
	 * System.out.println("Time :: " + (resource.getTime()));
	 * System.out.println("Response :: " + (resource.getBody().asString()));
	 * 
	 * 
	 * }
	 */

	@Test
	public void secondDemoProgram() {
		int responsecode = given().get("https://reqres.in/api/users/2").getStatusCode();

		System.out.println("Response :: " + responsecode);
		
	}
	
	@Test
	public void thirdDemoProgram() {
	given().get("https://reqres.in/api/users/2").then().log().all();
	
}
	
	
	@Test
	public void toolsQA1()
	{
		
	//	given().get("http://demoqa.com/utilities/weather/city/Hyderabad").header("application/json").w
		
		given().get("http://demoqa.com/utilities/weather/city/Hyderabad").then().bod
		
		
		
	}

}
