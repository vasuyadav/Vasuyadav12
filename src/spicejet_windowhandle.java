import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
//import org.yaml.snakeyaml.events.Event.ID;

public class spicejet_windowhandle {
	public WebDriver driver;
	
	public void url(){
		driver=new FirefoxDriver();
		driver.get("http://spicejet.com");
		driver.manage().window().maximize();
	}
	
	public void onewaysearch() throws Exception{
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		driver.findElement(By.linkText("Hyderabad (HYD)")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Bengaluru (BLR)")).click();
		driver.findElement(By.linkText("10")).click();
		new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult"))).selectByVisibleText("1 Adult");
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		Thread.sleep(6000);
	}
	
	public void popup()throws Exception{
		String str;
		str=driver.getWindowHandle();
		driver.findElement(By.linkText("Currency Converter")).click();
		Thread.sleep(5000);
		driver.switchTo().window("Currency Converter");
		
		new Select(driver.findElement(By.id("CurrencyConverterCurrencyConverterView_DropDownListBaseCurrency"))).selectByVisibleText("US Dollars(USD)");
		new Select(driver.findElement(By.id("CurrencyConverterCurrencyConverterView_DropDownListConversionCurrency"))).selectByVisibleText("Indian Rupee(INR)");
		driver.findElement(By.id("CurrencyConverterCurrencyConverterView_TextBoxAmount")).sendKeys("100");
		driver.findElement(By.id("CurrencyConverterCurrencyConverterView_ButtonConvert")).click();
		driver.findElement(By.id("ButtonCloseWindow")).click();
		driver.switchTo().window(str);
		
	}

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		spicejet_windowhandle obj=new spicejet_windowhandle();
		obj.url();
		obj.onewaysearch();
		obj.popup();
	}

}
