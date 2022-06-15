package methodsofWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/?utm_source=perf_google_search_brand&utm_medium=perf_google_search_brand&utm_campaign=Search%20-%20Myntra%20Brand%20(India)&gclid=Cj0KCQjwgYSTBhDKARIsAB8KukturHDuvycz5ptAxHkQAeoXfSnXpQ4Mcgr0q9Yy2lVchr3W-_OdWnEaAkzeEALw_wcB");
		String sourceCodeOfTheWebPage = driver.getPageSource();
		
		System.out.println(sourceCodeOfTheWebPage);
		

	}

}
