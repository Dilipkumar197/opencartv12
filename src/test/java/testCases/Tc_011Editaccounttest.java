package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.Changepasswordpage;
import pageobjects.Editaccountpage;
import pageobjects.Homepage;
import pageobjects.Loginpage;
import pageobjects.myaccountpage;
import testBase.Baseclass;

public class Tc_011Editaccounttest extends Baseclass {
	
	@Test(groups = {"Master"})
	public void verifyeditaccount() {

		logger.info("*** starting Editaccount test case ****");

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
			myacct.lnkeditaccount();
			
			
		
			//editaccountpage
			Editaccountpage ea = new Editaccountpage(driver);
			ea.clickonfirstname(randomeString().toUpperCase());
			ea.clickonlastname(randomeString().toUpperCase());
			ea.clickontelephone(randomeNumber());;
		    ea.clickoncontinue();
			
			
		}

		catch (Exception e) {

			Assert.fail();

		}
		
		try 
		{
		WebElement element =driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
		
		//Get the text from the element
		String ActualText = element.getText();
		
		String ExpText="Success: Your account has been successfully updated.";
		
		//Using if else statement
		
		if (ActualText.equals(ExpText)) {
            System.out.println("Account details are updated" + ActualText);
        } else {
            System.out.println("Account details  was not updated " + ExpText + "', but found: '" + ActualText + "'");
        }
		
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
		

		logger.info("*** finish editaccount test case ****");

	}

}


