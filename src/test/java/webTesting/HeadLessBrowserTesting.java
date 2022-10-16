package webTesting;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import helperUtility.DropdownUtillity;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLessBrowserTesting {

	public static void main(String[] args)
	{
		//Headless mode
			ChromeOptions obj=new ChromeOptions();
			obj.setHeadless(true);
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver(obj);
			driver.get("https://www.amazon.in/");
			
			//address of dropdown
				
			WebElement ele1=driver.findElement(By.id("searchDropdownBox"));
			DropdownUtillity.selectBasedDropDown(ele1,"Prime Video");
			
			
			
			
			
			/*
			//Capabilities(browser properties)
			
			ChromeDriver driver=new ChromeDriver();
			Capabilities cap=driver.getCapabilities();
			System.out.println("Browser name:"+cap.getBrowserName());
			System.out.println("Browser version: "+cap.getBrowserVersion());
			System.out.println("Platform details: "+cap.getPlatformName());
			//All Properties 
			Map<String,Object> map=cap.asMap();
			
			System.out.println(map);
			*/
			
			
			
			
			
	}

}
