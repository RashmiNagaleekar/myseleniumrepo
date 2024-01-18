

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class aTagCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.ebay.com/");
		System.out.println("Link in Entire page are:");
		System.out.println(driver.findElements(By.tagName("a")).size());
		//count of links in footer section
		WebElement footer=driver.findElement(By.xpath(".//*[@id='glbfooter']"));
		System.out.println("Link in footer are:");
		System.out.println(footer.findElements(By.tagName("a")).size());
		//counting links on only 1 column
		System.out.println("counting links of only 1 column:");
		WebElement col=driver.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));
		System.out.println(col.findElements(By.tagName("a")).size());
		
		//printing name of links
		for(int i=0;i<col.findElements(By.tagName("a")).size();i++)
		{
			System.out.println(col.findElements(By.tagName("a")).get(i).getText());
		}
		
	}

}
