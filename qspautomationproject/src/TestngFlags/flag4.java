package TestngFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class flag4 
{
	//priority: it is use to set the priority for the method.
  @Test  (priority = 4)
  public void m() 
  {
	  Reporter.log("m",true);
  }
  
  @Test  (priority = 2)
  public void a() 
  {
	  Reporter.log("a",true);
  }
  
  @Test  (priority = 1)
  public void b() 
  {
	  Reporter.log("b",true);
  }
  
  @Test  
  public void z() 
  {
	  Reporter.log("z",true);
  }
  
  @Test  (priority = 5)
  public void l() 
  {
	  Reporter.log("l",true);
  }
  
  @Test  (priority = 3)
  public void d() 
  {
	  Reporter.log("d",true);
  }
  
  @Test  
  public void v() 
  {
	  Reporter.log("v",true);
  }
}


//Default suite
//Total tests run: 7, Passes: 7, Failures: 0, Skips: 0
