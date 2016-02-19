package kdf;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import jxl.Sheet;
import jxl.Workbook;

//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utility.CommonUtility;


public class Keyword_Framework {
	
	ActionKw keys=new ActionKw();
	WebDriver driver;
	CommonUtility cu=new CommonUtility();
	
	@Test
	public void keywordframework() throws IOException
	{
		WebElement control;
		//WebDriver driver;
		FileInputStream fis=new FileInputStream("C:\\Selenium WebDriver Training\\HRMS_Keyword\\src\\KDF\\HRMSLOGIN_KEYWORDS.xlsx");
	    //XSSFWorkbook wb=new XSSFWorkbook();	
	    work
	    XSSFSheet ws=wb.getSheet("Sheet1");
	    Iterator <Row> rows=ws.iterator();
	    rows.next();
	    while(rows.hasNext())
	    {
	    Row r=rows.next();
	    String key=r.getCell(3).getStringCellValue();
	    String loc=r.getCell(4).getStringCellValue();
	    String prop=r.getCell(5).getStringCellValue();
	    String input=r.getCell(6).getStringCellValue();
	    if(key.equals("browser"))
	    {
	    	driver=keys.browser();
	    }
	    else if(key.equals("navigate"))
	    {
	    	keys.navigate(driver, input);
	    }
	    else if(key.equals("enterData"))
	    {
	    	control=cu.getControl(driver, prop, loc);
	    	keys.enterData(control, input);
	    }
	    else if(key.equals("click"))
	    {
	    	control=cu.getControl(driver, prop, loc);
	    	keys.click(control);
	    }
	    else
	    {
	    	keys.close(driver);
	    }
	    
		
	}

}
}

