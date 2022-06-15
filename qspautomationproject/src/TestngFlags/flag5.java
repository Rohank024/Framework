package TestngFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

//DependsonMethods: use to make method depend on specific method
public class flag5 
{
  @Test
  public void login() 
  {
	  Reporter.log("login",true);
  }
  
  @Test(dependsOnMethods = "login")
  public void createuser() 
  {
	  Reporter.log("createuser",true);
  }

  @Test(dependsOnMethods = "createuser")
  public void logot() 
  {
	  Reporter.log("logout",true);
  }

  
}

