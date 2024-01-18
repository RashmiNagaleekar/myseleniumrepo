package optionsAndProfiling;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverService;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class EdgeProfilingAndOptions {
	
	@Test
	public void edge() throws InterruptedException {
		
		System.setProperty(EdgeDriverService.EDGE_DRIVER_LOG_PROPERTY, "logs\\edge.log");
		//System.setProperty(EdgeDriverService.EDGE_DRIVER_SILENT_OUTPUT_PROPERTY, "true");//all the logs wont be showns
		EdgeOptions ops = new EdgeOptions();
		ops.addArguments("--disable-notifications");
		ops.addArguments("--start-maximized");
		ops.addArguments("ignore-certificate-errors");
		//ops.addArguments("--proxy-server=https://89.2872.292:9090");
		
		
		//profiling
		//ops.addArguments("user-data-dir=C:\\Users\\Lenovo\\AppData\\Local\\Google\\Chrome\\User Data");
		
		EdgeDriver ed = new EdgeDriver(ops);
		ed.get("https://pushengage.com/demo");
		
		Thread.sleep(2000);
		ed.get("https://untrusted-root.badssl.com");
		Thread.sleep(2000);

		ed.close();
		
		
		
	}

}
