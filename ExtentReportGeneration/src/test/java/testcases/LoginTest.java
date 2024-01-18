package testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import reports.ExtentManager;

public class LoginTest {
	
	ExtentTest test;
	ExtentReports reports;
	
	@BeforeMethod
	public void init() {
		System.out.println("--------Before Method------");
		
		System.out.println(System.getProperty("user.dir"));
		
		reports = ExtentManager.getReports();
		
		test = reports.createTest("LoginTest");
		
		
	}
	
	@AfterMethod
	public void quit() {
		System.out.println("Quit");
		reports.flush(); // generates and finalizes the reports
	}
	
	@Test
	public void login() throws IOException {
		
		test.log(Status.INFO, "Starting Test Case Login");
		test.addScreenCaptureFromPath("D:\\Temp.png","404 Error");
		test.log(Status.FAIL, "404 Error");
		Assert.fail("Some error");
		test.log(Status.INFO, "Opening Browser");
		test.log(Status.INFO, "Logging in");
		test.log(Status.INFO, "Test Passed");
		
			
		
		
	}

}
