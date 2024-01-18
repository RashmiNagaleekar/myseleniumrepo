package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CampionContactUs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Webdriver\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("http://campionsoftware.com/contact.html");
		
		Driver.findElement(By.name("name")).sendKeys("Test");
		Driver.findElement(By.name("email")).sendKeys("rashmi.nagaleekar23@gmail.com");
		Driver.findElement(By.name("phone")).sendKeys("9620473820");
		Driver.findElement(By.name("companyname")).sendKeys("Campion Software");
						
		Select ComSelect = new Select(Driver.findElement(By.name("company_type")));
		ComSelect.selectByVisibleText("Startup");
		

		Driver.findElement(By.xpath("//input[@value='Software Development']")).click();
		Driver.findElement(By.xpath("//input[@value='Android/IOS development']")).click();
		
		Driver.findElement(By.name("Message")).sendKeys("Test Test Test");
		
		Select Budget=new Select(Driver.findElement(By.name("budget")));
		Budget.selectByVisibleText("$20,000 - $50,000");
		
		Driver.findElement(By.xpath("//input[@value='Send Request']")).click();		

		
        Thread.sleep(2000);
		Driver.quit();

	}

}
