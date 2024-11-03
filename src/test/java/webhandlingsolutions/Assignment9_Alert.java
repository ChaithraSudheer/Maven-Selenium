package webhandlingsolutions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment9_Alert {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//alert1-ok
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		
		//alert handle
		Alert altok=driver.switchTo().alert();
		System.out.println("Alert text is: "+altok.getText());
		altok.accept();
		
		//msg
		String text1=driver.findElement(By.id("result")).getText();
		System.out.println(text1);
		
		Thread.sleep(1000);
		
		//alter1-cancel
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Alert altca=driver.switchTo().alert();
		System.out.println("Alert text is: "+altca.getText());
		altca.dismiss();
		
		//msg
		String text2=driver.findElement(By.id("result")).getText();
		System.out.println(text2);
		
		Thread.sleep(2000);
		
		//alert2
		WebElement ele1=driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
		ele1.click();
		
		Thread.sleep(2000);
		
		//alert handle
		Alert prompt=driver.switchTo().alert();
		System.out.println("Alert text is:"+prompt.getText());
		Thread.sleep(2000);
		prompt.sendKeys("This is prompt alert");
		Thread.sleep(3000);
		prompt.accept();
		
		Thread.sleep(1000);
		
		//msg
		String text3=driver.findElement(By.id("result")).getText();
	    System.out.println(text3);
	    
	    //prompt-cancel
	    ele1.click();
	    Thread.sleep(1000);
	    prompt.dismiss();
	    String text4=driver.findElement(By.id("result")).getText();
	    System.out.println(text4);
	    
	    driver.quit();
		
		
		
	}

}
