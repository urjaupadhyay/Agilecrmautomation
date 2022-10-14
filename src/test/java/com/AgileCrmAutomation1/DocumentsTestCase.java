package com.AgileCrmAutomation1;

import org.openqa.selenium.By;

import com.AgileCrmAutomation2.BaseCase;
import com.agilecrm.pages.DocumentsPage;
import com.agilecrm.pages.LoginPage;

public class DocumentsTestCase extends BaseCase {

	public static void main(String[] args) {
		
	     lunchBrowser("Chrome");
		driver.navigate().to("https://mtesting.agilecrm.com/#");
		LoginPage LoginPage = new LoginPage();
		LoginPage.login("coding@yopmail.com", "Qqqq1234");
		click(By.id("documentsmenu"), "Click on Contact Menu");
		waitElementToBeClickable(By.id("documentsmenu"));
		//driver.findElement(By.xpath("//i[@class='material-icons people']")).click();
		DocumentsPage dp=new DocumentsPage();
		dp.AddDocuments();

	}

}
