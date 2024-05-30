package automationLib;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement element =driver.findElement(By.xpath("//div[@class='information closable']/following-sibling::p/select\"));"));
		Actions action = new Actions(driver);
		action.click(element).perform();
		List<WebElement> findElements = driver.findElements(By.tagName("option"));
		Select select = new Select(element);
	    select.selectByVisibleText("India");
	}
		
	}






		



