package waitScenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import helper.Utility;

public class Explicitwait_WebDriverWaitDemo {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
	
		//using by locator
		By btn=By.xpath("//button[text()='Start']");
		By text=By.xpath("(//h4)[2]");
		
		//call method from utility class
		Utility.waitforElementClickable(driver, btn).click();
		WebElement ele=Utility.waitforVisibilityofElement(driver, text);
		
		System.out.println("Text is: "+ele.getText());
		
		
		
		/*//normal method
		//inspect start button
		driver.findElement(By.xpath("//button[text()='Start']")).click();
		
		//inspect text=hello world
		String text=driver.findElement(By.xpath("(//h4)[2]")).getText();
		System.out.println(text);
		*/
	
	
	}

}
