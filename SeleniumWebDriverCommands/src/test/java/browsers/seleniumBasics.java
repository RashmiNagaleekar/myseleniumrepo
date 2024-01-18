package browsers;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class seleniumBasics {

	
	@Test
	public void testApp() throws InterruptedException
	{
		
		  //System.setProperty("webdriver.chrome.driver","F:\\Drivers\\chromedriver.exe"); 
			ChromeDriver cd = new ChromeDriver();
			cd.manage().window().maximize(); 
			cd.get("https://www.google.com/");
			Thread.sleep(3000);
			System.out.println("Chrome loaded successfully");
			System.out.println(cd.getTitle());
			cd.close();
		  
			
			//System.setProperty("webdriver.edge.driver", "F:\\Drivers\\msedgedriver.exe");
			EdgeDriver ed = new EdgeDriver();
			ed.manage().window().maximize();
			ed.get("https://www.google.com/");
			Thread.sleep(3000);

			System.out.println("Edge");
			System.out.println(ed.getTitle());
			ed.close();
			Thread.sleep(3000);

			
			
		  //System.setProperty("webdriver.gecko.driver", "F:\\Drivers\\geckodriver.exe");
			FirefoxDriver fd = new FirefoxDriver(); 
			fd.manage().window().maximize();
			fd.get("https://www.google.com/");
			Thread.sleep(3000);


			System.out.println(fd.getTitle());
			fd.close();

		 

	


		
	}
}
