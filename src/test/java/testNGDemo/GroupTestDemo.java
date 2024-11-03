package testNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class GroupTestDemo {
  @Test(priority=1,groups="SmokeTest")
  public void verifyurl() 
  {
	  System.out.println("Test url: This is smoke test case");
  }
  
  @Test(priority=2,groups="SmokeTest")
  public void verifylink()
  {
	  System.out.println("Link Test: This is smoke test case");
  }
  
  @Test(priority=3,groups="FunctionalTest")
  public void verifylogin()
  {
	  System.out.println("Login Test: This is Functional test case");
  }
  
  @Test(priority=4,groups="FunctionalTest")
  public void verifytitlr()
  {
	  System.out.println("Title Test:This is functional test case");
  }
  
  @Test(priority=5,groups="FunctionalTest")
  public void verifyLogout()
  {
	  System.out.println("Logout test:this is Functional test case");
  }
}
