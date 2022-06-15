package methodsofWebDriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethodSetPosition {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
 WebDriver driver = new ChromeDriver();
 
  Point targetPosition = new Point(100,300);
 
 driver.manage().window().setPosition(targetPosition);
	}

}
