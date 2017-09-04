package pagetestcases;

import pagefactory.LoginPage;
import pagefactory.MyHomePage;
import wrappers.TestNGImplementation;
import dataprovider.ReadExcel;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

public class EditLeadPF extends TestNGImplementation{
	
	@BeforeClass
	public void setValues(){
		datasheetname="editlead";
		testcasename="EditLead";
		testcasedescription="EditLead";
		authorname="Deepankar";
		category="Smoke";
		
	}
	@Test(dataProvider="fetchData")
	public void editleadpf(String FN){
		
		new MyHomePage()
		.clickCreateLeadLink()
		.clickFindLeads();/*.
		typeFirstName(FN).
		clickFindLeads();*/
	}
	


}
