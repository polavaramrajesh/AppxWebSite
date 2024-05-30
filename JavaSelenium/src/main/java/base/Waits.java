package base;
import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

//import com.sun.tools.sjavac.Log;

import lombok.extern.slf4j.Slf4j;

	@Slf4j public class Waits {
		private Logger logger = LogManager.getLogger(Homepage.class);
		
		private WebDriver driver;
		private WebDriverWait wait;
		private FluentWait<WebDriver> fluentWait;
		private int pollingTime=2;
		private int timeOut=10;
		
		public Waits(WebDriver driver) {
			super();
			this.driver = driver;
		}


		//implictlyWaits
		public  boolean implicitlyWait(int timeOuts) {
			try {
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeOuts));
				logger.info("wait for element to be visible is passed");
				return true;
			}
			catch (Exception e) {
				logger.info("wait for element to be visible is failed"+e);
				logger.error(e);
			
			}
				return false;
			
		}
		
		
		//explicitlywaits
		public boolean isAlertsPresent(int timeOuts) {
			wait=new WebDriverWait(driver, Duration.ofSeconds(timeOuts));
			
			try {
				wait.until(ExpectedConditions.alertIsPresent());{
				logger.info("alert is present passed");
				return true;
			}}
			catch (Exception e) {
				logger.info("alert is present failed");
				logger.error(e);
			}
				return false;
			

		}
		
		
		public boolean isElementClickable(WebElement element, int timeOuts) {
			wait=new WebDriverWait(driver, Duration.ofSeconds(timeOuts));
			
			try {
				wait.until(ExpectedConditions.elementToBeClickable(element));
				logger.info(" element to be clickable is passed");
				return true;
			}
			catch (Exception e) {
				logger.info(" element to be clickable is failed"+e);
				logger.error(e);
			}
				return false;
			

		}
		
		
		public boolean isElementSelected(WebElement element, int timeOuts) {
			wait=new WebDriverWait(driver, Duration.ofSeconds(timeOuts));
			
			try {
				wait.until(ExpectedConditions.elementToBeSelected(element));{
				logger.info("element to be clickable is passed");
				return true;
			}}
			catch (Exception e) {
				logger.info("element to be clickable is failed "+e);
				logger.error(e);
			}
				return false;
			}

		
		
		
		public boolean visibilityOfAllElements(WebElement element, int timeOuts) {
			wait=new WebDriverWait(driver, Duration.ofSeconds(timeOuts));
			
			try {
				wait.until(ExpectedConditions.visibilityOfAllElements(element));{
				logger.info("element is selected passed");
				return true;
			}}
			catch (Exception e) {
				logger.info("element is selected failed");
				logger.error(e);
			}
				return false;
			}
			
		
		
		
		public boolean visibilityOfElement(WebElement element, int timeOuts) {
			wait=new WebDriverWait(driver, Duration.ofSeconds(timeOuts));
			
			try {
				wait.until(ExpectedConditions.visibilityOf(element));{
				logger.info("all elements to be visible passed");
				return true;
			}}
			catch (Exception e) {
				logger.info("all elements to be visible failed");
			}
				return false;
			}
			
		
		
		
		//Fluent Waits
		public boolean isAlertsPresent(int...timeOuts) {
			if(timeOuts==null) {
				fluentWait=fluent(timeOut, pollingTime);
			}
			else {
				fluentWait=fluent(timeOuts, pollingTime);
			}
			
			
			try {
				fluentWait.until(ExpectedConditions.alertIsPresent());
				return true;
			}catch (Exception e) {
				return false;
			}
		}
		
		
		public boolean isElementClickable(WebElement element, int...timeOuts) {
			if(timeOuts==null) {
				fluentWait=fluent(timeOut, pollingTime);
			}
			else {
				fluentWait=fluent(timeOuts, pollingTime);
			}
			
			try {
				fluentWait.until(ExpectedConditions.elementToBeClickable(element));
				return true;
			}
			catch (Exception e) {
				return false;
			}

		}
		
		
		public boolean isElementSelected(WebElement element, int...timeOuts) {
			if(timeOuts==null) {
				fluentWait=fluent(timeOut, pollingTime);
			}
			else {
				fluentWait=fluent(timeOuts, pollingTime);
			}
			
			try {
				fluentWait.until(ExpectedConditions.elementToBeSelected(element));
				return true;
			}
			catch (Exception e) {
				return false;
			}

		}
		
		public boolean visibilityOfAllElements(WebElement element, int...timeOuts) {
			if(timeOuts==null) {
				fluentWait=fluent(timeOut, pollingTime);
			}
			else {
				fluentWait=fluent(timeOuts, pollingTime);
			}
			
			try {
				fluentWait.until(ExpectedConditions.visibilityOfAllElements(element));
				return true;
			}
			catch (Exception e) {
				return false;
			}
			
		}
		
		
		public boolean visibilityOfElement(WebElement element, int...timeOuts) {
			if(timeOuts==null) {
				fluentWait=fluent(timeOut, pollingTime);
			}
			else {
				fluentWait=fluent(timeOuts, pollingTime);
			}
			
			try {
				fluentWait.until(ExpectedConditions.visibilityOf(element));
				return true;
			}
			catch (Exception e) {
				return false;
			}
			
		}
		
		
		//methods for call fluentwait object
		public FluentWait<WebDriver> fluent(int timeOuts, int pollingTime) {
			fluentWait=new FluentWait<WebDriver>(driver)
					.withTimeout(Duration.ofSeconds(timeOuts))
					.pollingEvery(Duration.ofSeconds(pollingTime))
					.ignoring(Throwable.class);
			return fluentWait;
		}
		
		public FluentWait<WebDriver> fluent(int[] timeOuts, int pollingTime) {
			fluentWait=new FluentWait<WebDriver>(driver) 
					.pollingEvery(Duration.ofSeconds(pollingTime))
					.ignoring(Throwable.class);
			return fluentWait;
		}
		
		
	
	public Alert driverSwitchToAlerts(WebDriver driver) {
		try {
			Alert alert= driver.switchTo().alert();
			return alert;
		}catch (Exception e) {
			return null;
		}
	}
	
	public boolean alertDismiss(Alert alert) {
		try {
			alert.dismiss();
			return true;
		}catch (Exception e) {
			return false;
		}
	}
	
	public boolean waitForElementToBeVisible(WebElement element, int... timeOuts) {
		if (timeOuts == null) {
			fluentWait = fluent(timeOut, pollingTime);
		} else {
			fluentWait = fluent(timeOuts, pollingTime);
			logger.info("waitForElement is visibled ");
		}

		try {
			fluentWait.until(ExpectedConditions.visibilityOf(element));
			return true;
		} catch (Exception e) {
			logger.info("waitForElement is not visibled ");
			logger.error(e);
		}
		return false;

	}}
	


