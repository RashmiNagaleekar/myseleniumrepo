package suitec;

import org.testng.annotations.Test;

import dataProvider.TestDataProvider;
import testBase.TestBase;

public class TestC extends TestBase{

	//@Parameters("browser")
	@Test(groups = {"smoke","browsergroup1"},dataProviderClass = TestDataProvider.class, dataProvider = "datasuiteC")
	public void testC(String username, String password) throws InterruptedException {
		log("Executing the test in browser "+browser);
		log("Starting C "+browser);
		Thread.sleep(2000);
		log("Ending C");
	}
}
