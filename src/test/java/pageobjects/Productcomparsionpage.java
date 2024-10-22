package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Productcomparsionpage extends Basepage {
	
	public Productcomparsionpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	@FindBy(xpath = "//div[@class='col-sm-4']//button[2]")
	public WebElement Lnkcomparsionproduct;
	
	@FindBy(xpath = "//a[normalize-space()='product comparison']")
	public WebElement Lnkcomparsionpage;
	
	@FindBy(xpath = "//input[@value='Add to Cart']")
	public WebElement Lnkaddtocart;
	
	public void clickonaddtocomparsion() {

	     Lnkcomparsionproduct.click();
	     
	}
	
	public void clickoncomparsionpage() {

		Lnkcomparsionpage.click();
		
	}
	
	public void clickonaddtocart() {

		Lnkaddtocart.click();
		
	}
	

}
