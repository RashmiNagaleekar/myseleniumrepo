package suitea;

import org.testng.annotations.Test;

public class TestAA {

	@Test
	public void testAA() throws InterruptedException {
		System.out.println("Starting testAA");
		Thread.sleep(2000);
		System.out.println("Ending testAA");
	}
}
