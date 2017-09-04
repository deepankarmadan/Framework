package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;
import reporting.ExtentReportsReporter;

public abstract  class  WDEvent extends ExtentReportsReporter implements WebDriverEventListener{

	@Override
	public void afterAlertAccept(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterAlertDismiss(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
		/*String webelementname=arg0.toString().split("xpath: ")[1];
		String webdriver=arg1.toString().substring(28,60);
		String desc="afterChangeValueOf for WebElement "+webelementname+ " Successful ";
		reportStep(desc, "INFO");
		System.out.println("afterChangeValueOf for WebElement "+webelementname+ " for the Webdriver " +webdriver);		*/
	}

	@Override
	public void afterClickOn(WebElement arg0, WebDriver arg1) {
		String webelementname=arg0.toString().split("xpath: ")[1];
		String webdriver=arg1.toString().substring(28,60);
		String desc="afterClickOn for WebElement "+webelementname+ " Successful ";
		System.out.println("afterClickOn for WebElement "+webelementname+ " for the Webdriver " +webdriver);
		reportStep(desc, "INFO");
	}

	@Override
	public void afterFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		//String webelementname=arg0.toString().split("xpath: ")[1];
		/*String webdriver=arg1.toString().substring(28,60);
		String desc="afterFindBy for WebElement "+arg0webelementname+ " Successful ";
		reportStep(desc, "INFO");
		System.out.println("afterFindBy for WebElement "+arg0webelementname+ " for the Webdriver " +webdriver);
		*/
	}

	@Override
	public void afterNavigateBack(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterNavigateForward(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterNavigateRefresh(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterNavigateTo(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterScript(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeAlertAccept(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeAlertDismiss(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeClickOn(WebElement arg0, WebDriver arg1) {
		String webelementname=arg0.toString().split("xpath: ")[1];
		String webdriver=arg1.toString().substring(28,60);
		System.out.println("beforeClickOn for WebElement "+webelementname+ " for the Webdriver " +webdriver);
		
	}

	@Override
	public void beforeFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeNavigateBack(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeNavigateForward(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeNavigateRefresh(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeNavigateTo(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeScript(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onException(Throwable throwable, WebDriver driver) {

		
		
		switch(throwable.toString()){
			case ("NoSuchElementException"):
				System.out.println("The element could not be found");;
				break;
			case ("NoSuchWindowException"):
				System.out.println("The Window could not be found");;
				break;
			case ("StaleElementReferenceException"):
				System.out.println("The element no longer appears on the DOM of the page");
				break;
			case ("ConnectionClosedException"):
				System.out.println("Exception thrown when the connection to the Driver is lost.");
				break;
			case ("UnknownServerException"):
				System.out.println("Exception used as a place holder if the server returns an error without a stack trace.");;
				break;
			case ("ImeNotAvailableException"):
				System.out.println("Indicates that IME support is not available. ");
				break;
			case ("NoSuchSessionException"):
				System.out.println("Thrown by any command being called after WebDriver.quit().");
				break;
			case ("NotFoundException"):
				System.out.println("NotFoundException");;
				break;
			case ("ScriptTimeoutException"):
				System.out.println("Thrown when an async execute script command does not complete in enough time.");;
				break;			
			case ("SessionNotCreatedException"):
				System.out.println("Indicates that a session could not be created.");;
				break;
			case ("TimeoutException"):
				System.out.println("Thrown when a command does not complete in enough time.");;
				break;
			case ("UnableToCreateProfileException"):
				System.out.println("UnableToCreateProfileException");;
				break;
				
			case ("UnexpectedTagNameException"):
				System.out.println("UnexpectedTagNameException");;
				break;
			case ("UnhandledAlertException"):
				System.out.println("UnhandledAlertException");
				break;
			case ("UnreachableBrowserException"):
				System.out.println("Indicates there was a problem communicating with the browser being controlled or the Selenium server.");;
				break;
			case ("UnsupportedCommandException"):
				System.out.println("Used to indicate that a command used by the remote webdriver is unsupported.");
				break;
		}
		
	}

	@Override
	public abstract long takeSnap();

}
