package TestCases.suiteA;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {

	@BeforeTest
	public void init() {
		System.out.println("-------@BeforeTest--------");
		
	}
	
	@AfterTest
	public void quit() {
		System.out.println("-------@AfterTest--------");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("*********@BeforeMethod*********");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("*********@AfterMethod*********");
	}
	
	@Test
	public void doLogin() {
		
		String expectedOutput = "ABCD";
		String actualOutput = "ABC";
		System.out.println("-------@Test------");
		
		//Assert.assertEquals(actualOutput, expectedOutput);
		//Assert.assertTrue(5>12, "error message");
		//Assert.fail();
		//System.out.println("A");
		//Assert.fail("Assert Failed");
		//System.out.println("B");
	}
	
	@Test
	public void logout() {
		System.out.println("Logging out");
	}
	
}
