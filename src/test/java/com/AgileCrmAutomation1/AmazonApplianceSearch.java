package com.AgileCrmAutomation1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.AgileCrmAutomation2.BaseCase;

public class AmazonApplianceSearch extends BaseCase {
	@Test
	public void main() throws AWTException {
		
		lunchBrowser("Chrome");
		driver.navigate().to("https://www.amazon.in/");
		//windowhandling
		/* WebElement custmerService =driver.findElement(By.xpath("//div[@id='nav-xshop']/a[4]"));
		Actions action=new Actions(driver);
		action.contextClick(custmerService).build().perform();
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		//get parent window id 
		String parentWindowId =driver.getWindowHandle();
		System.out.println("parent window id:" + parentWindowId);
	//ge allwindow id
		Set<String> allWindowIds = driver.getWindowHandles();
		//iterate of all window
		for (String windowId : allWindowIds)
		{// if window id is not present then go inside if condition
			if(!windowId.equals(parentWindowId)) {
			System.out.println("Child Window Id " +windowId);
			//Switch to another window
			driver.switchTo().window(windowId);
			//print the tital of the page 
			System.out.println(driver.getTitle());
			}
		}*/
		
		//washing machine
		selectDropDownValByText(driver.findElement(By.id("searchDropdownBox")),"Appliances");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Washing Machine");
		click(By.id("nav-search-submit-button"), "Click on search button");
		List<WebElement> applianceNames= driver.findElements(By.xpath("//div[@class='sg-row']/descendant::h2/a/span"));
		List<WebElement> appliancePrice= driver.findElements(By.xpath("//div[@class='sg-row']/descendant::a[@target='_blank']/span[@class='a-price']"));
		for(int i=0;i<applianceNames.size();i++) {
			String name= applianceNames.get(i).getText();
			String price=appliancePrice.get(i).getText();
			System.out.println(name + " : " + price);
			
			
		}
		
		
	
	
	}

}
