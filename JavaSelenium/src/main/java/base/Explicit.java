package base;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Explicit {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/#google_vignette");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement element = driver.findElement(By.xpath("//div[@class='information closable']/following-sibling::p/select"));
		Actions action=new Actions(driver);
		action.click(element).perform();
		
		List<WebElement> findElements = driver.findElements(By.tagName("option"));
		
		Select select=new Select(element);
		
		select.selectByVisibleText("India");
	}
}
	
////	public static void main(String[] args) {
//		WebDriver driver=new ChromeDriver();
//		driver.get(" ");
//		
//		WebElement findElement = driver.findElement(By.xpath(""));
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement until = wait.until(ExpectedConditions.elementToBeClickable(findElement));
//		
//		FluentWait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
//				.withTimeout(Duration.ofSeconds(10))
//				.pollingEvery(Duration.ofSeconds(2))
//				.ignoring(TimeoutException.class);
//		
//		WebElement until2 = fluentWait.until(ExpectedConditions.elementToBeClickable(findElement));
//	}
//	
//
//}
        


