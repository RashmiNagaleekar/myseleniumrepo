package browsers;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class fireFoxBrowser {

	@Test
	public void startBrowser() {
		
	
	System.setProperty("webdriver.gecko.driver", "F:\\Drivers\\geckodriver.exe");
	FirefoxDriver fd = new FirefoxDriver(); 
	fd.manage().window().maximize();
	fd.get("https://www.google.com/");
	System.out.println(fd.getTitle());
	fd.close();
		}

}
