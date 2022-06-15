package KeywordDrivenFramework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BaseTest {
	// base test method is use to write the code to open the browser.
		static WebDriver driver;
		public void openbrowser() throws IOException 
		{
			Flib flib = new Flib();
			// read the data from property files
			String browservalue = flib.readpropertyfile("./data/config.properties","browser");
			String url = flib.readpropertyfile("./data/config.properties","url");
			// if browser value & if statement value is true, then chrome will get executed,
			//or if it is false then else ststement will get executed.
			if (browservalue.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			    driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
				driver.get(url);
			} 
			else
			{
				System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			    driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
				driver.get(url);
			} 
		}
		// it is use to close the opened browser	
		public void closebrowser()
		{
			driver.quit();
		}
			
	
			
			
			
		
		

	}


