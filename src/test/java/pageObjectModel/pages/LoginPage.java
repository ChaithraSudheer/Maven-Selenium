package pageObjectModel.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
    //declare driver
	private WebDriver driver;
	
	//Initialize driver
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//locators
	//login
	private By eml=By.id("email-id");
	private By pswd=By.id("password");
	private By submit=By.name("submit-name");
	
	//public methods
	
	public void doLogin(String email, String password)
	{
		driver.findElement(eml).sendKeys(email);
		driver.findElement(pswd).sendKeys(password);
		driver.findElement(submit).click();
	}
	
	public String getUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public String getAppTitle()
	{
		return driver.getTitle();
	}
	
}
