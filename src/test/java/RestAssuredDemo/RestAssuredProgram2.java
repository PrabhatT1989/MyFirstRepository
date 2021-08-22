package RestAssuredDemo;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.util.JSONPObject;

import io.restassured.RestAssured;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class RestAssuredProgram2 {

	
	@Test
	public void getRequestPractice() throws ParseException
	{
		RestAssured.baseURI = "https://reqres.in/";
		
		RestAssured.registerParser("application/JSON", Parser.JSON);
		
		RequestSpecification requestspecification  = RestAssured.given();
		
		Response response = requestspecification.when().get("/api/users/2");
		
		int statuscode = response.getStatusCode();
		System.out.println("Status COde  ::" +statuscode);
		
		String responseline = response.getStatusLine();
		System.out.println("Response Line" +responseline);
		
		
		//response.then().assertThat().body("data.id", equals(2));
		
		
		// to get response body
		
		//ResponseBody responsebody =	response.getBody();
		
	String data_email=   response.jsonPath().getJsonObject("data.email");
	String support_url = response.jsonPath().getJsonObject("support.url");
	
	System.out.println("Data_email :: " +data_email);
	System.out.println("Support URL :: " +support_url);
	
	
	if(data_email==null)
	{System.out.println("Data_email is null" + data_email); }
	
	else if (support_url!=null) {
		System.out.println("Support URL printing once again :: " +support_url);
	
	
		ResponseSpecBuilder builder = new ResponseSpecBuilder();
		builder.expectBody("data.first_name" )
	
	
	}
	
	
	
	
	
	
	
	}
}
