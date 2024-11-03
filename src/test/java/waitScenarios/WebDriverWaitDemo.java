package waitScenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitDemo {

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
	
	
	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		//use by locator
		By email=By.id("input-email");
		By psw=By.id("input-password");
		By btn=By.xpath("//input[@type='submit']");
		
		boolean status=waitForUrlContains(driver,"login");
		
		if(status)
		{
			System.out.println("Url is: "+ driver.getCurrentUrl());
			
			boolean title=waitForTitleContains(driver,"Account");
			System.out.println("status is: "+driver.getTitle());
			
		
		//email
		WebElement ele1=waitforPresenceofElement(driver,email);
		ele1.sendKeys("teat@gmail.com");
		
		//password
		waitforVisibilityofElement(driver,psw).sendKeys("test123");
		
		//button
		WebElement ele2=waitforPresenceofElement(driver,btn);
		ele2.click();
		
		}
		
		/*   every element object has to create so use reusable method
		//web driver  wait object creation
		WebDriverWait obj=new WebDriverWait(driver, Duration.ofSeconds(5));
		//put expected conditions
		WebElement ele=obj.until(ExpectedConditions.presenceOfElementLocated(email));
		//pass data
		ele.sendKeys("test@gmail.com");
		
		//button
		WebDriverWait btnobj=new WebDriverWait(driver, Duration.ofSeconds(5));
		btnobj.until(ExpectedConditions.elementToBeClickable(btn)).click();
	
	*/
	}

}
