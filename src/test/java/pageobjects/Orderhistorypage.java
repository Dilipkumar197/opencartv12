package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Orderhistorypage extends Basepage{

	public Orderhistorypage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//tbody/tr[1]/td[7]/a[1]")
	public WebElement Lnkviewoption;
	
	@FindBy(xpath = "//i[@class='fa fa-reply']")
	public WebElement Lnkreturnoption;
	
	@FindBy(xpath = "//a[normalize-space()='Continue']")
	public WebElement Lnkcontinue;
	
	public void clickonviewoption() {

		Lnkviewoption.click();
		
	}
	
	public void clickonreturnoption() {

		Lnkreturnoption.click();
		
	}

	
	public void clickoncontinue() {

		Lnkcontinue.click();
		
	}
	
	


}
