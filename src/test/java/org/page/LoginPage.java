package org.page;

import org.baseTest.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@CacheLookup
	@FindBys({@FindBy(how=How.ID,using = "username"),@FindBy(how=How.XPATH,using="//input[@name='username']")})
	private WebElement userName;
	
	@FindAll({@FindBy(id = "passwohkdrd"),@FindBy(xpath = "//input[@name='password']")})
	private WebElement password;
	
	@FindBy(id = "login")
	private WebElement login;
	

	public WebElement getUserName() {
		return userName;
	}
	
	public WebElement getPassword() {
		return password;
	}
	
	public WebElement getLogin() {
		return login;
	}

	
	
}



