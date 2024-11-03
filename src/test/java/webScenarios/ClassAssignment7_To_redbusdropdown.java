package webScenarios;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ClassAssignment7_To_redbusdropdown {

	public static void main(String[] args) {

		//Automate 'to' option dropdown from redbus
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.redbus.in/");
		
		//to dropdown
		WebElement to=driver.findElement(By.id("dest"));
		to.click();
		to.sendKeys("ban");
		
		List<WebElement> tolist=driver.findElements(By.xpath("//ul[@class='sc-dnqmqq eFEVtU']//li//text[@class='placeHolderMainText']"));
		System.out.println("Total to options are: "+tolist.size());
		
		for(WebElement i:tolist)
		{
			System.out.println(i.getText());
			if(i.getText().contains("Hebbal"))
			{
				i.click();
				break;
			}
		}
	}

}
