package pageObjectModel.TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import pageObjectModel.pages.LoginPage;

public class BaseClass 
{
	public WebDriver driver;
	public LoginPage lp;
	
	@BeforeClass
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://automationplayground.com/crm/login.html");
		lp=new LoginPage(driver);
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
}
