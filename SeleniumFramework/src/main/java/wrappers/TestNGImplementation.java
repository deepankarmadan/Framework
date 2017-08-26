package wrappers;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import dataprovider.ReadExcel;

public class TestNGImplementation extends WDMethods{
	
	public String datasheetname;
	
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
	
	@DataProvider(name="fetchData")
	public Object[][] dataProviderCreateLead() throws InvalidFormatException, IOException
	{
		return ReadExcel.readExcel(datasheetname);
	}

}
