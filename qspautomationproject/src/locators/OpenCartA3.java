package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCartA3 {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.opencart.com/index.php?route=account/login/");
		
		//login operation
		
		driver.findElement(By.name("email")).sendKeys("abce@gmail.com");//type username
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("admin123");//type password
		Thread.sleep(2000);
		driver.findElement(By.id("Login")).click();//click on login button
		Thread.sleep(5000);
		driver.close();
	
	}
}
