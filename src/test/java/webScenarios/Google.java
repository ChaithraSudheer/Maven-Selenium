package webScenarios;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Google {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		WebElement text=driver.findElement(By.linkText("हिन्दी"));
		//WebElement text=driver.findElement(By.xpath("//div[@id='SIvCob']//a[1]"));
        System.out.println("Text is: "+text.getText());
        
        TakesScreenshot ts=(TakesScreenshot)driver;
        File temp=ts.getScreenshotAs(OutputType.FILE);
        
        File dest=new File("./"+"\\Screenshots\\google.png");
        FileHandler.copy(temp, dest);
       
	}

	
}
