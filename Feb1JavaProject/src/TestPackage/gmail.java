package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Webdriver\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://accounts.google.com");
		Driver.manage().window().maximize();
        String expectedTitle = " Sign in - Google Accounts ";
        String actualTitle = Driver.getTitle();
		if (expectedTitle.equals(actualTitle))
		{
			System.out.println("Verification Successful - The correct title is displayed on the web page.");
			}
		else
		{
			System.out.println("Verification Failed - An incorrect title is displayed on the web page.");
			}
		WebElement username = Driver.findElement(By.id("identifierId"));
		username.clear();
		username.sendKeys("TestSelenium");
		Driver.findElement(By.xpath("//span[text()='Next']")).click();
		Driver.switchTo().frame(0);
		Driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password123");
		Driver.findElement(By.xpath("//span[text()='Next']")).click();
		//WebElement SignInButton = Driver.findElement(By.id("signIn"));
		//SignInButton.click();
		Driver.close();
		System.out.println("Test script executed successfully.");
		System.exit(0);
		}
	}
