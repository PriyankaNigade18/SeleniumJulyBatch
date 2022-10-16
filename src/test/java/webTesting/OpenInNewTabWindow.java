package webTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenInNewTabWindow {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		//In new Window
		WebDriver newWindow=driver.switchTo().newWindow(WindowType.WINDOW);
		newWindow.get("https://www.amazon.in");
		System.out.println("Title is: "+newWindow.getTitle());
		
		//In new Tab
		for(int i=1;i<=10;i++) {
		WebDriver newTab=driver.switchTo().newWindow(WindowType.TAB);
		newTab.get("https://www.facebook.com");
		
		}
		
		
		
		
		
		
	}

}
