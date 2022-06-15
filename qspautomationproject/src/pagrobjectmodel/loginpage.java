package pagrobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	
	//declaration
	@FindBy(name="username") private WebElement usn;
	@FindBy(name="pwd") private WebElement pass;
	@FindBy(id="loginButton") private WebElement loginbtn;
	@FindBy(id="keepLoggedInLabel") private WebElement keepmelogin;
	@FindBy(xpath=("//img[contains(@src,'timer')]")) private WebElement img ;
	@FindBy(id="licenseLink") private WebElement licence;
	
	
	//initialization
	
     public loginpage(WebDriver driver) {
    	 PageFactory.initElements(driver, this);
     }


		
	//utilization
	
     public WebElement getUsn() {
 		return usn;
 	}


 	public WebElement getPass() {
 		return pass;
 	}


 	public WebElement getLoginbtn() {
 		return loginbtn;
 	}


 	public WebElement getKeepmelogin() {
 		return keepmelogin;
 	}


 	public WebElement getImg() {
 		return img;
 	}


 	public WebElement getLicence() {
 		return licence;
 	}
 	
 	
 	
 	
 	
 	//generic reusable method
 	
 	public void actitimevalidlogin(String validusername,String Validpassword) 
 	{
 		 usn.sendKeys(validusername);
 		 pass.sendKeys(Validpassword);
 		 loginbtn.click();
	}
 	
 	public void actitimeinvalidlogin(String Invalidusername,String Invalidpassword)
 	{
 		 usn.sendKeys(Invalidusername);
 		 pass.sendKeys(Invalidpassword);
 		 loginbtn.click();
	}
 	
 	
 	
 	//operational methods
 	

	
	
	
	
	
	
	
	
	
	
	
	
	

}
