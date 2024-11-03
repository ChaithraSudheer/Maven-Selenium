package webhandlingsolutions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindow_Tab {

	public static void main(String[] args) {

		WebDriver driver1=new ChromeDriver();
		driver1.get("https://www.google.com");
		
		//open new tab
		WebDriver driver2=driver1.switchTo().newWindow(WindowType.TAB);
		driver2.get("https://www.facebook.com");
		System.out.println(driver2.getTitle());
		
		//new window
		WebDriver driver3=driver1.switchTo().newWindow(WindowType.WINDOW);
		driver3.get("https://www.amazon.in");
		System.out.println(driver3.getTitle());
	}

}
