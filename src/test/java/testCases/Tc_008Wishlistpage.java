package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.Homepage;
import pageobjects.Loginpage;
import pageobjects.Productcomparsionpage;
import pageobjects.Searchproductpage;
import pageobjects.Wishlistpage;
import pageobjects.myaccountpage;
import testBase.Baseclass;

public class Tc_008Wishlistpage extends Baseclass {
	
	@Test(groups = {"Master"})
	public void verifywishlistpage() {

		logger.info("*** starting Wishlist test case ****");

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
			
			//addtowishlistpage
			Wishlistpage wl= new Wishlistpage(driver);
			wl.clickonaddtowishlist();
			wl.clickwishlistpage();
			
			
		
		}

		catch (Exception e) {

			Assert.fail();

		}

		logger.info("*** finish wishlist test case ****");

	}

}
	