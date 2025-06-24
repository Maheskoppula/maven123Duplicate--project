Feature:I am autoting HRM Application


Background: Common re_usable steps 

Given user launch browser
Then user enter url as "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

Scenario: TC_004_Nationalities Record_creating skils record

 And user enter username as "Admin" and password as "admin123" and clicks login as button
 
 Then user go to Nationalities page
 Then user go to Nationalities Name   and click on save button
 Then close the browser
 
 
 
 
 


 