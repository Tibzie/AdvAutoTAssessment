package com.qa.quickstart.petclinic_restassured;

import static org.junit.Assert.*;


import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.After;
import org.junit.Ignore;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class PetClinic {


	private Response response;
	private ValidatableResponse json;
	private RequestSpecification request;
	
	
	
	@Test
	public void testPost() {
		
		JSONObject requestParams = new JSONObject();
		RestAssured.baseURI = "http://10.0.10.10:9966/petclinic/api/pettypes";
		
		request = given().contentType(ContentType.JSON);
		
		requestParams.put("name", "Jozsi");

		
		System.out.println(request.body(requestParams.toString()));
		
		Response response = request.put("http://10.0.10.10:9966/petclinic/api/pettypes/");
		
		System.out.println(response.getStatusCode());	
	}
	
	@Test
	@Ignore
	public void testGet() {
		RestAssured.baseURI = "http://10.0.10.10:9966/petclinic/api/pettypes";
		request = given().contentType(ContentType.JSON);
		
		response = request.get("http://10.0.10.10:9966/petclinic/api/pettypes/9");
		System.out.println(response.prettyPrint());		
	}
	@Test
	@Ignore
	public void testPut() {
		JSONObject updateParams = new JSONObject();
		RestAssured.baseURI = "http://10.0.10.10:9966/petclinic/api/pettypes";
		request = given().contentType(ContentType.JSON);
		response = request.when().get("http://10.0.10.10:9966/petclinic/api/pettypes");
		
		updateParams.put("name", "Elek");

		
		System.out.println(request.body(updateParams.toString()));
		
		Response response = request.put("http://10.0.10.10:9966/petclinic/api/pettypes/9");
		
		System.out.println(response.getStatusCode());		
	}
	
	@Test
	@Ignore
	public void testDelete() {
		RestAssured.baseURI = "http://10.0.10.10:9966/petclinic/api/pettypes";
		request = given().contentType(ContentType.JSON);
		
		Response response = request.delete("http://10.0.10.10:9966/petclinic/api/pettypes/9");
		
		System.out.println(response.getStatusCode());		
	}


}
