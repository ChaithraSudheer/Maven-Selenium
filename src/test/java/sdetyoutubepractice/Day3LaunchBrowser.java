package sdetyoutubepractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day3LaunchBrowser {

	public static void main(String[] args) {

		//Chrome Browser
		WebDriver driver1=new ChromeDriver();
		
		//Firefox
		//WebDriver driver2=new FirefoxDriver();
		
		//Edge browser
		//WebDriver driver3=new EdgeDriver();
		
		//open url
		//driver1.get("https://demo.nopcommerce.com/");
		driver1.get("https://www.facebook.com");
		//title
		System.out.println("Title is:"+ driver1.getTitle());
		
		//current ulr
		System.out.println("Current url is: "+driver1.getCurrentUrl());
		
		//page source
		System.out.println("Page source is : "+driver1.getPageSource());
	}

}
