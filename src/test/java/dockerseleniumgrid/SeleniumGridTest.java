package dockerseleniumgrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumGridTest {
  @Test
  public void gridTest() throws MalformedURLException, InterruptedException 
  {
	  ChromeOptions options=new ChromeOptions();
	  
	  System.out.println("Driver Session will start on Grid");
	  
	  WebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444"),options);
	  
	  Thread.sleep(8000);
	  
	  driver.get("https://www.google.com");
	  
	  Thread.sleep(5000);
	  
	  System.out.println("Application opens!!!");
	  
	  System.out.println("Title is: "+driver.getTitle());
	  
	  driver.quit();
	  
  }
}
