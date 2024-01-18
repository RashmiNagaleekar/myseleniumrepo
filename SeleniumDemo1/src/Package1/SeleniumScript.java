package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumScript {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Webdriver\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S1090538407%3A1671113957260334&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AeAAQh5I4hStXYAaU6WX8Qcwf6VRaxSqCUcwLgsCd9N-nO_jTmpvG3cvUnqYZVr1CmpoNB7kqb3V");
		System.out.println(driver.getTitle());
		/*
		 * WebElement email = driver.findElement(By.id("identifierId")); email.click();
		 * email.sendKeys("rashmi.nagaleekar23@gmail.com"); WebElement next =
		 * driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']")); next.click();
		 * Thread.sleep(3000);
		 */
		
		driver.quit();

	}

}
