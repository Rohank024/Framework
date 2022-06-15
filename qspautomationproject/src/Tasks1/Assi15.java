package Tasks1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assi15 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("denyBtn")).click();
		Actions act=new Actions(driver);
		WebElement all = driver.findElement(By.xpath("//a[.='Coins ']"));
		act.moveToElement(all).perform();
		driver.findElement(By.xpath("//span[@data-p='gold-coins-weight-2gms,m']")).click();
		WebElement weight = driver.findElement(By.xpath("//span[@id='append_to_short_desc']"));
		String coin = weight.getText();
		
}
} 