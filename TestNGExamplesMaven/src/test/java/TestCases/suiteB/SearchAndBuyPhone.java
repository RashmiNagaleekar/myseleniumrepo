package TestCases.suiteB;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class SearchAndBuyPhone {

	
	boolean flag = true;
	 
	
	@Test(priority =1)
	public void search(ITestContext context) {
		if(flag)
			throw new SkipException("Skipped test");
		
		System.out.println("Searching Phone");
		//phone name
		context.setAttribute("phonename", "iPhone");
	}
	
	@Test(priority =2, dependsOnMethods = {"search"})
	public void selectPhone(ITestContext context) {
		String name = (String) context.getAttribute("phonename");
		System.out.println("Selecting Phone :"+name);
		Assert.fail();
	}
	
	@Test(priority =3, dependsOnMethods = {"search","selectPhone"})
	public void checkout(ITestContext context) {
		System.out.println("Checkout");
	}

}
