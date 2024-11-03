package MouseKeyboardHandlingActions_Robot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropAction {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/#default");
		
		//frame
		driver.switchTo().frame(0);
		
		//drag
		WebElement src=driver.findElement(By.id("draggable"));
		
		//drop
		WebElement dest=driver.findElement(By.id("droppable"));
		
		//Action class
		Actions act=new Actions(driver);
		
		/*
		//manual action
		act.clickAndHold(src).moveToElement(dest).release(src).build().perform();

		 */
		
		//readymade method
		act.dragAndDrop(src, dest).build().perform();
		System.out.println("Action is completed");
		
	}

}
