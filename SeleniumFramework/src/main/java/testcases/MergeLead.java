package testcases;

import org.testng.annotations.Test;

import wrappers.TestNGImplementation;
import wrappers.WDMethods;

public class MergeLead extends TestNGImplementation {
	@Test
	public void mergeLead(){
	
	type(locateElement("id","username"),"DemoSalesManager");
	type(locateElement("id","password"),"crmsfa");	
	click(locateElement("XPath","(//input[@class='decorativeSubmit'])[1]"));
	click(locateElement("XPath","//img[@src='/opentaps_images/integratingweb/crm.png']"));
	click(locateElement("XPath","//a[@href='/crmsfa/control/leadsMain']"));
	click(locateElement("XPath","//a[@href='/crmsfa/control/mergeLeadsForm']"));
	click(locateElement("XPath","//img[@src='/images/fieldlookup.gif']"));
	switchToWindow(1);	
	type(locateElement("XPath","//input[@name='id']"),"14855");
	click(locateElement("XPath","//button[text()='Find Leads']"));
	click(locateElement("XPath","(//a[@class='linktext'])[1]"));
	switchToWindow(0);	
	click(locateElement("XPath","(//img[@src='/images/fieldlookup.gif'])[2]"));
	switchToWindow(1);	
	type(locateElement("XPath","//input[@name='id']"),"14856");
	click(locateElement("XPath","//button[text()='Find Leads']"));
	click(locateElement("XPath","(//a[@class='linktext'])[1]"));
	switchToWindow(0);
	click(locateElement("XPath","//a[text()='Merge']"));
	acceptAlert();
	quitApp();
/*	Click Find Leads
	Enter From Lead ID
	Click Find Leads
	Verify error msg
	Close the browser (Do not log out)*/
	}
}
