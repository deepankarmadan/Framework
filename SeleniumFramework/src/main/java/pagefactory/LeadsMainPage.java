package pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LeadsMainPage extends AbstractClass {
		
	public LeadsMainPage(){
		PageFactory.initElements(eventdriver, this);
	}


}
