package datadriventest;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportDemo {
  @Test
  public void reportTest()
  {
	  //create extent report instance
	  ExtentReports extent=new ExtentReports();
	  
	  //using reporter we can add path
	  ExtentSparkReporter spark=new ExtentSparkReporter("Reports/Automation.html"); 
	  
	  //setup any configuration-congig()
	  spark.config().setDocumentTitle("Sprint1 Report");
	  spark.config().setReportName("Automation Testing Report");
	  spark.config().setTheme(Theme.DARK);
	  
	  //Attached the report
	  extent.attachReporter(spark);
	  
	  //create a test- use extent test
	  ExtentTest test=extent.createTest("Test1");
	  
	  //insert the logs
	  test.pass("Test case is pass...");
	  test.fail("Test case is fail..");
	  test.info("Test is in progress");
	  test.skip("Test case is skipped");
	  
	  test.log(Status.PASS, "Test is passed");
	  
	  //exit from report
	  extent.flush();
  
  }
}
