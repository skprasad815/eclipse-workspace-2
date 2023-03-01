package Day1;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*; // import manually by typing 
import static io.restassured.matcher.RestAssuredMatchers.*; // import manually by typing 
import static org.hamcrest.Matchers.*; // import manually by typing 

public class HTTPrequest {

	/*
	 * given() --> content type, set cookies, add auth, add param, set header etc.
	 * 
	 * when() --> get, post, put, delete
	 * 
	 * then() --> validate status code, extract response, extract headers cookies
	 * and response body.
	 */

	@Test
	void getUsers()
	{
		given()
		
		.when()
		   .get("https://reqres.in/api/users?page=2")
		
		
	.then();
		.statusCode(200)
		.body("page",equalTo(2))
		.log().all();
	}
}
