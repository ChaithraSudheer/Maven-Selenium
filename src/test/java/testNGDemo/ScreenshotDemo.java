package testNGDemo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class ScreenshotDemo {
  @Test
  public void capture() throws IOException
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.amazon.in");
	  
	  //create object using driver
	  TakesScreenshot ts=(TakesScreenshot) driver;
	  
	  //takes screenshot==>temp file
	 File temp=ts.getScreenshotAs(OutputType.FILE);
	 
	 //location
	 File dest=new File("./"+"\\Screenshots\\amazon2.png");
	 
	 //from temp---->dest file
	 FileHandler.copy(temp, dest);
	 
	  
	  
  }
}
