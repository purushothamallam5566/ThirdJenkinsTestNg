package com.second.in;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
public class putPatchDeleteClass {
	@Test
public void putMethod() {
	JSONObject objectt=new JSONObject();
	objectt.put("name", "morpheus");
	objectt.put("gulla", "gulla22");
	//;
	given().header("Content-Type","application/json").contentType(ContentType.JSON).accept(ContentType.JSON).body(objectt.toJSONString())
	.when().put("https://reqres.in/api/users/2")
	.then().statusCode(200).log().all();
}
	
	@Test
public void patchMethod() {
	JSONObject objectt=new JSONObject();
//	objectt.put("name", "morpheus");
	objectt.put("gulla", "gubballllll");
	//;
	given().header("Content-Type","application/json").contentType(ContentType.JSON).accept(ContentType.JSON).body(objectt.toJSONString())
	.when().patch("https://reqres.in/api/users/2")
	.then().statusCode(200).log().all();
}
	
	public void deletee() {
when().delete("/api/users/2").then().statusCode(200);
	}
}
