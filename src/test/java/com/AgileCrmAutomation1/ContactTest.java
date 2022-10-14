package com.AgileCrmAutomation1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.AgileCrmAutomation2.BaseCase;
import com.agilecrm.pages.ContactPage;
import com.agilecrm.pages.LoginPage;

public class ContactTest extends BaseCase{
@Test
	public  void main() throws InterruptedException {
		
	     lunchBrowser("Chrome");
		driver.navigate().to("https://mtesting.agilecrm.com/#");
		LoginPage LoginPage = new LoginPage();
		LoginPage.login("coding@yopmail.com", "Qqqq1234");
		driver.findElement(By.xpath("//i[@class='material-icons people']")).click();
		ContactPage c=new ContactPage();
		//c.AddContact();
		c.searchContact("Gunjan");
		//c.editContact("nagpur", "maharashtra");
		//c.deleteContact();

	}

}
