package wrappers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import dataprovider.ReadExcel;
import pagefactory.LoginPage;

public class TestNGImplementation extends WDMethods{
	
	public String datasheetname;
	public static Properties property;
	
	@BeforeTest
	public void beforeTest()
	{
		beforeTestExtentReports();
	}
	
	@BeforeSuite
	public static void loadConfig() throws FileNotFoundException, IOException
	{
		property = new Properties();
		property.load(new FileInputStream("./config.properties"));

	}
	
	@BeforeMethod
	public void beforeMethod() throws MalformedURLException
	{
		System.out.println("beforeMethod");
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WIN10);
		dc.setVersion("59.0");
		if(property.getProperty("RUN").equalsIgnoreCase("remote")){
			driver=new RemoteWebDriver(new URL(property.getProperty("HUB")),dc);
			}
		else {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		}
		beforeMethodExtentReports();
		invokeApp("chrome",property.getProperty("URL"));
		new LoginPage().
		typeUserName(property.getProperty("UN")).
		typePassword(property.getProperty("PWD")).
		clickSubmit().
		clickcrmsfaimage();
	}

	@AfterMethod
	public void afterMethod()
	{		
		aftermethodExtentReports();
		System.out.println("afterMethod");
		quitApp();
	}
	
	@AfterTest
	public void afterTest(){
		afterTestExtentReports();
	}
	
	@DataProvider(name="fetchData")
	public Object[][] dataProviderCreateLead() throws InvalidFormatException, IOException
	{
		return ReadExcel.readExcel(datasheetname);
	}

}
