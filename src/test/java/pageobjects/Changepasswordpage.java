package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Changepasswordpage extends Basepage {

	public Changepasswordpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	@FindBy(xpath = "//input[@id='input-password']")
	public WebElement txtchangepassword;
	
	@FindBy(xpath = "//input[@id='input-confirm']")
	public WebElement txtconfirmpassword;
	
	
	@FindBy(xpath = "//input[@value='Continue']")
	public WebElement btncontinue;
	
	
	public void clickonpassword(String pass) {

		txtchangepassword.sendKeys(pass);
	     
	}
	
	public void clickonconfirmpassword(String confirmpass) {

		txtconfirmpassword.sendKeys(confirmpass);
	     
	}
	
	public void clickoncontinue() {

	  btncontinue.click();
	     
	}
	

}
