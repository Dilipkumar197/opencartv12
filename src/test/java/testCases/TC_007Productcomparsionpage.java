package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.Homepage;
import pageobjects.Loginpage;
import pageobjects.Productcomparsionpage;
import pageobjects.Searchproductpage;
import pageobjects.myaccountpage;
import testBase.Baseclass;

public class TC_007Productcomparsionpage extends Baseclass {
	
	@Test(groups = {"Master"})
	public void verifyproductcomparsionpage() {

		logger.info("*** starting product comparsion test case ****");

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
		
			//Search page
			Searchproductpage sp = new Searchproductpage(driver);
			sp.Setsearchproduct("imac");
			sp.clickonsearchicon();
			sp.clickonproduct();
			
			//addtocomparsionpage
			Productcomparsionpage pc= new Productcomparsionpage(driver);
			pc.clickonaddtocomparsion();
			pc.clickoncomparsionpage();
			pc.clickonaddtocart();

		}

		catch (Exception e) {

			Assert.fail();

		}

		logger.info("*** finish product comparsion test case ****");

	}

}
	


