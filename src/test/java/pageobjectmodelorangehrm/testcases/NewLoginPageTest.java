package pageobjectmodelorangehrm.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageobjectmodelorangehrm.pages.NewLoginPage;

public class NewLoginPageTest extends BaseClass
{
	
	@Test(priority=1)
	public void verifyurl()
	{
		np.geturl();
	}
	
	@Test(priority=2)
	public void veriftitle()
	{
		np.getapptitle();
	}
  @Test(priority=2)
  public void verifylogin()
  {
	  //NewLoginPage np=PageFactory.initElements(driver, NewLoginPage.class);
	  np.dologin("Admin", "admin123");
  }
}
