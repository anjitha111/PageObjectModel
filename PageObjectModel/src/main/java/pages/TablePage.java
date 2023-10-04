package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.UtilityExample;

public class TablePage {

	WebDriver driver;
	@FindBy(xpath = "//a[contains(text(),'Table')]") //Page factory method to declare web element.
	WebElement tablelink;
	
	@FindBy(xpath="//table/tbody/tr[1]/td[1]")
	WebElement firstpersonname;
	
	@FindBy(xpath="//table[@id='dtBasicExample']//tbody//tr//td[1]")
	List<WebElement> list;//Will get all the names in this list.
	
	UtilityExample utility;

	public TablePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		//Page Factory:class,initElements:static method.Initializing web element.Otherwise it will show null pointer exception.
		//When using 'this',current class object is passed.
		//We are using constructors here,otherwise need to provide it in a separate method.
	}
	
	public void clickOnTableLink()
	{
		tablelink.click();
	}
	public String getNameOfFirstPerson()
	{
		utility=new UtilityExample();
		//System.out.println(utility.getTextOfElement(firstpersonname)); // We can't give assert in page class.
		String name=utility.getTextOfElement(firstpersonname);
		return name;
	}
	public void printAllNames()
	{
		System.out.println("Print All Names Method : ");
		for(int i=0;i<list.size();i++)
		{
			String name=list.get(i).getText();
			System.out.println(name);
		}
		
		/*for(WebElement element:list)
		{
			System.out.println(element.getText());
		}*/ //->Enhanced for loop.
		
	}
	public String getOfficeOfPerson(String person_name)
	{
		int index=0;
		List<String> names_data=new ArrayList<String>();
		names_data=utility.getTextOfElements(list);
		System.out.println("Get office of person method : List names");
		System.out.println(names_data);
		for(index=0;index<list.size();index++)
		{
			if(person_name.equals(names_data.get(index)))
			{
				index++;
				break;
			}
		}
		System.out.println("Position is " +index);
		WebElement office=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tr["+index+"]//td[3]"));
		return office.getText();
	}
}
