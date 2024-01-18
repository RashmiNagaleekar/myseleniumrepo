package singlesScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Temp {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver = new EdgeDriver();
		driver.get("https://www.google.com/");

		
		driver = null;
		
		
		Thread.sleep(2000);

		driver.close();
	}

}
