package pageobjectmodelorangehrm.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjectmodelorangehrm.pages.LoginPage;

public class LoginPageTest extends BaseClass
{
  @Test(priority=1)
  public void verifyurl() 
  {
	  //create object
	  //LoginPage lp=new LoginPage();
	  String url=lp.getUrl();
	  Assert.assertTrue(url.contains("orangehrmlive"), "Url is invalid");
	  System.out.println("Url is valid");
  }
  
  @Test(priority=2)
  public void verifytitle() 
  {
	  String acttitle=lp.gettitle();
	  Assert.assertTrue(acttitle.contains("OrangeHRM"), "Title is not matched");
	  System.out.println("Title is matched");
  }
  
  @Test(priority=3)
  public void verifylogin() 
  {
	  lp.dologin("Admin", "admin123");
	  Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"), "Login is failed");
	  System.out.println("Login is completed");
  }
}
