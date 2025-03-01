package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;


import pageobjects.Homepage;
import pageobjects.Loginpage;
import pageobjects.Orderhistorypage;
import pageobjects.myaccountpage;
import testBase.Baseclass;

public class Tc_012Orderhistorytest extends Baseclass {
	
	@Test(groups = {"Master"})
	public void verifyorderhistory () {

		logger.info("*** starting Orderhistory test case ****");

		try {
			// Homepage
			Homepage hp = new Homepage(driver);
			hp.clickonmyaccount();
			hp.clicklogin();

			// Login
			Loginpage lp = new Loginpage(driver);
			lp.clickonemailadress(p.getProperty("email"));
			lp.clickonpassword(p.getProperty("pass"));
			lp.clickonlogin();

			// Myaccount
			myaccountpage myacct = new myaccountpage(driver);
			myacct.clickonorderhistorylink();
			
		
			//Orderhistorypage
			Orderhistorypage oh= new Orderhistorypage(driver);
			oh.clickoncontinue();
			
	
		}

		catch (Exception e) {

			Assert.fail();

		}
		
		logger.info("*** finish Orderhistory test case ****");
	}
	
}
