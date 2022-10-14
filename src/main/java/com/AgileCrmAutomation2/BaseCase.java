package com.AgileCrmAutomation2;

import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseCase {
	public static ExtentTest Logger;
	public static WebDriver driver = null;

	public static void lunchBrowser(String browser) {
		switch (browser) {
		case "chrome":
//			System.setProperty("webdriver.chrome.driver", "F:\\selenium driver\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "edge":
//			System.setProperty("webdriver.chrome.driver", "F:\\selenium driver\\chromedriver.exe");
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		case "mozilla":
//			System.setProperty("webdriver.chrome.driver", "F:\\selenium driver\\chromedriver.exe");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		default:
//			System.setProperty("webdriver.chrome.driver", "F:\\selenium driver\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
	}

	// click on the element which is provided in the parameter
	public static void click(By by, String msg) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(by));
		driver.findElement(by).click();
		System.out.println(msg);
	}

	public static void waitForVisibilityOfElement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public static void waitElementToBeClickable(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public static void waitElementToBePresent(By element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));	
	}
	

	
		public static void waitElementToBeClickable(By element) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(element));	
		
	}

	public static void fluentWait(final By by) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2)).ignoring(Exception.class);
		wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				System.out.println("Waiting for element to be available...");
				return driver.findElement(by);
			}
			
		});

	}
	
	public static void selectDropDownValByIndex(WebElement element,int index) {
		Select select=new Select(element);
		select.selectByIndex(index);
	}
	
	public static void selectDropDownValByText(WebElement element,String text) {
		Select select=new Select(element);
		select.selectByVisibleText(text);
	}
	
	public static void selectDropDownValByValue(WebElement element,String val) {
		Select select=new Select(element);
		select.selectByValue(val);
	}
	
	private static ChromeOptions setChromeCapabilities() {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("start-maximized");
		Map<String,Object> prefs=new HashMap<String,Object>();
		prefs.put("download.default_directory", "/directory/path");
		option.setExperimentalOption("prefs", prefs);
		option.setExperimentalOption("excludeSwitchs",Arrays.asList("disable-popup-blocking"));
		return option;
	}
		
	}
	



