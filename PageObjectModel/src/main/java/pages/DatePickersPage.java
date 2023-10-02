package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DatePickersPage {

	WebDriver driver;
	
	By date_pickers_menu=By.xpath("//a[contains(text(),'Date Pickers')]");
	By enter_date_field=By.xpath("//input[@class='form-control datepicker']");
	By previous_icon=By.xpath("//div[@class='datepicker-days']//th[@class='prev']");
	By next_icon=By.xpath("//div[@class='datepicker-days']//th[@class='next']");
	By date_picker_switch=By.xpath("//div[@class='datepicker-days']//th[@class='datepicker-switch']");
	By date=By.xpath("//td[@data-date='1699401600000']");
	By show_date_button=By.xpath("//button[@id='button-one']");

	public DatePickersPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickOnDatePickers()
	{
		WebElement element1=driver.findElement(date_pickers_menu);
		element1.click();
		WebElement element2=driver.findElement(enter_date_field);
		element2.click();
		WebElement element3=driver.findElement(next_icon);
		element3.click();
		WebElement element4=driver.findElement(date);
		element4.click();
		WebElement element5=driver.findElement(show_date_button);
		element5.click();
		
		
	}
}
