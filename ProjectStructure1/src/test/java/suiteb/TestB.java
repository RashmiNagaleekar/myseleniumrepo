package suiteb;

import org.testng.annotations.Test;
import dataProvider.TestDataProvider;

import testBase.TestBase;

public class TestB extends TestBase{

	@Test(groups = {"smoke","sanity","browsergroup1"},dataProviderClass = TestDataProvider.class, dataProvider = "datasuiteB")
	public void testB(String username, String password) throws InterruptedException {
		log("Starting B");
		Thread.sleep(2000);
		log("Ending B");
	}
}
