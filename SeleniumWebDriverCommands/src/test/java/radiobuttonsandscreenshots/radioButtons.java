package radiobuttonsandscreenshots;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import Base.TestBase;

public class radioButtons extends TestBase{
	
	
	//select radio button
	
	@SuppressWarnings("deprecation")
	@Test
	public void radio() {
		

		launchBrowser("Chrome");
		driver.manage().window().maximize();
		driver.get("https://www.chabadpotomac.com/templates/articlecco_cdo/aid/1094542/jewish/HS-Registration-Form-New-Student.htm");
		List<WebElement> radios = driver.findElements(By.name("reading_proficiency"));
		System.out.println("Total radio buttons "+radios.size());
		System.out.println(radios.get(0).getAttribute("checked"));
		System.out.println(radios.get(1).getAttribute("checked"));
		System.out.println(radios.get(2).getAttribute("checked"));
		radios.get(0).click();
		System.out.println(radios.get(0).getAttribute("checked"));
		System.out.println(radios.get(1).getAttribute("checked"));
		System.out.println(radios.get(2).getAttribute("checked"));
		
		//https://patient.labcorp.com/account/registration/register
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);		
		driver.close();
	}

}
