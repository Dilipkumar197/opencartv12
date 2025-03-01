package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Productreturnpage extends Basepage{

	public Productreturnpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	@FindBy(xpath = "//input[@value='2']")
	public WebElement Lnkreasonforreturn;
	
	@FindBy(xpath = "//textarea[@name='comment']")
	public WebElement txtcomment ;
	
	@FindBy(xpath = "//input[@type='submit']")
	public WebElement btnsubmit ;
	
	public void clickonreasonforreturn() {

		Lnkreasonforreturn.click();
		
	}
	
	public void textcomment() {

		txtcomment.click();
		
	}
	
	public void clickonsubmit() {

		btnsubmit.click();
		
	}
	
}
