package downloadandupload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;

public class FirefoxDownload {
	
	@Test
	public void download() {
		
		FirefoxOptions options = new FirefoxOptions();
		FirefoxProfile prof = new FirefoxProfile();
		prof.setPreference("browser.download.folderList", 2);//will define my download folder
		prof.setPreference("browser.download.dir", "F:\\Temp\\");
		//https://www.freeformatter.com/mime-types-list.html
		prof.setPreference("browser.helperApps.neverAsk.openFile", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet, application/vnd.openxmlformats-officedocument.wordprocessingml.document");
		
		
		options.setProfile(prof);
		WebDriver driver = new FirefoxDriver(options);
		driver.get("https://www.qtpselenium.com/downloads/download.html");
		driver.findElement(By.linkText("xls download")).click();
		
		driver.findElement(By.linkText("text file download")).click();
		
	}

}
