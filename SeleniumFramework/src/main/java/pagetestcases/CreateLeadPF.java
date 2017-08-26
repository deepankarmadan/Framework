package pagetestcases;

import pagefactory.LoginPage;
import pagefactory.MyHomePage;
import wrappers.TestNGImplementation;
import org.testng.annotations.BeforeClass;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import dataprovider.ReadExcel;

public class CreateLeadPF extends TestNGImplementation{
	
	@BeforeClass
	public void setValues(){
		datasheetname="createlead";
	}
	
	@Test(dataProvider="fetchData")
	public void createleadPF(String UN, String PWD){
	
	new MyHomePage()
		.clickCreateLeadLink();
	}
	

	


}
