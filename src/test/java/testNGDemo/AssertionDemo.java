package testNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionDemo {
  @Test
  public void hardAssert() 
  {
	  String act="Selenium WebDriver is WebUI automation library.";
	  String exp="TestNG";
	  
	  //Assert.assertEquals(act, exp);//AssertionError
	  
	  //Assert.assertTrue(act.contains(exp));
	  
	  Assert.assertFalse(act.contains(exp));
	  
	  System.out.println("Hard assert demo is completed!");
  }
  
  
  @Test
  public void softAssert()
  {
	  SoftAssert sf=new SoftAssert();
	  String act="Selenium WebDriver is WebUI automation library.";
	  String exp="WebUI";
	  
	 // sf.assertEquals(act, exp, "Strings are not matching");
	  
	  //sf.assertTrue(act.contains(exp), "Expected string is not available");
	  
	  sf.assertFalse(act.contains(exp));
	  
	  
	  System.out.println("Soft Assert Demo completed");
	  
	  sf.assertAll();
	  
	  
	  
  }
  
  
  
  
  
  
}
