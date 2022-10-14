package com.agilecrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.AgileCrmAutomation2.BaseCase;

public class DealsPage extends BaseCase {
	public void changeDealsStatus(String scrStatus,String dstStatus) throws Exception {
		
		waitElementToBeClickable(By.xpath("//ul[@milestone='" + scrStatus +"']/li[1]"));
		
		//locate source element
		WebElement scrElement=driver.findElement(By.xpath("//ul[@milestone='" + scrStatus +"']/li[1]"));
		
		//get the name of source deal
		String dealsName=driver.findElement(By.xpath("//ul[@milestone='" + scrStatus +"']/li[1]/descendant::a[1]")).getText();
		
		Actions action =new  Actions(driver);
		//perform drag and drop between source and destination element
		action.dragAndDrop(scrElement, scrElement).build().perform();
		
		System.out.println("chaning the status of " + dealsName +"from " + scrStatus + "to" + dstStatus );
		
		//get the name of dest deal
		//fluentWait(By.xpath("//ul[@milestone='" + dstStatus +"']/li[1]/descendant::a[1]"));
		WebElement dstDealName=driver.findElement(By.xpath("//ul[@milestone='" + dstStatus +"']/li[1]/descendant::a[1]"));
		
		verfyDealsStatus(dstStatus, dstDealName);
	}
	
	public void verfyDealsStatus(String expectedStatus,WebElement element) throws Exception{
		//wait until the dst element is clickable 
		waitElementToBeClickable(element);
		//perform click operation
		element.click();
		//get the updated status of deal
		String actualStatus=driver.findElement(By.xpath("//div[@class='panel=body']/descendant::span[2]")).getText();
		//compare the actual and expected deal status
		if (actualStatus.equals(actualStatus)) {
			System.out.println("Successfully perfomed drag and drop opertion");
		}else {
			throw new Exception("Drag and drop did worked from source element");
			
		}
		
		}

}	
		
		
		
		
		
	


