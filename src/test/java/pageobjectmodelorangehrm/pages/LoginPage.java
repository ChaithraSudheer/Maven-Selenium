package pageobjectmodelorangehrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage 
{
	//declare driver-private
	private WebDriver driver;
	
	//initialize driver-Base Class
	public LoginPage(WebDriver driver)
	{
	  this.driver=driver;
	}
	
	//locators
	private By un=By.name("username");
	private By psw=By.name("password");
	private By btn=By.xpath("//button[@type='submit']");
	
	//public methods-Actions
	public void dologin(String username, String password)
	{
		driver.findElement(un).sendKeys(username);
		driver.findElement(psw).sendKeys(password);
		driver.findElement(btn).click();
	}
	
	public String getUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public String gettitle()
	{
		return driver.getTitle();
	}
	

}
