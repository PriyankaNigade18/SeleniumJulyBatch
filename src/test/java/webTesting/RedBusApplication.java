package webTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBusApplication {

	public static void main(String[] args) 
	{

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		//from
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Viman Nagar",Keys.ENTER);
		//to
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Nigadi",Keys.ENTER);
		
		//date
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		
		//month selection expected data
		String month="Dec";
		String year="2022";
		String date="27";
		
		while(true)
		{
			String text=driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
			//Actual data
			String mon=text.split(" ")[0];
			String yer=text.split(" ")[1];
			
//			System.out.println(mon+" : "+yer);
//			break;
			
			if(mon.equals(month)&& yer.equals(year))//this is for current month
			{
				break;
			}else
			{
				driver.findElement(By.xpath("//button[text()='>']")).click();//this is for expected month
			}
			
		}
		
		//Selection for Date
		
		List<WebElement> alldates=driver.findElements(By.xpath("//table//tbody//tr//td"));
		System.out.println("Total dates: "+alldates.size());
		for(WebElement i: alldates)
		{
			System.out.println(i.getText());
			if(i.getText().equals(date))
			{
				i.click();
				break;
			}
		}
		
		
		
		
		
		
		
		
	}

}
