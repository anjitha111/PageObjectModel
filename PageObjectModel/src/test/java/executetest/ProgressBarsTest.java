package executetest;

import org.testng.annotations.Test;

import basepackage.BaseClass;
import pages.ProgressBarsPage;

public class ProgressBarsTest extends BaseClass {
	ProgressBarsPage progressbarspage;

	@Test

	public void verifyLogoDisplayed() {

		progressbarspage = new ProgressBarsPage(driver);
		System.out.println(driver.getCurrentUrl());

	}

}
