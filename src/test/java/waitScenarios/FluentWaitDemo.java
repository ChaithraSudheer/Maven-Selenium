package waitScenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitDemo {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
	
		//By loc
		By btn=By.xpath("//button[text()='Start']");
		By text=By.xpath("(//h4)[2]");
		
		//fluentwait
		Wait<WebDriver> wait =
		        new FluentWait<>(driver)
		            .withTimeout(Duration.ofSeconds(10))
		            .pollingEvery(Duration.ofMillis(300))
		            .ignoring(NoSuchElementException.class);
		
		driver.findElement(btn).click();
		//wait for text
		String data=wait.until(ExpectedConditions.visibilityOfElementLocated(text)).getText();	
		System.out.println("Text of element is: "+data);
	}

}
