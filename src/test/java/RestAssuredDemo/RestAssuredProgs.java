package RestAssuredDemo;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static org.hamcrest.Matchers.*;

public class RestAssuredProgs {
	
@Test
public void testPostMethod()
{
RestAssured.baseURI = "https://reqres.in/";	

RequestSpecification requestspec = RestAssured.given();

String requestbody = "{\r\n"
		+ "    \"name\": \"morpheus\",\r\n"
		+ "    \"job\": \"leader\"\r\n"
		+ "}"; 

Response response = requestspec.body(requestbody).contentType("application/JSON").and().request(Method.POST, "/api/users");



String responsepayload = response.getBody().asPrettyString();

System.out.println("Response Payload :: " + responsepayload);

int responsecode = response.getStatusCode() ;
System.out.println("Post Response Code = " + responsecode);

String statusline = response.getStatusLine();

System.out.println("Post Status Line :: " + statusline);


}

}
