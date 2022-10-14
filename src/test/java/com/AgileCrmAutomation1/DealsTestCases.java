package com.AgileCrmAutomation1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.AgileCrmAutomation2.BaseCase;
import com.agilecrm.pages.DealsPage;
import com.agilecrm.pages.LoginPage;

public class DealsTestCases  extends BaseCase{
	@Test

	public void main() throws Exception {
	
		lunchBrowser("Chrome");
		driver.navigate().to("https://mtesting.agilecrm.com/#");
		LoginPage LoginPage = new LoginPage();
		LoginPage.login("coding@yopmail.com", "Qqqq1234");
		click(By.id("dealsmenu"),"Click on deals menu");
		DealsPage dealspage=new DealsPage();
		dealspage.changeDealsStatus("New","prospect");

	}

}
