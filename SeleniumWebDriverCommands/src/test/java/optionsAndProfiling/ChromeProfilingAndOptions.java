package optionsAndProfiling;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class ChromeProfilingAndOptions {

	@Test
	public void chrome() throws InterruptedException
	{
		
		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "logs\\chrome.log");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");//all the logs wont be showns
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--disable-notifications");
		ops.addArguments("--start-maximized");
		ops.addArguments("ignore-certificate-errors");
		//ops.addArguments("--proxy-server=https://89.2872.292:9090");
		
		
		//profiling
		//ops.addArguments("user-data-dir=C:\\Users\\Lenovo\\AppData\\Local\\Google\\Chrome\\User Data");
		
		ChromeDriver cd = new ChromeDriver(ops);
		cd.get("https://pushengage.com/demo");
		
		Thread.sleep(2000);
		cd.close();
		
	}
	
}
