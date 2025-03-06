package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Editaccountpage extends Basepage {

	public Editaccountpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}



	@FindBy(xpath = "//input[@id='input-firstname']")
	public WebElement txtfirstname;

	@FindBy(xpath = "//input[@id='input-lastname']")
	public WebElement txtlastname;

	@FindBy(xpath = "//input[@id='input-email']")
	public WebElement txtemail;

	@FindBy(xpath = "//input[@id='input-telephone']")
	public WebElement txttelephone;
	
	@FindBy(xpath = "//input[@value='Continue']")
	public WebElement btncontinue;

	

	public void clickonfirstname(String fname) {
		
        txtfirstname.clear();
		txtfirstname.sendKeys(fname);
		

	}

	public void clickonlastname(String lname) {

		txtlastname.clear();
		txtlastname.sendKeys(lname);
		
	}

	

	public void clickontelephone(String phonenum) {

		txttelephone.clear();
		txttelephone.sendKeys(phonenum);
		

	}
	
	public void btncontinue(String phonenum) {

		txtemail.sendKeys(phonenum);
		

	}
	
	public void clickoncontinue() {

		btncontinue.click();
		

	}
	

}
