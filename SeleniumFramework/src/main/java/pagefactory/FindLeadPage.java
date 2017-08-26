package pagefactory;

import org.openqa.selenium.support.PageFactory;

import wrappers.TestNGImplementation;

public class FindLeadPage extends TestNGImplementation{

	public FindLeadPage()
	{
		PageFactory.initElements(eventdriver, this);
	}
	
	
}
