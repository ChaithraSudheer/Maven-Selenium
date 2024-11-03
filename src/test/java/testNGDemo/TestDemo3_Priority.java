package testNGDemo;

import org.testng.annotations.Test;

public class TestDemo3_Priority {
  @Test(priority=1, description="This is first test case")
  public void registertest() 
  {
	  System.out.println("This is register test");
  }
  
  @Test(priority=2,description="This is second test case")
  public void logintest()
  {
	  System.out.println("This is login test");
  }
  
  @Test(priority=3,description="This is third test case")
  public void searchproducttest()
  {
	  System.out.println("This is search product test");
  }
  
  @Test(priority=4,description="This is fourth test case")
  public void addtocarttest()
  {
	  System.out.println("This is add to cart test");
  }
}
