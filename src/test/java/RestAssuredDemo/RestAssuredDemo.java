package RestAssuredDemo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredDemo {
	
	@Test
	public void demo()
	{
		
	Response rs = 	RestAssured.get("https://developers.google.com/calendar/api/guides/overview");
	
	System.out.println("Headers :: " +(rs.getHeaders()));;
	System.out.println("BODY :: " +(rs.getBody().asPrettyString()));
	
	
	}

}
