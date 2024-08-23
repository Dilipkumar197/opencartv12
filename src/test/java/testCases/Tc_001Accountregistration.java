package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.Accountregistrationpage;
import pageobjects.Homepage;
import testBase.Baseclass;

public class Tc_001Accountregistration extends Baseclass {

	@Test(groups = {"Sanity", "Master"})
	public void verfiyacctregsiter() throws InterruptedException {

		try {

			logger.info("*** starting account registration test case ****");
			Homepage hp = new Homepage(driver);

			logger.info("*** clicked on My account button ****");
			hp.clickonmyaccount();

			logger.info("*** clicked on Login button ****");
			hp.clickonregsiter();

			logger.info("*** providing the user details ****");
			Accountregistrationpage regpage = new Accountregistrationpage(driver);
			regpage.setfirstname(randomeString().toUpperCase());
			regpage.setlastname(randomeString().toUpperCase());
			regpage.setemail(randomeString() + "@gmail.com"); // randomly generated email
			regpage.settelephone(randomeNumber());

			String password = randomeAlphnanumberic();
			regpage.setpassword(password);
			regpage.setconfirmpassword(password);
			regpage.checkpolicy();
			regpage.checkoncontinuebtn();

			logger.info("*** validated the account creation message ****");
			String confrmmsg = regpage.getconfirmationmsg();

			if (confrmmsg.equals("Your Account Has Been Created!"))

			{
				Assert.assertTrue(true);
			}

			else {

				logger.error("Test Failed...");
				logger.debug("Debug Logs");
				Assert.assertTrue(false);
			}

		} catch (Exception e) {

			Assert.fail();
		}

		logger.info("***Finished starting account registration test case ****");

	}

}
