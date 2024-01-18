package dependency;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PurchaseOnline {

	@Test
	public void searchProduct() {
		Assert.fail();
	}
	
	@Test(dependsOnMethods= {"searchProduct"})
	public void buyProduct() {
		
	}
	
	@Test(dependsOnMethods= {"buyProduct"})
	public void confirmEmail() {
		
	}
}
