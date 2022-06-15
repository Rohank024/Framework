package KeywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class ActiTimevalidlogin extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub 
		
		BaseTest bs = new BaseTest();
         bs.openbrowser();
         
          Flib flib = new Flib();
         String UN = flib.readpropertyfile("./data/config.properties","username");
         String PWD = flib.readpropertyfile("./data/config.properties","password");
    
        driver.findElement(By.name("username")).sendKeys(UN);
 		driver.findElement(By.name("pwd")).sendKeys(PWD);
 		driver.findElement(By.id("loginButton")).click();
 		Thread.sleep(5000);
 		bs.closebrowser();
 		
         
	
}  
	

}
