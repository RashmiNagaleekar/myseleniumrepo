package listener;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class MyCustomListener implements ITestListener{
	
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed");
		System.out.println(result.getName());
		System.out.println(result.isSuccess());
		System.out.println(result.getTestContext());
		System.out.println(result.getStatus());
		System.out.println(result.getThrowable().getMessage());
		ExtentTest test = (ExtentTest) result.getAttribute("reporter");
		test.log(Status.FAIL, result.getThrowable().getMessage());
	}
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Passed: "+result.getName());
		System.out.println(result.getAttribute("reporter"));
		ExtentTest test = (ExtentTest) result.getAttribute("reporter");
		test.log(Status.PASS, "Test Passed - " +result.getName());
	}
	
	public void onTestSkipped(ITestResult result) {
		ExtentTest test = (ExtentTest) result.getAttribute("reporter");
		test.log(Status.SKIP, "Test Passed - " +result.getName());
	}

}
