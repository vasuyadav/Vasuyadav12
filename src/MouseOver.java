import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		FirefoxDriver d=new FirefoxDriver();
		d.manage().window().maximize();
		d.get("http://www.emirates.com/in/English/");
		
		// xpath for Book tag
		WebElement des=d.findElement(By.xpath("html/body/form/div[3]/div[2]/div/header/div/div/div/ul/li[5]/div"));
		Thread.sleep(10000);
		Actions mo=new Actions(d);
		
		mo.moveToElement(des).perform();

	}

}
