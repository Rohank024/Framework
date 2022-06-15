package screesshots;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;


public class Screenshot1 {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		
		 // Way 1
		
		 File src = driver.getScreenshotAs(OutputType.FILE);
		 File dest = new File("./Screenshots/selenium1.png");
		 Files.copy(src, dest);
		 
		 

		
		
	}

}
