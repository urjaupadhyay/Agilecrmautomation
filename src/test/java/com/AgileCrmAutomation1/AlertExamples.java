package com.AgileCrmAutomation1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.AgileCrmAutomation2.BaseCase;

public class AlertExamples extends BaseCase {
	@Test

	public  void main() {
		
		lunchBrowser("Chrome");
		driver.get("https://www.amazon.in");
		//information alert
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,700)");
		js.executeScript("window.scrollBy(0,-700)");
		/*js.executeScript("alert('this is sample alert');");
		Alert alert=driver.switchTo().alert();
		alert.accept();
		System.out.println("information alert displayed");
		
		//conformtion alert
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("confirm('this is sample alert!');");
		Alert confirm=driver.switchTo().alert();
		confirm.accept();
		System.out.println("conformation alert displayed");
		//prompt alert 
		
		js.executeScript("prompt('this is sample alert!');");
		Alert prompt=driver.switchTo().alert();
		prompt.sendKeys("this is a sample Text..." );
		prompt.accept();
		System.out.println("prompt alert displayed");*/
		
		
		

	}

}
