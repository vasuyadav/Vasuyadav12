package Sel_Pkg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class NewTest {
	public WebDriver d;
  @Test
  public void f() {
	  
	  
		d.switchTo().frame(0)
		
		WebElement src=d.findElement(By.id("draggable"));
		WebElement tar=d.findElement(By.id("droppable"));
		
		Actions a=new Actions(d);
	
		a.dragAndDrop(src, tar).perform();

  }
  @BeforeTest
  public void beforeTest() {
	  
	  FirefoxDriver d=new FirefoxDriver();
	  d.get("https://jqueryui.com/droppable/");
	  d.manage().window().maximize();

  }

  @AfterTest
  public void afterTest() {
  }

}
