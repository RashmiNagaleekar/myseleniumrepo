package suitea;

import org.testng.annotations.Test;
import dataProvider.TestDataProvider;
import testbase.TestBase;

public class TestAA extends TestBase{

	@Test(groups = {"smoke","browsergroup2"}, dataProviderClass = TestDataProvider.class , dataProvider = "dataSuiteA")
	public void testAA(String username, String password) throws InterruptedException {
		log("Starting AA");
		log(username+" -- "+password);
		Thread.sleep(2000);
		log("Ending AA");
	}
}
