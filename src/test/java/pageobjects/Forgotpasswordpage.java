package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Forgotpasswordpage extends Basepage {
	
	public Forgotpasswordpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//input[@id='input-email']")
	public WebElement txtrecoveryemail;
	
	@FindBy(xpath = "//input[@type='submit']")
	public WebElement btncontinue;
	
	public void clickonemailadress(String email) {

		txtrecoveryemail.sendKeys(email);
	}

	public void clickoncontinue() {

		btncontinue.click();
	}
}
