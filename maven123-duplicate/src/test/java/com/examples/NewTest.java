package com.examples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
	
  @Test
  public void f() {
	  
	  driver = new ChromeDriver();
	  
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().window().maximize();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.findElement(By.name("username")).sendKeys("Admin");
	  
	  driver.findElement(By.name("password")).sendKeys("admin123");
	  
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	  
	  
	  
	  driver.findElement(By.xpath("//a[@class=\"oxd-main-menu-item active\"]")).click();
	  
	  
	  driver.findElement(By.xpath("(//span[@class=\"oxd-topbar-body-nav-tab-item\"])[4])")).click();
	  
	  driver.findElement(By.xpath("(//a[@class=\"oxd-topbar-body-nav-tab-link\"])[1]")).click();
	  
	   driver.findElement(By.xpath("//i[@class=\"oxd-icon bi-plus oxd-button-icon\"]")).click();
	   
	   
	   driver.findElement(By.xpath("//input[@class=\"oxd-input oxd-input--active\"]")).sendKeys("mahesh");
	   driver.findElement(By.xpath("//textarea[@placeholder=\"Type description here\"]")).sendKeys("automation selenium");
	   
	   
	   driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]")).click();
	   
	  
			  
	  
	 
	  
	  
  }
}
