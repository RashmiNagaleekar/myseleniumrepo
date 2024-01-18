package suitea;

import org.testng.annotations.Test;

import dataProvider.TestDataProvider;
import testBase.TestBase;

public class TestAA extends TestBase{

	@Test(groups = {"smoke", "browsergroup2"},dataProviderClass = TestDataProvider.class, dataProvider = "datasuiteA")

	public void testAA(String browserName, String username, String password) throws InterruptedException {
		
		log("Starting AA");
		//Assert.fail("Assert Some Error Message");
		/*
		if(!"Title1".equals("Title"))
			softAssert("Titles do not match");
	
		if(!"Text1".equals("Text")) 
			softAssert("Text do not match");
		
		
		 * if(!"a".equals("b"))
		 * failAndStopTest("a is not valid");
			*/

		log(username+"--"+password);

		Thread.sleep(2000);
		log("Ending AA");
		softAssert.assertAll();
	}
}
