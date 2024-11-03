package webhandlingsolutions;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandling {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//mainpage
		String parentID=driver.getWindowHandle();
		System.out.println(parentID);
		
		Thread.sleep(3000);
		
		//click on link-OrangeHRM, Inc
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		//child page
		Set<String> allID=driver.getWindowHandles();
		System.out.println(allID);
		
		//ask driver to switch based on ID
		//id is not same then switch
		
		for(String childID:allID)
		{
			if(!parentID.equals(childID))
			{
				driver.switchTo().window(childID);
				//child window
				driver.findElement(By.name("EmailHomePage")).sendKeys("test@gmail.com");
				
				//driver.close();
				//driver.quit();
				
			}
		}
		
		//come back to parent
		driver.switchTo().window(parentID);
		driver.findElement(By.name("username")).sendKeys("Admin");
	}

}
