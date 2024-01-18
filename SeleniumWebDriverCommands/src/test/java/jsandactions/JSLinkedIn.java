package jsandactions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import Base.TestBase;

public class JSLinkedIn extends TestBase{

	@SuppressWarnings({ "static-access", "deprecation" })
	@Test
	public void linkedIn() throws InterruptedException{
				
		launchBrowser("Chrome");
		driver.manage().window().maximize();
		//driver.get("https://yahoo.com");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.location='https://linkedin.com/login'");

		js.executeScript("document.getElementById('username').value='hello'");
		js.executeScript("window.scrollTo(0,100)");
		
		
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.quit();//close all windows and end selenium session
		
	}
	
	public void waitForPageToLoad() throws InterruptedException{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		int i = 0;
		//page to load 100% -- wait for max 20 secs
		while(i!=10) {
			String state = (String)js.executeScript("return document.readyState;");
			System.out.println(state);
			if(state.equals("complete"))
				break;
			else
				Thread.sleep(2000);
			i++;
		}
		//check for jquery/ajax status
		/*
		 i=0;
		 while(i!=10){
			 Long d = (Long)js.executeScript("return JOuery.active;");
			 System.out.println(d);//0-not active, 1-active
			 if(d.longValue()==0)
				 break;
			 else
				 Thread.sleep(2000);
			 i++;
		 
		}
		*/
	}
	
}
