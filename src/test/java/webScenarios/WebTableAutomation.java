package webScenarios;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableAutomation {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://automationplayground.com/crm/customers.html?email-name=test%40gmail.com&password-name=jkjhkjh&submit-name=");
		
		System.out.println("***********All headings****************");
		List<WebElement> heading=driver.findElements(By.xpath("//thead//tr//th"));
		System.out.println("Total headings are: "+heading.size());
		
		for(WebElement i:heading)
		{
			System.out.println(i.getText());
		}
	
	
		System.out.println("**********Total Rows**************");
		int rows=driver.findElements(By.xpath("//div//tr")).size();
		System.out.println("Total rows: "+rows);
	
		System.out.println("*********Total columns****************");
		int columns=driver.findElements(By.xpath("//div//tr[1]//th")).size();
		System.out.println("Total columns: "+columns);
		
		System.out.println("*************Print row 4**************");
		String text=driver.findElement(By.xpath("//tbody//tr[4]")).getText();
		System.out.println(text);
		
		System.out.println("********Print Firstname column*********");
	    List<WebElement> cell=driver.findElements(By.xpath("//tbody//tr//td[2]"));
	    for(WebElement i:cell)
	    {
	    	System.out.println(i.getText());
	    }
	
	    System.out.println("*********Cpmlete table data********************");
	   List<WebElement> list2=driver.findElements(By.xpath("//tbody//tr//td"));
	   for(WebElement i:list2)
	   {
		   System.out.println(i.getText());
	   }
	
	}

}
