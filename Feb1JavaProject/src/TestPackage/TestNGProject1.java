package TestPackage;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestNGProject1 {
     public static WebDriver Driver ; 
     
    @Test
     public void verifyHomepageTitle() {
       
      System.out.println("launching chrome browser");
      Driver = new ChromeDriver();
      Driver.manage().window().maximize();
      
      Driver.get("http://www.demo.guru99.com/V4/");
      Driver.findElement(By.name("uid")).sendKeys("mngr201499");
		System.out.println("Entered the Username");
		
		Driver.findElement(By.name("password")).sendKeys("umudagy");
		System.out.println("Entered the Password");
		Driver.findElement(By.name("btnReset")).click();
		System.out.println("Reset button clicked");
		
		Driver.findElement(By.name("uid")).sendKeys("mngr201499");
		System.out.println("Entered the Username");
		
		Driver.findElement(By.name("password")).sendKeys("umudagy");
		System.out.println("Entered the Password");
		Driver.findElement(By.name("btnLogin")).click();
		System.out.println("Login button was clicked");
		System.out.println("Login Successfully");
		
		String expectedTitle = "Guru99 Bank Manager HomePage";
		String actualTitle = "";
		actualTitle = Driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
     	 Driver.close();
     }
  }