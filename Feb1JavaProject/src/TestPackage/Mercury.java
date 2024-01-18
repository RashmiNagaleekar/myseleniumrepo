package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mercury {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver Driver=new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("http://newtours.demoaut.com/");
		
		Driver.findElement(By.name("userName")).sendKeys("mercury");
		Driver.findElement(By.name("password")).sendKeys("mercury");
		Driver.findElement(By.name("login")).click();
		
		Thread.sleep(2000);
		Driver.findElement(By.name("tripType")).click();
		
		Select Passenger = new Select(Driver.findElement(By.name("passCount")));
		Passenger.selectByVisibleText("2");
		
		Select DepartingFrom = new Select(Driver.findElement(By.name("fromPort")));
		DepartingFrom.selectByVisibleText("Frankfurt");
		
		Select MonthFrom = new Select(Driver.findElement(By.name("fromMonth")));
		MonthFrom.selectByVisibleText("April");
		
		Select FromDay = new Select(Driver.findElement(By.name("fromDay")));
		FromDay.selectByVisibleText("26");
		
		Select ToPort = new Select(Driver.findElement(By.name("toPort")));
		ToPort.selectByVisibleText("London");
		
		Select ToMonth = new Select(Driver.findElement(By.name("toMonth")));
		ToMonth.selectByVisibleText("April");

		Select ToDay = new Select(Driver.findElement(By.name("toDay")));
		ToDay.selectByVisibleText("30");
		
		Driver.findElement(By.name("servClass")).click();
		Driver.findElement(By.name("airline")).click();
		Driver.findElement(By.name("findFlights")).click();
		
		Thread.sleep(2000);
		
		Driver.findElement(By.name("outFlight")).click();
		Driver.findElement(By.name("inFlight")).click();
		
		Driver.findElement(By.name("reserveFlights")).click();
		Thread.sleep(2000);
		
		Driver.findElement(By.name("passFirst0")).sendKeys("Rashmi");
		Driver.findElement(By.name("passLast0")).sendKeys("Nagaleekar");
		
		Select pasMeal = new Select(Driver.findElement(By.name("pass.0.meal")));
		pasMeal.selectByVisibleText("Hindu");
		
		Driver.findElement(By.name("passFirst1")).sendKeys("Nikhil");
		Driver.findElement(By.name("passLast1")).sendKeys("Reddy");
		
		Select pas1Meal = new Select(Driver.findElement(By.name("pass.1.meal")));
		pas1Meal.selectByVisibleText("Vegetarian");
		
		Select CreditCard = new Select(Driver.findElement(By.name("creditCard")));
		CreditCard.selectByVisibleText("MasterCard");
		
		Driver.findElement(By.name("creditnumber")).sendKeys("5500 0000 0000 0004");
		
		Select ExpMnth = new Select(Driver.findElement(By.name("cc_exp_dt_mn")));
		ExpMnth.selectByVisibleText("12");
		
		Select ExpYr = new Select(Driver.findElement(By.name("cc_exp_dt_yr")));
		ExpYr.selectByVisibleText("2000");
		
		Driver.findElement(By.name("buyFlights")).click();
		
		Thread.sleep(2000);
		Driver.quit();

	}

}