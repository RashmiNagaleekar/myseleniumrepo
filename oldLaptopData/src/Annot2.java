

import org.testng.annotations.*;

public class Annot2 {
	
	@BeforeSuite
	public void iAMFirst(){
		System.out.println("I am 1st passed");
	}

	
	@AfterSuite
	public void iAmLast(){
		System.out.println("I am Last passed");
	}

}
