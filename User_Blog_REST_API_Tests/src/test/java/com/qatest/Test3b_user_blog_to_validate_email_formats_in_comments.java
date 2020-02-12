package com.qatest;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.http.ContentType;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.parsing.Parser;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.beans.HasPropertyWithValue.hasProperty;
import static org.testng.Assert.fail;
import static org.hamcrest.Matchers.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

import java.util.concurrent.TimeUnit;
import java.util.List;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

@Listeners (TrackTestExecution_Testng_Listener.class)


/*******************************************************
 * ***** Test 3b1 to validate the 4 types of standard starting syntax of Emails (name@/ name.city@/ name_city@/ name-city@/  using <Hamcrest Matcher-Startswith> & <anyOf as OR operator> ***** 
 * ***** Email id [0] of Comment id - 101 in Post id - 21 by username - Samantha is being validated ***** 
 * 
 * & 
 * 
 * ***** Test 3b2 to validate the generic top-level domains (gTLD) ( .com/.org/.net/.de/.us/.co.uk/ .biz/ ) as standard ending syntax of Emails using <Hamcrest Matcher-Endswith> & <anyOf as OR operator> ***** ; 
   ***** Email id [0] of Comment id - 101 in Post id - 21 by username - Samantha is being validated ***** ;

 *  
 ******************************************************/


public class Test3b_user_blog_to_validate_email_formats_in_comments {


	@Test(priority = 4, groups = {"Email_Start_Syntax_validation"})
	public void Test_4_Email_Start_Syntax_validation_for_Email_id_0_Comment_id_101_Postid_21_by_user_Samantha()  {
	  
			
	   System.out.println("\n ***** Test 4 - to validate the 4 types of standard starting syntax of Emails (name@/ name.city@/ name_city@/ name-city@/) using <Hamcrest Matcher-Startswith> & <anyOf as OR operator> ***** "); 
	   System.out.println("\n ***** In this test - Email id [0] of Comment id - 101 in Post id - 21 by username - Samantha is being validated ***** ");
       
	   try {
	   ((RestAssured) given()).
       when().
       get("https://jsonplaceholder.typicode.com/comments?postId=21").
       then().
       assertThat().
             
       // Using anyOf as OR operator with Hamcrest matcher - startsWith (Chain conditions together, test passes when target meets any of the conditions, similar to logical OR:) 
       
       body("email[0]", anyOf(startsWith("Lura@"), 
                        containsString("Lura_office@"),
    		            containsString("Lura.office@"),
    		            containsString("Lura-office@")));
     
	   
		    Object actualString = null;
			Object expectedString = null;
			AssertJUnit.assertEquals(actualString, expectedString);
		} catch (AssertionError e) {
			System.out.println("\n <<<<<<<<<<  Result of Test 4 is as below = >>>>>>>>>> ");
		    System.out.println("\n Test 4 - is Fail since Start syntax for Email-id-0 in Comment_id_101 of Postid_21 by user Samantha is found not matching with 4 types of standard starting syntax of Emails like - (name@/ name.city@/ name_city@/ name-city@/)");
		    throw e;
		}
	   System.out.println("\n <<<<<<<<<<  Result of Test 4 is as below = >>>>>>>>>> ");
		System.out.println("\n Test 4 - is Pass since Start syntax for Email-id-0 in Comment_id_101 of Postid_21 by user Samantha is found matching with 4 types of standard starting syntax of Emails like - (name@/ name.city@/ name_city@/ name-city@/) ");
		System.out.println("\n--------------------------------------------------------------------------------------------------------------");
	}	
	
	

	private Object given() {
		// TODO Auto-generated method stub
		return null;
	
		
	}
	
	
	
	@Test(priority = 5, groups = {"Email_End_Syntax_validation"})
	public void Test_5_Email_End_Syntax_validation_for_Email_id_0_Comment_id_101_Postid_21_by_user_Samantha() {
   
		
	   System.out.println("\n ***** Test 5 - to validate the generic top-level domains (gTLD) ( .com/.org/.net/.de/.us/.co.uk/ .biz/ ) as standard ending syntax of Emails using <Hamcrest Matcher-Endswith> & <anyOf as OR operator> ***** "); 
	   System.out.println("\n ***** In this test - Email id [0] of Comment id - 101 in Post id - 21 by username - Samantha is being validated ***** ");
       
	   try {
	   ((RestAssured) given1()).
       when().
       get("https://jsonplaceholder.typicode.com/comments?postId=21").
       then().
       assertThat().
       
      // Using anyOf as OR operator with Hamcrest matcher - Endswith (Chain conditions together, test passes when target meets any of the conditions, similar to logical OR:) 
       
       body("email[0]", anyOf(endsWith("@rod.com"),containsString("@rod.org"),
   		                                           containsString("@rod.net"),
   		                                           containsString("@rod.de"),
   		                                           containsString("@rod.us"),
   		                                           containsString("@rod.co.uk"),
   		                                           containsString("@rod.biz")));
	   
	   
	 // Assert.fail("Test is failing");
	   	   
		   
		    Object actualString = null;
			Object expectedString = null;
			AssertJUnit.assertEquals(actualString, expectedString);
		} catch (AssertionError n) {
			System.out.println("\n <<<<<<<<<<  Result of Test 5 is as below = >>>>>>>>>> ");
		    System.out.println("\n Test 5 - is Fail since End syntax for Email-id-0 in Comment_id_101 of Postid_21 by user Samantha is found not matching with the generic top-level domains (gTLD) like - ( .com/.org/.net/.de/.us/.co.uk/ .biz/ )");
		    System.out.println("\n--------------------------------------------------------------------------------------------------------------");
		    throw n;
		}
	   System.out.println("\n <<<<<<<<<<  Result of Test 5 is as below = >>>>>>>>>> ");
		System.out.println("\n Test 5 - is Pass since End syntax for Email-id-0 in Comment_id_101 of Postid_21 by user Samantha is found matching with the generic top-level domains (gTLD) like - ( .com/.org/.net/.de/.us/.co.uk/ .biz/ )");
	   
	   // to add comment for "Else" failure test case as 
	   // Failed test case because - The domain name .tv for Email id [0] is the Internet country code top-level domain (ccTLD) for Tuvalu and not the accepted/pass generic top-level domain (gTLD)
        
		
	   
	  }	
	
	
	
	

	private Object given1() {
		// TODO Auto-generated method stub
		return null;
	
		
	}
}


