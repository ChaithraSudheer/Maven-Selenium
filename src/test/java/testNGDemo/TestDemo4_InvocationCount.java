package testNGDemo;

import org.testng.annotations.Test;

public class TestDemo4_InvocationCount {
  @Test(priority=1)
  public void enrollforcourse()
  {
	  System.out.println("Student enrolled for course");
  }
  
  @Test(priority=2)
  public void training()
  {
	  System.out.println("Student get the training for the course");
  }
  
  @Test(priority=3, invocationCount=3)
  public void placementcall()
  {
	  System.out.println("Student get the placement for the course");
  }
}
