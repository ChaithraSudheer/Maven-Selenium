package webhandlingsolutions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleFrameDemo {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/iframe");
		
		//3 methods to handle frame-
		//using index, id/name, webelement
		
		//handle frame using index
		//driver.switchTo().frame(0);
		
		//handle frame using id/name
		//driver.switchTo().frame("mce_0_ifr");
		
		
		//handle frame using webelement
		WebElement frameId=driver.findElement(By.id("mce_0_ifr"));
		driver.switchTo().frame(frameId);
		
		
		
		//element inside frame
		WebElement ele=driver.findElement(By.id("tinymce"));
		ele.click();
		ele.sendKeys("Hello All...");
		
		

}
}