package webScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ClassAssignement8_Goibibodropdown {

	public static void main(String[] args) {

		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.goibibo.com/");
		System.out.println(driver.getTitle());
		//close
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		/*
		//from
		WebElement from=driver.findElement(By.xpath("(//p[@class='sc-12foipm-6 erPfRs'])[1]"));
		from.click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("che");
		
		List<WebElement> frlist=driver.findElements(By.xpath("//ul[@id='autoSuggest-list']//li//div//p[@class='sc-12foipm-33 kUcHKT']"));
		System.out.println("Total options are: "+frlist.size());
		for(WebElement i:frlist)
		{
			System.out.println(i.getText());
			if(i.getText().contains("Chennai"))
			{
				i.click();
				break;
			}
		}
		*/
		//to
	    driver.findElement(By.xpath("(//p[text()='Enter city or airport'])[2]")).click();
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Ben");	
		
	    List<WebElement> to=driver.findElements(By.xpath("//ul//li//div[@class='sc-12foipm-32 jVTqNw']//p[@class='sc-12foipm-33 kUcHKT']"));
	    System.out.println("Total items: "+to.size());
	    
	    for(WebElement i:to)
	    {
	    	System.out.println(i.getText());
	    	if(i.getText().contains("Bechar"))
	    	{
	    		i.click();
	    		break;
	    	}
	    }
	
	
	}

}
