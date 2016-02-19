import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoItDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       FirefoxDriver d=new FirefoxDriver();
       d.manage().window().maximize();
       d.get("file:///C:/Users/ramprasad/Desktop/ram12.html");
      
       d.findElement(By.id("ram")).click();
       
       
       Runtime.getRuntime().exec("C:\\Users\\ramprasad\\Desktop\\Auto IT Scripts\\fileupload12.exe");
       
       
	}
	

}
