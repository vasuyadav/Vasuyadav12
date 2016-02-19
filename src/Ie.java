import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Ie {
	public WebDriver driver;
	
	
	public void url(){
		driver=new FirefoxDriver();
		driver.get("http://spicejet.com");
		driver.manage().window().maximize();
	}
	
	public void oneway()throws Exception{
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		driver.findElement(By.linkText("Hyderabad (HYD)")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Bengaluru (BLR)")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("11")).click();
		
		new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult"))).selectByVisibleText("4 Adults");
		new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child"))).selectByVisibleText("1 Child");
		new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant"))).selectByVisibleText("1 Infant");
		
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	}
	
	public void popup12() throws Exception{
		String str;
		str=driver.getWindowHandle();
		driver.findElement(By.id("popUpConverter")).click();
		Thread.sleep(9000);
		new Select(driver.findElement(By.id("CurrencyConverterCurrencyConverterView_DropDownListBaseCurrency"))).selectByVisibleText("US Dollars(USD)");
		new Select(driver.findElement(By.id("CurrencyConverterCurrencyConverterView_DropDownListConversionCurrency"))).selectByVisibleText("Indian Rupee(INR)");
		
		driver.findElement(By.id("CurrencyConverterCurrencyConverterView_TextBoxAmount")).sendKeys("100");
		driver.findElement(By.id("CurrencyConverterCurrencyConverterView_ButtonConvert")).click();
		
		driver.switchTo().window(str);
		
	}

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Ie a=new Ie();
		a.url();
		a.oneway();
		a.popup12();

	}

}
