package webScenarios;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Assignment9_HeadlessmodeofTesting {

	public static void main(String[] args) {

		System.out.println("*******  Firefox Browser *********");

		FirefoxOptions options=new FirefoxOptions();
		options.addArguments("--headless");
		
		FirefoxDriver driver1=new FirefoxDriver(options);
		driver1.get("https://www.amazon.in");
		System.out.println("Title is: "+driver1.getTitle());
		System.out.println("Amazon web browser is launched");

		System.out.println("*******  Edge Browser *********");
		
		EdgeOptions options2=new EdgeOptions();
		options2.addArguments("--headless");
		
		EdgeDriver driver2=new EdgeDriver(options2);
		driver2.get("https://www.flipkart.com");
		System.out.println("Title is: "+driver2.getTitle());
		System.out.println("Flipkart application is launched");
	}

}
