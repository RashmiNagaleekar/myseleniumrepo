package testcases;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;


public class Validations {
	
	@Rule
	public ErrorCollector errCol = new ErrorCollector();
	
	
	@Test
	public void validate() {
		
		String expectedValue="A";//xls,prop
		String actualValue="Al";//
		System.out.println("Start");
		try {
			
			Assert.assertEquals(expectedValue, actualValue);
		
		}catch(Throwable e) {
			System.out.println("Some error: "+e.getMessage());
			//fail
			errCol.addError(e);
		}
		
		System.out.println("End");

		try{
			Assert.assertTrue("Error Message", 4<12);
			System.out.println("Pass 4<12 the case");
		}catch(Throwable e) {
			System.out.println("Some error: "+e.getMessage());
			errCol.addError(e);
		}
		try{
			Assert.assertFalse("Error Message", 4<2);
			System.out.println("Pass 4<2 the case");
		}catch(Throwable e) {
			System.out.println("Some error: "+e.getMessage());
			errCol.addError(e);
		}
		try {
			Assert.fail("Had to be logged in but not logged in");
			System.out.println("Pass Fail case");
		}catch(Throwable e) {
			System.out.println("Some error: "+e.getMessage());
			errCol.addError(e);
		}
		
	}

}
