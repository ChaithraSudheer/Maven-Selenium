package testNGDemo;

import org.testng.annotations.Test;

public class TestDisablefromExecution {
  @Test
  public void testcase1()
  {
	  System.out.println("This is test case 1");
  }
  
  @Test
  public void testcase2()
  {
	  System.out.println("This is test case 2");
  }
  
  @Test(enabled=false)
  public void testcase3()
  {
	  System.out.println("This is test case 3");
  }
  
  @Test
  public void testcase4()
  {
	  System.out.println("This is test case 4");
  }
}
