package Takescreenshotdynamically;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


@Listeners (CustomListner.class)

public class Testcase extends BaseTest
{
	
	@BeforeMethod
	public void setup()
	{
		intialization();
	}
	
	
    @Test
    public void validlogin() throws InterruptedException
    {
    	
    	SoftAssert softassert= new SoftAssert();
	     String loginpage = driver.getTitle();
	     softassert.assertEquals(loginpage, "actiTIME-Login");
	    driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager1");
		driver.findElement(By.id("loginButton")).click();
	  
		  WebElement timetrack = driver.findElement(By.xpath("//td[.='Enter Time-Track']"));
		  boolean status = timetrack.isDisplayed();
	      Assert.assertEquals(status, true);
	      Thread.sleep(2000);
	  
    }
    
    
    @Test
    public void testcase2() {
    	Assert.fail();
    }
    
    @Test
    public void testcase() {
    	Assert.fail();
    }
    
}
