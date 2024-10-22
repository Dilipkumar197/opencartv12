package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Searchproductpage extends Basepage {

	public Searchproductpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//input[@name='search']")
	public WebElement txtsearchproduct;
	
	@FindBy(xpath = "//button[@class='btn btn-default btn-lg']")
	public WebElement btnsearch;
	
	@FindBy(xpath = "//div[@class='caption']//a[contains(text(),'iMac')]")
	public WebElement Lnkproduct;
	
	@FindBy(xpath = "//button[@id='button-cart']")
	public WebElement Lnkaddtocart;
	
	@FindBy(xpath = "//span[@id='cart-total']")
	public WebElement Lnkitemscart;
	
	public void Setsearchproduct(String product) {

		txtsearchproduct.sendKeys(product);
	}
	
	public void clickonsearchicon() {

		btnsearch.click();
	}
	
	
	public void clickonproduct() {

		Lnkproduct.click();
	}
	

	public void clickonaddtocart() {

		Lnkaddtocart.click();
	}
	
	public void clickonitemscart() {

		Lnkitemscart.click();
	}
	

}
