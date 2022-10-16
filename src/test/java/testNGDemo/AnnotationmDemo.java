package testNGDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationmDemo
{
  @Test
  public void testCase1() 
  {
	  System.out.println("This is Test 1");
  }
  
  @Test
  public void testCase2()
  {
	  System.out.println("This is Test 2");
  }
  
  
  @Test
  public void testCase3()
  {
	  System.out.println("This is Test 3");
	  
  }
  //Annotation
  @BeforeMethod
  public void bmethod()
  {
	  System.out.println("Before Method execute before every test case");
  }
  
  @AfterMethod
  public void amethod()
  {
	  System.out.println("After method will execute after test case");
  }
  
  @BeforeClass
  public void bclass()
  {
	  System.out.println("Before class execute before first test case");
  }
  
  
  @AfterClass
  public void aclass()
  {
	  System.out.println("After class executes after last test case");
  }
  
  @BeforeTest
  public void btest()
  {
	  System.out.println("Before Test execute before class");
  }
  
  @AfterTest
  public void atest()
  {
	  System.out.println("AfterTest executes after class");
  }
  
  @BeforeSuite
  public void bsuite()
  {
	  System.out.println("BeforeSuite executes before test");
  }
  
  @AfterSuite
  public void asuite()
  {
	  System.out.println("Aftersuite will executes after test");
  }
  
  
}
