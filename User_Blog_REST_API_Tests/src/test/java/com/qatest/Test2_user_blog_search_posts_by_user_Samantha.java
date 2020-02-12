package com.qatest;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;

import static org.hamcrest.Matchers.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/*******************************************************
 * Search for the Number of Posts & Post ids by username = Samantha with user id - 3 
 * Send a GET request to /jsonplaceholder.typicode.com/posts?userId=3
 * and check that the Number of Posts = 10  & List all 10 - Post ids  
 
 ******************************************************/


public class Test2_user_blog_search_posts_by_user_Samantha {
	
public static Response doGetRequest(String endpoint) {
		
		System.out.println("\n ***** Test 2 - Search for the Number of Posts & Post ids by username = Samantha ,with user id - 3  ***** "); 
	    System.out.println("\n ***** This test extracts details like Number of Posts & Lists all Post ids made by username = Samantha , with user id - 3  ***** ");
	    
	        RestAssured.defaultParser = Parser.JSON;

	        return
	            given().headers("Content-Type", ContentType.JSON, "Accept", ContentType.JSON).
	                when().get(endpoint).
	                then().contentType(ContentType.JSON).extract().response();
	    } 

	
	@Test(priority = 2, groups = {"User_Blog_posts_list_search"})
	public void Test_2_User_blog_search_posts_and_post_ids_by_user_Samantha(){
	        Response response = doGetRequest("https://jsonplaceholder.typicode.com/posts?userId=3");

	        List<String> jsonResponse = response.jsonPath().getList("$");

	        System.out.println("\n <<<<<<<<<<  Result of Test 2 is as below = >>>>>>>>>> ");
	        System.out.println("\n Number of Posts by username - Samantha with User id - 3 are = " +jsonResponse.size());
	        
	     
	        
	        String postids = response.jsonPath().getString("id");
	        System.out.println(" Post ids of all the Posts made by username Samantha in the Posts list are = " +postids);
	        System.out.println("\n--------------------------------------------------------------------------------------------------------------");
	        
	   
	    }


}

	
	



