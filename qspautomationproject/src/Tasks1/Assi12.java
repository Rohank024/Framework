package Tasks1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assi12 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("denyBtn")).click();
		
		WebElement offer = driver.findElement(By.xpath("//span[.='Offers ']"));
	offer.click();
	Actions act=new Actions(driver);
	WebElement ele = driver.findElement(By.xpath("//span[.='Offers']/following-sibling::i[@class='icon-ion-chevron-down']"));
	act.moveToElement(ele).perform();
	driver.findElement(By.xpath("//span[@data-displayname='10% Making Charge Off']")).click();
	 WebElement offervalidation = driver.findElement(By.xpath("(//span[@class='offers-wrapper'])"));
	 
	String valid = offervalidation.getText();
	   
		 System.out.println(valid);
	  
	  

driver.quit();
	
		
		
		
	}

}
