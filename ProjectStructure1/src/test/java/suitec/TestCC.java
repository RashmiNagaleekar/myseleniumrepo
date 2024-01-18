package suitec;

import org.testng.annotations.Test;

import dataProvider.TestDataProvider;
import testBase.TestBase;

public class TestCC extends TestBase{

	//@Parameters("browser")
	@Test(groups = {"sanity","browsergroup2"},dataProviderClass = TestDataProvider.class, dataProvider = "datasuiteC")
	public void testCC(String username, String password) throws InterruptedException {
		log("Starting CC");
		Thread.sleep(2000);
		log("Ending CC");
	}
}
