package exercise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.TestBase;

public class QTPSelenium_JobServe extends TestBase{

		
		@SuppressWarnings({ "static-access", "deprecation" })
		@Test
		public void JobServeExercise() throws InterruptedException{
			String text = "Food & Hospitality";
			launchBrowser("Chrome");
			driver.manage().window().maximize();
			driver.get("https://jobserve.com/in/en/Job-Search/");
			System.out.println("Title: "+driver.getTitle());
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"ddcl-selInd\"]/span/span")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"ddcl-selInd-ddw\"]/div/div[1]/div/div")).click();
			Thread.sleep(1000);
			
			//input[id^=ddcl-selSalary-i]
			//input[starts-with(@id,'ddcl-selSalary-i')]
			//label.ui-dropdownchecklist-text
			List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[id^=ddcl-selSalary-i]"));
			List<WebElement> labels = driver.findElements(By.cssSelector("label[for^=ddcl-selInd-i]"));
			System.out.println("Total Checkboxes: "+checkboxes.size());
			System.out.println("Total labels: "+labels.size());
			
			for(int i=0;i<labels.size();i++) {
				System.out.println("inside for: "+i);
				if(text==labels.toString()) {
					System.out.println("Found");
					driver.findElement(By.cssSelector("label[for^=ddcl-selInd-i]")).click();
					break;
				}
					
				
			}
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.quit();//close all windows and end selenium session
			
			
		}
}
