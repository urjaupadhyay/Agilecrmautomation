package com.agilecrm.pages;

import org.openqa.selenium.By;

import com.AgileCrmAutomation2.BaseCase;

public class DocumentsPage extends BaseCase {
	
	public void AddDocuments() {
		//click(By.id("documentsmenu"), "Click on Contact Menu");
		//waitElementToBeClickable(By.id("documentsmenu"));
		click (By.xpath("//i[@class=\"material-icons add v-sub\"]"), "click on add documents" );
		click(By.xpath("//div[@id=\"docselection\"]/div[2]/div/div[2]/div[2]"), "click on upload document" );
		driver.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys("adhar");
		click(By.xpath("//div[@id=\"document-link\"]/div[1]/div"),"choose document");
		//click(By.xpath("//div[@class=\"btn-group \"]"), "successfully add document");
	} 

}
