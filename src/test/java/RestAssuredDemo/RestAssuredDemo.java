package RestAssuredDemo;

import java.util.HashMap;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredDemo {
	
	@Test
	public void demo()
	{
	
		RestAssured.baseURI = "https://reqres.in/";
		
		RequestSpecification requestspecification = RestAssured.given();
		
		
		HashMap<String, String> hm =  new HashMap<String, String>();
		
		hm.put("name", "Prabhat");
		hm.put("job","leader");
		

		JSONObject jo = new JSONObject(hm);
	
		
	}

}
