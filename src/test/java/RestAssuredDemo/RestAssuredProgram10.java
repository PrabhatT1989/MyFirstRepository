package RestAssuredDemo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class RestAssuredProgram10 
{
	
	@Test
	public void getdemo()
	{
		
		RestAssured.baseURI = "https://reqres.in" ;
		RestAssured.basePath = "/api/users/2" ;
		
		
		
	}

}
