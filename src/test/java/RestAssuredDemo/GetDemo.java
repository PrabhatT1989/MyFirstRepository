package RestAssuredDemo;

import org.json.simple.JSONObject;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.runner.Request;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.fasterxml.jackson.core.json.JsonReadContext;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.path.json.JsonPath.JsonParser;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetDemo {
	RequestSpecification request;
	
	SoftAssert sa ;
	
	@BeforeMethod
	public void initialize()
	{
	 RestAssured.baseURI =  "https://reqres.in/";
	request  = RestAssured.given();
	}
	
	
	
	@Test
	public void getDemo() throws ParseException
	
	
	{
		Response response = request.when().get("/api/users/2");
		
	String getresponsebody=	response.getBody().asPrettyString();
		
		System.out.println(getresponsebody);
		
		
		sa= new SoftAssert();
		
	int statuscode=	response.getStatusCode();
	sa.assertEquals(statuscode, 200);
	
	// code to convert the response body to json
	
	String responseline = response.getStatusLine();
	
	sa.assertEquals(responseline, "Ok");
	
	/*
	 * JSONParser parser = new JSONParser();
	 * 
	 * JSONObject json = (JSONObject) parser.parse(getresponsebody);
	 * 
	 * System.out.println("Json Value :: " + json);
	 */
	
	
	
	/*
	 * JsonPath jsp = new JsonPath(getresponsebody);
	 * 
	 * String supporturl = jsp.getString("$.support.url");
	 
	 */
	
	//Code to parse 
	/*
	 * String json = getresponsebody;
	 * 
	 * JsonParser ctx = JsonPath.parseText(json);
	 */
	
	
	
	String json = getresponsebody;
	Object document = Configuration.defaultConfiguration().jsonProvider().parse(json);

	String author0 = JsonPath.read(document, "$.store.book[0].author");
	String author1 = JsonPath.read(document, "$.store.book[1].author");
	
	String supporturl = response.jsonPath().get("support.url");
	
	
	System.out.println("Support object URL : " +supporturl);
	
	}
	

}
