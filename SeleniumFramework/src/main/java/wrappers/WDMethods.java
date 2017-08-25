package wrappers;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;

public class WDMethods extends WDEvent implements WDInterface {
	
	
	RemoteWebDriver driver= null;
	public static EventFiringWebDriver eventdriver=null;
	public WebElement locateElement(String locator, String using){		
			
		WebElement element=null;
		switch(locator){
		
		case("id"):
			element= eventdriver.findElement(By.id(using));
			break;
			
		case("XPath"):
				element=eventdriver.findElement(By.xpath(using));
				break;
				
		case("className"):
			element = eventdriver.findElement(By.className(using));
			break;
			
		case("name"):
				element=eventdriver.findElement(By.name(using));
				break;
				
		case("cssSelector"):
			element =eventdriver.findElement(By.cssSelector(using));
			break;
			
		case("linkText"):
				element=eventdriver.findElement(By.linkText(using));
				break;
				
		case("partialLinkText"):
			element=eventdriver.findElement(By.partialLinkText(using));
			break;
			
		case("tagName"):
			element =eventdriver.findElement(By.tagName(using));
			break;
		
		case("href"):
			element =eventdriver.findElement(By.xpath("//*[href='"+using+"']"));
			break;
			
		}
		
	return element;
	};
	
	public void type(WebElement element,String text)
	{
		System.out.println(element);
		element.sendKeys(text);
	}
	
	public void click(WebElement element)
	{
		element.click();
	}
	
	public String getText(WebElement element)
	{
		return element.getText();
	}
	
	public String getAttribute(WebElement element, String attributename)
	{
		return element.getAttribute(attributename);
	}
	
	public boolean verifyText(WebElement element, String text)
	{
		if (text.equals(element.getText()))
			return true;		 
		return false;
	}
	
	
	public void switchToWindow(int n)
	{
		Set<String> allWindowHandles = eventdriver.getWindowHandles();
		List<String> allWindows = new ArrayList<>();
		allWindows.addAll(allWindowHandles);
		eventdriver.switchTo().window(allWindows.get(n));
	}
	
	public void acceptAlert()
	{
		Alert alertWindow =eventdriver.switchTo().alert();
		alertWindow.accept();
	}
	
	public String alertText()
	{
		Alert alertWindow =eventdriver.switchTo().alert();
		return alertWindow.getText();
	}
	
	public void switchToFrame(String frame)
	{
		eventdriver.switchTo().frame(frame);
	}
	
	public boolean verifyTitle(String title)
	{
		if (title.equals(eventdriver.getTitle()))
			return true;
		return false;
	}
	
	public void selectByVisibleText(WebElement element,String text)
	{
		Select dropdown = new Select(element);
		dropdown.selectByVisibleText(text);
	}
	
	public void selectByValue(WebElement element,String text)
	{
		Select dropdown = new Select(element);
		dropdown.selectByValue(text);
	}	
	
	public void selectByIndex(WebElement element,int index)
	{
		Select dropdown = new Select(element);
		dropdown.selectByIndex(index);
	}
	
	public void invokeApp(String browser,String URL){
		
		
		if (browser.equalsIgnoreCase("CHROME")){
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		eventdriver= new EventFiringWebDriver(driver);
		WDEvent handler=new WDEvent();
		eventdriver.register(handler);
		
		eventdriver.manage().window().maximize();
		eventdriver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		eventdriver.get(URL);
	}
	
	public void quitApp()
	{
		eventdriver.close();
	}
}
