package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaptopAssignment1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[.='✕']")).click();//type username
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Laptops");//type username
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();//type username
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='_3879cV']")).click();//type username
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[.='Brand']")).click();//type username
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[.='HP']")).click();//type username
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[.='Operating System']")).click();//type username
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[.='Windows 10']")).click();//type username
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[.='HP Pavilion Gaming Core i5 11th Gen - (8 GB/1 TB HDD/256 GB SSD/Windows 10 Home/4 GB Graphics/NVIDIA G...']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']")).getText();//type username
		Thread.sleep(3000);
		driver.close();
		
		
			}
	}
