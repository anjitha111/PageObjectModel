package executetest;

import org.testng.annotations.Test;

import basepackage.BaseClass;
import pages.InputFormPage;

public class InputFormTest extends BaseClass {

	InputFormPage inputformpage;

	@Test

	public void verifyShowMessageButtonDisplay() {

		inputformpage = new InputFormPage(driver);
		inputformpage.clickOnInputForm();
		inputformpage.inputMessageInMessageField("Welcome");
		inputformpage.clickOnMessageButton();
	}

}
