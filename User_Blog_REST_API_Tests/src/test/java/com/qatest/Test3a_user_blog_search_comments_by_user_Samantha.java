package com.qatest;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.beans.HasPropertyWithValue.hasProperty;
import static org.hamcrest.Matchers.is;

import static org.hamcrest.Matchers.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;
import java.util.List;

import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/*******************************************************
 * Test 3a - Search for the Number of Comments & Comment ids by username = Samantha with only 1 Post id (- 21) of total 10 Post ids 
 * Send a GET request to /jsonplaceholder.typicode.com/comments?postId=21
 * 
 * and check that 
 * 
 * Total Number of Comments by username - Samantha with Post id - 21 are =
 * Comment ids of all comments made by username - Samantha in the Post id - 21 are = 
 * Email ids within all comments made by username - Samantha in the Post id - 21 are = 
 * 
 ******************************************************/
public class Test3a_user_blog_search_comments_by_user_Samantha {
	
	
	@SuppressWarnings("unused")
	private static String com;
	
	
	
	public static Response doGetRequest(String endpoint) {
		
		System.out.println("\n ***** Test 3 - Search for the Number of Comments & Comment ids by username = Samantha  ***** "); 
	    System.out.println("\n ***** This test extracts details of no.of comments , comment ids  & emails in Post id - 21 ( of total 21 to 30 ) made by username = Samantha  ***** ");
	    
	        RestAssured.defaultParser = Parser.JSON;

	        return
	            given().headers("Content-Type", ContentType.JSON, "Accept", ContentType.JSON).
	                when().get(endpoint).
	                then().contentType(ContentType.JSON).extract().response();
	    } 

	@Test(priority = 3, groups = {"User_Blog_comments_list_search"})
	public void Test_3_User_blog_search_comments_comment_ids_and_emails_by_user_Samantha() {
	      
	        Response response = doGetRequest("https://jsonplaceholder.typicode.com/comments?postId=21");

	        List<String> jsonResponse = response.jsonPath().getList("$");

	        System.out.println("\n <<<<<<<<<<  Result of Test 3 is as below = >>>>>>>>>> ");
	        System.out.println("\n Total Number of Comments by username - Samantha with Post id - 21 are = " +jsonResponse.size());
	        
	     
	        
	        String commentid = response.jsonPath().getString("id");
	        System.out.println(" Comment ids of all comments made by username - Samantha in the Post id - 21 are = " +commentid);
	        
	        String emails = response.jsonPath().getString("email");
	        System.out.println(" Email ids within all comments made by username - Samantha in the Post id - 21 are = " +emails);
	   
	        String emailid_101 = response.jsonPath().getString("email[0]");
	        System.out.println("\n Email id of Comment id - 101 made by username - Samantha is = "+emailid_101);
	    
	        String emailid_102 = response.jsonPath().getString("email[1]");
	        System.out.println(" Email id of Comment id - 102 made by username - Samantha is = "+emailid_102);
	    
	        String emailid_103 = response.jsonPath().getString("email[2]");
	        System.out.println(" Email id of Comment id - 103 made by username - Samantha is = "+emailid_103);
	    
	        String emailid_104 = response.jsonPath().getString("email[3]");
	        System.out.println(" Email id of Comment id - 104 made by username - Samantha is = "+emailid_104); 
	        
	        String emailid_105 = response.jsonPath().getString("email[4]");
	        System.out.println(" Email id of Comment id - 105 made by username - Samantha is = "+emailid_105);
	        System.out.println("\n--------------------------------------------------------------------------------------------------------------");
	     
	   }

}
