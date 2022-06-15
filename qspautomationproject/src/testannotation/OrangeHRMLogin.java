package testannotation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class OrangeHRMLogin {
	WebDriver driver;
  @BeforeTest
  public void property() 
  
  {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe"); 
  }
  
  @BeforeMethod
  public void launch()
  {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	  driver.get("http://desktop-e715h5r/login.do");
	  
  }
  
  @Test
  public void login() throws InterruptedException
  {
	  
	     SoftAssert softassert= new SoftAssert();
	     String loginpage = driver.getTitle();
	     softassert.assertEquals(loginpage, "actiTIME-Login");
	    driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
	  
		  WebElement timetrack = driver.findElement(By.xpath("//td[.='Enter Time-Track']"));
		  boolean status = timetrack.isDisplayed();
	      Assert.assertEquals(status, true);
	      Thread.sleep(2000);
	      
	      String Homepage = driver.getTitle();
	      softassert.assertEquals(Homepage, "actiTIME-Enter Time-Track");
	      Reporter.log("create user", true);
	      Reporter.log("create contact", true);
	      softassert.assertAll();
	  
  }
}
