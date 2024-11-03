package webhandlingsolutions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {
	
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
	
	
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in");
		
		//to create new alert
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("alert('Iam new Javascript alert')");
		
		Thread.sleep(2000);
		
		//handle alert
		Alert alt=driver.switchTo().alert();
		System.out.println("Alert text is: "+alt.getText());
		//to handle ok
		alt.accept();
		
		//title using gettitle()
		System.out.println(driver.getTitle());
		
		//title usig javascriptexecutor
		String title=js.executeScript("return document.title").toString();
		System.out.println("Title is: "+title);
		
		
		
		//scroll down
		js.executeScript("window.scrollTo(0,6000)");
		System.out.println("Page scroll is done");
		
		Thread.sleep(3000);
		
		
		
		//scroll till end-down to up
		//js.executeScript("window.scrollTo(0,document.body.scrollheight)");
		//System.out.println("Page scroll is done");
		
		//scroll from down to up
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		
		//scroll till any element in the page
		WebElement ele=driver.findElement(By.xpath("(//h2[@class='as-title-block-left'])[2]"));
		js.executeScript("arguments[0].scrollIntoView()",ele);
		
		System.out.println("Page is scrolled till the element is selected");
		
		//ScrollUp(driver);
		
		//ScrollDown(driver);
		
		//ScrollToElement(driver,ele);
		
	}

}
