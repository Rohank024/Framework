package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		Thread.sleep(10000);
		driver.close();
		
		

	}

}
