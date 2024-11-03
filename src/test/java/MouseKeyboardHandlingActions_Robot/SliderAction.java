package MouseKeyboardHandlingActions_Robot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderAction {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/slider/");
		
		//frame
		driver.switchTo().frame(0);
		
		WebElement ele=driver.findElement(By.className("ui-slider-handle"));
		
		//Actions class
		Actions act=new Actions(driver);
		act.clickAndHold(ele).moveToElement(ele, 300, 0).build().perform();
		
		System.out.println("Slider is moved");
	
	
	}

}
