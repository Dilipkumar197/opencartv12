package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage extends Basepage{

	
	public Loginpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//input[@id='input-email']")
	public WebElement txtusername;

	@FindBy(xpath = "//input[@id='input-password']")
	public WebElement txtpassword;
	
	@FindBy(xpath = "//input[@value='Login']")
	public WebElement btnlogin;

	public void clickonemailadress(String email) {

		txtusername.sendKeys(email);
	}

	public void clickonpassword(String pass) {

		txtpassword.sendKeys(pass);
	}

	public void clickonlogin() {

		btnlogin.click();
	}
}
