package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.Changepasswordpage;
import pageobjects.Homepage;
import pageobjects.Loginpage;
import pageobjects.myaccountpage;
import testBase.Baseclass;

public class Tc_010Changepasswordtest extends Baseclass {
	
	@Test(groups = {"Master"})
	public void verifychangepassword() {

		logger.info("*** starting changepassword test case ****");

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
			myacct.lnkpassword();
		
			//changepasswordpage
			Changepasswordpage cp = new Changepasswordpage(driver);
			cp.clickonpassword("Deepu@123");
			cp.clickonconfirmpassword("Deepu@123");
			cp.clickoncontinue();
			
			
		}

		catch (Exception e) {

			Assert.fail();

		}
		
		try 
		{
		WebElement element =driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
		
		//Get the text from the element
		String ActualText = element.getText();
		
		String ExpText="Success: Your password has been successfully updated.";
		
		//Using if else statement
		
		if (ActualText.equals(ExpText)) {
            System.out.println("password change success " + ActualText);
        } else {
            System.out.println("password chnage was not success " + ExpText + "', but found: '" + ActualText + "'");
        }
		
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
		

		logger.info("*** finish changepassword test case ****");

	}

}
	


