package suitea;

import org.testng.annotations.Test;

public class TestA {

	@Test
	public void testA() throws InterruptedException {
		System.out.println("Starting testA");
		Thread.sleep(2000);
		System.out.println("Ending testA");
	}
}
