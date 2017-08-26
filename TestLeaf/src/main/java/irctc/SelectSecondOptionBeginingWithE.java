package irctc;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectSecondOptionBeginingWithE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		WebElement element = driver.findElementById("userRegistrationForm:nationalityId");
		Select dropdownNationality = new Select(element);
		List<WebElement> options= dropdownNationality.getOptions();
		int i=0;
		for(WebElement eachoption:options)
		{
			if(eachoption.getText().startsWith("E"))
			{
				i++;
				if(i==2)
				{
					System.out.println(eachoption.getText());
					eachoption.click();
					break;
				}
			}
		}
				
	}

}
