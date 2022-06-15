package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MeeshoA5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-e715h5r/login.do");
		
		//login operation
		
		driver.findElement(By.name("username")).sendKeys("admin");//type username
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("manager");//type username
        Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();//click on login button
		Thread.sleep(10000);
		driver.findElement(By.className("logout")).click();//click on login button
		Thread.sleep(2000);
		driver.close();
	}

}
