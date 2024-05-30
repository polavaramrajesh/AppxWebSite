package automationLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BPM {
	WebDriver driver;

	@FindBy(xpath = "//li[@class='menu-item-has-children']/a[text()='Technologies']")
	WebElement lnkTechnologies;
	
	@FindBy(xpath = "//ul[@class='sub-menu']//a[contains(text(),'Business Process Management')]")
	WebElement businessProcessManagementSubMenu;
	
	@FindBy(xpath = "//div[@class='breadcumb-wrapper background-image']")
	WebElement backGroundImg;

	@FindBy(xpath = "//h1[@class='breadcumb-title']")
	WebElement technologiesText;

	@FindBy(xpath = "//ul[@class='breadcumb-menu']//a[contains(text(),'Home')]")
	WebElement homebutton;

	@FindBy(xpath = "//h1[text()='The Best Minds In Optimization.']")
	WebElement homePageText;

	@FindBy(xpath = "//li[text()='Business Process Management (BPM / DPA) ']")
	WebElement businessProcessManagementText;
	
	
}
