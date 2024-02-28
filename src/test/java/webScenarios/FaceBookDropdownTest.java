package webScenarios;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookDropdownTest {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create new account")).click();
		
		//dropdown
		WebElement day=driver.findElement(By.id("day"));
		Select sd=new Select(day);
		System.out.println("Is dropdown support multiple selection: "+sd.isMultiple());
		List<WebElement> alloptions=sd.getOptions();
		System.out.println("Total options are: "+alloptions.size());
		for(WebElement i:alloptions)
		{
			System.out.println(i.getText());
			if(i.getText().contains("27"))
			{
				i.click();
				break;
			}
		}
		
		

	}

}
