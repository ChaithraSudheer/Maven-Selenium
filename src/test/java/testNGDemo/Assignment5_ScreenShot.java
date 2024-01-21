package testNGDemo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Assignment5_ScreenShot {
  @Test
  public void capture() throws IOException 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.flipkart.com/");
	  
	  //create object using driver
	  TakesScreenshot ts=(TakesScreenshot) driver;
	  File temp=ts.getScreenshotAs(OutputType.FILE);
	  //location
	  File dest=new File("./"+"\\Screenshots\\flipkart1.png");
	  FileHandler.copy(temp, dest);
	  
  }
}
