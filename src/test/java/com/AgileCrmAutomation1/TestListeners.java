package com.AgileCrmAutomation1;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.AgileCrmAutomation2.BaseCase;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class TestListeners extends BaseCase implements ITestListener , ISuiteListener {
	
	ExtentReports extentReport;
	ExtentSparkReporter sparkReport;
	
	public void onStart(ISuite suite) {
	LocalDateTime dateTime= LocalDateTime.now();//Return the current date time(long)
	//format date and time 
	String timeStamp=dateTime.format(DateTimeFormatter.ofPattern("dd_MM_yyyy_hh_mm"));
	String folderName="Report_"+ timeStamp;
	System.out.println("folderName");
	
	
	 String reportPath=System.getProperty("user.dir")+"//ExecutionResult//"+folderName	;
		
	File file=new File(reportPath);
	
	if(!file.exists()) {
		file.mkdir();
	}
	setExtentReportDetails(reportPath);	
	}	
		
		
	public void setExtentReportDetails(String reportPath)	{
		System.out.println("this is onStart Method of Suite");
		 reportPath=System.getProperty("user.dir")+"//ExecutionResult//Report//AutomationReport.html";
		sparkReport=new ExtentSparkReporter(reportPath);
		sparkReport.config().setDocumentTitle("AgileCrmAutomationReport");
		sparkReport.config().setReportName("Automation Report");
		// to add information into the html report, we need to create ExtentReports class instance
		extentReport=new ExtentReports();
		extentReport.attachReporter(sparkReport);
		extentReport.setSystemInfo("username", "cyber success");
		extentReport.setSystemInfo("environment", "test");
		extentReport.setSystemInfo("browser", "chrome");
	}

	public void onFinish(ISuite suite) {
		
		System.out.println("this is finish Method of Suite");
		driver.quit();
		extentReport.flush();
	}
	
	public void onStrat(ITestContext context) {
		
		System.out.println("this is onStart Method of Test");	
		
	}
	
	public void onFinish(ITestContext context) {
		
		System.out.println("this is onFinish Method of Test");	
		
	}
	
	public void onTestStart(ITestResult result) {
		String methodName=result.getMethod().getMethodName();
		String methodName1=result.getName();
		Logger=extentReport.createTest(methodName1);
		System.out.println("this is onTestStart Method ");	
		
		}
	
	public void onTestSuccess(ITestResult result) {
		Logger.pass("Successfully executed the test:"+result.getName());
		System.out.println("this is onTestSuccess Method ");	
		
		}
	
	public void onTestFailure(ITestResult result, String reportPath) {
		
		System.out.println("this is onTestFailure Method ");
		
		TakesScreenshot takeSc=(TakesScreenshot)driver;
		File screenShotfile=takeSc.getScreenshotAs(OutputType.FILE);
		
		String fileName=result.getName();
		
		String OutputPath=reportPath+"//Screenshots//"+fileName+".png";
		
		File outputFile=new File(OutputPath) ;
		
		try {
			FileUtils.copyFile(screenShotfile, outputFile);
		}catch(IOException e){
			e.printStackTrace();
		}
		Logger.fail("the test execution is failed due to :" + result.getThrowable());
		Logger.addScreenCaptureFromPath(OutputPath);
	}
	
	public void onTestSkipped(ITestResult result) {
	
		System.out.println("this is onTestSkipped Method ");
	}
	
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("this is onTestFailedWithTimeout Method ");
		onTestFailure(result);
		
			
		}
		}
		
	
	

