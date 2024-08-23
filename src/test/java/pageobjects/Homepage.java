package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends Basepage {

	public Homepage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//a[@title='My Account']")
	public WebElement Linkmyact;

	@FindBy(xpath = "(//a[text()='Register'])[1]")
	public WebElement Linkregister;
	
	@FindBy(xpath = "(//a[text()='Login'])[1]")
	public WebElement Linklogin;

	public void clickonmyaccount() {

		Linkmyact.click();
	}

	public void clickonregsiter() {

		Linkregister.click();
	}



	public void clicklogin() {
		Linklogin.click();
	}

	

}
