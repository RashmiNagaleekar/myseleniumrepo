package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class identifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Webdriver\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();		Driver.manage().window().maximize();
		System.out.println("ID Locators");
		Driver.get("https://www.facebook.com/");
		Driver.findElement(By.id("email")).sendKeys("rashmi");
		System.out.println("Name Locator");
		Driver.findElement(By.name("pass")).sendKeys("rashmi");
		System.out.println("Link Text Locator");
		WebElement forgot=Driver.findElement(By.linkText("Forgotten account?"));
		forgot.click();
		System.out.println("Linked Text Clicked");
		

	}

}
