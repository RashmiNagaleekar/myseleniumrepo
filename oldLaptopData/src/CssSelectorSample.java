package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelectorSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.cssSelector("#username")).sendKeys("abcd");
		driver.findElement(By.cssSelector("input[class='input r4 wide mb16 mt8 password']")).sendKeys("fewrew");
		driver.findElement(By.cssSelector("#Login")).click();

	}

}
