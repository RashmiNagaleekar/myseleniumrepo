package downloadandupload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChromeDownload {

		@Test
		public void download() {
			
			
						
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.qtpselenium.com/downloads/download.html");
			driver.findElement(By.linkText("xls download")).click();
			
			driver.findElement(By.linkText("text file download")).click();
		}
}