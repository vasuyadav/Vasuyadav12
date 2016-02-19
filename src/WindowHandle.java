

	import java.util.Iterator;
	import java.util.Set;
import org.openqa.selenium.By;
	import org.openqa.selenium.firefox.FirefoxDriver;

//import com.gargoylesoftware.htmlunit.javascript.host.Set;


	public class WindowHandle {

		public static void main(String[] args) throws InterruptedException {
			
			FirefoxDriver driver;
			
			
				
				
				
				driver=new FirefoxDriver();
				driver.get("http://citibank.com");
				driver.manage().window().maximize();
			
			
			
				driver.findElement(By.linkText("Learn More")).click();
				Set<String> windowids=driver.getWindowHandles();
				Iterator<String> it=windowids.iterator();
				while(it.hasNext())
				{
				  driver.switchTo().window(it.next());
				  try
				  {
				     driver.findElement(By.xpath("//*[@id='banner']/div[1]/p[2]/a")).click();
				     break;
				  }
				  catch(Exception e)
				  {
					  
				  }
				}
				
		}
	}


