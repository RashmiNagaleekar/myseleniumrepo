package suitea;

import static org.testng.Assert.fail;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import testbase.base;

public class SakraWorldTest extends base{
	
	@SuppressWarnings({ "deprecation", "unlikely-arg-type" })
	@Test
	public void appointmentTest() throws InterruptedException {
		
		
		//loading Chrome browser
		WebDriver driver = launchBrowser("Chrome");
		driver.manage().window().maximize();
		log("Opened Chrome");
		driver.get(prop.getProperty("url"));
		driver.findElement(By.linkText(prop.getProperty("doctor_name"))).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//click Consultation button
		driver.findElement(getObjectLocator("Consultation_css")).click();
		//------Name
		//************************Explicit Wait************************
		
		//Thread.sleep(3000);		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(getObjectLocator("name_xpath")));
		
		if(! isElementPresent("name_xpath"))
			failAndStopTest("Name WebElement is not present/visible");
		log("Name WebElement is present");
		
		
		
		driver.findElement(getObjectLocator("name_xpath")).sendKeys(prop.getProperty("first_name"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement text = driver.findElement(getObjectLocator("name_xpath"));
		System.out.println(text.getAttribute("value"));
		//----Email
		
		Thread.sleep(3000);		
		
		
		if(! isElementPresent("email_xpath")){
			failAndStopTest("Email WebElement is not present/visible");
		}
		log("Email WebElement is present");
		driver.findElement(getObjectLocator("email_xpath")).sendKeys(prop.getProperty("email_id"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		text = driver.findElement(getObjectLocator("email_xpath"));
		System.out.println(text.getAttribute("value"));
		//--Mobile
		Thread.sleep(3000);		
		
		
		if(! isElementPresent("mobile_number_xpath")){
			failAndStopTest("Mobile WebElement is not present/visible");
		}
		log("Mobile WebElement is present");
		
		driver.findElement(getObjectLocator("mobile_number_xpath")).sendKeys(prop.getProperty("phone_number"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		text = driver.findElement(getObjectLocator("mobile_number_xpath"));
		System.out.println(text.getAttribute("value"));
		//--Gender
		//************************Validate the option in Gender field************************

		String expectedGenderValues[] = prop.getProperty("expectedGenderOptions").split(",");
		Thread.sleep(3000);		
		
		
		if(! isElementPresent("gender_xpath")){
			failAndStopTest("Gender WebElement is not present/visible");
		}
		log("Gender WebElement is present");
		
		
		
		WebElement gender = driver.findElement(getObjectLocator("gender_xpath"));
		Select s = new Select(gender);
		s.selectByVisibleText("Female");
		List<WebElement> genders = s.getOptions();
		if(genders.size()!=expectedGenderValues.length)
			fail("Gender list is not equal");
		
		for(int i = 0 ; i<genders.size();i++) {
			System.out.println(expectedGenderValues[i]+"--------"+genders.get(i).getText());
		}
		String selectedComboValue = s.getFirstSelectedOption().getText();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		text = driver.findElement(getObjectLocator("gender_xpath"));
		System.out.println(selectedComboValue);
		
		//--DOB
		int maxAttempts=10;
		int attempts = 0;
		while (attempts < maxAttempts) {
		
			if(! isElementPresent("dob_xpath")){
				failAndStopTest("dob_id WebElement is not present/visible");
			}
			log("dob_id WebElement is present");
			
		driver.findElement(getObjectLocator("dob_xpath")).click();
		String dob = prop.getProperty("dob_val");
		System.out.println("DOB: "+dob);
		//dynamic date selection logic
		Date currentDate = new Date();
		System.out.println("Current Date: "+currentDate);
		
		try {
			WebElement monthDisplayed = driver.findElement(getObjectLocator("month_css"));
			//Select monthDisplayedText = new Select(monthDisplayed);
		  //System.out.println("Default selected month: "+monthDisplayedText);

		  WebElement yearDisplayed = driver.findElement(getObjectLocator("year_css")); 
		  //Select yearDisplayedText = new Select(yearDisplayed);
		  //System.out.println("Default selected year: "+yearDisplayedText);

		  
		  //String monthYearDisplayed = monthDisplayedText+" "+yearDisplayedText;
		  //System.out.println("Month Year Displayed: "+monthYearDisplayed);
		  SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy");
	  	      
			try {
				Date dateToBeSelected = sd.parse(dob);
			
				String day = new SimpleDateFormat("dd").format(dateToBeSelected);
				String month =  new SimpleDateFormat("MM").format(dateToBeSelected);
				
				
				String year =  new SimpleDateFormat("yyyy").format(dateToBeSelected);
				String monthYearToBeSelected = month+" "+year;
				System.out.println("Month Year To Be Selected "+monthYearToBeSelected);
	
				/*
				 * while(!year.equals(yearDisplayedText)) {
				 * 
				 * }
				 */
				//while(!monthYearToBeSelected.equals(monthYearDisplayed)) {
					//select month and year from dropdown
					if(dateToBeSelected.compareTo(currentDate) == 1) {
						//forward icon
						//driver.findElement(By.xpath(prop.getProperty("calendar_forward_xpath"))).click();
					}else if(dateToBeSelected.compareTo(currentDate) == -1) {
						//backward icon
						//driver.findElement(By.xpath(prop.getProperty("calendar_back_xpath"))).click();
						Select select = new Select(yearDisplayed);
					      // select an item with text visible
					      WebElement option = select.getFirstSelectedOption();
					      String defaultItem = option.getText();
					      select.selectByVisibleText("1992");
					      option = select.getFirstSelectedOption();
					      defaultItem = option.getText();
					      System.out.println("Year selected: "+defaultItem);
					      
					      select = new Select(monthDisplayed);
					      defaultItem = option.getText();
					      select.selectByVisibleText("Aug");
					      option = select.getFirstSelectedOption();
					      defaultItem = option.getText();
					      System.out.println("Month selected: "+defaultItem);
					      //select date
					     // String desiredNumberString = prop.getProperty("day");
					     // System.out.println("desiredNumberString: "+desiredNumberString);
					     // int desiredNumber = Integer.parseInt(desiredNumberString);
					      String xpathExpression = String.format("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[1]/a", day);
					      driver.findElement(By.xpath(xpathExpression)).click();
					      System.out.println("Date selected: "+day);
					      break;

					}
					
				
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		} catch (StaleElementReferenceException e) {
		e.printStackTrace();
	}
		   attempts++;
			

	    }
		
		//Registered with Sakra?
		if(! isElementPresent(("yes_radio_xpath"))){
			failAndStopTest("Registered with Sakra? WebElement is not present/visible");
		}
		log("Registered with Sakra? WebElement is present");
		
		
		if(driver.findElement(getObjectLocator("UHID_xpath")).isDisplayed())
				failAndStopTest("UHID is displayed");
		
		driver.findElement(getObjectLocator("yes_radio_xpath")).click();
		System.out.println("yes_radio clicked");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		if(!driver.findElement(getObjectLocator("UHID_xpath")).isDisplayed())
			failAndStopTest("UHID is not displayed");
		
		driver.findElement(getObjectLocator("UHID_xpath")).sendKeys(prop.getProperty("uhild_val"));
		text = driver.findElement(getObjectLocator("UHID_xpath"));
		System.out.println("UHID Value :"+text.getAttribute("value"));
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		driver.findElement(getObjectLocator("no_radio_xpath")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("no_radio2 clicked");
		if(driver.findElement(getObjectLocator("UHID_xpath")).isDisplayed())
			failAndStopTest("UHID is displayed");
		
		//Preferred Date 1
		if(! isElementPresent("prefer_date_visit1_xpath")){
			failAndStopTest("Preferred Date 1 WebElement is not present/visible");
		}
		log("Preferred Date 1 WebElement is present");
		driver.findElement(getObjectLocator("prefer_date_visit1_xpath")).click();
		selectDate(prop.getProperty("preffered_date_1"));
		
		//time 1

		if(! isElementPresent("time1_hr_xpath")){
			failAndStopTest("time1_hr WebElement is not present/visible");
		}
		log("time1_hr WebElement is present");
		
		WebElement time1_hr = driver.findElement(getObjectLocator("time1_hr_xpath"));
		s = new Select(time1_hr);
		s.selectByVisibleText("13");
		selectedComboValue = s.getFirstSelectedOption().getText();
		System.out.println("time1_hr: "+selectedComboValue);
		
		WebElement time1_sec = driver.findElement(getObjectLocator("time1_sec_xpath"));
		s = new Select(time1_sec);
		s.selectByVisibleText("30");
		selectedComboValue = s.getFirstSelectedOption().getText();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("time1_sec: "+selectedComboValue);
		
		
		//Preferred Date 2
		if(! isElementPresent("prefer_date_visit2_xpath")){
			failAndStopTest("Preferred Date 2 WebElement is not present/visible");
		}
		log("Preferred Date 2 WebElement is present");
		driver.findElement(getObjectLocator("prefer_date_visit2_xpath")).click();
		selectDate(prop.getProperty("preffered_date_2"));
		
		//time 2

				if(! isElementPresent("time2_hr_xpath")){
					failAndStopTest("time2_hr WebElement is not present/visible");
				}
				log("time2_hr WebElement is present");
				
				WebElement time2_hr = driver.findElement(getObjectLocator("time2_hr_xpath"));
				s = new Select(time2_hr);
				s.selectByVisibleText("13");
				selectedComboValue = s.getFirstSelectedOption().getText();
				System.out.println("time2_hr: "+selectedComboValue);
				
				WebElement time2_sec = driver.findElement(getObjectLocator("time2_sec_xpath"));
				s = new Select(time2_sec);
				s.selectByVisibleText("30");
				selectedComboValue = s.getFirstSelectedOption().getText();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				System.out.println("time2_sec: "+selectedComboValue);
		
				
				//description
				
				if(! isElementPresent("description_xpath")){
					failAndStopTest("description WebElement is not present/visible");
				}
				log("description WebElement is present");
				
				
				driver.findElement(getObjectLocator("description_xpath")).sendKeys(prop.getProperty("description_val"));
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				text = driver.findElement(getObjectLocator("description_xpath"));
				System.out.println(text.getAttribute("value"));
				
				
				//submit
				if(! isElementPresent("submit_xpath")){
					failAndStopTest("submit WebElement is not present/visible");
				}
				log("submit WebElement is present");
				driver.findElement(getObjectLocator("submit_xpath")).click();
				
				
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.close();
	}
	
	//checking visibility and presence
	//true - present and not hidden
	//false - not present and hidden
	public boolean isElementPresent(String locatorKey) {
		WebElement e = null;
		// presence
		/*
		try {
			e = driver.findElement(By.xpath(locator));
		}catch(Exception ex) {
			log("Exception while extracting object " +ex.getMessage());
			return false;
		}
		*/
		By locator = getObjectLocator(locatorKey);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		//wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
		
		
		// visibility
		//log("Element visibility status: " + e.isDisplayed());
		
		
		//reach here - - present and not hidden
		return true;
		
		
	}
	
	public void selectDate(String dateVal) {
		// dynamic - date selection
		String monthYearDisplayed = driver.findElement(getObjectLocator("monthyear_xpath")).getText();
		System.out.println("monthYearDisplayed -"+monthYearDisplayed);
		SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy");
		try {
			Date dateToBeSelected = sd.parse(dateVal);
			Date currentDate = new Date();
			String day = new SimpleDateFormat("d").format(dateToBeSelected);
			System.out.println(day);
			String month= new SimpleDateFormat("MMMM").format(dateToBeSelected);
			System.out.println(month);
			String year= new SimpleDateFormat("yyyy").format(dateToBeSelected);
			System.out.println(year);
			String monthYearToBeSelected = month+" "+year;
			System.out.println("monthYearToBeSelected -"+monthYearToBeSelected);
			
			while(!monthYearToBeSelected.equals(monthYearDisplayed)) {
				// click on forward or back icon
				if(dateToBeSelected.compareTo(currentDate) == 1) {//
					//forward icon
					driver.findElement(getObjectLocator("calendar_forward_xpath")).click();
				}else if(dateToBeSelected.compareTo(currentDate) == -1){
					// back icon
					driver.findElement(getObjectLocator("calendar_back_xpath")).click();
				}
				 monthYearDisplayed = driver.findElement(getObjectLocator("monthyear_css")).getText();
			     System.out.println("monthYearDisplayed -"+monthYearDisplayed);
			     
			}
			
			 //day
		     driver.findElement(By.xpath("//a[text()='"+day+"']")).click();

		}catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	public By getObjectLocator(String locatorKey) {
		if(locatorKey.endsWith("_xpath"))
			return By.xpath(prop.getProperty(locatorKey));
		else if(locatorKey.endsWith("_css"))
			return By.cssSelector(prop.getProperty(locatorKey));
		else if(locatorKey.endsWith("_id"))
			return By.id(prop.getProperty(locatorKey));
		else
			return By.name(prop.getProperty(locatorKey));
	}

	
}
