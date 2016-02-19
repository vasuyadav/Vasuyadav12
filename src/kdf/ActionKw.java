package kdf;

//import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ActionKw {

	
	
		
		public WebDriver browser()
		{
			return new FirefoxDriver();
		}
		
		public void navigate(WebDriver driver,String url)
		{
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
		
		public void enterData(WebElement element,String input)
		{
			element.sendKeys(input);
		}
		public void click(WebElement element)
		{
			element.click();
		}


	
}
