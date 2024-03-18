package org.step;

import org.baseTest.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.page.BookAHotelPage;
import org.page.SelectHotel;

import io.cucumber.java.en.When;

public class BookAHotelStep extends BaseClass{
	
	public static   BookAHotelPage  l = new    BookAHotelPage();
	public static  BaseClass  b = new BaseClass();
	
	
	@When("User should enter the booknow hotel information {string} and {string} and  {string} and  {string} and  {string} and  {string} and  {string} and  {string}")
	public void user_should_enter_the_booknow_hotel_information_and_and_and_and_and_and_and(String name, String last, String addres, String cardno, String cardtp, String mon, String year, String cvv) {
	   
		try
		{
			
			WebElement firstName = l.getFirstName();
			b.textSendByJava(firstName, name );
			
			WebElement lastName = l.getLastName();
		    b.textSendByJava(lastName, last );
		    
		    WebElement billingAddress = l.getBillingAddress();
		    b.textSendByJava(billingAddress, addres );
		    
		    
		    WebElement cardNumber = l.getCardNumber();
		    b.textSendByJava(cardNumber,cardno);
		    
		    WebElement cardType = l.getCardType();
		    b.textSendByJava(cardType, cardtp);
		    
		    WebElement expMonth = l.getExpMonth();
		    b.textSendByJava(expMonth, mon );
		    
		    WebElement expYear = l.getExpYear();
		    b.textSendByJava(expYear, year );
		    
		    WebElement cvNo = l.getCvNo();
		    b.textSendByJava(cvNo, cvv);
		    
		    WebElement bookNow = l.getBookNow();
		    bookNow.click();
		    
		    Thread.sleep(5000);
		    
		    WebElement orderNo = driver.findElement(By.id("order_no"));
			String numberOrder = b.getAttributebyJava(orderNo);
			System.out.println(numberOrder);
		    
			System.out.println("sucess booking");
		}
	    catch(Exception e)
		{
	    	System.out.println("unsucess booking");
		}
	}
	}

