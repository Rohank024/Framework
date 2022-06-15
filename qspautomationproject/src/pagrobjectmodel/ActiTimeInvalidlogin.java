package pagrobjectmodel;

import java.io.IOException;

public class ActiTimeInvalidlogin extends BaseTest{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BaseTest bt = new BaseTest();
		bt.setup();
		
		
		Flib flib = new Flib();
		
		loginpage lp = new loginpage(driver);
		
		int rc = flib.getrowcount(EXCEL_PATH,"invalidcreds");
		

		for (int i = 1; i<=rc; i++)
		{
			String Invalidusername = flib.readExceldata(EXCEL_PATH,"invalidcreds", i, 0);
			String Invalidpassword = flib.readExceldata(EXCEL_PATH,"invalidcreds", i, 1);
			lp.actitimeinvalidlogin(Invalidusername,Invalidpassword);
	
		}
		
		}
		

}
