package pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MyHomePage extends AbstractClass {

	public MyHomePage(){
		PageFactory.initElements(eventdriver, this);
	}
	
	
	@FindBy(how=How.XPATH,using="//a[@href='/crmsfa/control/leadsMain']")
	WebElement leadsmainlink;
	
	public LeadsMainPage clickLeadsMainLink()
	{
		click(leadsmainlink);
		return new LeadsMainPage();
	}
	
	@FindBy(how=How.XPATH,using="//a[text()='Create Lead']")	
	WebElement createleadlink;
	
	public CreateLeadPage clickCreateLeadLink()
	{
		click(createleadlink);
		return new CreateLeadPage();
	}
	
	
}
