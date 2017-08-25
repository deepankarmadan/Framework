package pagetestcases;

import org.testng.annotations.Test;

import pagefactory.LoginPage;
import wrappers.TestNGImplementation;

public class MergeLeadPF extends TestNGImplementation{

	@Test(@DataProvider="")
	public void mergeLeadPF()
	{
		new LoginPage().
		typeUserName(UN).
		typePassword(PWD).
		clickSubmit();
	}
	
	Object[][] loginDataSet{
		
	}
}
