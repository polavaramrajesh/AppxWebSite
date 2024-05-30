package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
	WebDriver driver;
	 public void browserinitialization(String browser)
	 {  
		 
		 if (browser.equalsIgnoreCase("Chrome")) {
			 driver= new ChromeDriver();
		 }
		 else if(browser.equalsIgnoreCase("Edge")) {
			 
			 driver=new EdgeDriver();
		 }
		 else if(browser.equalsIgnoreCase("FireFox")) {
			 
			 driver=new FirefoxDriver();
		 }
		 else
		 {
			 driver= new ChromeDriver();
		 }
		 
			 
		 }


}
