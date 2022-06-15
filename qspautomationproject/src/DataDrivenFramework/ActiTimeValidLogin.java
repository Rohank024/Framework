package DataDrivenFramework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActiTimeValidLogin {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://desktop-e715h5r/login.do");
		
		Thread.sleep(2000);
		//accessing the generic reusable  non static method by creating the object
        Flib flib = new  Flib();
      //read the username
		String UN = flib.readData("./data/ActiTimevalidcreds.xlsx","validcreds",1,0);
		//read the password
		String PWD = flib.readData("./data/ActiTimevalidcreds.xlsx","validcreds",1,1);

		
		driver.findElement(By.name("username")).sendKeys(UN);
		driver.findElement(By.name("pwd")).sendKeys(PWD);
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.xpath("//a[@class='logout']")).click();
		driver.quit();
		
	}

}

