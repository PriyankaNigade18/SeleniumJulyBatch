package testNGDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RealTimeAnnotation extends BaseClass
{
	//WebDriver driver;
	
	@Test
  public void hrmLogin() 
  {		
		
		//username
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		
		//password
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		
		//login 
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
			
  }
  
  @Test
  public void hrmLogout()
  {
	//Logout
			driver.findElement(By.xpath("//i[contains(@class,'oxd-userdropdown-icon')]")).click();
			
			driver.findElement(By.xpath("//a[text()='Logout']")).click();
  }
  
  
}
