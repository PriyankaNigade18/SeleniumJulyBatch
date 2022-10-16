package testNGDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class DataReadFromPropertiesFile
{
	
  @Test
  public void testCase() throws IOException 
  {
	 //To read data from File set up path 
	  File f1=new File("./"+"\\Config.properties");
	  
	  //read
	 FileInputStream fs=new FileInputStream(f1);
	 
	 Properties p1=new Properties();
	 p1.load(fs);
	 
	 System.out.println("Browser name: "+p1.getProperty("bname"));
	 System.out.println("Browser version: "+p1.getProperty("bversion"));
	 System.out.println("Platform is: "+p1.getProperty("platform"));
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	  
	  
	  
  }
}
