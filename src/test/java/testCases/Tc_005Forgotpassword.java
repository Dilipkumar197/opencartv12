package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.Forgotpasswordpage;
import pageobjects.Homepage;
import pageobjects.Loginpage;
import pageobjects.myaccountpage;
import testBase.Baseclass;

public class Tc_005Forgotpassword extends Baseclass {
	

	@Test(groups = {"Master" })
	public void verifyforgotpassword() {

		logger.info("*** starting verify forgot password test ****");

		try {
			// Homepage
			Homepage hp = new Homepage(driver);
			hp.clickonmyaccount();
			hp.clicklogin();

			// Login
			Loginpage lp = new Loginpage(driver);
			lp.clickonforgotpasswordlink();

			//forgotpasswordpage
			Forgotpasswordpage fp= new Forgotpasswordpage(driver);
			fp.clickonemailadress(p.getProperty("email"));
			fp.clickoncontinue();
			

		}

		catch (Exception e) {

			Assert.fail();

		}

		try 
		{
		WebElement element =driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
		
		//Get the text from the element
		String ActualText = element.getText();
		
		String ExpText="An email with a confirmation link has been sent your email address.";
		
		//Using if else statement
		
		if (ActualText.equals(ExpText)) {
            System.out.println("Confirmation link " + ActualText);
        } else {
            System.out.println("Confirmation link not sent " + ExpText + "', but found: '" + ActualText + "'");
        }
		
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
		

		
		logger.info("*** finish verify forgot password test ****");

	}


}

