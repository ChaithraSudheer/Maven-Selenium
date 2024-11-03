package artOFTesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class SampleWebPage {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://artoftesting.com/samplesiteforselenium");
		System.out.println(driver.getTitle());
		
		
		//sample text
		String text=driver.findElement(By.xpath("//b[text()='This is sample text!']")).getText();
		System.out.println("Text is: "+text);
		
		//link
		driver.findElement(By.linkText("This is a link")).click();
		System.out.println("Link is cliked");
		
		//Text box
		driver.findElement(By.id("fname")).sendKeys("Suresh");
		
		//Button
		driver.findElement(By.xpath("//button[@type='button']")).click();
		System.out.println("Button got clicked");
		
		//double click
		WebElement dblclick=driver.findElement(By.id("dblClkBtn"));
		Actions act1=new Actions(driver);
		act1.doubleClick(dblclick).perform();
		Thread.sleep(2000);
		Alert alt=driver.switchTo().alert();
		System.out.println("Alert test is: "+alt.getText());
		alt.accept();
		
		
		//radio button
		driver.findElement(By.id("female")).click();
		System.out.println("Radio button is selected");
		
		//checkbox
		driver.findElement(By.className("Automation")).click();
		
		//dropdown
		WebElement dd=driver.findElement(By.id("testingDropdown"));
		Select sc=new Select(dd);
		System.out.println("Is dropdown support multiple selection:"+sc.isMultiple());
		sc.selectByValue("Manual");
		
		//alert
		driver.findElement(By.xpath("//button[text()='Generate Alert Box']")).click();
		Thread.sleep(2000);
		Alert alt2=driver.switchTo().alert();
		System.out.println("Alert text is:"+alt2.getText());
		alt2.accept();
		
		//confirm
		driver.findElement(By.xpath("//button[text()='Generate Confirm Box']")).click();
		Thread.sleep(2000);
		Alert alt3=driver.switchTo().alert();
		System.out.println("Alert test is: "+alt3.getText());
		alt3.dismiss();
		
		//msg
		WebElement msg=driver.findElement(By.id("demo"));
		System.out.println("Confirm msg is:"+msg.getText());
		
		//drag -drop
		WebElement src=driver.findElement(By.id("myImage"));
		WebElement dest=driver.findElement(By.id("targetDiv"));
		Actions act2=new Actions(driver);
		act2.dragAndDrop(src, dest).build().perform();
		System.out.println("Action is completed");
		
		System.out.println("All actions performed successfully");
		
		driver.close();		
	
	
	
	}

}
