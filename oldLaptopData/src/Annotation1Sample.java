

import org.testng.annotations.*;


public class Annotation1Sample {
	
	
	@BeforeTest
	public void UserIDGeneration(){
		System.out.println("UserIDGeneration Passed");
	}
	
	@BeforeMethod
	public void BeforeMethod1(){
		System.out.println("BeforeMethod Passed");
	}
	

	@AfterMethod
	public void AfetrMethod1(){
		System.out.println("AfterMethod Passed");
	}
	
	
	@Test
	public void OpenBroswer(){
		System.out.println("OpenBroswer passed");
	}
	
	@Test
	public void FlytTicket(){
		System.out.println("Flyt booking passed");
	}
	
	
	
	@AfterTest
	public void ClosingBrowser(){
		System.out.println("ClosingBrowser Passed");
	}

	
}
