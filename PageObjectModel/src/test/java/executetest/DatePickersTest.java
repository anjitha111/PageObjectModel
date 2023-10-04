package executetest;

import org.testng.annotations.Test;

import basepackage.BaseClass;
import pages.DatePickersPage;


public class DatePickersTest extends BaseClass {

	DatePickersPage datepickerspage;

	@Test

	public void verifyShowDate() {

		datepickerspage = new DatePickersPage(driver);
		datepickerspage.clickOnDatePickers();
		datepickerspage.selectDate("15-08-2000");
		
		//datepickerspage.showDateButtonfunctionality();

	}

}
