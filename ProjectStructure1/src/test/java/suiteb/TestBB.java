package suiteb;

import org.testng.annotations.Test;

import dataProvider.TestDataProvider;
import testBase.TestBase;

public class TestBB extends TestBase{

	@Test(groups = {"sanity", "browsergroup2"},dataProviderClass = TestDataProvider.class, dataProvider = "datasuiteB")

	public void testBB(String username, String password) throws InterruptedException {
		log("Starting BB");
		Thread.sleep(2000);
		log("Ending BB");
	}
}
