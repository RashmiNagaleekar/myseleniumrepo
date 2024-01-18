package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.gmail.com/");
		Actions abc=new Actions(driver);
		driver.findElement(By.xpath(".//input[@id='Email']")).sendKeys("rashu9900@gmail.com");
		WebElement Element=driver.findElement(By.xpath(".//input[@id='next']"));
		abc.moveToElement(Element).build().perform();
		driver.findElement(By.xpath(".//input[@id='next']")).click();
		
		//giving password as input in next page and clicking sign in
		try {
			Thread.sleep(5000);
			driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("Look@myPussy");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
						
		
		
		WebElement Element1=driver.findElement(By.xpath(".//*[@id='signIn']"));
		abc.moveToElement(Element1).build().perform();
		driver.findElement(By.xpath(".//*[@id='signIn']")).click();	
		
		//composing mail
		driver.findElement(By.xpath("html/body/table[3]/tbody/tr/td[1]/table[1]/tbody/tr[1]/td/b/a")).click();
		driver.findElement(By.xpath(".//*[@id='to']")).sendKeys("abhilash.bbb@gmail.com");
		driver.findElement(By.xpath(".//*[@id='cc']")).sendKeys("abhilash.bbbbb@gmail.com");
		driver.findElement(By.xpath(".//*[@id='bcc']")).sendKeys("rashu9900@gmail.com");
		driver.findElement(By.xpath("html/body/table[3]/tbody/tr/td[2]/table[1]/tbody/tr/td[2]/form/table[2]/tbody/tr[8]/td[2]/textarea")).sendKeys("its test mail from eclipse");
		
		// clicking on send button
		WebElement Element2=driver.findElement(By.xpath(".//input[@name='nvp_bu_send']"));
		abc.moveToElement(Element2).build().perform();
		driver.findElement(By.xpath(".//input[@name='nvp_bu_send']")).click();
				
		// clicking on sign out
		driver.findElement(By.xpath(".//*[@id='gb_71']")).click();
		
		//closing browser
		driver.close();
	}

}
