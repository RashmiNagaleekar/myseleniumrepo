package testBase;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import reports.ExtentManager;

public class TestBase {

	
	public ExtentReports rep;
	public ExtentTest test;
	public SoftAssert softAssert;
	public String browser;
	
	@BeforeMethod(alwaysRun=true)
	public void init(ITestContext con,ITestResult res) {
		
		System.out.println("---------Before Method");
		System.out.println(res.getMethod().getMethodName().toUpperCase());
		rep = ExtentManager.getReports();
		test = rep.createTest(res.getMethod().getMethodName().toUpperCase());
		res.setAttribute("reporter", test);
		softAssert = new SoftAssert();
		//init the variable browser
		//browser = con.getCurrentXmlTest().getParameter("browser");
		//System.out.println("Browser is: "+browser);
		
		//find the browser group of test case
		String arr[] = con.getIncludedGroups();
		System.out.println("Arr[] length is : "+arr.length);
		//System.out.println(arr[arr.length-1]);
		con.getCurrentXmlTest().getParameter("browser");
		
		//find the group name from test method parameters
		System.out.println("Total methods are: "+con.getAllTestMethods().length);
		String groupNames[] = con.getAllTestMethods()[0].getGroups();
		String browserGroup="";
		for(String g : groupNames) {
			System.out.println("In side the For loop : Group name is: "+g);
			if(g.startsWith("browsergroup")) {
				browserGroup = g;
				break;			
			}
		}
		System.out.println("Browser group is "+browserGroup);
		browser = con.getCurrentXmlTest().getParameter(browserGroup);
		System.out.println("Browser is "+browser) ;
	
	}
	
	@AfterMethod(alwaysRun=true)
	public void quit() {
		System.out.println("@AfterMethod");
		rep.flush();
	}
	
	public void log(String msg)
	{
		System.out.println(msg);
		test.log(Status.INFO, msg);
	}
	
	public void logFailure(String msg) {
		System.out.println("From logFailure() syso statement:"+msg);
		test.log(Status.FAIL, msg);
	}
	
	public void failAndStopTest(String msg) {//fail in testng and extent reports but it will stop the test case
		softAssert(msg);
		softAssert.assertAll();
	}
	
	public void softAssert(String msg) {//fail in testng and extent reports but it will continue
		logFailure(msg);//extent
		softAssert.fail(msg);//testng
		//take screenshot and put it in report
		
	}
}
