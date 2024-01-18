package framesandcookies;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.TestBase;

public class Paytm extends TestBase{

	@SuppressWarnings({ "static-access", "deprecation" })
	@Test
	public void paytm() throws InterruptedException{
				
		launchBrowser("Chrome");
		driver.manage().window().maximize();
		driver.get("https://paytm.com/");
		Thread.sleep(5000);
		waitForPageToLoad();
		driver.findElement(By.xpath("//*[@id='app']/header/div/div[2]/div/span")).click();
		//clickAndWait();

		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println("Total number of frames are: "+frames.size());
		
		for(int i = 0 ; i<frames.size();i++) {
			//switch to ith frame
			driver.switchTo().frame(i);
			System.out.println("********We are switch to the iframe*******");
			//check the presence of element, if element is present then switch and break
			int s = driver.findElements(By.xpath("//div[@class='_1pkd1-42eg5l4h6b11QpTd']")).size();
			if(s==0)
				driver.switchTo().defaultContent();
			else
				break;
		}
		//driver.switchTo().frame(0);
		
		String text = driver.findElement(By.xpath("//div[@class='_1pkd1-42eg5l4h6b11QpTd']")).getText();
		System.out.println(text);
		
		driver.switchTo().defaultContent();
		
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
	//try to click 5 times
	public void clickAndWait(String xpathToClicked, String xpathAppear) {
		
		//click on element - xpathToClicked
		//wait for presence and visibility of xpathAppear
		//if not visible - wait for 2 secs
		
		
		//throw failure message - if after 5 clicks the element is not appearing
	}
}
