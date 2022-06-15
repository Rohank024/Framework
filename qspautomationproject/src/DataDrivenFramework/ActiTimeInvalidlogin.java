package DataDrivenFramework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeInvalidlogin {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("http://desktop-e715h5r/login.do");
		
		Flib flib = new Flib();
		int rc = flib.getrowcount("./data/ActiTimevalidcreds.xlsx","invalidcreds");
		
		for(int i=1;i<=rc;i++)
		{
			String UN = flib.readData("./data/ActiTimevalidcreds.xlsx","invalidcreds",i,0);
			String PWD = flib.readData("./data/ActiTimevalidcreds.xlsx","invalidcreds",i,1);

			driver.findElement(By.name("username")).sendKeys(UN);
			driver.findElement(By.name("pwd")).sendKeys(PWD);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("username")).clear();
			}
		driver.quit();
		
}
}