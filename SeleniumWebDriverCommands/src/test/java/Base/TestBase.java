package Base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverService;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	public WebDriver driver; 
	Properties prop;
	@SuppressWarnings("deprecation")
	public WebDriver launchBrowser(String browserName) {
		
		
		if(browserName.equals("Chrome")) {
			System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "logs\\chrome.log");
			System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");//all
			
			driver = new ChromeDriver();
			ChromeOptions ops = new ChromeOptions();
			ops.addArguments("--disable-notifications");
			ops.addArguments("--start-maximized");
			ops.addArguments("ignore-certificate-errors");
			
		}
		
		else if(browserName.equals("Mozilla"))
			driver = new FirefoxDriver();
		else if(browserName.equals("Edge")) {
			
			System.setProperty(EdgeDriverService.EDGE_DRIVER_LOG_PROPERTY, "logs\\edge.log");
			System.setProperty(EdgeDriverService.EDGE_DRIVER_ALLOWED_IPS_PROPERTY, "true");//all
			
			driver = new EdgeDriver();
			EdgeOptions ops = new EdgeOptions();
			ops.addArguments("--disable-notifications");
			ops.addArguments("--start-maximized");
			ops.addArguments("ignore-certificate-errors");
			
			try {
				prop = new Properties();
				FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//project.properties");
				prop.load(fs);
		} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		
		return driver;
	}
	
	
}
