package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InputFormPage {

	WebDriver driver;
	By input_form_menu = By.xpath("//a[contains(text(),'Input Form')]");
	By enter_message=By.xpath("//input[@id='single-input-field']");
	By show_message= By.xpath("//button[@id='button-one']");

	public InputFormPage(WebDriver driver) {
		this.driver = driver;
	}
	public void clickOnInputForm()
	{
		WebElement element=driver.findElement(input_form_menu);
		element.click();
	}
	public void inputMessageInMessageField(String message)
	{
		WebElement element=driver.findElement(enter_message);
		element.sendKeys(message);
	}
	public void clickOnMessageButton()
	{
		WebElement element=driver.findElement(show_message);
		element.click();
	}
}
