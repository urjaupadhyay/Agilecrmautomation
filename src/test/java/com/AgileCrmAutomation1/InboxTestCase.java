package com.AgileCrmAutomation1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.AgileCrmAutomation2.BaseCase;
import com.agilecrm.pages.InboxPage;
import com.agilecrm.pages.LoginPage;

public class InboxTestCase extends BaseCase {
@Test
	public void main() {
		
		lunchBrowser("Chrome");
			driver.navigate().to("https://mtesting.agilecrm.com/#");
			LoginPage LoginPage = new LoginPage();
			LoginPage.login("coding@yopmail.com", "Qqqq1234");
			click(By.id("inboxmenu"), "Click on Inbox Menu");
			waitElementToBeClickable(By.id("inboxmenu"));
			InboxPage ip=new InboxPage();
			ip.composeMail();
			

	}

}
