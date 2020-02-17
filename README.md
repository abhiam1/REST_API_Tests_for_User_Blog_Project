# REST_API_Tests_for_User_Blog_Project
[![CircleCI](https://circleci.com/gh/abhiam1/REST_API_Tests_for_User_Blog_Project.svg?style=svg)](https://circleci.com/gh/abhiam1/REST_API_Tests_for_User_Blog_Project)


       Title - User Blog API Tests - using Rest Assured + Test NG + Maven - by Abhijit Malankar - MSc Engg TU Berlin - Feb 2020 
 
          A) Essential Test Set up Requirements for Testing this folder is  
 
1) Eclipse IDE with JRE system library JAVA SE 1.8 
2) Rest Assured Library 
3) Test NG ( with Class based Testng Suite xml + Groups based Testng Suite xml + Maven Library ( updated POM.xml ) 
   TestNG requires JDK 7 or higher. 
4) Access to User Blog API published here: https://jsonplaceholder.typicode.com/ 
5) GIT Hub & Circle CI login  access 

   
          B) About the Test cases in the repository 
      
Test Solutions folder location - REST_API_Tests_for_User_Blog_Project/User_Blog_REST_API_Tests/src/test/java/com/qatest/ 
I have focused on completing following test tasks which ensures complete proof of concept (PoC) & modular implementation of the TestNG + Rest Assured API based automation tests , which can be easily scaled up further -
1) Test 1 -Search for user - Samantha is executed as per the requirements document
2) Test 2 - Search for posts by user - Samantha is executed as per the requirements
3) Test 3a - Search for comments by user - Samantha is executed as per the requirements
4& 5) Test 3b1 & 3b2 - Validation of start & end syntax of emails by user - Samantha has been limited to 1 email id implementing the KISS best practices for coding - This 1 verification of Email id [0] within Comment id - 101 in Post id - 21 by username - Samantha has been successfully accomplished.Similarly all 49 remaining email ids can also be verified using similar test logic with changes in the email id to be validated.
6) 4 types of standard Starting syntax are being validated for Emails like - (name@/ name.city@/ name_city@/ name-city@/ )  using <Hamcrest Matcher-Startswith> & <anyOf as OR operator>
7) 7 types of standard Ending syntax of emails is being validated for generic top-level domains (gTLD) ( .com/.org/.net/.de/.us/.co.uk/ .biz/ ) using <Hamcrest Matcher-Endswith> & <anyOf as OR operator>
8) Similarly remaining email ids , i.e.Email id [1] to Email id [4] for Comment id - 102 to Comment id - 105 within Post id - 21 by username - Samantha can be validated . This can be further scaled up to cover Post id - 22 to Post id - 30 by username - Samantha.


          C) Implementation of best coding practices like DRY , KISS , YAGNI , SOC and SOLID.

For designing of the test cases for the Restful API tests I have implemented the best coding practices like DRY , KISS , YAGNI , SOC and SOLID as below - 

         DRY - “Dont repeat yourself” principle 
I have implemented DRY best practise for the Listener class called the  “TrackTestExecution_Testng_Listener”  in the test case solution. This Listener class is called within all the test classes to keep a watch for failed test cases and display a message for failed test case in the test reports and console output for better information to the test engineer for further analysis of failed test case.

          KISS - “Keep it simple Stupid” principle    

The KISS principle has been applied to all of the test cases as follows - 

1 - Each test case has been assigned to a separate test class , so each test case can be worked on separately in case of test design issues or modifications by the test engineer without hampering the task of remaining test cases execution and this updated test class can be integrated later with the remaining test suite when complete. 

2- We have created a very modular test execution structure by creating a “Classes based TestNG suite” and also a “Groups based TestNG suite” . The advantage of this is that based on the test cycle requirements , specific test groups or test classes can be added or removed from the T Best suite quickly to achieve better test coverage and test cycle focus as essential. It also allows for quick isolated troubleshooting in case of any errors in the test case , by removing that specific class / group from the suite & continuing with the execution of the remaining suite . 

3- Additionally the TRY-CATCH routine which gives a failed test case output message to the eclipse console directly for further analysis by the test engineer has been implemented for only the failing test case 5) of Email End syntax mismatch as a proof of concept (PoC) . This can also be implemented for other test cases as required .  

4- I have validated as a proof of concept (PoC) 1 email id from among 50 total email ids , to be validated for the email syntax validation. This 1 verification of Email id [0] within Comment id - 101 in Post id - 21 by username - Samantha has been successfully accomplished as per the KISS principle. Similarly all 49 remaining email ids can also be verified using similar test logic with changes in just the email id contents to be validated . 

5- The missing requirements of email id start and end syntax have been assumed based upon 4 types of standard Starting syntax for Emails like - (name@ / name.city@ / name_city@ / name-city@ / ) while 7 types of standard Ending syntax of emails for generic top-level domains (gTLD) ( .com/.org/.net/.de/.us/.co.uk/ .biz/ ) as per the KISS principle.

6- Wherever required , messages have been added within the test case classes as well as for the test case outputs appearing on console and reports for better information to the test engineer and all the product stakeholders & for ease of troubleshooting and test maintenance later .  

             YAGNI - “You are not going to need it “ principle  

For implementing this best practice , i have done away with any unrequired imports or classes or additional dependencies of any sort .
No junk code or unused junk statements are kept back in the class files . 


              SOC - “ Separation of Concerns “ & the SOLID - principle of “Single   
                          Responsibility” 
    
This refers to “ doing just one thing well “  . For implementing this best practice of SOC and SOLID , 
We have separated each test case into different class and different groups as well , so that a test engineer is able to focus on just one functionality at a time for test development and maintenance , without obstructing the execution of a complete test suite during a regression on a smoke test cycle using the classes / groups based testng test suites available . 
    
  
             D)  Test NG based classes suite as well as Test NG based groups suite : 

For ease of test execution and troubleshooting , i have implemented both classes and groups based test suites .xml files which are available in the GITHUB repository here - 
https://github.com/abhiam1/REST_API_Tests_for_User_Blog_Project/tree/master/User_Blog_REST_API_Tests 

As TestNG - Test Suite - can be run by - Right Click on the Testng.xml file in this folder and selecting to "run as a Test NG suite" which is a test suite made combining classes or Groups. 


               E) Reports 

Testng Test Reports can be observed in 3 locations after the test is run (+ file/refresh) within the Test-Output sub folder  
      a) emailable-report.html  - open with web browser
      b) Index.html - open with web browser
      c) Console messages
      
Example reports have been uploaded in the repository as well .    

               F) Circle CI integration 
               
   For continuos integration we have integrated the Circle CI tool and created a config.yml file in the root of this repository. Further integration steps for this Circle CI tool are in process at the moment.              

In case of any questions , please get in touch on email - abhiam1@gmail.com or skype - abhiam11 
     
    
     Thanks . 
     Abhijit Malankar 
     MSc Engg TU Berlin 

