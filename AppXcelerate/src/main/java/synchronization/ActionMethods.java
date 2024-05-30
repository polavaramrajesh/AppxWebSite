package synchronization;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.jline.utils.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//import com.aventstack.extentreports.util.Assert;

import lombok.extern.slf4j.Slf4j;


@Slf4j public class ActionMethods extends WaitMethods {
	
	public WebDriver driver;
	private Actions actions;
		
		public ActionMethods(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.actions = new Actions(driver);
	}

		public void mouseHoverandClick(WebElement hoverElement, WebElement clickElement) {
			mouseActions(hoverElement);
			Click(clickElement);
			Log.info("mouse is hover the element and click");
		}
		
		public void hoverClick(WebElement hoverElement, WebElement clickElement) {
			actions.moveToElement(hoverElement).click(clickElement).perform();
			Log.info("mouse is hover the element and click");
		}
		public boolean mouseActions(WebElement moveToElementName)
		{
			try {
				Log.info("doing moveToElement operation on element : "+moveToElementName.toString());
				actions.moveToElement(moveToElementName).build().perform();
				return true;
			}catch (Exception e) {
				Log.info("doing moveToElement operation on element is failed: "+e);
				Log.error(e);
			}
			return false;
		}
		
		public void DoubleClick(WebElement DoubleClick)
		{
			Log.info("doing doubleclick operation on element : "+DoubleClick.toString());
			actions.doubleClick(DoubleClick).build().perform();
		}
		public void SendKeys(WebElement SendKeys)
		{
			Log.info("doing sendkeys operation on element :"+SendKeys.toString());
			actions.sendKeys(SendKeys).build().perform();
		}
		public void ContextClick(WebElement ContextClick)
		{
			Log.info("doing contextclick operation on element :"+ContextClick.toString());
			actions.contextClick(ContextClick).build().perform();
		}
		
		public boolean validateValueinElement(WebElement WebElement, String string) {
			try {
				waitForElementToBeVisible(WebElement, 30);
				if (WebElement.getText().equals(string)) {
					Log.info("Validation of  Valuein  WebElement  is successfull ");
					return true;
				}
			} catch (Exception e) {
				Log.info("Validation of  Valuein  WebElement  is failed ");
				Log.error(e);
			}
			return false;
		}
		
		public boolean waitFroElementTobeVisible(WebElement WebElement) {
			try {
				if (visibilityOfAllElements(WebElement, 10)) {
					Log.info("Validation of  Valuein  WebElement  is successfull ");
					return true;
				}
			} catch (Exception e) {
				Log.info("Validation of  Valuein  WebElement  is failed ");
				Log.error(e);
			}
			return false;
		}

		public boolean Click(WebElement Click)
		{
			try {
				visibilityOfElement(Click, 20);
				actions.click(Click).build().perform();
				Log.info("doing click operation on element :"+Click.toString());
				return true;
			}catch (Exception e) {
				return false;
			}
		}
		public void Drag(WebElement Drag,WebElement Drop)
		{
			Log.info("doing drag  operation on element :"+Drag.toString());
			actions.dragAndDrop(Drag, Drop).build().perform();
		}
		public void Drop(WebElement Drag,WebElement Drop)
		{
			Log.info("doing  drop operation on element :"+Drop.toString());
			actions.dragAndDrop(Drag, Drop).build().perform();
		}
		public void ClickAndHold(WebElement ClickAndHold)
		{
			Log.info("doing clickandhold opeation element :"+ClickAndHold.toString());
			actions.clickAndHold(ClickAndHold).build().perform();
		}
		
		public void Release(WebElement Release)
		{
			Log.info("doing release opeation element :"+Release.toString());
			actions.clickAndHold(Release).build().perform();
		}
		
		public void Drag(WebElement Drag,WebElement Drop,WebElement By)
		{
			Log.info("doing drag operation on element :"+Drag);
			actions.dragAndDropBy(By,13,12).build().perform();
		}
       public void Drop (WebElement Drag,WebElement Drop,WebElement By)
       {
    	   Log.info("doing drop operation on element :"+Drop);
			actions.dragAndDropBy(By,13,12).build().perform();
       }
	
       public void By(WebElement Drag,WebElement Drop,WebElement By)
       {
    	   Log.info("doing By operation on element :"+By);
			actions.dragAndDropBy(By,1000,2000).build().perform();
       }
}
