package TestNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	public WebDriver d;
	
	public void clicklinks(String str) {
		d.findElement(By.xpath(str)).click();
		d.findElement(By.linkText("English")).click();
		}
	
  @Test
  public void f() {
	  clicklinks(".//*[@id='_eEe']/a[2]"); //hindi
	  clicklinks(".//*[@id='_eEe']/a[3]");  // telugu
	  clicklinks(".//*[@id='_eEe']/a[7]");  // kannada
	  
  }
  @BeforeTest
  public void beforeTest() {
	  d=new FirefoxDriver();
	  d.navigate().to("http://google.com");
	  d.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
