package webTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import helperUtility.DropdownUtillity;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownDemo1 {

	public static void main(String[] args) throws InterruptedException
	{
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.in/");
			
			//address of dropdown
				
			WebElement ele1=driver.findElement(By.id("searchDropdownBox"));
			DropdownUtillity.selectBasedDropDown(ele1,"Prime Video");
			
			
			
			
			
			/*
			Select ddele=new Select(ele1);
			System.out.println("Drop down support multiple selection?: "+ddele.isMultiple());
			
			ddele.selectByVisibleText("Baby");
			Thread.sleep(2000);
			ddele.selectByValue("search-alias=fashion");
			Thread.sleep(2000);
			ddele.selectByIndex(1);
			
			*/
			
			
			
			
			/*
			//To capture all values of drop down
			List<WebElement> alloptions=ddele.getOptions();
			System.out.println("Total Options in dropdown is: "+alloptions.size());
			
			//iterate all option
			
			for(WebElement i:alloptions)
			{
				System.out.println(i.getText());
				if(i.getText().equals("Kindle Store"))
				{
					i.click();
					break;
				}
			}
			
			*/
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			

	}

}
