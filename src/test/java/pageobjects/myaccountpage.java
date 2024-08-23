package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class myaccountpage extends Basepage {

	public myaccountpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//h2[text()='My Account']")
	public WebElement msgheading;
	
	@FindBy(xpath = "//div[@class='list-group']//a[text()='Logout']")
	public WebElement btnlogout;

	public boolean ismyaccountpageexists() {

		try {
			return (msgheading.isDisplayed());

		} catch (Exception e) {

			return false;
		}

	}
	
	public void clickonlogout() {

		btnlogout.click();
	}

}
