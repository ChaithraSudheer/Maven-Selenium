package testNGDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTitleValidation {
  @Test
  public void titlevalidation() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com");
	  //get title
	  String title=driver.getTitle();
	  //validate
	  Assert.assertEquals(title, "Google", "Fail:Title not matched");
	  System.out.println("Pass:Title matched");
	  
  }
}
