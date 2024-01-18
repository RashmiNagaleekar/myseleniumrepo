package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class clickImage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Webdriver\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.facebook.com/login/identify/?ctx=recover&ars=royal_blue_bar");
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//i[@class='fb_logo img sp_FiyLgvsJymR sx_f2b656']")).click();
		Thread.sleep(2000);
		System.out.println("Title is: "+Driver.getTitle());
		if (Driver.getTitle().equals("Facebook � log in or sign up"))
		{							
            System.out.println("We are back at Facebook's homepage");					
        } else {			
            System.out.println("We are NOT in Facebook's homepage");					
        }		
				//Driver.close();		

    }		
}