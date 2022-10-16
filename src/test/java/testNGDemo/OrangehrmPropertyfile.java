package testNGDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import helperUtility.PropertyUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangehrmPropertyfile {
  @Test
  public void hrmLogin() throws IOException
  {
//	  File f1=new File("./"+"\\Config.properties");
//	  FileInputStream fs=new FileInputStream(f1);
//	  Properties p1=new Properties();
//	  p1.load(fs);
	  
	  
	  

		WebDriverManager.chromedriver().setup();
	  	WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Properties p1=PropertyUtil.propertyRead();
		driver.get(p1.getProperty("url"));
		driver.manage().window().maximize();
		//username
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(p1.getProperty("un"));
				
				//password
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(p1.getProperty("psw"));
				
				//login 
		driver.findElement(By.xpath("//button[@type='submit']")).click();
				
  }
}
