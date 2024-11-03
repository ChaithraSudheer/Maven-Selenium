package testNGDemo;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public class AnotationDemo {
  @Test(priority=1)
  public void registertest()
  {
	  System.out.println("This is Register test");
  }
  
  @Test(priority=2)
  public void logintest()
  {
	  System.out.println("This is Login test");
  }
  
  @Test(priority=3)
  public void logouttest()
  {
	  System.out.println("This is Register test");
  }
  
  //annotations
  @BeforeMethod
  public void bmethod()
  {
	  System.out.println("Before Method executes before every test case");
  }
  
  @AfterMethod
  public void amethod()
  {
	  System.out.println("Afer method executes after every test case");
  }
  
  @BeforeClass
  public void bclass()
  {
	  System.out.println("Before class executes before only first test case");
  }
  
  @AfterClass
  public void aclass()
  {
	  System.out.println("After class executes after only last test case");
  }
  
  @BeforeTest
  public void btest()
  {
	  System.out.println("Before test executes before class/all classes");
  }
  
  @AfterTest
  public void atest()
  {
	  System.out.println("After test will run after class/all classes");
  }
  
  @BeforeSuite
  public void bsuite()
  {
	  System.out.println("Before suite will execute before test");
  }
  
  @AfterSuite
  public void asuite()
  {
	  System.out.println("After suite will execute after test");
  }
  
}
