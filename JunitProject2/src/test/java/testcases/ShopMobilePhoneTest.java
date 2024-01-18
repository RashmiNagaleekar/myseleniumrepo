package testcases;

import org.junit.Assume;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ShopMobilePhoneTest {
	
	@Test
	public void searchForMobile() {
		System.out.println("Search for Mobile");
	}

	@Test
	public void selectingMobile() {
		System.out.println("Selecting Mobile");
	}
	
	//@Ignore
	@Test
	public void checkout() {
		Assume.assumeTrue(false);
		System.out.println("CheckOut");
	}
	
}
