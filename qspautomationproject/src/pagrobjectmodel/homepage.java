package pagrobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {

	//declaration
	
	@FindBy(xpath=("//a[.='Logout']")) private WebElement logoutlink;
	@FindBy(xpath=("//a[.='Create new tasks']")) private WebElement createtask;
	@FindBy(xpath=("//div[.='Settings']")) private WebElement settings;
	
	
	//initialization
	
	public homepage(WebElement driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	
	//utilization
	
	public WebElement getLogoutlink() {
		return logoutlink;
	}
	
	public WebElement getCreatetask() {
		return createtask;
	}
	public WebElement getSettings() {
		return settings;
	}
	
	
	
	
}
