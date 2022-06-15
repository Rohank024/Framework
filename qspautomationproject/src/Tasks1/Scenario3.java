package Tasks1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

		
		
public class Scenario3 {
	public static void main(String[] args) throws InterruptedException, IOException {
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				driver.get("https://jqueryui.com/droppable/");
				WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
				driver.switchTo().frame(frame);
				
				Actions ac =new Actions(driver);
			WebElement sorce = driver.findElement(By.xpath("//div[@id='draggable']"));
			WebElement target= driver.findElement(By.xpath("//div[@id='droppable']"));
			//check color and text befor drop
			String colourbefor = target.getCssValue("color");
			System.out.println("colour after drop:="+colourbefor);
			 String befor = target.getText();
		System.out.println("text befor drop:="+befor);

		//perform drag and drop

			ac.dragAndDrop(sorce, target).perform();
			
			//verify colour and text after drop
			String colourafter = target.getCssValue("color");
			System.out.println("colour after drop:="+colourafter);
			String after = target.getText();
			System.out.println("text after drop:="+after);
			
			//for verification of colou
			 if (colourbefor.equalsIgnoreCase(colourafter))
			 {
				 System.out.println("color is same after drop ");
			 }
			 else 
			 {
				 System.out.println("color is change after drop ");
		 
			 }
			//for verification of text after drop
			 if (after.equalsIgnoreCase(befor))
			 {
				 System.out.println("text is same after drop ");
			 }
			 else 
			 {
				 System.out.println("text is change after drop ");
		 
			 }
			Thread.sleep(2000);
			 driver.quit();
		}
		
		
		
	}

