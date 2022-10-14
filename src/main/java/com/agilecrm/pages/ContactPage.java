package com.agilecrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.AgileCrmAutomation2.BaseCase;

public class ContactPage extends BaseCase {
	String firstName;
	String lastName;
	String emailId;
	String mobNo;
	
	public void AddContact() throws InterruptedException {
		firstName="abc";
		lastName="xyz";
		emailId="test@ac.com";
		mobNo="4645674465";
		click(By.id("contactsmenu"), "Click on Contact Menu");
		waitElementToBeClickable(By.id("contactsmenu"));
		
		click(By.xpath("//*[@id=\"view-list\"]/div/button"), "Click on add Contact button");
		waitElementToBeClickable(By.id("fname"));
		driver.findElement(By.id("fname")).sendKeys("gunjan1");
		fluentWait(By.id("person_validate"));
		
		driver.findElement(By.id("person_validate")).click();
	}
	
	public void searchContact(String fname) {
		
		click(By.xpath("//*[@id='navbar']/ul[1]/li[1]/div/button"), "Click on search button");
		waitElementToBeClickable(By.xpath("//*[@id='navbar']/ul[1]/li[1]/div/button"));
		click(By.xpath("//input[@name=\"all\"]/following-sibling::i"), "Click on all check boxes");
		//click(By.xpath("//input[@name=\"person\"]/following-sibling::i"), "Click on contact check box");
		System.out.println("contact box is selected ");
		WebElement searchData=driver.findElement(By.id("searchText"));
		searchData.sendKeys(fname);
		//click(By.xpath("//div[@id=\"contact-details-block\"]/div/div/div/div/div/div[1]/div/div/div[7]/a[1]/i"), "click on 3 dots" );
		//waitElementToBeClickable(By.name(fname));
		//searchData.sendKeys(Keys.ENTER);
		//System.out.println("contact search successfully ");
		
	}
	
	public void editContact(String city,String state) {
		click(By.xpath("//*[@id='sreach-model-list']/tr[1]"), "Click on searched contact ");
		click(By.xpath("//div[@class='contact-lhs-actions']/a[1]/i"), "Click on edit icon");
		fluentWait(By.id("city"));
		driver.findElement(By.id("city")).sendKeys(city);
		driver.findElement(By.id("state")).sendKeys(state);
		click(By.id("update"), "Click on update button");
		System.out.println("contact update successfully ");
	}
	
	public void deleteContact() {
		//fluentWait(By.xpath("//div[@class='panel-body']/descendant::div[24]/button"));
		//click(By.xpath("//div[@class='panel-body']/descendant::div[24]/button"), "Click on 3 dots ");
		//click(By.xpath("//div[@class='contact-lhs-actions']/decendant::li[10]"), "Click on delete button");
		//click(By.id("success_callback"), "Click on yes");
		click(By.xpath("//tbody[@id=\"contacts-list-view-model-list\"]/tr[1]/td[1]/label/i"),"Click on check box");
		click(By.xpath("//div[@id=\"bulk-action-btns\"]/div[1]/div/button[3]"),"Click on delete button");
		click(By.id("success_callback"), "Click on yes");
		System.out.println("contact delete successfully ");
		
		
		
		
	}

}
