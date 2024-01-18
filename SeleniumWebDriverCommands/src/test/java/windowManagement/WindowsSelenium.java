package windowManagement;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import Base.TestBase;

public class WindowsSelenium extends TestBase{

	@Test
	public void testWindows() throws InterruptedException {
		launchBrowser("Chrome");
		driver.manage().window().maximize();
		//1st window
		Set<String> s = driver.getWindowHandles();
		System.out.println("Total Windows: "+s.size());
		Iterator<String> it = s.iterator();
		System.out.println(it.next());//main window id
		//driver.switchTo().window(nameOrHandle);
		driver.get("https://www.naukri.com/");
		//popup1
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.google.com/");
		//popup2
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=AXo7B7XvOdea84jcGvHJGA4971-OAtR6BoFSEAqxVmqfL6yzEmS1cqPCAQ-ddqEfAHa5aGEJUlQ-qQ&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S-1542735823%3A1693398491573093");
		//3 windows
		Thread.sleep(2000);
		s = driver.getWindowHandles();
		System.out.println("Total Windows: "+s.size());
		it = s.iterator();
		if(s.size()>1) {
			String mainWindow = it.next();
			String popup1 = it.next();
			String popup2= it.next();
			System.out.println(mainWindow);
			System.out.println(popup1);
			System.out.println(popup2);
			
			driver.switchTo().window(mainWindow);
			driver.close();//close window under focus
			Thread.sleep(5000);
	
			driver.switchTo().window(popup2);
			driver.switchTo().defaultContent();
		}
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.quit();//close all windows and end selenium session
		
	}
	
	
	
}
