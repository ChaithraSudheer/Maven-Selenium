package webhandlingsolutions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrameDemo {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		
		System.out.println("*************LEFT******************");
		/* 1st method
		//left frame
		//driver.switchTo().frame("frame-left");
		//top--->left
		//driver.switchTo().frame("frame-top");
		driver.switchTo().frame(0);//top
		//left
		driver.switchTo().frame("frame-left");
		*/
		
		//2nd method-code in one line
		driver.switchTo().frame(0).switchTo().frame("frame-left");
		WebElement text1=driver.findElement(By.xpath("//body[normalize-space()='LEFT']"));
		System.out.println("Left frame text: "+text1);
		System.out.println(driver.getPageSource());
		
		System.out.println("******************MIDDLE*******************");
		//left--->middle not possible so left----top then top----middle
		//back to top frame
		driver.switchTo().defaultContent();
		//top frame
		driver.switchTo().frame(0);
		//middle
		driver.switchTo().frame("frame-middle");
		String text2=driver.findElement(By.id("content")).getText();
		System.out.println("Middle frame text is: "+text2);
		
		System.out.println("******************RIGHT*******************");
		//come back to top
		driver.switchTo().defaultContent();
		//top----right
		driver.switchTo().frame(0).switchTo().frame("frame-right");
		System.out.println("Right side frame page source is: ");
		System.out.println(driver.getPageSource());
		
		System.out.println("************BOTTOM*****************");
		//back to top
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		System.out.println("Bottom frame page source is: ");
		System.out.println(driver.getPageSource());
	}

}
