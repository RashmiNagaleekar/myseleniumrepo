package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EbayCode {
	static WebDriver Driver;
	public void search() throws InterruptedException {
		Driver.findElement(By.name("_nkw")).sendKeys("Apple Watches");
		Driver.findElement(By.name("_nkw")).sendKeys(Keys.ENTER);
		//Thread.sleep(5000);
		//WebDriverWait wait = new WebDriverWait(Driver.findElement(By.xpath("//input[@id='w_1556953593347_cbx']")),TimeOut);
		//WebDriverWait wait= Driver.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='w_1556953593347_cbx']")));
		WebDriverWait wait = new WebDriverWait(Driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='w_1556953593347_cbx']")));
		element.click();
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		EbayCode var=new EbayCode();
		Driver=new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://in.ebay.com/");	
		
		var.search();

	}

}
