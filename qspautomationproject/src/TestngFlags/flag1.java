package TestngFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class flag1 {
 
	
	@Test(description = "hello")
  public void f() 
  {
	  Reporter.log("login",true);
  }
}


// use to print the massage after the execution of program..