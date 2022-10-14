package com.AgileCrmAutomation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.AgileCrmAutomation2.BaseCase;
import com.agilecrm.pages.LoginPage;

public class LoginAgileCrmTestCase extends BaseCase {
@Test
	public  void main() throws InterruptedException {
		LoginAgileCrmTestCase login = new LoginAgileCrmTestCase();
		login.lunchBrowser("Chrome");
		driver.navigate().to("https://mtesting.agilecrm.com/#");
		LoginPage LoginPage = new LoginPage();
		//invaild username and invalid password
		LoginPage.login("asdfdf","12345");
		LoginPage.validMessage();
		
		//invaild username and valid password
		LoginPage.login("cst@yopmail.com","Qqqq1234");
		LoginPage.validMessage();
		
		//vaild username and invalid password
		LoginPage.login("coding@yopmail.com","12345");
		LoginPage.validMessage();
		
		//vaild username and blank password
		LoginPage.login("coding@yopmail.com"," ");
		LoginPage.validMessage();
		
		//valid username and valid password
		LoginPage.login("coding@yopmail.com", "Qqqq1234");
		LoginPage.validMessage();
		
		//logout 
		
		LoginPage.logOut();
		System.out.println("logout successful");
		
		
		
		
		
		
		
		
		
		
		// click on contact menu
		/*driver.findElement(By.id("contactsmenu")).click();
		Thread.sleep(3000);
		// locate delete button
		WebElement deleteButton = driver.findElement(By.xpath("//button[text='Delete']"));
		// check delete button is enabled or not
		if (deleteButton.isEnabled()) {
			deleteButton.click();//
		} else {
			// locate select all check box
			WebElement selectAllCheckBox = driver.findElement(By.id("contacts-list-view-checkbox"));
			// click on select all check box
			selectAllCheckBox.click();
			// confirm that the select all check is selected or not
			if (selectAllCheckBox.isSelected()) {
				deleteButton.click();
				System.out.println("contact Delete successfully....");
			} else {// if the select all check box is not selected then select it
				selectAllCheckBox.click();
				// click on delete button
				deleteButton.click();
*/
			}
		

	}

