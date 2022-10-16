package webTesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoibiboApplication {

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.goibibo.com/flights/");
		/*
		driver.findElement(By.xpath("(//p[text()='Enter city or airport'])[1]")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("p");
		Thread.sleep(2000);
		List<WebElement> list=driver.findElements(By.xpath("//ul[@id='autoSuggest-list']//li//p[@class='sc-dPiLbb kUaZDb']//span[@class='autoCompleteTitle ']"));		
		System.out.println("Total Elements in list is: "+list.size());
		
		for(WebElement i:list)
		{
			String text=i.getText();
			System.out.println(text);
			
			if(text.contains("Pune, India"))
			{
				i.click();
				System.out.println("Match found");
				break;
			}
			
			
		}
		
		*/
		
		
		//calendar
		
		driver.findElement(By.xpath("//span[@class='sc-kfPuZi dprjVP fswDownArrow']")).click();
		
		
		//month selection expected data
				String month="December";
				String year="2022";
				String date="27";
				
				while(true)
				{
					String text=driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]")).getText();
					//Actual data
					String mon=text.split(" ")[0];
					String yer=text.split(" ")[1];
					
//					System.out.println(mon+" : "+yer);
//					break;
					
					if(mon.equals(month)&& yer.equals(year))//this is for current month
					{
						break;
					}else
					{
						driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();//this is for expected month
					}
					
				}
				
				//Selection for Date
				
				List<WebElement> alldates=driver.findElements(By.xpath("(//div[@class='DayPicker-Body'])[1]//div[contains(@class,'DayPicker-Day')]"));
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
