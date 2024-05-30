package base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class SafeActions extends Waits {
	public WebDriver driver;
	private JavascriptExecutor javaScriptExecuter; 

	private Logger logger = LogManager.getLogger(Homepage.class);
	public Actions actions;
	public Waits wait;

	public SafeActions(WebDriver driver) {
		super(driver);
		this.driver = driver;
		actions = new Actions(driver); // to perform actions on driver
		javaScriptExecuter = (JavascriptExecutor) driver; // to perform javascriptexecutor on driver
	}

	public boolean moveToElement(WebElement moveToElementName) {
		try {
			logger.info("doing moveToElement operation on element : " + moveToElementName.toString());
			actions.moveToElement(moveToElementName).build().perform();
			logger.info("element ");
			return true;
		} catch (Exception e) {
			logger.info("element ");
			logger.error(e);
		}
		return false;
	}

	public void DoubleClick(WebElement DoubleClick) {
		logger.info("doing doubleclick operation on element : " + DoubleClick.toString());
		actions.doubleClick(DoubleClick).build().perform();
	}

	public void SendKeys(WebElement SendKeys) {
		logger.info("doing sendkeys operation on element :" + SendKeys.toString());
		actions.sendKeys(SendKeys).build().perform();
	}
	
	public boolean Keyboard(WebElement keyboard) {
		try {
		actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		logger.info("element ");
		return true;
	} catch (Exception e) {
		logger.info("element ");
		logger.error(e);
	}
	return false;
}
	public void ContextClick(WebElement ContextClick) {
		logger.info("doing contextclick operation on element :" + ContextClick.toString());
		actions.contextClick(ContextClick).build().perform();
	}

	public boolean Click(WebElement Click) {
		try {

			isElementClickable(Click, 30);
			actions.click(Click).build().perform();
			logger.info("doing click operation on element is passed ");
			return true;
		} catch (Exception e) {
			logger.info("doing click operation on element is failed " + e);
			logger.error(e);
		}
		return false;
	}

	public void Drag(WebElement Drag, WebElement Drop) {
		logger.info("doing drag  operation on element :" + Drag.toString());
		actions.dragAndDrop(Drag, Drop).build().perform();
	}

	public void Drop(WebElement Drag, WebElement Drop) {
		logger.info("doing  drop operation on element :" + Drop.toString());
		actions.dragAndDrop(Drag, Drop).build().perform();
	}

	public void ClickAndHold(WebElement ClickAndHold) {
		logger.info("doing clickandhold opeation element :" + ClickAndHold.toString());
		actions.clickAndHold(ClickAndHold).build().perform();
	}

	public void Release(WebElement Release) {
		logger.info("doing release opeation element :" + Release.toString());
		actions.clickAndHold(Release).build().perform();
	}

	public void Drag(WebElement Drag, WebElement Drop, WebElement By) {
		logger.info("doing drag operation on element :" + Drag);
		actions.dragAndDropBy(By, 3, 1).build().perform();
	}

	public void Drop(WebElement Drag, WebElement Drop, WebElement By) {
		logger.info("doing drop operation on element :" + Drop);
		actions.dragAndDropBy(By, 3, 2).build().perform();
	}

	public void By(WebElement Drag, WebElement Drop, WebElement By) {
		logger.info("doing By operation on element :" + By);
		actions.dragAndDropBy(By, 1, 2).build().perform();
	}

	public boolean displayelement(WebElement element) {
		try {
			if (element.isDisplayed())
				// Assert.assertEquals(true, element);
				logger.info("element to be visible -passed");
			return true;
		} catch (Exception e) {
			logger.info("element to be visible -failed" + e);
			logger.error(e);
		}
		return false;
	}

	public boolean validatevalueinelement(WebElement WebElement, String string) {
		try {
			if (WebElement.getText().equalsIgnoreCase(string)) {
				logger.info("Validation of  Value in  WebElement  is passed ");
				return true;
			}
		} catch (Exception e) {
			logger.info("Validation of  Value in  WebElement  is failed ");
			logger.error(e);
		}
		return false;
	}

	public boolean scrollToElement(WebElement element) {
		try {
			if (visibilityOfElement(element))
				;
			javaScriptExecuter.executeScript("arguments[0].scrollIntoView();", element);
			{
				logger.info("scrolling an element is passed");
				return true;
			}
		} catch (Exception e) {
			logger.info("scrolling an element is failed" + e);
			logger.error(e);
		}
		return false;

	}

	public void scrollingPageLast() {
		// javaScriptExecuter.executeScript("window.scrollTo(0,
		// document.body.scrollHeight)");
		Object executeScript = javaScriptExecuter.executeScript("return window.pageYOffset;");
		javaScriptExecuter
				.executeScript("window.scrollTo(" + executeScript.toString() + ",document.body.scrollHeight)");
	}

	public boolean validateDriverTitle(WebDriver driver, String string) {
		try {
			implicitlyWait(20);
			if (driver.getTitle().equals(string)) {
				logger.info("Validation of  driver title  is successfull ");
				return true;
			}
		} catch (Exception e) {
			logger.info("Validation of driver title is failed " + e);
			logger.error(e);
		}
		return false;
	}

	public boolean navigateBack(WebDriver driver) {
		try {
			driver.navigate().back();
			logger.info("driver navigation successfull ");
			return true;
		} catch (Exception e) {
			logger.info("driver navigation failed  " + e);
			logger.error(e);
		}
		return false;
	}
	




	public String gittingUrl(WebDriver driver) {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	public void navigateByUrl(String Url, WebDriver driver) {
		driver.get(Url);
	}

	public void maximize(WebDriver driver) {
		driver.manage().window().maximize();
	}

	public void close(WebDriver driver) {
		driver.close();
	}

	public void quit(WebDriver driver) {
		driver.quit();
	}
}