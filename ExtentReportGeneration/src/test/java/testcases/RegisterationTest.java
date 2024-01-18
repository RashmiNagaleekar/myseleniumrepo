package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import reports.ExtentManager;

public class RegisterationTest {
	
	ExtentTest test;
	ExtentReports reports;
	
	@BeforeMethod
	public void init() {
		System.out.println("--------Before Method------");
		
		System.out.println(System.getProperty("user.dir"));
		
		reports = ExtentManager.getReports();
		
		test = reports.createTest("RegisterTest");
		
	}
	
	@AfterMethod
	public void quit() {
		System.out.println("Quit");
		reports.flush(); // generates and finalizes the reports
	}
	
	
	
	@Test
	public void doRegister() {
		
		System.out.println("Register Class");
		test.log(Status.INFO, "Register Test Started");
		test.log(Status.PASS, "Register Test Ended");
	}

}
