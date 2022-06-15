package Tasks1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario5 {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			driver.get("https://www.bluestone.com/");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[.='Not now']")).click();
			Actions ac=new Actions(driver);
			 WebElement target = driver.findElement(By.xpath("//a[.='Rings ']"));

			ac.moveToElement(target).perform();
			driver.findElement(By.xpath("//a[@title='Diamond Rings' and (.='Diamond')]")).click();

			List<WebElement> price = driver.findElements(By.xpath("//span[@class='new-price']"));
			System.out.println("price By Default");
			System.out.println("");

			String P="";//in p variable we store default price
			for(WebElement pri:price)
			{
				 P = pri.getText();
				System.out.println(P);
			}


				WebElement element = driver.findElement(By.xpath("//span[.=' Popular ']"));
				ac.moveToElement(element).perform();
				
				//here we sorted price below to high
				driver.findElement(By.xpath("//a[.='Price Low to High ']")).click();
			List<WebElement> sort = driver.findElements(By.xpath("//span[@class='new-price']"));

			System.out.println("");

				System.out.println("Price after Sorting lo to high");
				System.out.println("");
			String sp="";//price low to high we store in sp variable

				for(WebElement So:sort)
				{
				sp = So.getText();
					System.out.println(sp);
				}
				if(P.equals(sp))//here we compare default price and sorted price by low to high
				{
					System.out.println("default price and sorlted by low to high It is  Equals");
					
				}
				else 
				{
			System.out.println("default price and sorted by low to high it is not equals");
				}
				driver.quit();
				}

				
}
	
