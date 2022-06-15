package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraA4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nykaa.com/auth/verify?ptype=auth");
		
		//login operation
		
		driver.findElement(By.name("emailMobile")).sendKeys("1223366489");//type username
		Thread.sleep(2000);
		driver.findElement(By.id("submitVerification")).click();//click on login button
		Thread.sleep(5000);
		driver.close();

	}
}
