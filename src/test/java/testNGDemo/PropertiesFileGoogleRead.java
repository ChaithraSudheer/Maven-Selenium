package testNGDemo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import helper.PropertiesUtil;

public class PropertiesFileGoogleRead {
  @Test
  public void readFile() throws IOException
  {
	  /*
	  //File
	  File f1=new File("./"+"\\config.properties");
	  
	  //read in a stream
	  FileInputStream fs=new FileInputStream(f1);
	  
	  //Properties file
	  Properties p1=new Properties();
	  
	  p1.load(fs);
	  
	  System.out.println("Title is: "+p1.getProperty("title"));
	  */
	  
	  /*
	  //hard code
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com");
	  
	  driver.findElement(By.name("q")).sendKeys("Java",Keys.ENTER);
	  
	  Assert.assertTrue(driver.getTitle().contains("Google"), "Title is not matched");
	  System.out.println("Title is matched");
	  
	  */
	  
	  //code using property file
	  PropertiesUtil p1=new PropertiesUtil();
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get(p1.getData("url"));
	  
	  Assert.assertTrue(driver.getTitle().contains(p1.getData("title")), "Title is not matched");
	  System.out.println("Title is matched");
	  
	  driver.findElement(By.name(p1.getData("name"))).sendKeys(p1.getData("input"),Keys.ENTER);
	  
	  
	  
  }
}
