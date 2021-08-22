package RestAssuredDemo;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.matcher.RestAssuredMatchers.*;


import org.hamcrest.Matchers.* ;
import org.testng.annotations.Test;

import io.restassured.module.jsv.JsonSchemaValidator.* ;
public class RestAssured2 
{

	@Test
public void getDemo() 
	{
		
		RestAssured.baseURI = "https://reqres.in/" ; 
		
RequestSpecification rs	=	RestAssured.given();

Response response = rs.request(Method.GET, "/api/users?page=2"); 


String resbody = response.getBody().asPrettyString();

System.out.println("Response Body :: " +resbody);

//System.out.println("Response Body :: " + response);

int responsecode = response.getStatusCode();

System.out.println("Response Code :: " +responsecode);



}



}
