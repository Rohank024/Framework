package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//login operation
		
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");//type username
		Thread.sleep(2000);	
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");//type password
		Thread.sleep(2000);
		driver.findElement(By.id("btnLogin")).click();//click on login button

	}

}
