package suitea;

import org.testng.annotations.Test;
import dataProvider.TestDataProvider;
import testbase.TestBase;

public class TestA extends TestBase{

	
	@Test(groups = {"smoke","sanity","browsergroup1"},dataProviderClass = TestDataProvider.class , dataProvider = "dataSuiteA")
	public void testA(String browserName, String username, String password) throws InterruptedException {
		
		
		log("Starting A");
		if(!"Title1".equals("Title")) 
			softAssert("Title do not match");
		
		
		log("Logging into application");
		log("Booking tickets");
		
		if(!"Text1".equals("Text")) 
			softAssert("Text not matches");
		
		if(!"a".equals("b"))
			failAndStopTest("a is not valid");
		
		
		//Assert.fail("Some error message");
		log(username+" -- "+password);
		Thread.sleep(2000);
		log("Ending A");
		softAssert.assertAll();
		
	
	}
}
