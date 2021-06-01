package org.iit.healthcare.mmp.patientmodule.tests;
import java.util.HashMap;

import org.iit.healthcare.mmp.BaseClass;
import org.iit.healthcare.mmp.patientmodule.pages1.HomePage;
import org.iit.healthcare.mmp.patientmodule.pages1.LoginPage;
import org.iit.healthcare.mmp.patientmodule.pages1.ScheduleAppointmentPage;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class ScheduleAppointmentTests extends BaseClass{
WebDriver driver;
	
	@Test
	public void validateBookAppointment()
	
	{
	LoginPage lPage = new LoginPage(driver);
	lPage.launchBrowser("http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000/portal/login.php");
	lPage.login("ria1","Ria12345");
	HomePage hPage= new HomePage(driver);
	hPage.navigationToAModule("ScheduleAppointment");
	ScheduleAppointmentPage sPage= new ScheduleAppointmentPage(driver);
	
	SoftAssert sAssert=new SoftAssert(); 
	HashMap<String,String>expHMap = sPage.bookAppointment("DR.Beth");
	HashMap<String,String>actHMap = hPage.fetchPatientDetails();
	sAssert.assertEquals(actHMap , expHMap);
	actHMap= sPage.fetchCurrentAppointmentData();
	sAssert.assertEquals(actHMap, expHMap);
		sAssert.assertAll();
}
	
}