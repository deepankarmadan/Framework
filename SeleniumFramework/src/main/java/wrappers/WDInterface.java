package wrappers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public interface WDInterface {
		
		RemoteWebDriver driver= null;
		
		EventFiringWebDriver eventdriver=null;
		
		public WebElement locateElement(String locator, String using);
		
		public void type(WebElement element,String text);
		
		public void click(WebElement element);
		
		public String getText(WebElement element);
		
		public String getAttribute(WebElement element, String attributename);
		
		public boolean verifyText(WebElement element, String text);
		
		public void switchToWindow(int n);
		
		public void acceptAlert();
		
		public String alertText();
		
		public void switchToFrame(String frame);
		
		public boolean verifyTitle(String title);
		
		public void selectByVisibleText(WebElement element,String text);
		
		public void selectByValue(WebElement element,String text);	
		
		public void selectByIndex(WebElement element,int index);
		
		public void invokeApp(String browser,String URL);
		
		public void quitApp();


}
