package com.qatest;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
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
 * Test 1 - Search for the username = Samantha 
 * Send a GET request to /jsonplaceholder.typicode.com/users
 * Print all User names & User ids 
 * and Check that the username = Samantha is present with user id = 3 
 
 ******************************************************/

public class Test1_user_blog_search_user_Samantha {
	
	@BeforeSuite(groups = {"User_Blog_users_list_search"})
	public void Start_of_Test() 
   {
		
		System.out.println("\n--------------------------------------------------------------------------------------------------------------");
		
		System.out.println("\n ***** START of RESTful API Automation Test for API published at - https://jsonplaceholder.typicode.com/ ***** ");
		System.out.println("\n ***** Tools used - REST Assured Java Library , TestNG unit testing framework , MAVEN & Eclipse IDE ***** ");
		System.out.println("\n ***** Test implemented by Abhijit Malankar - MSc Engg TU Berlin , Email - abhiam1@gmail.com ***** ");
		
		System.out.println("\n--------------------------------------------------------------------------------------------------------------");
	}
	
	@AfterSuite(groups = {"User_Blog_users_list_search"})
	public void End_of_Test() 
	   {
			
	    	System.out.println("\n--------------------------------------------------------------------------------------------------------------");
			
			System.out.println("\n ***** END of RESTful API Automation Test for API published at - https://jsonplaceholder.typicode.com/ ***** ");
			System.out.println("\n ***** Tools used - REST Assured Java Library , TestNG unit testing framework , MAVEN & Eclipse IDE ***** ");
			System.out.println("\n ***** Test implemented by Abhijit Malankar - MSc Engg TU Berlin , Email - abhiam1@gmail.com ***** ");
			System.out.println("\n--------------------------------------------------------------------------------------------------------------");
		}
	
		 
	
	public static Response doGetRequest(String endpoint) {
		
		System.out.println("\n--------------------------------------------------------------------------------------------------------------");
		System.out.println(" \n ***** Test 1 - To Search for the username = Samantha   ***** "); 
	    System.out.println(" \n ***** This test extracts details like all User names & User ids for /users and Checks that the username = Samantha is present with user id = 3   ***** ");
	    
	        RestAssured.defaultParser = Parser.JSON;

	        return
	            given().headers("Content-Type", ContentType.JSON, "Accept", ContentType.JSON).
	                when().get(endpoint).
	                then().contentType(ContentType.JSON).extract().response();
	   }
	
	

       @Test(priority = 1, groups = {"User_Blog_users_list_search"})
	   public void Test_1_Search_for_user_Samantha() {
	       
	        Response response = doGetRequest("https://jsonplaceholder.typicode.com/users");

	        List<String> jsonResponse = response.jsonPath().getList("$");

	        System.out.println("\n <<<<<<<<<<  Result of Test 1 is as below = >>>>>>>>>> ");
	        System.out.println("\n Number of Users in the Users list are = " +jsonResponse.size());
	        
	        
	        String usernames = response.jsonPath().getString("username");
	        System.out.println(" Name of all the users in the Users list are = "+usernames);
	        
	        String userids = response.jsonPath().getString("id");
	        System.out.println(" User ids of all the users in the Users list are = " +userids);
	        
	        String usernames1 = response.jsonPath().getString("username[2]");
	        System.out.println(" Username of User with user id - 3 is = "+usernames1);
	        
	        String search_user = "Samantha";
	        String exp_user = usernames1 ;
	        
	        AssertJUnit.assertEquals(search_user, exp_user);
	        
	        System.out.println("\n--------------------------------------------------------------------------------------------------------------");
	    }
	    
}


