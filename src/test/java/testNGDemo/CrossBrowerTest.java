package testNGDemo;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowerTest {
  @Test
  public void chromeTest() 
  {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.amazon.in");
	   
  }
  
  
  @Test
  public void firefoxTest()
  {
	  WebDriverManager.firefoxdriver().setup();
	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://www.google.com");
	  
	  
	  
  }
  
  @Test
  public void edgeTest()
  {
	  WebDriverManager.edgedriver().setup();
	  WebDriver driver=new EdgeDriver();
	  driver.get("https://www.facebook.com");
  
  
  }
  
  
}
