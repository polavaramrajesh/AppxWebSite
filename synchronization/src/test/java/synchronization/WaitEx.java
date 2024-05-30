package synchronization;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitEx {
//
//	public static void main(String[] args) {
//		WebDriver dr=new ChromeDriver();
//		dr.get("https://www.flipkart.com/");
//		WebDriverWait wait=new WebDriverWait(dr, Duration.ofSeconds(10));
//		Actions act=new Actions(dr);
////		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		FluentWait<WebDriver> fw=new FluentWait<WebDriver>(dr);
//		fw.withTimeout(Duration.ofSeconds(20));    
//		fw.pollingEvery(Duration.ofSeconds(2));
//		fw.ignoring(NoSuchElementException.class);
//		
//		
//		
//		//implicity wait
////		
////		WebElement findElement = dr
////				.findElement(By.xpath("//a[@href='https://www.flipkart.com/travel/flights?param=TravelDT-booknowexplorelater-TravelDT-HPW-Spicejet-Sale']"));
//	
////		act.click(findElement).build().perform();
//		
//		//explicity wait
////		WebElement until = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='https://www.flipkart.com/travel/flights?param=TravelDT-booknowexplorelater-TravelDT-HPW-Spicejet-Sale']")));
////		
////		act.click(until).build().perform();
//		
//		//fluent wait
//		
//		WebElement until = (WebElement)fw.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='https://www.flipkart.com/travel/flights?param=TravelDT-booknowexplorelater-TravelDT-HPW-Spicejet-Sale']")));
//		act.click(until).build().perform();
//		
//		
//	}
	
	
/*	public List<WebElement> visibilityOfAllElements(WebElement element, int timeOuts) {
		wait=new WebDriverWait(driver, Duration.ofSeconds(timeOuts));
		
		try {
			List<WebElement> allElements = wait.until(ExpectedConditions.visibilityOfAllElements(element));
			return allElements;
		}
		catch (Exception e) {
			return null;
		}
		
	}*/
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver dr=new ChromeDriver();
		dr.get("https://app-xcelerate.com/index.php");
	//	Navigation nav=(Navigation) dr;
		WaitMethods methods=new WaitMethods(dr);
		Actions act=new Actions(dr);
		methods.implicitlyWait(10);
		WebElement findElement = dr
			.findElement(By.xpath("//div[@class='btn-group']/a"));
	act.click(findElement).build().perform();
	Thread.sleep(2000);
	dr.navigate().back();
		
//		methods.visibilityOfElement(findElement, 10);
//	
//	methods.visibilityOfElement(findElement, 10, 2);
	}

} 
