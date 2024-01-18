package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmailLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Lenovo\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S-1592893643%3A1673017825610320&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AeAAQh5jKp4wEESNLY9teE5eenmS3_sgf4EyrvuYLd0omHGmW5owLAmHlxfgB_v-m0u4AjwHQoWN1g");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("rashmi.nagaleekar23@gmail.com");
		Thread.sleep(5000);
		//driver.findElement(By.className("VfPpkd-RLmnJb")).click();
		System.out.println("Clicked Next......!");
		
		String at=driver.getTitle();
		String et="gmail";
		driver.quit();
		if(at.equalsIgnoreCase(et))
		{
			System.out.println("Test Success");
		}
		else
			System.out.println("Test Unsuccess");
	}

}
