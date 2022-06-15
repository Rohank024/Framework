package pagrobjectmodel;

import java.io.IOException;

import junit.framework.Test;

public class ActiTimeValidLogin extends BaseTest
{
	public static void main(String[] args) throws IOException  {
	  
		BaseTest bt =new BaseTest();
		bt.setup(); 
		
		
		Flib flib = new Flib();
		
		//read the data from generic reusable method
		String validUsername = flib.readpropertyfile(PROP_PATH, "username");
		String validPassword = flib.readpropertyfile(PROP_PATH, "password");
		
		loginpage lp = new loginpage(driver);
		lp.actitimeinvalidlogin(validUsername, validPassword);
		
	}

}
