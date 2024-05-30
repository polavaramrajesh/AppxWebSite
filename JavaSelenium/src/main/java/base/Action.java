package base;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import freemarker.log.Logger;

public class Action {
	private Logger  logger = (Logger) LogManager.getLogger(Action.class);
	public static void main(String[] args)  {
	
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=3150358981746625725&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062010&hvtargid=kwd-10573980&hydadcr=14453_2316415&gad_source=1");
	driver.manage().window().maximize();
    WebElement accountLists=  driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
    Actions a=new Actions(driver);
    a.moveToElement(accountLists);
          
  WebElement yourOrders=    driver.findElement(By.xpath("//a[@id='nav_prefetch_yourorders']"));
   
 a.moveToElement(yourOrders).build().perform();
   
  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shirts");
 driver.findElement(By.id("nav-search-submit-button")).click();
   driver.findElement(By.linkText("Men's Wrinkle-Resistant Regular Fit Cotton Formal Shirt")).click();

  a.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
  

	  
  }
		
		
		
 


} 






