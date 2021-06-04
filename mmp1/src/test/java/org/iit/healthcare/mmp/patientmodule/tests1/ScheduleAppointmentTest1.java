package org.iit.healthcare.mmp.patientmodule.tests1;
import java.util.HashMap;

import org.iit.healthcare.mmp.patientmodule1.pages.HomePage1;
import org.iit.healthcare.mmp.patientmodule1.pages.LoginPage1;
import org.iit.healthcare.mmp.patientmodule1.pages.ScheduleAppointmentPage1;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ScheduleAppointmentTest1 {
WebDriver driver;
	
	@Test
	public void validateBookAppointment()
	
	{
	LoginPage1 lPage = new LoginPage1(driver);
	lPage.launchBrowser("http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000/portal/login.php");
	lPage.login("ria1","Ria12345");
	HomePage1 hPage= new HomePage1(driver);
	hPage.navigationToAModule("ScheduleAppointment");
	ScheduleAppointmentPage1 sPage= new ScheduleAppointmentPage1(driver);
	
	SoftAssert sAssert=new SoftAssert(); 
	HashMap<String,String>expHMap = sPage.bookAppointment("DR.Beth");
	HashMap<String,String>actHMap = hPage.fetchPatientDetails();
	sAssert.assertEquals(actHMap , expHMap);
	actHMap= sPage.fetchCurrentAppointmentData();
	sAssert.assertEquals(actHMap, expHMap);
		sAssert.assertAll();
}
	
}

