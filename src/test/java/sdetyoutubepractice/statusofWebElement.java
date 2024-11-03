package sdetyoutubepractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class statusofWebElement {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		
		//isDisplayed()  isEnabled()
		WebElement search=driver.findElement(By.id("small-searchterms"));
		System.out.println("Display status: "+search.isDisplayed());
		System.out.println("Enabled status: "+search.isEnabled());
		
		//isSelected()
		WebElement male=driver.findElement(By.id("gender-male"));
		WebElement female=driver.findElement(By.id("gender-female"));
		
		System.out.println("Male select status:"+male.isSelected());
		System.out.println("FeMale select status:"+female.isSelected());
		
		male.click();
		
		System.out.println("Male select status:"+male.isSelected());
		System.out.println("FeMale select status:"+female.isSelected());
		
		female.click();
		System.out.println("Male select status:"+male.isSelected());
		System.out.println("FeMale select status:"+female.isSelected());
		
	}

}
