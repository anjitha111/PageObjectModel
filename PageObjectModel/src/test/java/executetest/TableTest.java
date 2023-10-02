package executetest;

import org.testng.annotations.Test;

import basepackage.BaseClass;
import pages.TablePage;

public class TableTest extends BaseClass {
	TablePage tablepage;

	@Test

	public void verifyLogoDisplayed() {

		tablepage = new TablePage(driver);
		System.out.println(driver.getCurrentUrl());

	}

}
