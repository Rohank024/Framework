package EliminateDuplicates;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class eliminateDuplicate2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/welcome/Desktop/selenium%20files/multiselectdropdown.html");
		
		 WebElement Element = driver.findElement(By.id("menu"));
		 
		 Select sel = new Select(Element);

			//get the list of WebElements
			List<WebElement> options = sel.getOptions();

			//decalre a set to eliminate the duplicate data
			LinkedHashSet<String> s = new LinkedHashSet<String>();
			
			for(int i=0;i<options.size();i++);
			{
				//WebElement ops= options.get(i);
			//String text = ops.getText(); 
			//s.add(text);
			}

			for(String se :s);
			{
		          System.out.println();
			} 
		
	}

}
