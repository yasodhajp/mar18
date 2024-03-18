package org.step;

import org.baseTest.BaseClass;
import org.openqa.selenium.WebElement;
import org.page.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class loginSteps extends BaseClass{
	
	public static BaseClass  b = new BaseClass();
	public static LoginPage  l = new LoginPage();
	
	@Given("User should be navigate to the login page")
	public void user_should_be_navigate_to_the_login_page() {
	  
	}

	@When("User should enter the {string} and {string}")
	public void user_should_enter_the_and(String user, String pass) {
	   l = new LoginPage();
	   WebElement userName = l.getUserName();
	   b.textSendByJava(userName, user);
	   
	   WebElement password = l.getPassword();
	   b.textSendByJava(password, pass);
	   
	   WebElement login = l.getLogin();
	   login.click();
	   
	}

}
