package Tasks1;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.SendKeysAction;

import dev.failsafe.internal.util.Assert;

public class scenario4 {

	static WebDriver driver;
	public  void product()
	{
		  
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			driver.get("https://www.ebay.com/");
			driver.findElement(By.id("gh-ac")).sendKeys("apple watch");
			driver.findElement(By.id("gh-btn")).click();
			
	}
	public void tenThElement()
	{
	WebElement eleme = driver.findElement(By.xpath("//h3[.='Apple Watch Series 6 44mm Aluminum Case with Sport Band - PRODUCT(RED) (GPS +...']/ancestor::div[@class='s-item__info clearfix']"));
	String st = eleme.getText();
	System.out.println("name of tenth element");

	System.out.println(st);
	}
	public void result()
	{
	 List<WebElement> srp = driver.findElements(By.xpath("//h3[@class='s-item__title']"));
		for(WebElement list:srp)
		{
		 String name = list .getText(); 	
		 System.out.println(name);
		}
	}		
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter specific browser name");
		String name=sc.nextLine();
		
		if (name.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			 scenario4 ass=new  scenario4();
		ass.product();
		ass.result();
		ass.tenThElement();
		
		}
		if(name.equalsIgnoreCase("firefox"))
		{
			driver= new FirefoxDriver();
			 scenario4 ass=new  scenario4();
			ass.product();
			ass.result();
			ass.tenThElement();
		}
		driver.quit();

}
}
				
		
		

	


