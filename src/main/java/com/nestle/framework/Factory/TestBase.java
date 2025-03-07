package com.nestle.framework.Factory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.nestle.framework.Util.CommonFunctions;
import com.nestle.framework.Util.PropertiesReader;

public class TestBase extends CommonFunctions{
	public static WebDriver driver;
	
	@BeforeMethod
	public static void initialization() {
		//test comment
		String browser = PropertiesReader.getPropertyvaluebyKey("browser");
		String M2FE_URL = PropertiesReader.getPropertyvaluebyKey("magento_frontend_url");
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		else {
			System.out.println("please pass correct  browser value");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().deleteAllCookies();
		driver.get(M2FE_URL);
	}
	
	@AfterMethod
	public static void tearDown() {
		driver.close();
	}
	
}
