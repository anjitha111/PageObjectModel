package executetest;

import org.testng.annotations.Test;

import basepackage.BaseClass;
import pages.AlertsAndModalsPage;


public class AlertsAndModalsTest extends BaseClass {

	AlertsAndModalsPage alertsandmodalspage;

	@Test

	public void verifyLogoDisplayed() {

		alertsandmodalspage = new AlertsAndModalsPage(driver);
		System.out.println(driver.getCurrentUrl());

	}

}
