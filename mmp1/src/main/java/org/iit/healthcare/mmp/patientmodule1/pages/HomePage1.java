package org.iit.healthcare.mmp.patientmodule1.pages;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage1 {
	
	WebDriver driver;
	
	public HomePage1(WebDriver driver) {
		this.driver = driver;
	}
	public void navigationToAModule(String moduleName)
	{
		driver.findElement(By.xpath("//span[contains(text(),'"+moduleName+"')]")).click();

	}
	public HashMap<String, String> fetchPatientDetails()
	{
		HashMap<String,String> sMap= new HashMap<String,String>();
		String rowData =driver.findElement(By.xpath("//table[@class='table']/tbody/tr[1]")).getText();
		String data[]=rowData.split(" ");
		sMap.put("Doctor",data[3]);
		sMap.put("Date",data[0]);
		sMap.put("Time",data[1]);
		sMap.put("Appointment",data[2]);
		return sMap;
		
	}


}


