package urlClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Url {

	private WebDriver driver;

	public WebDriver appx() {
		driver = new ChromeDriver();
		driver.get("https://app-xcelerate.com/index.php");
		driver.manage().window().maximize();
		return driver;
	}
}
