package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Accountregistrationpage extends Basepage {

	public Accountregistrationpage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//input[@id='input-firstname']")
	public WebElement txtfirstname;

	@FindBy(xpath = "//input[@id='input-lastname']")
	public WebElement txtlastname;

	@FindBy(xpath = "//input[@id='input-email']")
	public WebElement txtemail;

	@FindBy(xpath = "//input[@id='input-telephone']")
	public WebElement txtTelephone;

	@FindBy(xpath = "//input[@id='input-password']")
	public WebElement txtPassword;

	@FindBy(xpath = "//input[@id='input-confirm']")
	public WebElement txtconfirmpassword;

	@FindBy(xpath = "//input[@type='checkbox']")
	public WebElement chckpolicy;

	@FindBy(xpath = "//input[@value='Continue']")
	public WebElement btncontinue;

	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	public WebElement confirmmessage;

	public void setfirstname(String fname) {

		txtfirstname.sendKeys(fname);
	}

	public void setlastname(String lname) {

		txtlastname.sendKeys(lname);
	}

	public void setemail(String email) {

		txtemail.sendKeys(email);
	}

	public void settelephone(String telephone) {

		txtTelephone.sendKeys(telephone);
	}

	public void setconfirmpassword(String password) {

		txtPassword.sendKeys(password);
	}

	public void setpassword(String cnfpassword) {

		txtconfirmpassword.sendKeys(cnfpassword);
	}

	public void checkpolicy() {

		chckpolicy.click();
	}

	public void checkoncontinuebtn() {

		btncontinue.click();
	}

	public String getconfirmationmsg() {

		try {
			return (confirmmessage.getText());
		} catch (Exception e) {
			return (e.getMessage());
		}

	}
}
