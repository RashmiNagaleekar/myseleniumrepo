package testbase;
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
	
	@BeforeMethod(alwaysRun = true )
	public void init(ITestContext con, ITestResult result) {
		System.out.println("--------- @BeforeMethod");
		rep = ExtentManager.getReports();
		System.out.println(result.getMethod().getMethodName().toUpperCase());
		test = rep.createTest(result.getMethod().getMethodName().toUpperCase());
		result.setAttribute("reporter", test);
		softAssert = new SoftAssert();
		//init the variable browser
		//browser = con.getCurrentXmlTest().getParameter("browser");
		//System.out.println("Browser - "+browser);
		
		//find the browser group
		String arr[] = con.getIncludedGroups();
		System.out.println("Arr[] length : "+arr.length);
		System.out.println("Last element is "+arr[arr.length-1]);
		con.getCurrentXmlTest().getParameter("");
		
		//find the group name from test method parameters
		String groupNames[] = con.getAllTestMethods()[0].getGroups();
		String browserGroup = "";
		
		for(String g : groupNames) {
				if(g.startsWith("browserGroup")) {
					browserGroup = g;
					System.out.println("Group name is:"+browserGroup);
					break;
					}
				}
		browser = con.getCurrentXmlTest().getParameter("browserGroup");
		System.out.println("Browser is: "+browser);
	}
	
	@AfterMethod(alwaysRun = true)
	public void quit() { // executed after the listener
		System.out.println("@AfterMethod");
		rep.flush();
	}
	
	public void log(String msg) {
		System.out.println("-----------------------Logs");
		System.out.println(msg);
		test.log(Status.INFO, msg);
	}
	
	public void logFailure(String msg) {//only fails in extent reports
		System.out.println(msg);
		test.log(Status.FAIL, msg);
	}
	
	public void failAndStopTest(String msg) {//fail in testNG as well as extent reports but stops
		softAssert(msg);
		softAssert.assertAll();//stop
	}
	
	public void softAssert(String msg) {//fail in testNG as well as extent reports but it will continue
		logFailure(msg);//extent report
		softAssert.fail();//testNG
		//take screenshot and put it in reports
	}
}
