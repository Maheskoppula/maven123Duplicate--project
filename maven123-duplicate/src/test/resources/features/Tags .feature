
Feature: I am automating HRM Application


Background: Common re_usable steps

Given user launch browser
Then user enter url as "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

@smoke
Scenario: TC_002_Addskils Record-creating skils record

And user enter username as "Admin" and password as "admin123" and clicks login as button
Then user go to skils page
Then user enters skils name as "java automation2535" and description as "java123444005554" and click on save button
Then click on login button
Then close the browser




Scenario: TC_003  Jobtitle Record -creating  skills record
  
   
   And user enter usename as "Admin"  and password as "admin123" click  login as  button
   
   Then user goto Job Titles page
   
   Then user enters Job Ttile as "Devop" and Jon Description as "html" click on save button
   Then close the  browser
   
   
   
   Scenario: TC_004_Nationalities Record_creating skils record

 And user enter username as "Admin" and password as "admin123" and clicks login as button
 
 Then user go to Nationalities page
 Then user go to Nationalities Name   and click on save button
 Then close the browser






