package urlPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import synchronization.WaitMethods;

public class UrlProvied {
	private WebDriver driver;
	private WaitMethods waits;
	public WebDriver appx() {
		driver=new ChromeDriver();
		waits=new WaitMethods(driver);  
		waits.navigateByUrl("https://app-xcelerate.com/index.php",driver);
		waits.maximize(driver);
		return driver;
	}
}

