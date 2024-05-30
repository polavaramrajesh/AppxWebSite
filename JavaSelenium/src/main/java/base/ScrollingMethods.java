package base;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ScrollingMethods {
	private Logger logger= LogManager.getLogger(Homepage.class);
	public WebDriver driver;
	
	public boolean moveToElement(WebElement element,WebElement Element) {
		try {
			if(moveToElement(element, Element)) {
			  logger.info("element is moved passed");
			return true;
			}}catch(Exception e) {
			logger.info("element is moved failed"+e);
			logger.error(e);
		}
		return false;
	}
	}
	
		