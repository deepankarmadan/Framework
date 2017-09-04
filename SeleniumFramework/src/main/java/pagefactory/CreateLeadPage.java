package pagefactory;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;

import pagefactory.FindLeadPage;

public class CreateLeadPage extends AbstractClass{

	public CreateLeadPage(){
		PageFactory.initElements(eventdriver,this);
	}
	
	@FindBy(how=How.XPATH,using="//a[text()='Find Leads'")
	WebElement findleadslink;
	public FindLeadPage clickFindLeads(){
		return new FindLeadPage();
	}
	


}
