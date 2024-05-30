package xpath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import synchronization.ActionMethods;

public class Main extends ActionMethods{
	WebDriver driver;
	public Main(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//nav[@class='main-menu d-none d-lg-inline-block']/ul/li[2]/a")
	private WebElement aboutUs;
	
	@Test
	public void execute() {
		driver=new ChromeDriver();
		driver.get("https://app-xcelerate.com/index.php");
		about();
		AboutUs a=new AboutUs(driver);
		 
	}
	
	public void about() {
		Click(aboutUs);
	}
}
