package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.Homepage;
import pageobjects.Loginpage;
import pageobjects.myaccountpage;
import testBase.Baseclass;

public class TC_002Logintest extends Baseclass {

	@Test(groups = {"Master", "Regression"})
	public void verifylogin() {

		logger.info("*** starting Log in test case ****");

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
			boolean Targetpage = myacct.ismyaccountpageexists();

			Assert.assertEquals(Targetpage, true, "Loginfailed");

		}

		catch (Exception e) {

			Assert.fail();

		}

		logger.info("*** finish Login test case ****");

	}

}
