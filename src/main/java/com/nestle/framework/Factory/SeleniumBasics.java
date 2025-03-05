package com.nestle.framework.Factory;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumBasics {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		
		driver.get("https://mcstaging.pureencapsulationspro.com/practitioner-account");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("seleniumjava123@gmail.com");
//		driver.findElement(By.xpath("//input[@name='First_Name']")).sendKeys("Selenium");
//		driver.findElement(By.xpath("//input[@name='Last_Name']")).sendKeys("Java");
//		driver.findElement(By.xpath("//input[@name='Phone']")).sendKeys("9000900090");
//		Select practioner_type = new Select(driver.findElement(By.xpath("//select[@name='Practitioner_Type']")));
//		practioner_type.selectByVisibleText("Dentistry");
//		driver.findElement(By.xpath("//input[@name='License_Number']")).sendKeys("abc12345");
//		Select personal_use = new Select(driver.findElement(By.xpath("//select[@name='Personal_Use']")));
//		personal_use.selectByVisibleText("For personal or family use");
//		driver.findElement(By.xpath("//input[@name='Street_Address_1']")).sendKeys("99 UNIVERSITY AVE");
//		driver.findElement(By.xpath("//input[@name='City']")).sendKeys("NEW CASTLE");
//		Select state = new Select(driver.findElement(By.xpath("//select[@name='State']")));
//		state.selectByVisibleText("Delaware");
//		driver.findElement(By.xpath("//input[@name='Zip']")).sendKeys("78987");
//		Select referral_code = new Select(driver.findElement(By.xpath("//select[@name='Referral_Code']")));
//		referral_code.selectByVisibleText("Catalog Mail");
		
		WebElement tc = driver.findElement(By.xpath("//a[contains(text(), 'Legal Disclaimer')]"));
		Actions action = new Actions(driver);
		action.scrollToElement(tc);
		Thread.sleep(5000);
		
		
		WebElement cookie = driver.findElement(By.xpath("//button[contains(text(),'Consent')]"));
		cookie.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"uniform-prac-acc-agree-tc\"]")).click();
		driver.findElement(By.xpath("//a[@id='iagree']")).click();
		driver.findElement(By.xpath("//input[@value='Apply Now']")).click();
				
		/*
		 * //input[@name='Email']
		 * //input[@name='First_Name']
		 * //input[@name='Last_Name']
		 * //input[@name='Phone']
		 * //select[@name='Practitioner_Type']
		 * //input[@name='License_Number']
		 * //select[@name='Personal_Use']
		 * //input[@name='Street_Address_1']
		 * //input[@name='City']
		 * //select[@name='State']
		 * //input[@name='Zip']
		 * //select[@name='Referral_Code']
		 * //input[@name='prac-acc-agree-tc']
		 * //a[@id='iagree']
		 * 
		 */

	}

}
