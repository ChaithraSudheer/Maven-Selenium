package testNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertioninTestng {
  @Test(priority=1)
  public void hardAssertionTest()
  {
	  //String act="Selenium WebDriver is WebUI Automation library";
	  //String exp="Selenium WebDriver is WebUI Automation tool";
	  
	  //assert equals()
//	  Assert.assertEquals(act, exp, "Fail:Strings are not equal");
//	  System.out.println("Pass: Strings are equal");
	  
	  //assert true()
//	  String act="Selenium WebDriver is WebUI Automation library";
//	  String exp="WebUI Test";
//	  Assert.assertTrue(act.contains(exp), "Fail:Actual string does not contain webui");
//	  System.out.println("Actual string contains WebUI");
	  
	  //AssertFalse()
	  String act="Selenium WebDriver is WebUI Test Automation library";
	  String exp="WebUI Test";
	  
	  Assert.assertFalse(act.contains(exp),"Fail:Actual string contains webui test");
	  System.out.println("Pass: Actual string does not contains webui test");
	  System.out.println("Hard Assertion is completed");
	  
	  //
	  
  }
  
  @Test(priority=2)
  public void softAssertionTest()
  {
	  SoftAssert sf=new SoftAssert();
	  
	  int a=100, b=200;
	  
	  //assertequals()
//    sf.assertEquals(a, b, "Fail:Numbers are not equals");
//	  System.out.println("Pass: Numbers are equal");
//	  System.out.println("This is soft assertion test");
//	  sf.assertAll();
	  
	  //aserttrue()
//	  sf.assertTrue(a==b, "Fail:No are not equal");
//	  System.out.println("Pass: no are equal");
//	  System.out.println("This is soft assertion test");
//	  sf.assertAll();
	  
	  //assertfalse()
	  sf.assertFalse(a==b, "Fail:No are not equal");
	  System.out.println("Pass: no are equal");
	  System.out.println("This is soft assertion test");
	  sf.assertAll();
  }
}
