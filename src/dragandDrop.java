import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class dragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxDriver d=new FirefoxDriver();
		d.get("https://jqueryui.com/droppable/");
		d.manage().window().maximize();
		
		d.switchTo().frame(0);
		
		WebElement src=d.findElement(By.id("draggable"));
		WebElement tar=d.findElement(By.id("droppable"));
		
		Actions a=new Actions(d);
		a.dragAndDrop(src, tar).perform();
		

	}

}
