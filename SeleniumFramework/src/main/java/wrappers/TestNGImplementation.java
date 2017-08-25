package wrappers;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestNGImplementation extends WDMethods{
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("beforeMethod");
		invokeApp("chrome","http://leaftaps.com/opentaps/control/main");
	}

	@AfterMethod
	public void afterMethod()
	{		
		System.out.println("afterMethod");
		quitApp();
	}

}
