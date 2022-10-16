package webTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootstrapDropdownDemo1 {

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/bootstrap/bootstrap_dropdowns.asp");
		
		//address of dropdown
		driver.findElement(By.xpath("//button[@id='menu1']")).click();
		
		//all options
		List<WebElement> list=driver.findElements(By.xpath("(//ul[@class='dropdown-menu test'])[1]//li//a"));
		System.out.println("Total options are: "+list.size());

		for(WebElement i:list)
		{
			System.out.println(i.getText());
		}
		
		
		
		
		
		
		
		
		

	}

}
