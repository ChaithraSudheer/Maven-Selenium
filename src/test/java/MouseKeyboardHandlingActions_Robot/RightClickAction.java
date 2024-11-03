package MouseKeyboardHandlingActions_Robot;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		//inspect-right click
		WebElement rbtn=driver.findElement(By.xpath("//span[text()='right click me']"));

		//Action class
		Actions act=new Actions(driver);
		act.contextClick(rbtn).perform();
		
		//menu
		List<WebElement> list=driver.findElements(By.xpath("(//ul)[3]//li//span"));
		for(WebElement i:list)
		{
			System.out.println(i.getText());
			if(i.getText().contains("Delete"))
			{
				i.click();
				break;
			}
		}
		
		//alert handle
		Alert alt=driver.switchTo().alert();
		System.out.println("Alert text is: "+alt.getText());
		alt.accept();
	
	
	
	}

}
