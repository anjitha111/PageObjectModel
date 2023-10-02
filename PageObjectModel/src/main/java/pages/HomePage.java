package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	WebDriver driver;
	By obsqura_Logo = By.xpath("//img[@alt='logo'])[1]");// WebElement initialization using By locator.

	public void printTitle() {
		System.out.println("Title is " + driver.getTitle());
	}

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public boolean isLogoDipslayed() 
	{
		WebElement logoelement=driver.findElement(obsqura_Logo);
		return logoelement.isDisplayed(); 
	}
}
