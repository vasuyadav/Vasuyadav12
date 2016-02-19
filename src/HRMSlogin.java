import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HRMSlogin {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver d=new FirefoxDriver();
		d.manage().window().maximize();
		d.get("http://professional.demo.orangehrmlive.com/");
		
		
		//d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS)
		d.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		String et="orangeHRM";
		String at=d.getTitle();
		
		System.out.println("The actual Title: "+at);
		
		if(et.equalsIgnoreCase(at))
		
			System.out.println("launch is successfull");
		else
			System.out.println("launch is not successfull");
		
		//login
		d.findElement(By.id("txtUsername")).sendKeys("Admin");
		d.findElement(By.id("txtPassword")).sendKeys("admin");
		d.findElement(By.id("btnLogin")).click();
		
		String ecp="welcome Admin";
		String lcp=d.findElement(By.id("welcome")).getText();
		
		System.out.println("The actual login Message: "+lcp);
		if(ecp.equals(lcp))
			System.out.println("login is successfull");
		else
			System.out.println("login is not successfull");
		
		//logout
		d.findElement(By.linkText("Welcome Admin")).click();
		d.findElement(By.linkText("Logout")).click();

	}

}



