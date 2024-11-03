package webScenarios;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropdownDemo1 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.w3schools.com/bootstrap/bootstrap_dropdowns.asp");
		
		//dropdown
	    driver.findElement(By.id("menu1")).click();
	    
	    List<WebElement> list=driver.findElements(By.xpath("//ul[@aria-labelledby='menu1']//li//a"));
	    System.out.println("Total options are: "+list.size());
	    for(WebElement i:list)
	    {
	    	System.out.println(i.getText());

	    }
		
	}

}
