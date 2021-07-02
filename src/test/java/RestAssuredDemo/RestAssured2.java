package RestAssuredDemo;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.matcher.RestAssuredMatchers.*;
import org.hamcrest.Matchers.* ;
public class RestAssured2 
{
	
public void getDemo() {
 RequestSpecification rs =  RestAssured.given();
 
 rs.get("https://reqres.in/api/users/2");
 
 Response response  = rs.get("/api/", "users" , "2");
 response.getBody() ; 

}



}
