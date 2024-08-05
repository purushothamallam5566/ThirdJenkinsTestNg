package comApi.in;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;




public class ApiClass {

@Test
public void getDataById()
{
	when()
	.get("https://reqres.in/api/users?page=2")
	.then().statusCode(200).body("data[4].first_name", equalTo("George"))
	//.body("data.first_name",hasItems("George","Rachel"))
	.log().all();
}
@Test
public void testPost() {
	JSONObject objects=new JSONObject();
	objects.put("name", "purushotham");
	objects.put("age", 21);
	
	System.out.println(objects.toJSONString());
	given().header("Content-Type","application/json").contentType(ContentType.JSON).accept(ContentType.JSON).body(objects.toJSONString())
	.when().post("https://reqres.in/api/users")
	.then().statusCode(201).log().all();
}
}