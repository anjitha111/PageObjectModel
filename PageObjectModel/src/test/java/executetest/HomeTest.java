package executetest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import basepackage.BaseClass;
import pages.HomePage;


public class HomeTest extends BaseClass {
	
	static int a=10;
	//a=5; //Error occurred since it checked during compliation time.Outside method content.
	HomePage homepage;
	

	@Test

	public void verifyLogoDisplayed() {
		
		homepage=new HomePage(driver);
		int a=5;
		a=10;//Runtime execution.Everything inside methods execute during runtime.Then only overriding happens.
		System.out.println(driver.getCurrentUrl());
		WebElement logo=driver.findElement(By.xpath("//img[@alt='logo'])[1]"));
		homepage.printTitle();
		Assert.assertTrue(homepage.isLogoDipslayed());
		
		//Assertions should always be there in Test class.
		
	}

}
