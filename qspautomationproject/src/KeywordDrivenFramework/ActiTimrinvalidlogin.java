package KeywordDrivenFramework;

import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import DataDrivenFramework.Flib;

public class ActiTimrinvalidlogin extends BaseTest{

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		BaseTest bs = new BaseTest();
        bs.openbrowser();
        
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


