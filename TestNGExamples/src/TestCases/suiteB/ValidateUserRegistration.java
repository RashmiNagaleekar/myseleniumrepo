package TestCases.suiteB;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ValidateUserRegistration {

	@Test
	public void validate() {
		
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals("ABC", "ABC");
		softassert.assertEquals("ABC","XYZ");//fail
		softassert.assertTrue(5>11, "Error message");//fail
		softassert.fail("404: Error came up");//fail
		
		
		softassert.assertAll();
	}
	
	
}
