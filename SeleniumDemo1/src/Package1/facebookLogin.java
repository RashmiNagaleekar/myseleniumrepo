package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebookLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Webdriver\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		/*Code for entering Email address in Login page
		//WebElement email = driver.findElement(By.id("//input[@id='email']"));
		WebElement email = driver.findElement(By.xpath("//input[contains(@name,'email') and @id='email']"));
		email.sendKeys("rashmi.nagaleekar23@gmail.com");
		System.out.println("Entered Email Id");*/
		
		// Code to click on Create Account 
		  WebElement createAccount = driver.findElement(By.xpath("//a[contains(@href,'#') and @class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		createAccount.click();
		System.out.println("Create Account Clicked....!");

		Thread.sleep(3000);
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select selectDay = new Select(day);
		selectDay.selectByVisibleText("23");
		System.out.println("Day23 selected");
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select selectMonth = new Select(month);
		selectMonth.selectByVisibleText("Aug");
		System.out.println("Selected Aug");
		
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select selectYear = new Select(year);
		selectYear.selectByVisibleText("1992");
		System.out.println("Selected 1992");
		
		
		driver.quit();
	}

}
