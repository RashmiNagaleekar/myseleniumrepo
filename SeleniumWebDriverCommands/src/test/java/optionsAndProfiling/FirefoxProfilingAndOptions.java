package optionsAndProfiling;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.testng.annotations.Test;

public class FirefoxProfilingAndOptions {

	
	@Test
	public void firefox() {
		
		System.setProperty("webdriver.gecko.driver", "F:\\Drivers\\geckodriver.exe");
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, ".logs\\firefox.log");
		FirefoxOptions options = new FirefoxOptions();
		//page load strategy
		//options.setPageLoadStrategy(strategy);
		//set Binary file
		//options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		ProfilesIni allProf = new ProfilesIni();
		FirefoxProfile prof = allProf.getProfile("June2023");
		
		//manage notification
		prof.setPreference("dom.webnotifications.enabled", false);
		//manage ssl notification
		prof.setAcceptUntrustedCertificates(true);
		prof.setAssumeUntrustedCertificateIssuer(false);
		//proxy
		prof.setPreference("network.proxy.type", 1);
		prof.setPreference("network.proxy.socks", "83.778.87.11");
		prof.setPreference("network.proxy.socks_port", 1827);
		options.setProfile(prof);
		
		FirefoxDriver fd = new FirefoxDriver(options);
		//fd.get("https://pushengage.com/demo");
		fd.get("https://expired.badssl.com");// by default - ssl is managed
	}
}
