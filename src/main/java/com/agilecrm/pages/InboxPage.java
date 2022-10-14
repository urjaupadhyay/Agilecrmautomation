package com.agilecrm.pages;

import org.openqa.selenium.By;

import com.AgileCrmAutomation2.BaseCase;

public class InboxPage extends BaseCase {

	public void composeMail(){
		//fluentWait(By.xpath("//div[@class=\\\"wrapper b-b bg\\\"]/a"));
		driver.findElement(By.xpath("//div[@id=\"inbox-listners\"]/div[2]/div/div[1]/div[1]/a")).click();
		fluentWait(By.xpath("//input[@id=\"to\"]"));
		driver.findElement(By.xpath("//input[@id=\"to\"]")).sendKeys("atest@yopmail.com");
		click (By.xpath("//a[@id=\"sendEmailInbox\"]"),"send successfully");
		
	}
}
