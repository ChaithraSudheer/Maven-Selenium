package pageObjectModel.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjectModel.pages.LoginPage;

public class LoginPageTest extends BaseClass
{

	@Test(priority=1)
	public void verifyUrl()
	{
		//LoginPage lp=new LoginPage();
		String url=lp.getUrl();
		Assert.assertTrue(url.contains("crm"),"url is invalid");
		System.out.println("Url is valid: "+url);
		
	}
	
	@Test(priority=2)
	public void verifyTitle()
	{
		String actTitle=lp.getAppTitle();
	    Assert.assertTrue(actTitle.contains("Customer Service"), "Title is not matched");
	    System.out.println("Title is mached "+actTitle);
	}

	@Test(priority=3)
	public void verifyLogin()
	{
		lp.doLogin("manya123@gmail.com", "Manya@123");
		Assert.assertTrue(driver.getCurrentUrl().contains("customers"),"Login is not completed");
		System.out.println("Login is completed");
	}

}
