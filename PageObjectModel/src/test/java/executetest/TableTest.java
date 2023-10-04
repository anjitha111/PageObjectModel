package executetest;

import org.testng.Assert;
import org.testng.annotations.Test;

import basepackage.BaseClass;
import pages.TablePage;

public class TableTest extends BaseClass {
	TablePage tablepage;

	@Test

	public void verifyClickOnTableLink()
	{
		tablepage=new TablePage(driver);
		tablepage.clickOnTableLink(); // Will show error indicating the webelement is null.
		
	}
	@Test
	public void verifyTablePageElements()
	{
		tablepage.getNameOfFirstPerson();
		String expectedname="Tiger Nixon";
	
		tablepage.printAllNames();
		String office_name=tablepage.getOfficeOfPerson("Colleen Hurst");
		System.out.println("Office is "+office_name);
		Assert.assertEquals(tablepage.getNameOfFirstPerson(),expectedname,"Names are not matching.");
		
	}

}
