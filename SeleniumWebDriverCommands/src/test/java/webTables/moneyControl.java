package webTables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import Base.TestBase;

public class moneyControl extends TestBase{

	@SuppressWarnings({ "static-access", "deprecation" })
	@Test
	public void testTable() throws InterruptedException{
		
		String company = "Maruti Suzuki";//find last price
		
		launchBrowser("Chrome");
		driver.manage().window().maximize();
		driver.get("https://www.moneycontrol.com/stocks/marketstats/nsemact1/index.php?index=FNO");
		
		//xpath
		//div[@class='bsr_table hist_tbl_hm']/table - entire table
		//div[@class='bsr_table hist_tbl_hm']/table/tbody/tr[3]/td[3] - 3rd row, 3rd col
		//div[@class='bsr_table hist_tbl_hm']/table/tbody/tr[3] - entire 3rd row
		//div[@class='bsr_table hist_tbl_hm']/table/tbody/tr[3]/td - each cell in 3rd row
		//div[@class='bsr_table hist_tbl_hm']/table/tbody/tr/td[3] - entire 3rd col
		//div[@class='bsr_table hist_tbl_hm']/table/tbody/tr - each row of table


		//cssSelector:
		
		//div.bsr_table.hist_tbl_hm > table - entire table
		//div.bsr_table.hist_tbl_hm > table > tbody > tr:nth-child(3) > td:nth-child(3) - 3rd row, 3rd col
		//div.bsr_table.hist_tbl_hm > table > tbody > tr:nth-child(3) - entire 3rd row
		//div.bsr_table.hist_tbl_hm > table > tbody > tr:nth-child(3) > td - each cell in 3rd row
		//div.bsr_table.hist_tbl_hm > table > tbody > tr > td:nth-child(3) - entire 3rd col
		//div.bsr_table.hist_tbl_hm > table > tbody > tr - each row of table
		
		
		List<WebElement> names = driver.findElements(By.xpath("//div[@class='bsr_table hist_tbl_hm']/table/tbody/tr/td[1]"));
		List<WebElement> lastPrice = driver.findElements(By.xpath("//div[@class='bsr_table hist_tbl_hm']/table/tbody/tr/td[4]"));
		System.out.println("Total Company names are: "+names.size());
		System.out.println("Total Last Prices are: "+lastPrice.size());
		
		for(int i=0;i<names.size();i++) {
			if(company.equals(names.get(i).getText())) {
			System.out.println(names.get(i).getText()+"- -"+lastPrice.get(i).getText());
			break;
			}
		}
		Thread.sleep(2000);
		
		
		
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.quit();//close all windows and end selenium session
		
		
	}
	
	
}
