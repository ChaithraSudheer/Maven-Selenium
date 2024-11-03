package pageobjectmodelorangehrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewLoginPage 
{
	//declare driver
	private WebDriver driver;
	
	//initialize driver
	public NewLoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//locators
	private @FindBy(name="username")
		WebElement un;
	
	private @FindBy(name="password")
		WebElement psw;
	
	private @FindBy(xpath="//button[@type='submit']")
		WebElement btn;
	
	//actions
	public String geturl()
	{
		return driver.getCurrentUrl();
	}
	
	public String getapptitle()
	{
		return driver.getTitle();
	}
	
	public void dologin(String username, String password)
	{
		un.sendKeys(username);
		psw.sendKeys(password);
		btn.click();
	}
}
