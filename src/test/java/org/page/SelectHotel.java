package org.page;

import org.baseTest.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends BaseClass{

	
	public WebElement getSSelect() {
		return SSelect;
	}


	public void setSSelect(WebElement sSelect) {
		SSelect = sSelect;
	}


	public WebElement getContinuee() {
		return Continuee;
	}


	public void setContinuee(WebElement continuee) {
		Continuee = continuee;
	}


	public SelectHotel() {
	
	PageFactory.initElements(driver, this);
	}

	@FindBy(id="radiobutton_0")
	private WebElement SSelect;
	

	@FindBy(id="continue")
	private WebElement Continuee;
}	

