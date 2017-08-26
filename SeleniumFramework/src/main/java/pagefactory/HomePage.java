package pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends AbstractClass{

	public HomePage(){
		PageFactory.initElements(eventdriver, this);
	}
		
	@FindBy(how=How.XPATH,using="//img[@src='/opentaps_images/integratingweb/crm.png']")
	WebElement crmsfaimage;
	public MyHomePage clickcrmsfaimage(){
		click(crmsfaimage);
		return new MyHomePage();	
	}
}
