package appxwebsite;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//import org.jline.utils.Log;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sychronization.ActionMethods;

public class HeaderAppx extends ActionMethods {
	private WebDriver driver;
	private Logger Log = LogManager.getLogger(HeaderAppx.class);

	@FindBy(xpath = " //header[@class='th-header header-layout2 ']")
	private WebElement header;

	@FindBy(xpath = " //div[@class='col-auto d-none d-lg-block ']//i[@class='fas fa-map-location']")
	private WebElement iconMap;

	@FindBy(xpath = " //li[contains(text(),'AppXcelerate')]")
	private WebElement txtLocationAddress;
	String Address = "AppXcelerate Solutions Pvt Ltd, HustleHub SB01,HSR Layout 5th Sector, Bengaluru-560034";

	@FindBy(xpath = " //div[@class='header-links']//i[@class='fas fa-envelope']")
	private WebElement iconEMail;

	@FindBy(xpath = "//i[@class='fas fa-envelope']/following-sibling::a")
	private WebElement lnkEMail;

	@FindBy(xpath = "//div[@class='header-links']//i[@class='fas fa-phone'] ")
	private WebElement iconPhone;

	@FindBy(xpath = " //div[@class='header-links']//a[text()='+91 9491434143']")
	private WebElement lnkPhoneNo;

	@FindBy(xpath = "//a[@class='icon-masking'] ")
	private WebElement appxLogo;

	@FindBy(xpath = "//div[@class='header-button']")
	private WebElement btnEnquire;

	// ===============HOME=========================//
	@FindBy(xpath = "//nav[@class='main-menu d-none d-lg-inline-block']//a[text()='Home']")
	private WebElement lnkHome;

	// ===============ABOUTUS=========================//
	@FindBy(xpath = "//nav[@class='main-menu d-none d-lg-inline-block']/ul//a[text()='About Us']")
	private WebElement lnkAboutUs;

	// ===============INDUSTRIES=========================//
	@FindBy(xpath = "//nav[@class='main-menu d-none d-lg-inline-block']//a[text()='Industries']")
	private WebElement lnkIndustries;

	@FindBy(xpath = "//ul[@class='sub-menu']//a[contains(text(),'Health Care and Life')]")
	private WebElement lnkMenuHealthCareAndLife;

	@FindBy(xpath = "//ul[@class='sub-menu']//a[text()='Government ']")
	private WebElement lnkMenuGovernmente;

	@FindBy(xpath = "//ul[@class='sub-menu']//a[text()='Banking and Finance ']")
	private WebElement lnkMenuBankingAndFinance;

	@FindBy(xpath = "//ul[@class='sub-menu']//a[text()='Insurance ']")
	private WebElement lnkMenuForInsurance;;

	// ================SERVICES=========================//
	@FindBy(xpath = "//li[@class='menu-item-has-children']//a[text()='Services']")
	private WebElement lnkServices;

	@FindBy(xpath = "//ul[@class='sub-menu']//li//a[contains(text(),'Customer')]")
	private WebElement lnkCMR;

	@FindBy(xpath = "//ul[@class='sub-menu']//li//a[text()='Digital Transformation ']")
	private WebElement lnkDigitalTransformation;

	@FindBy(xpath = "//ul[@class='sub-menu']//li//a[text()='App / Platform Development ']")
	private WebElement lnkAppPlatformDevelpment;

	@FindBy(xpath = "//ul[@class='sub-menu']//li//a[text()='SWAT/Triage ']")
	private WebElement lnkSwatTriage;

	@FindBy(xpath = "//ul[@class='sub-menu']//li//a[text()='System Upgrades ']")
	private WebElement lnkSystemUpgrades;

	@FindBy(xpath = "//ul[@class='sub-menu']//li//a[text()='Center Of Excellence (COE) ']")
	private WebElement lnkCOE;

	@FindBy(xpath = "//ul[@class='sub-menu']//li//a[text()='Application Testing ']")
	private WebElement lnkApplicationTesting;

	@FindBy(xpath = "//ul[@class='sub-menu']//li//a[contains(text(),'Maintenance Services (AMS)')]")
	private WebElement lnkAMS;

	@FindBy(xpath = "//ul[@class='sub-menu']//li//a[text()='ERP Implementation ']")
	private WebElement lnkERPImplementation;

	@FindBy(xpath = "//ul[@class='sub-menu']//li//a[text()='Managed Services ']")
	private WebElement lnkManagedServices;

	// ===============TECHNOLOGIES=========================//
	@FindBy(xpath = "//li[@class='menu-item-has-children']/a[text()='Technologies']")
	private WebElement lnkTechnologies;

	@FindBy(xpath = "//ul[@class='sub-menu']//li//a[text()='Generative AI ']")
	private WebElement lnkGenerativeAI;

	@FindBy(xpath = "//ul[@class='sub-menu']//li//a[text()='Robotic Automation (RPA & RDA) ']")
	private WebElement lnkRpaRda;

	@FindBy(xpath = "//ul[@class='sub-menu']//li//a[contains(text(),'Business Process Management')]")
	private WebElement lnkBpmDpa;

	@FindBy(xpath = "//ul[@class='sub-menu']//li//a[text()='API and MicroServices ']")
	private WebElement lnkApiMs;

	// ===============CONTACT=========================//
	@FindBy(xpath = "//nav[@class='main-menu d-none d-lg-inline-block']//a[text()='Contact']")
	private WebElement lnkContact;

	public HeaderAppx(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean ValidateionHeaderPage() {
		try {
			if (validateHeaderAddress())
				if (validateHome())
					if (validateIndustries())
						if (validateServices())
							if (validateTechnologies())
								if (validateContact()) {
									Log.info("validation of headerPage successfull");
									return true;
								}

		} catch (Exception e) {
			Log.info("validation of contactpage failed");
			Log.error(e);
		}
		return false;
	}

	private boolean validateHeaderAddress() {
	
		try {
			if (elementDisplay(iconMap))
				if (elementDisplay(txtLocationAddress))
					if (elementDisplay(iconEMail))
						if (validateValueinElement(lnkEMail, "info@app-xcelerate.com"))
							if (elementDisplay(iconPhone))
								if (validateValueinElement(lnkPhoneNo, "+91 9491434143")) {
									Log.info("validation of headerAddress is successfull");
									return true;
								}

		} catch (Exception e) {
			Log.info("validation of headerAddress is failed");
			Log.error(e);
		}
		return false;
	}

	private boolean validateHome() {
		try {
			if (elementDisplay(appxLogo))
				if (waitForElementToBeVisible(lnkHome))
					if (waitForElementToBeVisible(lnkAboutUs)) {
						Log.info("validation of validateHome is successfull");
						return true;
					}
		} catch (Exception e) {
			Log.info("validation of validateHome is failed");
			Log.error(e);
		}
		return false;
	}

	private boolean validateContact() {
		try {
			if (waitForElementToBeVisible(lnkContact))
				if (isElementClickable(btnEnquire)) {
					Log.info("validation of validateContact is successfull");
					return true;
				}
		} catch (Exception e) {
			Log.info("validation of validateContact is failed");
			Log.error(e);
		}
		return false;
	}

	private boolean validateIndustries() {
		try {
			if (waitForElementToBeVisible(lnkIndustries, 10))
				if (mouseActions(lnkIndustries))
					if (waitForElementToBeVisible(lnkMenuHealthCareAndLife, 10))
						if (waitForElementToBeVisible(lnkMenuGovernmente, 10))
							if (waitForElementToBeVisible(lnkMenuBankingAndFinance, 10))
								if (waitForElementToBeVisible(lnkMenuForInsurance, 10)) {
									Log.info("validation of Industries is successfull");
									return true;
								}

		} catch (Exception e) {
			Log.info("validation of Industries is failed");
			Log.error(e);
		}
		return false;
	}

	private boolean validateServices() {
		try {
			if (waitForElementToBeVisible(lnkServices, 10))
				if (mouseActions(lnkServices))
					if (waitForElementToBeVisible(lnkCMR, 10))
						if (waitForElementToBeVisible(lnkDigitalTransformation, 10))
							if (waitForElementToBeVisible(lnkAppPlatformDevelpment, 10))
								if (waitForElementToBeVisible(lnkSwatTriage, 10))
									if (waitForElementToBeVisible(lnkSystemUpgrades, 10))
										if (waitForElementToBeVisible(lnkCOE, 10))
											if (waitForElementToBeVisible(lnkApplicationTesting, 10))
												if (waitForElementToBeVisible(lnkAMS, 10))
													if (waitForElementToBeVisible(lnkERPImplementation, 10))
														if (waitForElementToBeVisible(lnkManagedServices, 10)) {
															Log.info("validation of Services is successfull");
															return true;
														}

		} catch (Exception e) {
			Log.info("validation of Services is failed");
			Log.error(e);
		}
		return false;
	}

	private boolean validateTechnologies() {
		try {
			if (waitForElementToBeVisible(lnkTechnologies, 10))
				if (mouseActions(lnkTechnologies))
					if (waitForElementToBeVisible(lnkGenerativeAI,10))
						if (waitForElementToBeVisible(lnkRpaRda, 10))
							if (waitForElementToBeVisible(lnkBpmDpa, 10))
								if (waitForElementToBeVisible(lnkApiMs, 10)) {
									Log.info("validation of technologies is successfull");
									return true;
								}

		} catch (Exception e) {
			Log.info("validation of technologies is failed");
			Log.error(e);
		}
		return false;
	}

	private boolean validateClickingLnkPhoneNo() {
		try {
			if (Click(lnkPhoneNo))
				if (isAlertsPresent()) {
					Alert alert = driverSwitchToAlerts(driver);
					if (alertDismiss(alert)) {
						Log.info("validation of headerAddress is successfull");
						return true;
					}
				}

		} catch (Exception e) {
			Log.info("validation of headerAddress is failed");
			Log.error(e);
		}
		return false;
	}
}