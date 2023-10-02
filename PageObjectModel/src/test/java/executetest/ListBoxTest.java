package executetest;

import org.testng.annotations.Test;

import basepackage.BaseClass;
import pages.ListBoxPage;

public class ListBoxTest extends BaseClass {
	ListBoxPage listboxpage;

	@Test

	public void verifyLogoDisplayed() {

		listboxpage = new ListBoxPage(driver);
		System.out.println("Current URL is "+driver.getCurrentUrl());

	}

}
