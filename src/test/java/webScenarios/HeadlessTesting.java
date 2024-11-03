package webScenarios;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessTesting {

	public static void main(String[] args) {

		ChromeOptions options=new ChromeOptions();
		options.addArguments("--headless");
		
		//create session
		ChromeDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
		System.out.println("Google application is opened");
		
		driver.findElement(By.id("APjFqb")).sendKeys("testng");
		System.out.println("In search box testng is searched");
		
		List<WebElement> list=driver.findElements(By.xpath("//ul[@class='G43f7e'][1]//li"));
		
		System.out.println("Total options are: "+list.size());
		
		System.out.println("Capturing the list");
		for(WebElement i:list)
		{
			System.out.println(i.getText());
	//		if(i.getText().contains("testng"))
	//		{
	//			i.click();
	//			break;
	//		}
			
		}
		
	}

}
