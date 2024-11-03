package helper;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility 

{
	//screenshot
	public static void getScreenshot(WebDriver driver)
	{
		//create object using driver
		  TakesScreenshot ts=(TakesScreenshot) driver;
		  
		  //takes screenshot==>temp file
		 File temp=ts.getScreenshotAs(OutputType.FILE);
		 
		 //location
		 File dest=new File("./"+"\\Screenshots\\ProjectName"+System.currentTimeMillis()+".png");
		 
		 //from temp---->dest file
		 try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//Java Script methods
	public static void ScrollDown(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollheight)");
	}
	
	public static void ScrollUp(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(document.body.scrollheight,0)");
	}

	public static void ScrollToElement(WebDriver driver, WebElement ele)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView)",ele);
	}
	
	
	//WebDriverWait=Explicit wait()
	public static WebElement waitforPresenceofElement(WebDriver driver, By loc)
	{
		WebDriverWait obj=new WebDriverWait(driver, Duration.ofSeconds(5));
		return obj.until(ExpectedConditions.presenceOfElementLocated(loc));
	}
	
	public static WebElement waitforElementClickable(WebDriver driver, By loc)
	{
		WebDriverWait btnobj=new WebDriverWait(driver, Duration.ofSeconds(5));
		return btnobj.until(ExpectedConditions.elementToBeClickable(loc));
	}
	
	public static WebElement waitforVisibilityofElement(WebDriver driver, By loc)
	{
		WebDriverWait obj=new WebDriverWait(driver, Duration.ofSeconds(5));
		return obj.until(ExpectedConditions.visibilityOfElementLocated(loc));
	}
	
	public static boolean waitForUrlContains(WebDriver driver, String url)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		return wait.until(ExpectedConditions.urlContains(url));	
	}
	
	public static boolean waitForTitleContains(WebDriver driver, String title)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.titleContains(title));	
	}
	
	
	//select based drop down
	public static void SelectBasedDropDown(WebElement ele, String value)
	{
		Select sd=new Select(ele);
		System.out.println("Is dropdown support multiple selection: "+sd.isMultiple());
		List<WebElement> alloptions=sd.getOptions();
		System.out.println("Total options are: "+alloptions.size());
		for(WebElement i:alloptions)
		{
			System.out.println(i.getText());
			if(i.getText().contains(value))
			{
				i.click();
				break;
			}
		}
	}


}
