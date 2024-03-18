package org.step;

import org.baseTest.BaseClass;
import org.openqa.selenium.WebElement;
import org.page.SearchPage;

import io.cucumber.java.en.When;

public class SearchHotelsteps extends BaseClass {
	
	public static BaseClass b = new BaseClass();
	public static SearchPage s1 = new SearchPage();
	
	
	@When("User should enter the {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string}")
	public void user_should_enter_the_and_and_and_and_and_and_and(String locate, String hotel, String roomtyp, String norm, String datein, String dateout, String aper, String cper) {
		try
		{
			s1 = new   SearchPage();
			WebElement location = s1.getLocation();
			b.SelectbyValue(location, locate);
			
			WebElement hotels = s1.getHotels();
			b.SelectbyValue(hotels, hotel);
			
			WebElement roomtype = s1.getRoomtype();
			b.SelectbyValue(roomtype, roomtyp);
			
			WebElement noroom = s1.getNoroom();
		    b.textSendByJava(noroom, norm);
			
		    WebElement indate = s1.getIndate();
		    b.textSendByJava(indate,datein );
		    
		    WebElement outdate = s1.getOutdate();
		    b.textSendByJava(outdate, dateout );
		    
		    WebElement adultperroom = s1.getAdultperroom();
		    b.textSendByJava(adultperroom, aper);
		    
		    WebElement childrenperroom = s1.getChildrenperroom();
		    b.textSendByJava(childrenperroom, cper);
		    
		    WebElement search = s1.getSearch();
		    search.click();
		}
		catch(Exception e)
		{
			System.out.println("not success");
		}
	}

}
