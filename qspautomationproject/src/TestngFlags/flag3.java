package TestngFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class flag3
{
	
  @Test  (invocationCount = 500)
  public void login() 
  {
	  Reporter.log("login",true);
  }
}

//it is use to execute particular test multiple Times.
//Total tests run: 500, Passes: 500, Failures: 0, Skips: 0