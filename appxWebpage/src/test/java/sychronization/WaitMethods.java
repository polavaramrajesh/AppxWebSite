package sychronization;
		
import java.time.Duration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WaitMethods {

	private WebDriver driver;
	private JavascriptExecutor javaScriptExecuter;
	private static Logger Log = LogManager.getLogger(WaitMethods.class);
	private WebDriverWait wait;
	private FluentWait<WebDriver> fluentWait;
	private int pollingTime = 2;
	private int timeOut = 10;

	public WaitMethods(WebDriver driver) {
		super();
		this.driver = driver;
		javaScriptExecuter = (JavascriptExecutor) driver;
	}

	// implictlyWaits
	public boolean implicitlyWait(int timeOuts) {
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeOuts));
			Log.info("waiting for element to be visible");
			return true;
		} catch (Exception e) {
			Log.info("element is not to be visible " + e);
			Log.error(e);
		}
		return false;
	}

	// explicitlywaits
	public boolean isAlertsPresent(int timeOuts) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(timeOuts));

		try {
			wait.until(ExpectedConditions.alertIsPresent());
			Log.info("Alert is present ");
			return true;
		} catch (Exception e) {
			Log.info("Alert is not present " + e);
			Log.error(e);
		}
		return false;
	}

	public boolean isElementClickable(WebElement element, int timeOuts) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(timeOuts));

		try {
			wait.until(ExpectedConditions.elementToBeClickable(element));
			Log.info("element is clickable ");
			return true;
		} catch (Exception e) {
			Log.info("element is not able to clickable " + e);
			Log.error(e);
		}
		return false;
	}

	public boolean isElementSelected(WebElement element, int timeOuts) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(timeOuts));

		try {
			wait.until(ExpectedConditions.elementToBeSelected(element));
			Log.info("element is Selected ");
			return true;
		} catch (Exception e) {
			Log.info("element is not able to Selected " + e);
			Log.error(e);
		}
		return false;
	}

	public boolean visibilityOfAllElements(WebElement element, int timeOuts) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(timeOuts));

		try {
			wait.until(ExpectedConditions.visibilityOfAllElements(element));
			Log.info("all the element is visible ");
			return true;
		} catch (Exception e) {
			Log.info("all the element is not visibled " + e);
			Log.error(e);
		}
		return false;
	}

	public boolean visibilityOfElement(WebElement element, int timeOuts) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(timeOuts));

		try {
			wait.until(ExpectedConditions.visibilityOf(element));
			Log.info("element is visibled ");
			return true;
		} catch (Exception e) {
			Log.info("element is not visibled " + e);
			Log.error(e);

		}
		return false;
	}

	// Fluent Waits
	public boolean isAlertsPresent(int... timeOuts) {
		try {
			if (timeOuts == null) {
				fluentWait = fluent(timeOut, pollingTime);
			} else {
				fluentWait = fluent(timeOuts, pollingTime);
			}

			fluentWait.until(ExpectedConditions.alertIsPresent());
			Log.info("Alert is present ");
			return true;
		} catch (Exception e) {
			Log.info("Alert is not present " + e);
			Log.error(e);
		}
		return false;
	}

	public boolean isElementClickable(WebElement element, int... timeOuts) {

		try {
			if (timeOuts == null) {
				fluentWait = fluent(timeOut, pollingTime);
			} else {
				fluentWait = fluent(timeOuts, pollingTime);
			}

			fluentWait.until(ExpectedConditions.elementToBeClickable(element));
			Log.info("element is clickable ");
			return true;
		} catch (Exception e) {
			Log.info("element is not able to clickable " + e);
			Log.error(e);
		}
		return false;
	}

	public boolean isElementSelected(WebElement element, int... timeOuts) {

		try {
			if (timeOuts == null) {
				fluentWait = fluent(timeOut, pollingTime);
			} else {
				fluentWait = fluent(timeOuts, pollingTime);
			}

			fluentWait.until(ExpectedConditions.elementToBeSelected(element));
			Log.info("element is Selected ");
			return true;
		} catch (Exception e) {
			Log.info("element is not able to Selected " + e);
			Log.error(e);
		}
		return false;
	}

	public boolean visibilityOfAllElements(WebElement element, int... timeOuts) {

		try {
			if (timeOuts == null) {
				fluentWait = fluent(timeOut, pollingTime);
			} else {
				fluentWait = fluent(timeOuts, pollingTime);
			}

			fluentWait.until(ExpectedConditions.visibilityOfAllElements(element));
			Log.info("all the element is visible ");
			return true;
		} catch (Exception e) {
			Log.info("all the element is not visibled " + e);
			Log.error(e);
		}
		return false;
	}

	public boolean visibilityOfElement(WebElement element, int... timeOuts) {

		try {
			if (timeOuts == null) {
				fluentWait = fluent(timeOut, pollingTime);
			} else {
				fluentWait = fluent(timeOuts, pollingTime);
			}

			fluentWait.until(ExpectedConditions.visibilityOf(element));
			Log.info("element is visibled ");
			return true;
		} catch (Exception e) {
			Log.info("element is not visibled " + e);
			Log.error(e);
		}
		return false;
	}

	// methods for call fluentwait object
	public FluentWait<WebDriver> fluent(int timeOuts, int pollingTime) {
		fluentWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(timeOuts))
				.pollingEvery(Duration.ofSeconds(pollingTime)).ignoring(Throwable.class);
		return fluentWait;
	}

	public FluentWait<WebDriver> fluent(int[] timeOuts, int pollingTime) {
		fluentWait = new FluentWait<WebDriver>(driver).pollingEvery(Duration.ofSeconds(pollingTime))
				.ignoring(Throwable.class);
		return fluentWait;
	}

//	elementDisplay
	public boolean elementDisplay(WebElement element) {
		try {
			scrollToElement(element);
			element.isDisplayed();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Alert driverSwitchToAlerts(WebDriver driver) {
		try {
			Alert alert = driver.switchTo().alert();
			return alert;
		} catch (Exception e) {
			return null;
		}
	}

	public boolean alertDismiss(Alert alert) {
		try {
			alert.dismiss();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean waitForElementToBeVisible(WebElement element, int... timeOuts) {
		if (timeOuts == null) {
			fluentWait = fluent(timeOut, pollingTime);
		} else {
			fluentWait = fluent(timeOuts, pollingTime);
			Log.info("waitForElement is visibled ");
		}

		try {
			fluentWait.until(ExpectedConditions.visibilityOf(element));
			return true;
		} catch (Exception e) {
			Log.info("waitForElement is not visibled ");
			Log.error(e);
		}
		return false;

	}

	public void logInfo(String msg) {
		Log.info(msg);
	}

	public void logInfoError(String msg, Exception e) {
		Log.info(msg + " " + e);
		Log.error(e);
	}

	public boolean validateValueinElement(WebElement WebElement, String string) {
		try {
			waitForElementToBeVisible(WebElement);
			if (WebElement.getText().equals(string)) {
				Log.info("Validation of  Valuein  WebElement  is successfull ");
				return true;
			}
		} catch (Exception e) {
			Log.info("Validation of  Valuein  WebElement  is failed " + e);
			Log.error(e);
		}
		return false;
	}

	public boolean validateDriverTitle(WebDriver driver, String string) {
		try {
			implicitlyWait(20);
			if (driver.getTitle().equals(string)) {
				Log.info("Validation of  driver title  is successfull ");
				return true;
			}
		} catch (Exception e) {
			Log.info("Validation of driver title is failed " + e);
			Log.error(e);
		}
		return false;
	}

	public boolean navigateBack(WebDriver driver) {
		try {
			driver.navigate().back();
			Log.info("driver navigation successfull ");
			return true;
		} catch (Exception e) {
			Log.info("driver navigation failed  " + e);
			Log.error(e);
		}
		return false;
	}

	public void scrollToElement(WebElement element) {
		visibilityOfElement(element);
		javaScriptExecuter.executeScript("arguments[0].scrollIntoView();", element);
	
	}

	public void scrollingPageLast() {
		//javaScriptExecuter.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Object executeScript = javaScriptExecuter.executeScript("return window.pageYOffset;");
		javaScriptExecuter.executeScript("window.scrollTo("+executeScript.toString()+",document.body.scrollHeight)");
	}
	
	public String gittingUrl(WebDriver driver) {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}
	
	public void navigateByUrl(String Url,WebDriver driver) {
		driver.get(Url);
	}
	
	public void maximize(WebDriver driver) {
			
		driver.manage().window().maximize();
	}
}
