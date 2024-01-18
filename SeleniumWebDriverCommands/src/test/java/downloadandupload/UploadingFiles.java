package downloadandupload;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Base.TestBase;

public class UploadingFiles extends TestBase{

	@Test
	public void uploading() {
		launchBrowser("Chrome");
		driver.manage().window().maximize();
		driver.get("http://files.form.guide/contact-form/contact-form-attachment-1/contactform.php");
		driver.findElement(By.xpath("//*[@id=\"photo\"]")).sendKeys("F:\\Temp\\Varna Ventures-156.jpg");

		
		
	}
	
	
}
