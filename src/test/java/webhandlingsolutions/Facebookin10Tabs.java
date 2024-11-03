package webhandlingsolutions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookin10Tabs {

	public static void main(String[] args) {

		int tab=10;
		String url="https://www.facebook.com";
		
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		
		for(int i=0; i<tab; i++)
		{
			if(i>0)
			{
				driver.switchTo().newWindow(WindowType.TAB);
				driver.get(url);
				System.out.println("Title is: "+driver.getTitle());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
				
		}
		
		driver.quit();
		
		
	}

	}
	

