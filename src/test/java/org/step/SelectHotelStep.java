package org.step;

import org.baseTest.BaseClass;
import org.openqa.selenium.WebElement;
import org.page.SearchPage;
import org.page.SelectHotel;

import io.cucumber.java.en.When;

public class SelectHotelStep extends BaseClass {

	public static BaseClass b = new BaseClass();
	public static SelectHotel s2 = new SelectHotel();
	
	
	@When("User should select the hotel details")
	public void userShouldSelectTheHotelDetails() {
	    
		try
		{
			s2= new SelectHotel();
			WebElement selecthotel = s2.getSSelect();
			selecthotel.click();
			
			WebElement continuee = s2.getContinuee();
			continuee.click();
			
			System.out.println("sucessful selection");
		}
		catch(Exception e)
		{
			System.out.println("unsucessful selection");
		}
	}
	}

