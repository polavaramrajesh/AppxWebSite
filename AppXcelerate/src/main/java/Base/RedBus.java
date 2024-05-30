package Base;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {
	
	

		public static void main(String[] args) {
			
			// TODO Auto-generated method stub
			
			
			
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.redbus.in/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			//driver.switchTo().alert().dismiss();
			driver.findElement(By.xpath("//span[text()='Help']")).click();
			Set<String> wind=driver.getWindowHandles();   //sets return inside string 
			System.out.println(wind);
			Iterator<String> it=wind.iterator();          //string iterator 
			String mainwin =it.next();                      //main window id will sort 
			String subwin=it.next();                         // sub window id will store
			driver.switchTo().window(subwin);
			
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@style='overflow:visible;']")));
			driver.findElement(By.xpath("//span[text()='Offers']")).click();
			driver.switchTo().window(mainwin);
			
			
			
			 
			
		}

	}

