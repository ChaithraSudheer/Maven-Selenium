package realtimeAnnotationsUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CRMTestBasic {
  @Test
  public void crmtest() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://automationplayground.com/crm/");
	  
	  //signin link
	  driver.findElement(By.linkText("Sign In")).click();
	  
	  //login
	  driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
	  driver.findElement(By.id("password")).sendKeys("test123");
	  driver.findElement(By.id("submit-id")).click();
	  
	  //close
	  driver.quit();
	  
	  
  }
}
