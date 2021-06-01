package org.iit.healthcare.mmp.patientmodule.pages1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class LoginPage {
		
		WebDriver driver;
		public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

		
		/**
		 * loginpage.java
		 * @param uname
		 * @param pword
		 
		 */
public void launchBrowser(String url)
		
		{
			driver.get(url);
		}
		public void login(String uname,String pword)
		{
			//System.setProperty("webdriver.chrome.driver","chromedriver.exe")
			
			//driver.get("http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000/portal/login.php");
			WebDriverManager.chromedriver().setup();
			 driver.findElement(By.id("username")).sendKeys("");
			driver.findElement(By.id("password" )).sendKeys("");
			driver.findElement(By.name("submit" )).click();
			
			
			
			
			
			
		}
		 
		
		
	}
		

