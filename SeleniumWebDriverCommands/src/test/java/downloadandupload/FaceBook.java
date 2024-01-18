package downloadandupload;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class FaceBook {

	
	@Test
	public void testApp() throws InterruptedException, IOException {
		
		
		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "logs\\chrome.log");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");//all the logs wont be showns
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--disable-notifications");
		ops.addArguments("--start-maximized");
		ops.addArguments("ignore-certificate-errors");
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("its.nagaleekar@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("BeautyNDBeast123$$");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mount_0_0_Ws\"]/div/div[1]/div/div[3]/div/div/div/div[1]/div[1]/div/div[1]/div/div/div[1]/div/div/div[1]/ul/li/div/a/div[1]/div[2]/div/div/div/div/span/span")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mount_0_0_M2\"]/div/div[1]/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[1]/div[2]/div/div/div[1]/div[1]/div/div/div/div[2]/div/div[2]/i")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mount_0_0_M2\"]/div/div[1]/div/div[4]/div/div/div[1]/div/div[2]/div/div/div/div[3]/div[1]/div/div[1]/div/div/div[1]/div[2]/span/span")).click();
		
		//run AutoIT script 
		
		new ProcessBuilder(System.getProperty("user.dir")+"//AutoIT//FaceBook.exe").start();
		
		
		
	}
	
	
}
