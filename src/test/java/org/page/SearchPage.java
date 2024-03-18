package org.page;

import org.baseTest.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends BaseClass{

	public SearchPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")
	private WebElement location;

	@FindBy(id="hotels")
	private WebElement hotels;
	
	
	@FindBy(id="room_type")
	private WebElement roomtype;

	@FindBy(id="room_nos")
	private WebElement noroom;

	
	
	@FindBy(id="datepick_in")
	private WebElement indate;

	@FindBy(id="datepick_out")
	private WebElement outdate;

	
	
	@FindBy(id="adult_room")
	private WebElement adultperroom;

	@FindBy(id="child_room")
	private WebElement childrenperroom;
	
	@FindBy(id="Submit")
	private WebElement search;

	public WebElement getLocation() {
		return location;
	}

	public void setLocation(WebElement location) {
		this.location = location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public void setHotels(WebElement hotels) {
		this.hotels = hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public void setRoomtype(WebElement roomtype) {
		this.roomtype = roomtype;
	}

	public WebElement getNoroom() {
		return noroom;
	}

	public void setNoroom(WebElement noroom) {
		this.noroom = noroom;
	}

	public WebElement getIndate() {
		return indate;
	}

	public void setIndate(WebElement indate) {
		this.indate = indate;
	}

	public WebElement getOutdate() {
		return outdate;
	}

	public void setOutdate(WebElement outdate) {
		this.outdate = outdate;
	}

	public WebElement getAdultperroom() {
		return adultperroom;
	}

	public void setAdultperroom(WebElement adultperroom) {
		this.adultperroom = adultperroom;
	}

	public WebElement getChildrenperroom() {
		return childrenperroom;
	}

	public void setChildrenperroom(WebElement childrenperroom) {
		this.childrenperroom = childrenperroom;
	}

	public WebElement getSearch() {
		return search;
	}

	public void setSearch(WebElement search) {
		this.search = search;
	}

}


