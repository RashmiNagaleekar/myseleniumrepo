package webTables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.TestBase;

public class customWebTableFunction extends TestBase{

	@SuppressWarnings({ "static-access", "deprecation" })
	@Test
	public void testTable() throws InterruptedException{
		
		String company = "Maruti Suzuki";//find last price
		
		launchBrowser("Chrome");
		driver.manage().window().maximize();
		driver.get("https://www.moneycontrol.com/stocks/marketstats/nsemact1/index.php?index=FNO");
		int rowNumber = getRowNumberWithCellData("//div[@class='bsr_table hist_tbl_hm']/table",company,"xpath");
		
		Assert.assertTrue(rowNumber!=-1, "Company name not found in the table -"+company);
		String price = driver.findElement(By.xpath("//div[@class='bsr_table hist_tbl_hm']/table/tbody/tr["+rowNumber+"]/td[3]")).getText();
		System.out.println("Price: "+price);
		
		
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.quit();//close all windows and end selenium session
		
		
		
	}
	//return row number corresponding to data
	//data not found retuns -1
	public int getRowNumberWithCellData(String tableLocator, String data,String identifier) {
		List<WebElement> rows = null;
		if(identifier.equals("xpath"))
				rows = driver.findElements(By.xpath(tableLocator+"/tbody/tr"));
		else
			rows = driver.findElements(By.cssSelector(tableLocator+"> tbody > tr"));
		
		for(int rNum=0;rNum<rows.size();rNum++) {
			WebElement row = rows.get(rNum);
			List<WebElement> cells = row.findElements(By.tagName("td"));
			for(int cNum=0;cNum<cells.size();cNum++) {
			
			System.out.println(cells.get(cNum).getText());
			if(data.equals(cells.get(cNum).getText())) {
				return (rNum+1);
			}
			}
			System.out.println("----------------------");
		}
		return -1;
	}

}
