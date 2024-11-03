package MouseKeyboardHandlingActions_Robot;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement ele=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		//Action class
		Actions act=new Actions(driver);
		act.doubleClick(ele).perform();
		
		//alert handling
		Alert alt=driver.switchTo().alert();
		System.out.println("Alert text is: "+alt.getText());
		alt.accept();
		
		
	
	}

}
