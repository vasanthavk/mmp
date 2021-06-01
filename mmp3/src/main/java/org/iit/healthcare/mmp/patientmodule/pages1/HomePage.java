package org.iit.healthcare.mmp.patientmodule.pages1;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {

	WebDriver driver;
	public HomePage(WebDriver driver) {
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
		//*i put in notepad that is array values of date time appointm and doc name row so [0],[1],[2],[3]//

	}


}




