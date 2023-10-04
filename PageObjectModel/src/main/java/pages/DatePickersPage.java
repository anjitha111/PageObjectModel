package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DatePickersPage {

	WebDriver driver;

	@FindBy(xpath = "//a[contains(text(),'Date Pickers')]")
	WebElement date_picker;

	@FindBy(xpath = "//input[@class='form-control datepicker']")
	WebElement enter_date_field;

	@FindBy(xpath = "//div[@class='datepicker-days']//th[@class='prev']")
	WebElement previous_icon;

	@FindBy(xpath = "//div[@class='datepicker-days']//th[@class='next']")
	WebElement next_icon;

	@FindBy(xpath = "//div[@class='datepicker-days']//th[@class='datepicker-switch']")
	WebElement date_picker_switch;

	/*
	 * By date_pickers_menu=By.xpath("//a[contains(text(),'Date Pickers')]"); By
	 * enter_date_field=By.xpath("//input[@class='form-control datepicker']"); By
	 * previous_icon=By.xpath("//div[@class='datepicker-days']//th[@class='prev']");
	 * By next_icon=By.xpath("//div[@class='datepicker-days']//th[@class='next']");
	 * By date_picker_switch=By.xpath(
	 * "//div[@class='datepicker-days']//th[@class='datepicker-switch']"); By
	 * date=By.xpath("//td[@data-date='1699401600000']"); By
	 * show_date_button=By.xpath("//button[@id='button-one']");
	 * 
	 * public DatePickersPage(WebDriver driver) { this.driver=driver; }
	 * 
	 * public void showDateButtonfunctionality() { WebElement
	 * element1=driver.findElement(date_pickers_menu); element1.click(); WebElement
	 * element2=driver.findElement(enter_date_field); element2.click(); WebElement
	 * element3=driver.findElement(next_icon); element3.click(); WebElement
	 * element4=driver.findElement(date); element4.click(); WebElement
	 * element5=driver.findElement(show_date_button); element5.click();
	 * 
	 * }
	 */
	public DatePickersPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickOnDatePickers() {

		date_picker.click();
	}

	public void selectDate(String date) {
		String split[] = date.split("-"); // Day,month and year separated by hyphen.
		String day = split[0]; // Day's position. Starts with index 0.
		String month_number = split[1]; // Month's position
		String year = split[2];// Year's position

		int month_position = Integer.parseInt(month_number); // Conversion to integer.
		int year_position = Integer.parseInt(year);

		String month = "";

		switch (month_position) {
		case 1:
			month = "January";
			break;
		case 2:
			month = "February";
			break;
		case 3:
			month = "March";
			break;
		case 4:
			month = "April";
			break;
		case 5:
			month = "May";
			break;
		case 6:
			month = "June";
			break;
		case 7:
			month = "July";
			break;
		case 8:
			month = "August";
			break;
		case 9:
			month = "September";
			break;
		case 10:
			month = "October";
			break;
		case 11:
			month = "November";
			break;
		case 12:
			month = "December";
		}

		// System.out.println("Month is "+month);
		String month_year = month + " " + year;
		System.out.println("Month and year are " + month_year);
		enter_date_field.click();

		while (true) {
			// next_icon.click();
			String actual_month_year = date_picker_switch.getText();
			// System.out.println("Displayed month and year : "+actual_month_year);
			if (actual_month_year.equals(month_year)) // Comparison with given string and calendar displayed one.
			{
				break;
			} else if ((month_position < 10) && (year_position <= 2023))
				previous_icon.click();
			else
				next_icon.click();
		}
		WebElement element = driver.findElement(By.xpath("//td[text()='" + day + "' and @class='day']"));// Concatanation
		//This xpath is of the dates in calendar.Eg : //td[text()='26' and @class='day'] for current month's 10th day.
		element.click();
	}
}
