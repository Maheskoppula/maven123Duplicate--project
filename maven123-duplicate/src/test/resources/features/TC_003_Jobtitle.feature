
 Feature: i am automating HRM Application
 
 Background: Common re_usable stpes
  Given user lanuch browser
  Then user enter  url as "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
  
  
  Scenario: TC_003  Jobtitle Record -creating  skills record
  
   
   And user enter usename as "Admin"  and password as "admin123" click  login as  button
   
   Then user goto Job Titles page
   
   Then user enters Job Ttile as "Devop" and Jon Description as "html" click on save button
   Then close the  browser
   
   