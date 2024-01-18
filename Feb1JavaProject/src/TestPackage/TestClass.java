/**
 * 
 */
package TestPackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
						String exePath = "C:\\Users\\csc\\Downloads\\chromedriver_win32\\chromedriver.exe";
						System.setProperty("webdriver.chrome.driver", exePath);
						ChromeDriver driver = new ChromeDriver();
						driver.get("https://www.google.com/");
	}

}
