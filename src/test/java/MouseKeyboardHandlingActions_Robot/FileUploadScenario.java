package MouseKeyboardHandlingActions_Robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadScenario {

	public static void main(String[] args) throws AWTException {

		/*
		//using sendkeys
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		
		String path="C:\\Users\\dell\\Downloads\\free-resume-template-functional.docx";
		
		//choose file
		driver.findElement(By.id("file-upload")).sendKeys(path);
		
		//upload
		driver.findElement(By.id("file-submit")).click();
		
		*/
		
		//using robot
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		
		String path="C:\\Users\\dell\\Downloads\\free-resume-template-functional.docx";
		
		//transferrable file name declaration
		StringSelection contents=new StringSelection(path);
		
		//getting toolkit
		Toolkit toolkit=Toolkit.getDefaultToolkit();
		
		//getting clipboard as file upload window
		Clipboard clipboard=toolkit.getSystemClipboard();
		
		//copying string file name to the file upload window
		clipboard.setContents(contents, null);
		
		//failed
		//driver.findElement(By.id("file-upload")).click();
		//click is not work
		//use action class
		
		WebElement ele=driver.findElement(By.id("file-upload"));
		
		//action class
		Actions act=new Actions(driver);
		act.moveToElement(ele).click().build().perform();
		
		//robot class
		Robot rb=new Robot();
		rb.delay(2000);
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.delay(2000);
		
		//enter key
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		//Upload
		driver.findElement(By.id("file-submit")).click();
		
		
		
		
	}

}
