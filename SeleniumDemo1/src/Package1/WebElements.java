package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Webdriver\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone 14");
		System.out.println("Entered Iphone 14 in Search box");
		driver.findElement(By.xpath("//input[contains(@class,'nav-input nav-progressive-attribute') and @id='nav-search-submit-button']")).click();
		System.out.println("Searching for Iphone 14");
		Thread.sleep(3000);
		driver.getTitle();
		driver.findElement(By.linkText("256 GB & above")).click();
		Thread.sleep(5000);
		System.out.println("Checked 256 GB & above checkbox......");
		driver.navigate().to("https://www.flipkart.com/");
		System.out.println("Navigating to"+driver.getCurrentUrl()+" and "+driver.getTitle());
		//System.out.println(driver.getPageSource());
		Thread.sleep(5000);
		driver.navigate().back();
		System.out.println("Navigated back....and Page title is "+driver.getTitle());
		driver.quit();
	}

}
