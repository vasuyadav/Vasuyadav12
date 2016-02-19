
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A {

	public static void main(String[] args) {
		
		
		FirefoxDriver ff=new FirefoxDriver();
		ff.manage().window().maximize();
		ff.navigate().to("http://www.toolsqa.com/automation-practice-form/");
		ff.findElement(By.name("firstname")).sendKeys("kumar");
		ff.findElement(By.name("lastname")).sendKeys("vasantha");
		ff.findElement(By.id("sex-1")).click();
		ff.findElement(By.id("exp-3")).click();
		ff.findElement(By.id("photo")).sendKeys("C:\\Users\\Public\\Pictures\\Sample Pictures\\Tulips.jpg");
		ff.findElement(By.id("datepicker")).sendKeys("04th may 2015");
		ff.findElement(By.id("profession-1")).click();
		ff.findElement(By.id("tool-2")).click();
		ff.findElement(By.id("continents")).sendKeys("Asia");
		ff.findElement(By.id("selenium_commands")).sendKeys("Browser Commands");
		ff.findElement(By.id("submit")).click();
		
	}
}