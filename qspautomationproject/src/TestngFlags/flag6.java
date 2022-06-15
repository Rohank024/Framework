package TestngFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class flag6 
{
	
	 @Test
	  public void login() 
	  {
		  Reporter.log("login",true);
	  }
	  
	  @Test(dependsOnMethods = "login")
	  public void createuser() 
	  {
		  org.testng.Assert.fail();
		  Reporter.log("createuser",true);
	  }

	  @Test(dependsOnMethods = "createuser", alwaysRun = true)
	  public void logot() 
	  {
		  Reporter.log("logout",true);
	  }

 }


//login
//PASSED: login
//FAILED: createuser
//Total tests run: 3, Passes: 1, Failures: 1, Skips: 1


//using of AlwaysrunMethod
//{login
//logout
//PASSED: login
//PASSED: logot
//FAILED: createuser
//Total tests run: 3, Passes: 2, Failures: 1, Skips: 0}