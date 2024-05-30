package sychronization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.jline.utils.Log;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ActionMethods extends WaitMethods {

	public WebDriver driver;
	private Actions actions;

	public ActionMethods(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.actions = new Actions(driver);
	}

	public void mouseHoverandClick(WebElement hoverElement, WebElement clickElement) {
		visibilityOfElement(hoverElement);
		visibilityOfElement(clickElement);
		Log.info("mouse is hover the element and click");
		actions.moveToElement(hoverElement).click(clickElement).build().perform();
	}

		
	

	public boolean mouseActions(WebElement moveToElementName) {
		try {
			visibilityOfElement(moveToElementName);
			Log.info("doing moveToElement operation on element : " + moveToElementName.toString());
			actions.moveToElement(moveToElementName).build().perform();
			return true;
		} catch (Exception e) {
			Log.info("element is not found " + e);
			Log.error(e);
		}
		return false;
	}

	public void DoubleClick(WebElement DoubleClick) {
		isElementClickable(DoubleClick);
		Log.info("doing doubleclick operation on element : " + DoubleClick.toString());
		actions.doubleClick(DoubleClick).build().perform();
	}

	public void SendKeys(WebElement SendKeys) {
		Log.info("doing sendkeys operation on element :" + SendKeys.toString());
		visibilityOfElement(SendKeys);
		actions.sendKeys(SendKeys).build().perform();
	}

	public void ContextClick(WebElement ContextClick) {
		Log.info("doing contextclick operation on element :" + ContextClick.toString());
		isElementClickable(ContextClick);
		actions.contextClick(ContextClick).build().perform();
	}

	public boolean Click(WebElement Click) {
		try {
			isElementClickable(Click,10);
			actions.click(Click).perform();
			Log.info("doing click operation on element");
			return true;
		} catch (Exception e) {
			Log.info("clicking the not performed " + e);
			Log.error(e);
			return false;
		}
	}

	public void Drag(WebElement Drag, WebElement Drop) {
		Log.info("doing drag  operation on element :" + Drag.toString());
		visibilityOfElement(Drag);
		visibilityOfElement(Drop);
		actions.dragAndDrop(Drag, Drop).build().perform();
	}

	public void Drop(WebElement Drag, WebElement Drop) {
		Log.info("doing  drop operation on element :" + Drop.toString());
		actions.dragAndDrop(Drag, Drop).build().perform();
	}

	public void ClickAndHold(WebElement ClickAndHold) {
		Log.info("doing clickandhold opeation element :" + ClickAndHold.toString());
		isElementClickable(ClickAndHold);
		actions.clickAndHold(ClickAndHold).build().perform();
	}

	public void Release(WebElement Release) {
		Log.info("doing release opeation element :" + Release.toString());
		actions.clickAndHold(Release).build().perform();
	}

	public void Drag(WebElement Drag, WebElement Drop, WebElement By) {
		Log.info("doing drag operation on element :" + Drag);
		actions.dragAndDropBy(By, 13, 12).build().perform();
	}

	public void Drop(WebElement Drag, WebElement Drop, WebElement By) {
		Log.info("doing drop operation on element :" + Drop);
		actions.dragAndDropBy(By, 13, 12).build().perform();
	}

	public void By(WebElement Drag, WebElement Drop, WebElement By) {
		Log.info("doing By operation on element :" + By);
		actions.dragAndDropBy(By, 1000, 2000).build().perform();
	}

	public void sendKeysToElement(WebElement element, String valueToSend) {
		Log.info("sending the keys to element:");
		visibilityOfElement(element);
		element.sendKeys(valueToSend);
	}
}

