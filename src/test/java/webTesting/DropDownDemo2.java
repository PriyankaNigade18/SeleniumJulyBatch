package webTesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import helperUtility.DropdownUtillity;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownDemo2
{
	
	
	
	

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		// day drop down
		WebElement daydd=driver.findElement(By.id("day"));
		DropdownUtillity.selectBasedDropDown(daydd,"27");
		
		//month address
		WebElement mondd=driver.findElement(By.id("month"));
		DropdownUtillity.selectBasedDropDown(mondd,"Dec");
		
		//year
		WebElement yerdd=driver.findElement(By.id("year"));
		DropdownUtillity.selectBasedDropDown(yerdd,"2010");
		
//		Select daydd=new Select(ele1);
//		List<WebElement> alloptions=daydd.getOptions();
//		System.out.println("Total Elements in Drop down are: "+alloptions.size());
//		
//		for(WebElement i:alloptions)
//		{
//			System.out.println(i.getText());
//			if(i.getText().equals("27"))
//			{
//				i.click();
//				break;
//			}
//		}
//		

		
		
		
		
		
		
		
		
		
		
		

	}

}
