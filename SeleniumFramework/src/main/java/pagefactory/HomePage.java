package pagefactory;

import org.openqa.selenium.support.PageFactory;

public class HomePage extends AbstractClass{

	public HomePage(){
		PageFactory.initElements(eventdriver, this);
	}
}
