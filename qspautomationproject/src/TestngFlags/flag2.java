package TestngFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class flag2
{
	
  @Test (enabled=true)   // It will get execute
  public void login()
  {
	  Reporter.log("i am login",true);
  }
  
  @Test (enabled=false)  // It will not execute
  public void logout()
  {
	  Reporter.log("i am logout",true);
  }

}

//Total tests run: 1, Passes: 1, Failures: 0, Skips: 0