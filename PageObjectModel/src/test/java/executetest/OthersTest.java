package executetest;

import org.testng.annotations.Test;

import basepackage.BaseClass;
import pages.OthersPage;

public class OthersTest extends BaseClass {
	OthersPage otherspage;

	@Test

	public void verifyLogoDisplayed() {

		otherspage = new OthersPage(driver);
		System.out.println(driver.getCurrentUrl());

	}

}
