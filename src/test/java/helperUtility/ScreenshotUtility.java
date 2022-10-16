package helperUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotUtility 
{
	
	
	public static void capture(WebDriver driver)
	{
		 
		  try {
			FileHandler.copy(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE),new File("./"+"\\Screenshots\\Sc"+System.currentTimeMillis()+".png"));
		} catch (WebDriverException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
