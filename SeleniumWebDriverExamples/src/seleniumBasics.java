import org.testng.annotations.Test;

import browsers.ChromeDriver;

public class seleniumBasics {

	
	@Test
	public void testApp()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver cd = new ChromeDriver();
		
	}
}
