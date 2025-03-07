package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.Homepage;
import pageobjects.Loginpage;
import pageobjects.Orderhistorypage;
import pageobjects.Productreturnpage;
import pageobjects.myaccountpage;
import testBase.Baseclass;

public class Tc_013Productreturntest extends Baseclass {
	
	
	@Test(groups = {"Master"})
	public void verifyproductreturn () {

		logger.info("*** starting product return  test case ****");

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
			//Orderhistorypage oh= new Orderhistorypage(driver);
			//oh.clickonviewoption();
			//oh.clickonreturnoption();
			
			//productreturnpage 
			
			//Productreturnpage PR= new Productreturnpage(driver);
			//PR.clickonreasonforreturn();
			//PR.textcomment();
			//PR.clickonsubmit();
			
		
	
		}

		catch (Exception e) {

			Assert.fail();

		}
		
		
		try 
		{
		WebElement element =driver.findElement(By.xpath("//p[contains(text(),'Thank you for submitting your return request. Your')]"));
		
		//Get the text from the element
		String ActualText = element.getText();
		
		String ExpText="Thank you for submitting your return request. Your request has been sent to the relevant department for processing.";
		
		//Using if else statement
		
		if (ActualText.equals(ExpText)) {
            System.out.println("Product return  request is success" + ActualText);
        } else {
            System.out.println(" Product return  request is not success" + ExpText + "', but found: '" + ActualText + "'");
        }
		
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
		
		
		logger.info("*** finish product returntest case ****");
	}
	
}


