package webScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownAutomation {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		System.out.println("Title is: "+driver.getTitle());
		
		//Identify select based drop down
		WebElement ele=driver.findElement(By.name("url"));
		
		//Select base- create object for select class
		Select dd=new Select(ele);
		System.out.println("Is dropdown supports multiple selection:"+dd.isMultiple());
		
		//single selection
		dd.selectByIndex(3);
		Thread.sleep(2000);
		dd.selectByVisibleText("Clothing & Accessories");
		Thread.sleep(2000);
		dd.selectByValue("search-alias=home-improvement");
		
		//Print all options from drop down
		List<WebElement> allOptions=dd.getOptions();
		System.out.println("Total options are:"+allOptions.size());
		
		for(WebElement i:allOptions)
		{
			System.out.println(i.getText());
			if(i.getText().contains("Video Games"))
			{
				i.click();
				break;
			}
		}
	}

}
