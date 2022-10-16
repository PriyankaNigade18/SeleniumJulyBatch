package webTesting;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindowHanadling {

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		//Parent window
		String parentId=driver.getWindowHandle();
		System.out.println(parentId);
		//orangehrm link
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		//child window
		Set<String> allwindows=driver.getWindowHandles();
		System.out.println(allwindows);
		for(String childId:allwindows)
		{
			if(!parentId.equals(childId))
			{
				driver.switchTo().window(childId);
				driver.findElement(By.xpath("//input[@id='myText']")).sendKeys("piyu1818@gmail.com");
				//driver.close();
				//driver.quit();
			}
		}
		driver.switchTo().window(parentId);
		driver.findElement(By.name("username")).sendKeys("Priyanka");
		
		
		
		
		//
		
		

	}

}
