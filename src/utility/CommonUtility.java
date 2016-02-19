package utility;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonUtility {
	
	public String readProperty(String propname) throws IOException
	{
		FileInputStream fis=new FileInputStream("C:\\Selenium WebDriver Training\\HRMS_Keyword\\src\\CONFIG\\HRMS_OBJECTS.properties");
		Properties prop=new Properties();
		prop.load(fis);
		return prop.getProperty(propname);
	}
	
	public WebElement getControl(WebDriver driver,String propname,String locname) throws IOException
	{
		WebElement control=null;
		if(locname.equals("id"))
		{
			control=driver.findElement(By.id(readProperty(propname)));			
		}
		else if(locname.equals("name"))
		{
			control=driver.findElement(By.name(readProperty(propname)));
		}
		else if(locname.equals("xpath"))
		{
			control=driver.findElement(By.xpath(readProperty(propname)));
		}
		else if(locname.equals("link"))
		{
			control=driver.findElement(By.linkText(readProperty(propname)));
		}
		
		return control;
	}


}
