package pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends AbstractClass{
	
	public LoginPage(){
		PageFactory.initElements(eventdriver, this);
	}
	
	@FindBy(how=How.ID,  using = "username")
	WebElement username;
	
	public LoginPage typeUserName(String UN)
	{
		//WebElement username=locateElement(locator, using)
		type(username,UN);
		return this;
	}
	
/*	@FindBys({
		@FindBy(how=How.ID, using ="password"),
		@FindBy(how=How.NAME, using ="PASSWORD")		
	})*/
	@FindBy(how=How.ID, using ="password")
	WebElement password;
	public LoginPage typePassword(String PWD)
	{
		type(password,PWD);
		return this;
	}
	
/*	@FindAll({
	@FindBy(how=How.CLASS_NAME, using ="decorativeSubmit"),
	@FindBy(how=How.NAME, using ="decorativeSubmit")
	})*/
	@FindBy(how=How.XPATH, using ="//input[@class='decorativeSubmit']")
	WebElement submit;
	public HomePage clickSubmit(){
		click(submit);
		return new HomePage();
	}
	
};

