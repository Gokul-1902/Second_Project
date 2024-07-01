package org.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_A_Hotel {


	private WebDriver driver;

	@FindBy(xpath="//input[@id='first_name']")
	private WebElement FirstName;

	@FindBy(xpath="//input[@id='last_name']")
	private WebElement LastName;

	@FindBy(xpath="//textarea[@id='address']")
	private WebElement BillingAddress;

	@FindBy(xpath="//input[@id='cc_num']")
	private WebElement CreditCardNo ;

	@FindBy(xpath="//select[@id='cc_type']")
	private WebElement CreditCardType;

	@FindBy(xpath="//select[@id='cc_exp_month']")
	private WebElement Expirymonth;

	@FindBy(xpath="//select[@id='cc_exp_year']")
	private WebElement Expiryear;

	@FindBy(xpath="//input[@id='cc_cvv']")
	private WebElement CVVNumber;

	@FindBy(xpath="//input[@id='book_now']")
	private WebElement BookNOw;

	@FindBy(xpath ="//td[@class='login_title']")
	private WebElement BookingConformation;

	@FindBy(xpath="//input[@id='logout']")
	private WebElement  Logout;





	public Book_A_Hotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);

	}

	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getLogout() {
		return Logout;
	}

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getBillingAddress() {
		return BillingAddress;
	}

	public WebElement getCreditCardNo() {
		return CreditCardNo;
	}

	public WebElement getCreditCardType() {
		return CreditCardType;
	}

	public WebElement getExpirymonth() {
		return Expirymonth;
	}

	public WebElement getExpiryear() {
		return Expiryear;
	}

	public WebElement getCVVNumber() {
		return CVVNumber;
	}

	public WebElement getBookNOw() {
		return BookNOw;
	}
	public WebElement getBookingConformation() {
		return BookingConformation;
	}
	public void setLogout(WebElement logout) {
		Logout = logout;
	}

}
