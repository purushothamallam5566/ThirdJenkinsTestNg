package com.second.in;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;

public class SecondTestNG {
@Test
	public void enterDetails() {
	JSONObject obj=new JSONObject();
	obj.put("name", "purushotham");
	obj.put("company", "virtusaaa");
	obj.put("age", 33);
	obj.put("google", "Testing");
	
	given().header("Content-Type","application/json").contentType(ContentType.JSON).accept(ContentType.JSON).body(obj.toJSONString())
.when().post("https://reqres.in/api/users")
.then().statusCode(201).log().all();

}
}
