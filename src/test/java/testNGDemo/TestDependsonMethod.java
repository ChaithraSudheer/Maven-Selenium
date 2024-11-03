package testNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDependsonMethod {
  @Test(priority=1)
  public void register()
  {
	  System.out.println("User must be registered");
	  //boolean status=true;
	  boolean status=false;
	  Assert.assertTrue(status);
  }
  
  @Test(priority=2, dependsOnMethods="register")
  public void login()
  {
	  System.out.println("After registeration user can login");
  }
}
