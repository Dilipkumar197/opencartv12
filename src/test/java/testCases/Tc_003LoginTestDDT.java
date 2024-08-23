package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.Homepage;
import pageobjects.Loginpage;
import pageobjects.myaccountpage;
import testBase.Baseclass;
import utilities.DataProviders;

public class Tc_003LoginTestDDT extends Baseclass {

	@Test(dataProvider = "LoginData", dataProviderClass = DataProviders.class) // Getting data from dataproviderclass
	public void verifyloginDDT(String email, String pass, String exp) {

		logger.info("*** starting Log inDDT test case ****");
		try {
			Homepage hp = new Homepage(driver);
			hp.clickonmyaccount();
			hp.clicklogin();

			// Login
			Loginpage lp = new Loginpage(driver);
			lp.clickonemailadress(email);
			lp.clickonpassword(pass);
			lp.clickonlogin();

			// Myaccount
			myaccountpage myacct = new myaccountpage(driver);
			boolean Targetpage = myacct.ismyaccountpageexists();

			/*
			 * data is valid---> Log in success --> Test pass --> Log out --> Log is not
			 * success --> Test fail
			 *
			 * Data is invalid -> Log in success --> Test pass--> Log out -> Log in not
			 * success--> Test fail-->
			 */

			if (exp.equalsIgnoreCase("Valid")) {

				if (Targetpage == true) {
					myacct.clickonlogout();
					Assert.assertTrue(true);
				}

				else {
					Assert.assertTrue(false);
				}
			}

			if (exp.equalsIgnoreCase("Invalid")) {

				if (Targetpage == true) {
					myacct.clickonlogout();
					Assert.assertTrue(false);
				}

				else {
					Assert.assertTrue(true);
				}
			}

			logger.info("*** Finish Log in DDT test case ****");

		} catch (Exception e) {

			Assert.fail();
		}
	}

}
