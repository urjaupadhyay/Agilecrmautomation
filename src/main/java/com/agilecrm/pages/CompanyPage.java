package com.agilecrm.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AgileCrmAutomation2.BaseCase;

public class CompanyPage extends BaseCase {
	
	By addCompanyButton=By.xpath("//button[contains(text(),'Add Company')]");
	By companyName=By.id("company_name");
	By saveCompany=By.id("company_validate");
	
	@FindBy(xpath="//button[text()='Delete']")
	public WebElement deleteButton;
	
	
	@FindBy(xpath="//span[@id='companies-list-view-checkbox']//input")
	public WebElement selectAllCheckbox;
	
	@FindBy(xpath="//span[@id='companies-list-view-checkbox']//input")
	public List<WebElement> AllCheckbox;
	
	
	public CompanyPage() {
		
		//initializing the factory element of current page
		PageFactory.initElements(driver,this);
	}
	
	public void deleteCompany() {
		
		selectAllCheckbox.click();
		deleteButton.click();
	}
	
	public void addCompany(){
		//click(By.id("\"companiesmenu\""), "Click on companies Menu");
		WebElement addCompanyButton=driver.findElement(this.addCompanyButton);
		Actions action=new Actions(driver);
		action.click(addCompanyButton).build().perform();
	}

}
