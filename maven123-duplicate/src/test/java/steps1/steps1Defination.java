package steps1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class steps1Defination {
WebDriver driver;
	
	@Given("user lanuch browser")
	public void user_lanuch_browser() {
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
		
		
	}
	@Then("user enter  url as {string}")
	public void user_enter_url_as(String applicationUrl) {
	    driver.get(applicationUrl);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	
	
	@Then("user enter usename as {string}  and password as {string} click  login as  button")
	public void user_enter_usename_as_and_password_as_click_login_as_button(String userName, String password) {
	   driver.findElement(By.name("username")).sendKeys(userName);
		 driver.findElement(By.name("password")).sendKeys(password);
	   driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	}
	
	
	
	@Then("user goto Job Titles page")
	public void user_goto_job_titles_page() {
		
		
//		driver.findElement(By.xpath("//a[@class=\"oxd-main-menu-item active\"]")).click();
		
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		
		//driver.findElement(By.xpath("//span[text()='Job ']")).click();
		driver.findElement(By.xpath("//span[text()='Job ']")).click();
		driver.findElement(By.xpath("//a[text()='Job Titles']")).click();	
		
		
		driver.findElement(By.xpath("//button[text()=' Add ']")).click();
	
	}
	
	
	
	
	@Then("user enters Job Ttile as {string} and Jon Description as {string} click on save button")
	public void user_enters_job_ttile_as_and_jon_description_as_click_on_save_button(String string, String string2) {
	 
		
	}
	@Then("close the  browser")
	public void close_the_browser() {
	    
	}
}
