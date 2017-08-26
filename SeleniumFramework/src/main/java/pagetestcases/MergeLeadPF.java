package pagetestcases;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import dataprovider.ReadExcel;
import pagefactory.LoginPage;
import pagefactory.MyHomePage;
import wrappers.TestNGImplementation;

public class MergeLeadPF extends TestNGImplementation{

	@BeforeClass
	public void setValues(){
		datasheetname="mergelead";
	}
	@Test(dataProvider="fetchData")
	public void mergeLeadPF(String UN, String PWD)
	{
		new MyHomePage()
			.clickLeadsMainLink();
	}
	

}
