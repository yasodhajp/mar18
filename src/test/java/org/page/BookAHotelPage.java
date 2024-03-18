package org.page;

import org.baseTest.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAHotelPage extends BaseClass {

	public BookAHotelPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="first_name")
	private WebElement FirstName;
	
	@FindBy(id="last_name")
	private WebElement LastName;
	
	@FindBy(id="address")
	private WebElement billingAddress;
	
	@FindBy(name="cc_num")
	private WebElement cardNumber;
	
	@FindBy(id="cc_type")
	private WebElement cardType;
	
	@FindBy(id="cc_exp_month")
	private WebElement expMonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement expYear;
	
	@FindBy(id="cc_cvv")
	private WebElement cvNo;
	
	@FindBy(id="book_now")
	private WebElement bookNow;

	public WebElement getFirstName() {
		return FirstName;
	}

	public void setFirstName(WebElement firstName) {
		FirstName = firstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public void setLastName(WebElement lastName) {
		LastName = lastName;
	}

	public WebElement getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(WebElement billingAddress) {
		this.billingAddress = billingAddress;
	}

	public WebElement getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(WebElement cardNumber) {
		this.cardNumber = cardNumber;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public void setCardType(WebElement cardType) {
		this.cardType = cardType;
	}

	public WebElement getExpMonth() {
		return expMonth;
	}

	public void setExpMonth(WebElement expMonth) {
		this.expMonth = expMonth;
	}

	public WebElement getExpYear() {
		return expYear;
	}

	public void setExpYear(WebElement expYear) {
		this.expYear = expYear;
	}

	public WebElement getCvNo() {
		return cvNo;
	}

	public void setCvNo(WebElement cvNo) {
		this.cvNo = cvNo;
	}

	public WebElement getBookNow() {
		return bookNow;
	}

	public void setBookNow(WebElement bookNow) {
		this.bookNow = bookNow;
	
}
}
