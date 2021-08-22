package BdoLifeRestAssured;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

import java.util.HashMap;


public class BdoLifeRestDemo 
{
	
	RequestSpecification rs ; 
	HashMap<String, String>  credentials ; 
	
	HashMap<String, String>  requestheaders ; 
	
	SoftAssert sa ;
	
	
	@BeforeMethod
	public void setup()
	{
		RestAssured.baseURI = "https://bdo-unibank-dr.apigee.net" ; 
		rs= RestAssured.given();
		credentials= new HashMap<String , String>();
		credentials.put("username", "customerportal02");
		credentials.put("password", "Password@1");
		credentials.put("grant_type", "password");
		
		
		/*
		 * requestheaders= new HashMap<String , String>(); requestheaders.put(
		 * "cookie","AWSALB=V35wGV4HiBL1Z81A0qtuULR24FC0VDbipB8mWCOH7Nak51rMriYp1208jblHIpkbNAjQF5/wkFl+44UOrIMLdsqI+w8DfYFBgN4U67DBB/i6m+4BEJfsPDVbzV6p; AWSALBCORS=V35wGV4HiBL1Z81A0qtuULR24FC0VDbipB8mWCOH7Nak51rMriYp1208jblHIpkbNAj"
		 * + "QF5/wkFl+44UOrIMLdsqI+w8DfYFBgN4U67DBB/i6m+4BEJfsPDVbzV6p");
		 */
		
		
		
		
	}
	
	@Test(testName = "Get access token")
	public void getToken()
	{
	Response response=	rs.given().when().body(credentials).post("/v1/auth/token");
	
	String responsepayload = response.getBody().asPrettyString();
	
	System.out.println(responsepayload);
	
	int statuscode = response.getStatusCode();
	
	sa = new SoftAssert();
	
	sa.assertEquals(statuscode, 201);
	
		
	}

	
	@AfterMethod
	public void closeDown()
	{
		
	}
	
	
}
