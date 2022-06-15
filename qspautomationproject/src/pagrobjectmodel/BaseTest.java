package pagrobjectmodel;

import java.io.IOException;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest implements IAutoconstant
{
	static WebDriver driver;
	public void setup() throws IOException
	{

		Flib flib = new Flib();
		String browservalue = flib.readpropertyfile("./data/config.properties","browser");
		String url = flib.readpropertyfile("./data/config.properties","url");
		
		if (browservalue.equalsIgnoreCase("chrome"))
			
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
				
		} 
		
		else if(browservalue.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);

		}
		else 
		{
			System.out.println("enter the correct url");
		}
		
	}
  
        public void teardown() 
        {
        	driver.quit();
		}	
}


