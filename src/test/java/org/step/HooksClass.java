 package org.step;

import java.util.concurrent.TimeUnit;

import org.baseTest.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass {

	public static  BaseClass b = new BaseClass();
	
	
	@Before
	public void BeforeExecute() {
		try
		{
			b.getDriver("chrome");
			b.getUrl(b.readExcel(7, 0));
			b.winMax();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			System.out.println("Launching browser sucessfull ");

		}
		catch(Exception e)
		{
			System.out.println("Launching browser unsucessfull ");
		}
	}
	
	
	@After
	
	public void AfterExexcute()
	{
		driver.close();
	}
}
