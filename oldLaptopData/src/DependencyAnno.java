package Annotations1;

import org.testng.annotations.Test;

public class DependencyAnno {
	
	@Test
	public void OpenBrowser(){
		System.out.println("OpenBroswer passed");
	}
	
	@Test(dependsOnMethods=("OpenBrowser"),alwaysRun=true)
	public void flytBooking(){
		System.out.println("FlytBooking passed");
	}

	@Test(timeOut=5000)
	public void TimeRelatedt(){
		System.out.println("TimeRelated passed");
	}
	
	@Test(enabled=false)
	public void Payment(){
		System.out.println("Payment passed");
	}
	

}
