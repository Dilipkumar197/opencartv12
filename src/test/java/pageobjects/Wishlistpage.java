package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Wishlistpage  extends Basepage{

	public Wishlistpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	@FindBy(xpath = "//button[@class='btn btn-default']//i[@class='fa fa-heart']")
	public WebElement Lnkaddtowishlist;
	
	@FindBy(xpath = "//a[normalize-space()='wish list']")
	public WebElement Lnkwishlistpage;
	
	public void clickonaddtowishlist() {

		Lnkaddtowishlist.click();
	     
	}
	
	public void clickwishlistpage() {

		Lnkaddtowishlist.click();
	     
	}
	
	
}
