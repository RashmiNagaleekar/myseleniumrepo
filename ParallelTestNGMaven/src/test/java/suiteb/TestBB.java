package suiteb;

import org.testng.annotations.Test;

public class TestBB {

	@Test
	public void testBB() throws InterruptedException {
		System.out.println("Starting testBB");
		Thread.sleep(2000);
		System.out.println("Ending testBB");
	}
}
