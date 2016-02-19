import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class google_links {
	public WebDriver d;
	
	public void url(){
		d=new FirefoxDriver();
		d.manage().window().maximize();
		d.get("http://google.co.in");
	}
	
	public void clicklinks(String str){
		d.findElement(By.xpath(str)).click();
		d.findElement(By.linkText("English")).click();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		google_links g=new google_links();
		
		g.url();
		g.clicklinks(".//*[@id='_eEe']/a[2]");// hindi
		g.clicklinks(".//*[@id='_eEe']/a[4]");//marati
		g.clicklinks(".//*[@id='_eEe']/a[3]");// telugu

	}

}
