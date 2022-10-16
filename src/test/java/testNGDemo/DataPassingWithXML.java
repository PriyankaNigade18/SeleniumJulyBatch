package testNGDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.Test;

public class DataPassingWithXML
{
	@Parameters({"un","psw"})
  @Test
  public void testCase(String un,String psw) 
  {
	  System.out.println("User name is: "+un);
	  System.out.println("Password is: "+psw);
  }
	
	
	
	@Parameters({"un1","psw1"})
	@Test
	public void hrmLogin(String un1,String psw1)
	{
		WebDriverManager.chromedriver().setup();
	  	WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		//username
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(un1);
				
				//password
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(psw1);
				
				//login 
		driver.findElement(By.xpath("//button[@type='submit']")).click();
				
	}
	
	
	
	
}
