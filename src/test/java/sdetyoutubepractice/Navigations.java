package sdetyoutubepractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("httpa://www.snapdeal.com");
		driver.get("httpa://www.amazon.com");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		driver.navigate().to("https://www.flipakrt.com");
		
		

	}

}
