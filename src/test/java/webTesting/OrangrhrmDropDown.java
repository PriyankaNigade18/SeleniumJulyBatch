package webTesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangrhrmDropDown
{
	public static void bootstrapDropdown(WebDriver driver,String value)
	{
		List<WebElement> dd=driver.findElements(By.xpath("//div[@role='listbox']//div//span"));
		System.out.println("Total Options: "+dd.size());
		for(WebElement i: dd)
		{
			//System.out.println(i.getText());
		
			String text=i.getText();
			System.out.println(text);
			if(text.contains(value))
			{
				i.click();
				break;
				
			}
			
			
			
		}
	}
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		//username
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		
		//password
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		
		//login 
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//Employee status
		driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")).click();
		bootstrapDropdown(driver,"Full-Time Probation");
		
		//include
		driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")).click();		
		bootstrapDropdown(driver,"Current and Past Employees");
		
		//job title
		driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[3]")).click();		
		bootstrapDropdown(driver,"VP - Client Services");

		
		//sub unit
		driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[4]")).click();		
		bootstrapDropdown(driver,"Human Resources");

		
		
		//capture list
//		List<WebElement> empdd=driver.findElements(By.xpath("//div[@role='listbox']//div//span"));
//		System.out.println("Total Options: "+empdd.size());
//		for(WebElement i: empdd)
//		{
//			//System.out.println(i.getText());
//		
//			String text=i.getText();
//			System.out.println(text);
//			if(text.contains("Full-Time Probation"))
//			{
//				i.click();
//				break;
//				
//			}
//			
//			
//			
//		}
		
		//include
		


	}

}
