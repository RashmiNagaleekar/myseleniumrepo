package suitea;

import org.testng.annotations.Test;
import dataProvider.TestDataProvider;

import testBase.TestBase;
public class TestA extends TestBase{

	@Test(groups = {"smoke","sanity","browsergroup1"},dataProviderClass = TestDataProvider.class, dataProvider = "datasuiteA")
	public void testA(String browserName, String username, String password) throws InterruptedException {
		log("Starting A from logs");
		log(username+"--"+password);
		Thread.sleep(2000);
		log("Ending A from logs");

	}
	
}
