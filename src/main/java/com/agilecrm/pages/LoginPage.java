package com.agilecrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.AgileCrmAutomation2.BaseCase;

public class LoginPage extends BaseCase {
	public void login(String username,String password)
	{		
		WebElement uname=driver.findElement(By.name("email"));
		uname.clear();
		uname.sendKeys(username);
		WebElement pwd=driver.findElement(By.name("password"));
		pwd.clear();
		pwd.sendKeys(password);
		WebElement signIn=driver.findElement(By.xpath("//input[@type='submit']"));
		signIn.click();
	}
	public static void validMessage() {
		try
		{
			if(driver.findElement(By.xpath("//*[@id=\"agile\"]/div[1]/div[2]/input")).isDisplayed())
			{String errormessage=driver.findElement(By.xpath("//*[@id=\"agile\"]/div[1]/div[2]/input")).getText();
			System.out.println("login failed");
			
			}
		}
		catch(Exception e)
		{
			System.out.println("login Successful");
		}
	}
	
	public static void logOut()
	{
		driver.findElement(By.xpath("//*[@id=\"fat-menu\"]/a/span/img")).click();
		driver.findElement(By.xpath("//*[@id=\"fatMenuModal\"]/div[2]/div/div/div/div[3]/div/a")).click();	
		}
}
	
	
	
	
	//public void logoutOrErrorMessage() {
		//if(driver.findElement(By.xpath("a[@class='close']/parent::div")).isDisplayed())
	//	{System.out.println("Invalid Credentials");
	//}else
	//{
//	driver.findElement(By.xpath("//img@class=\"pos-rlt pos-xs\"]")).click();
//	driver.findElement(By.xpath("//a[text()='logout']")).click();	
//	}
	

//}}
