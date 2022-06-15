package Assignments;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlifkarthandleMethods {


	public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				driver.get("https://www.flipkart.com/");

				driver.findElement(By.xpath("//button[.='✕']")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@name='q']")).sendKeys("samsung f12");
				driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
				driver.findElement(By.xpath("//div[.='SAMSUNG Galaxy F12 (Sea Green, 64 GB)']")).click();
				String parenthandle = driver.getWindowHandle();                   
				Set<String> allhandles = driver.getWindowHandles();
				
				for(String wh : allhandles)
				{
					 if(!parenthandle.equals(wh))
					 {
						 driver.switchTo().window(wh);
					 }
					 else {
						
					}
				
				driver.findElement(By.xpath("//a[.='128 GB']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[.='BUY NOW']")).click();
				}
	}	
	}

