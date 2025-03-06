package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Shoppingcarttest extends Basepage {

	public Shoppingcarttest(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	@FindBy(xpath = "//div[@class='product-layout product-grid col-lg-3 col-md-3 col-sm-6 col-xs-12']//button[1]")
	public WebElement Lnkaddtocart;
	
	@FindBy(xpath = "//a[normalize-space()='shopping cart']")
	public WebElement Lnkshoppingcart;
	
	public void clickonaddtocart() {

		Lnkaddtocart.click();
	     
	}
	
	public void clickonshoppingcart() {

		Lnkshoppingcart.click();
	     
	}
}
