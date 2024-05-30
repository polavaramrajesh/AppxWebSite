package automationLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ApplicationTesting {
	WebDriver driver;
	//Chandrakiran	
	@FindBy(xpath="//h3[text()='Recent Posts']")
	WebElement headerRecentPost;
	
	@FindBy(xpath="//a[text()='Customer Relationship Management(CRM) ']")
	WebElement btnCustomerRelationshipManagemen;
	
	@FindBy(xpath="//ul[@class='sub-menu th-submenu']//a[text()='Digital Transformation ']")
	WebElement btnDigitalTransformation;
	
	@FindBy(xpath="//ul[@class='sub-menu th-submenu']//a[text()='App / Platform Development ']")
	WebElement btnAppPlatformDevelopment;
	
	@FindBy(xpath="//ul[@class='sub-menu th-submenu']//a[text()='SWAT/Triage ']")
	WebElement btnSWATTriage;
	
	@FindBy(xpath="//ul[@class='sub-menu th-submenu']//a[text()='System Upgrades ']")
	WebElement btnSystemUpgrades;
	
	@FindBy(xpath="//ul[@class='sub-menu th-submenu']//a[text()='Center Of Excellence (COE) ']")
	WebElement btnCenterOfExcellence;
	
	@FindBy(xpath="//ul[@class='sub-menu th-submenu']//a[text()='Application Testing ']")
	WebElement btnApplicationTesting;
	
	@FindBy(xpath="//h4[@class='post-title']//a[text()='Application Maintenance Services (AMS) ']")
	WebElement btnApplicationMaintenanceServices;
	
	@FindBy(xpath="//h4[@class='post-title']//a[text()='ERP Implementation ']")
	WebElement btnErpImplementation;
	
	@FindBy(xpath="//h4[@class='post-title']//a[text()='Managed Services ']")
	WebElement btnManagedServices;
	
	

}
