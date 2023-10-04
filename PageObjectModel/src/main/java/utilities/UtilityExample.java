package utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

public class UtilityExample {

	public String getTextOfElement(WebElement element)
	{
		return element.getText();

	}
	public List<String> getTextOfElements(List <WebElement> element)
	{
		List<String> data=new ArrayList<String>();
		//System.out.println("Utility elements are ");
		for(WebElement item:element)
		{
			data.add(item.getText());//Converting list of web elements to string of web elements.
		}
		
		
		return data;
	}
}

