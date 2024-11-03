package MouseKeyboardHandlingActions_Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TooltipAction {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/tooltip/");
		
		//frame
		driver.switchTo().frame(0);
		
		WebElement ele=driver.findElement(By.id("age"));
		
		//Action class
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		
		//tooltip
		String text=driver.findElement(By.xpath("//div[@class='ui-tooltip-content']")).getText();
		System.out.println(text);
	}

}
