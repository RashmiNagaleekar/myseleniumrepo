package TestPackage;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.io.File;
import java.io.IOException;

public class flipKart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Webdriver\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver(); 
		Driver.manage().window().maximize();
		/*
		 * Driver.get("https://www.flipkart.com/");
		 * System.out.println("Loaded Flipkart in Chrome browser");
		 * Driver.findElement(By.xpath("//div[@class='_3Njdz7']/button")).click();
		 * 
		 * new WebDriverWait(Driver,
		 * 30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
		 * "//span[contains(.,'Electronics')]")));
		 * 
		 * WebElement
		 * Electronics=Driver.findElement(By.xpath("//span[contains(.,'Electronics')]"))
		 * ; Actions action = new Actions(Driver);
		 * action.moveToElement(Electronics).build().perform(); new
		 * WebDriverWait(Driver,
		 * 30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
		 * "//a[@title='OPPO']")));
		 * Driver.findElement(By.xpath("//a[@title='OPPO']")).click();
		 * 
		 * //new WebDriverWait(Driver,
		 * 50).until(ExpectedConditions.visibilityOfElementLocated(By.
		 * xpath("//a[@title='OPPO A3s (Purple, 16 GB)']")));
		 * //Driver.findElement(By.xpath("//a[@title='OPPO A3s (Purple, 16 GB)']")).
		 * click();
		 * 
		 * new WebDriverWait(Driver,
		 * 50).until(ExpectedConditions.visibilityOfElementLocated(By.
		 * xpath("//a[@title='OPPO F5 Youth (Gold, 32 GB)']")));
		 * Driver.findElement(By.xpath("//a[@title='OPPO F5 Youth (Gold, 32 GB)']")).
		 * click();
		 */
		
		
		//new WebDriverWait(Driver, 5).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(.,'ADD TO CART')]")));
		//Driver.findElement(By.xpath("//button[contains(.,'ADD TO CART')]")).click();				
		//new WebDriverWait(Driver, 50).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul/li/button[@class='_2AkmmA _2Npkh4 _2MWPVK']")));
		//WebElement AddToCart=Driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']"));
		//(JavascriptExecutor)Driver.executeScript("arguments[0].scrollIntoView(true);", AddToCart);
		
		//Thread.sleep(10000);
		//WebElement element = Driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']"));
		//JavascriptExecutor AddToCart = (JavascriptExecutor)Driver;
		//AddToCart.executeScript("arguments[0].click();", element);
		
		
		//WebDriverWait wait = new WebDriverWait(Driver, 100);
		//WebElement element= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")));
		//element.click();
		
		//System.out.println("Loading Flipkart in Chrome browser");
		//Driver.findElement(By.xpath("//div[@class='_3Njdz7']/button")).click();
		Driver.get("https://www.flipkart.com/oppo-f5-youth-gold-32-gb/p/itmfybdzm3gftnd5?pid=MOBFYBDZNYTYDZXQ&lid=LSTMOBFYBDZNYTYDZXQP16LVG&marketplace=FLIPKART&fm=neo%2Fmerchandising&iid=M_8ade8ff7-ac95-43a6-a09d-c39e392bdf8d_2_T4AX2RRLV1_MC.MOBFYBDZNYTYDZXQ&ppt=Homepage&ppn=Homepage&otracker=clp_pmu_v2_Oppo%2BMobiles%2Bunder%2B%25E2%2582%25B915K_1_2.productCard.PMU_V2_OPPO%2BF5%2BYouth%2B%2528Gold%252C%2B32%2BGB%2529_oppo-mobile-phones-store_MOBFYBDZNYTYDZXQ_neo%2Fmerchandising_0&cid=MOBFYBDZNYTYDZXQ");
		Driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")).click();
		System.out.println("Clicked Add to Cart");
		Driver.findElement(By.xpath("//img[@title='Flipkart']")).click();
		Thread.sleep(2000);
		//Driver.findElement(By.xpath("//div[@class='_3Njdz7']/button]")).click(); 
		Driver.findElement(By.xpath("//button[text()='✕']")).click();//clicking on Close button in Login pop-up
		Driver.findElement(By.xpath("//a[@class='_3ko_Ud']")).click();
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//span[text()='Place Order']")).click();
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//input[@class='_2zrpKA _14H79F']")).sendKeys("rashmih.nagaleekar23@gmail.com");
		Driver.findElement(By.xpath("//span[text()='CONTINUE']")).click();
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//input[@class='_2zrpKA _14H79F']")).sendKeys("8618512588");
		Driver.findElement(By.xpath("//span[text()='CONTINUE']")).click();
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _14H79F']")).sendKeys("Rashmi123@");
		Driver.findElement(By.xpath("//span[text()='Login']")).click();
		Thread.sleep(2000);
		//Driver.findElement(By.xpath("//input[@class='_16qL6K _366U7Q']")).sendKeys("Rashmi");
		//Driver.findElement(By.name("name")).sendKeys("RAshmi");
		//Driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("8618512588");
		//Driver.findElement(By.name("phone")).sendKeys("8618512588");
		//Driver.findElement(By.xpath("//input[@name='pincode']")).sendKeys("560032");
		//Driver.findElement(By.xpath("//input[@name='addressLine2']")).sendKeys("RT Nagar");
		//Driver.findElement(By.xpath("//textarea[@name='addressLine1']")).sendKeys("#123, RT Nagar");
		//Driver.findElement(By.xpath("//input[@name='addressLine1']")).sendKeys("#123, RT Nagar");
		//Driver.findElement(By.xpath("//input[@name='city']")).clear();
		//Driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Bengaluru");
		//Select State=new Select(Driver.findElement(By.xpath("//select[@name='state']")));
		//State.selectByVisibleText("Karnataka");
		//Driver.findElement(By.xpath("//span[text()='Home (All day delivery)']")).click();
		//Driver.findElement(By.xpath("//button[text()='Save and Deliver Here']")).click();
		System.out.println("Save and Delivery Here was Clicked");
		//Driver.findElement(By.xpath("//input[@class='_35lzyU']")).sendKeys("rashmih.nagaleekar23@gmail.com");
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//button[text()='CONTINUE']")).click();
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//div[text()='Net Banking']")).click();
		Thread.sleep(2000);
		Select BankType=new Select(Driver.findElement(By.xpath("//select[@class='_1CV081']")));
		Thread.sleep(2000);
		BankType.selectByVisibleText("Corporation Bank");
		
		File src= ((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
		try {
		 // now copy the  screenshot to desired location using copyFile //method
		FileUtils.copyFile(src, new File("E:/error.png"));
		}
		 
		catch (IOException e)
		 {
		  System.out.println(e.getMessage());
		 
		 }

		Driver.quit();
	
	}

}
