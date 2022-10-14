package com.AgileCrmAutomation1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.AgileCrmAutomation2.BaseCase;
import com.agilecrm.pages.LoginPage;

public class CompanyTest extends BaseCase {
@Test
	public void main()throws InterruptedException {
		CompanyTest company=new CompanyTest();
		company.lunchBrowser("Chrome");
		driver.navigate().to("https://mtesting.agilecrm.com/#");
		LoginPage LoginPage = new LoginPage();
		LoginPage.login("coding@yopmail.com", "Qqqq1234");
		click(By.id("companiesmenu"),"Click on Company");
		
		click(By.xpath("//button[contains(text(),'Add Company')]"),"click on add company button");
		waitElementToBeClickable(By.id("company_name"));
		driver.findElement(By.id("company_name")).sendKeys("RMC cloud");
		driver.findElement(By.xpath("//a[@id='continue-company']")).click();
		//Thread.sleep(3000);
		fluentWait(By.name("email-select"));
		Select select=new Select(driver.findElement(By.name("email-select")));
		List<WebElement> emailDropDownList=select.getOptions();
		for (WebElement element :emailDropDownList) {
		String text=element.getAttribute("value");
		System.out.println(text);
		
		Select select1=new Select(driver.findElement(By.id("country")));
		List<WebElement> countryDropDownList=select1.getOptions();
		for (WebElement element1 :countryDropDownList) {
		String text1=element1.getText();
		System.out.println(text1);	
		}


	}
	}

}
