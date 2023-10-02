package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DatePickersPage {

	WebDriver driver;
	
	By date_picker=By.xpath("//a[contains(text(),'Date Pickers')]");

	public DatePickersPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickOnDatePickers()
	{
		WebElement element=driver.findElement(date_picker);
		element.click();
	}
}
