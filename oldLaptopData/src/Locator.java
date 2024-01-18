package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		//driver.get("https://www.google.co.in/?gws_rd=ssl");
		//driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[3]/center/input[1]")).click();
		
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("qaclickacademy");
		driver.findElement(By.name("pass")).sendKeys("12345");
		driver.findElement(By.linkText("Forgotten your password?")).click();
		//driver.findElement(By.partialLinkText("Forgot your")).click();
		driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();
	}

}
