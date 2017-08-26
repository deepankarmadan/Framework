package pagetestcases;

import pagefactory.LoginPage;
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
	}
	@Test(dataProvider="fetchData")
	public void editleadpf(String UN,String PWD){
		
	new LoginPage().
	typeUserName(UN).
	typePassword(PWD).
	clickSubmit().
	clickcrmsfaimage().
	clickCreateLeadLink().
	clickFindLeads();
	
	}
	


}
