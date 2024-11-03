package webScenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClassAssignment6_FacebookDropdown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		
		//create new account link
		driver.findElement(By.linkText("Create new account")).click();
		
		//day
		WebElement day=driver.findElement(By.id("day"));
		Select sd=new Select(day);
		Thread.sleep(2000);
		sd.selectByVisibleText("12");
		
		//month
		WebElement month=driver.findElement(By.id("month"));
		Select sm=new Select(month);
		Thread.sleep(2000);
		sm.selectByValue("7");
		
		//year
		WebElement year=driver.findElement(By.id("year"));
		Select sy=new Select(year);
		Thread.sleep(2000);
		sy.selectByVisibleText("2011");
		
	}

}
