package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.Homepage;
import pageobjects.Loginpage;
import pageobjects.Searchproductpage;
import pageobjects.Shoppingcarttest;

import pageobjects.myaccountpage;
import testBase.Baseclass;

public class Tc_009Shoppingcarttest extends Baseclass{
	
	
		@Test(groups = {"Master"})
		public void verifyshoppingpage() {

			logger.info("*** starting shoppingpage test case ****");

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
			
				
			   //shoppingcartpage
				Shoppingcarttest sc= new Shoppingcarttest(driver);
				sc.clickonaddtocart();
				sc.clickonshoppingcart();
				
				
			}

			catch (Exception e) {

				Assert.fail();

			}

			logger.info("*** finish shoppingcart test case ****");

		}

	}
		


