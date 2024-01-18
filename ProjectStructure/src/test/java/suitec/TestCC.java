package suitec;

import org.testng.annotations.Test;
import dataProvider.TestDataProvider;

import testbase.TestBase;

public class TestCC extends TestBase{

	@Test(groups = {"sanity","browsergroup2"},dataProviderClass = TestDataProvider.class , dataProvider = "dataSuiteC")
	public void testCC(String username, String password) throws InterruptedException {
		log("Starting CC");
		log(username+" -- "+password);

		Thread.sleep(2000);
		log("Ending CC");
	}
}
