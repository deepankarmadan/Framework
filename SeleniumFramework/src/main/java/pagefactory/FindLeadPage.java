package pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import pagefactory.ViewLeadPage;
import wrappers.TestNGImplementation;

public class FindLeadPage extends TestNGImplementation{

	public FindLeadPage()
	{
		PageFactory.initElements(eventdriver, this);
	}
	
	@FindBy(how=How.XPATH,using="(//label[contains(text(),'First name:')])[3]/following::input")
	WebElement firstname;
	public FindLeadPage typeFirstName(String name){
		type(firstname,name);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Find Leads')]")
	WebElement findleads;
	public FindLeadPage clickFindLeads(){
		click(findleads);
		return this;
	}
	
/*	public ViewLeadPage clickFirstResultingLead(){
		clickByXpath();
		return new ViewLeadPage(driver,test);
	}
	
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]/a")
	WebElement firstResultingLead
	public  */
}
