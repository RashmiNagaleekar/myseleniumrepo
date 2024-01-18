package suitea;



import org.testng.annotations.Test;

import testbase.base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;


public class test1 extends base{
		@Test
		public void geekforgeeks() throws IOException, InterruptedException {
			FileReader reader=new FileReader("./src/test/resources/TestData.properties");
			Properties props=new Properties();
			props.load(reader);
			
			WebDriver driver = launchBrowser("Chrome");
			driver.manage().window().maximize();

			driver.get(props.getProperty("searchTerm"));
			Thread.sleep(2000);
			driver.close();
		}
	
}
