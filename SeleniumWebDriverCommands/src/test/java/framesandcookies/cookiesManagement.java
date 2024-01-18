package framesandcookies;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Base.TestBase;

public class cookiesManagement extends TestBase{

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cnn.com");
		Set<Cookie> cookies = driver.manage().getCookies();

		Iterator<Cookie> it = cookies.iterator();
		while(it.hasNext()) {
			Cookie c = it.next();
			System.out.println(c.getName()+"------"+c.getValue());
			if(c.getName().equals("countrycode")) {
				driver.manage().deleteCookie(c);
				Cookie mycookie = new Cookie("countrycode","UK");
				driver.manage().addCookie(mycookie);
			}
		}
		
		
		System.out.println("=====================================================================");
		cookies=driver.manage().getCookies();
		it=cookies.iterator();
		while(it.hasNext()) {
			Cookie c = it.next();
			System.out.println(c.getName()+"------"+c.getValue());
			if(c.getName().equals("countrycode")) {
				driver.manage().deleteCookie(c);
			}
		}
		
		Thread.sleep(5000);
		driver.quit();//close all windows and end selenium session	
	}
	
	
}
