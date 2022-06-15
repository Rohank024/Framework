package TestngFlags;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.internal.annotations.ParametersAnnotation;

public class parameterAnnotation 
{
	//http://desktop-e715h5r/login.do
	WebDriver driver;
  @Test
  @Parameters({"browser","username","password","url"})
  public void loginactitime(String browservalue, String username, String password,String url)
  {
	ParametersAnnotation pa = new ParametersAnnotation();
	
	if (browservalue.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		driver.get(url);
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
	} 
	
	else if(browservalue.equalsIgnoreCase("firfox"))
	{
	
	System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("http://desktop-e715h5r/login.do");
	driver.findElement(By.name("username")).sendKeys(username);
	driver.findElement(By.name("pwd")).sendKeys(password);
	driver.findElement(By.id("loginButton")).click();
	
	}
	
	
	
	
	}
	 

  }

	