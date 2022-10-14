package com.AgileCrmAutomation1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.AgileCrmAutomation2.BaseCase;
import com.agilecrm.pages.LoginPage;

public class CompanyModuleTestCase extends BaseCase {
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("this is before method");
		lunchBrowser("Chrome");
		driver.navigate().to("https://mtesting.agilecrm.com/#");
		LoginPage LoginPage = new LoginPage();
		LoginPage.login("coding@yopmail.com", "Qqqq1234");
	  
  }
  
  @AfterMethod
  public void aftermethod() {
	  System.out.println("this is after method");
	  
  }
	  
   @Test
  public void verifyAddCompany(){
	  click(By.id("companiesmenu"),"Click on Company");
		
		click(By.xpath("//button[contains(text(),'Add Company')]"),"click on add company button");
		waitElementToBeClickable(By.id("company_name"));
		driver.findElement(By.id("company_name")).sendKeys("RMC11 cloud");
		driver.findElement(By.xpath("//a[@id='continue-company']")).click();
		//Thread.sleep(3000);
		fluentWait(By.name("email-select"));
		Select select=new Select(driver.findElement(By.name("email-select")));
		List<WebElement> emailDropDownList=select.getOptions();
		for (WebElement element :emailDropDownList) {
		String text=element.getAttribute("value");
		System.out.println(text);
	  
	  
  }
}
}
