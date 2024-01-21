package webDriverAssignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment3_SelectDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		/*
		 * Assignment-3
		 * Write a WebDriver script to handle a drop down and select an option based on 
		 * specific criteria.
		 * 
		 */
		
		//Select based dropdown for Skills Section in Registration
		//create driver session
		WebDriver driver=new ChromeDriver();
		
		//open browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		System.out.println(driver.getTitle());
		
		//Identify select based drop down for skills section in register page
		WebElement ele=driver.findElement(By.id("Skills"));
		
		//Select base- Create object
		Select dd=new Select(ele);
		
		//check for multiple selection
		System.out.println("Is Dropdown supports multiple selection? "+dd.isMultiple());
		
		//single selection
		//select by index
		dd.selectByIndex(2);
		Thread.sleep(1000);
		dd.selectByVisibleText("Art Design");
		Thread.sleep(1000);
		dd.selectByValue("Engineering");
		
		//To print all options
		List<WebElement> alloptions=dd.getOptions();
		
		System.out.println("Total options in the skills sections are: "+alloptions.size());
		
		for(WebElement i:alloptions)
		{
			System.out.println("The options are: "+i.getText());
			if(i.getText().contains("SQL"))
			{
				i.click();
				break;
			}
	
		}
		
		//close 
		driver.quit();
	
	}

}
