package base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CommonMethods extends SafeActions {


	public WebDriver driver;
	private static Logger Log = LogManager.getLogger(CommonMethods.class);
	
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
	private WebElement phoneIcon;

	@FindBy(xpath = " //div[@class='header-links']//a[text()='+91 9491434143']")
	private WebElement phoneNoLnk;

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

	@FindBy(xpath = "//h3[text()='About Company']")
	private WebElement txtAboutCompany;

	@FindBy(xpath = "//div[@class='th-widget-about']/p")
	private WebElement paraAboutCompany;

	@FindBy(xpath = "//div[@class='th-social']/a/i[@class='fab fa-facebook-f']")
	private WebElement lnkFaceBook;

	@FindBy(xpath = "//div[@class='th-social']/a/i[@class='fab fa-twitter']")
	private WebElement lnkTwitter;
	
	@FindBy(xpath = "//span[text()='Happening now']")
	private WebElement txtTwitter;

	@FindBy(xpath = "//div[@class='th-social']/a/i[@class='fab fa-linkedin-in']")
	private WebElement lnkLinkedin;

	@FindBy(xpath = "//div[@class='th-social']/a/i[@class='fab fa-whatsapp']")
	private WebElement lnkWhatsApp;

	@FindBy(xpath = "//div[@class='th-social']/a/i[@class='fab fa-youtube']")
	private WebElement lnkYouTube;

	@FindBy(xpath = "//h3[text()='Quick Links']")
	private WebElement txtQuickLinks;

	@FindBy(xpath = "//ul[@class='menu']//a[text()='Home']")
	private WebElement lnkFooterHome;

	@FindBy(xpath = "//div[@class='menu-all-pages-container']//a[text()='About Us']")
	private WebElement lnkFooterAboutUs;

	@FindBy(xpath = "//ul[@class='menu']//a[text()='Industries ']  ")
	private WebElement lnkFooterIndustries;

	@FindBy(xpath = "//ul[@class='menu']//a[text()='Services ']")
	private WebElement lnkFooterServices;

	@FindBy(xpath = "//ul[@class='menu']//a[text()='Technologies ']")
	private WebElement lnkFooterTechnology;

	@FindBy(xpath = "//ul[@class='menu']//a[text()='Contact Us']")
	private WebElement lnkFooterContachUs;

	@FindBy(xpath = "//h3[text()='Contact Info']")
	private WebElement txtContachInfo;

	@FindBy(xpath = "//ul[@class='menu']//a/i[@class='fas fa-phone']")
	private WebElement iconPhone;

	@FindBy(xpath = "//ul[@class='menu']//i[@class='fas fa-phone']/parent::a")
	private WebElement lnkPhoneNo;

	@FindBy(xpath = "//ul[@class='menu']//a/i[@class='fas fa-envelope']")
	private WebElement iconMail;

	@FindBy(xpath = "//ul[@class='menu']//i[@class='fas fa-envelope']/parent::a")
	private WebElement lnkMail;

	@FindBy(xpath = "//ul[@class='menu']//a/i[@class='fas fa-map-location']")
	private WebElement iconAddress;

	@FindBy(xpath = "//ul[@class='menu']//i[@class='fas fa-map-location']/parent::a")
	private WebElement lnkAddress;

	@FindBy(xpath = "//h3[text()='Location']")
	private WebElement txtLocation;

	@FindBy(xpath = "//div[@class='recent-post-wrap']")
	private WebElement map;

	@FindBy(xpath = "//div[contains(@class,'place-name')]")
	private WebElement sb01;

	@FindBy(xpath = "//div[contains(@class,'google-maps-link')]/a")
	private WebElement viewLargeMap;

	@FindBy(xpath = "//div[@class='text-center']/p")
	private WebElement txtCopyright;

	@FindBy(xpath = "//div[@class='text-center']/p/i")
	private WebElement iconFoot;

	@FindBy(xpath = "//div[@class='text-center']/p//a")
	private WebElement lnkChannelSoftTech;

	@FindBy(xpath = "//h1[text()='The Best Minds In Optimization.']")
	private WebElement txtHomePage;

	@FindBy(xpath = "//nav[@class='main-menu d-none d-lg-inline-block']//a[text()='About Us']")
	private WebElement txtAboutUsPage;

	@FindBy(xpath = "//h1[text()='Industries']")
	private WebElement txtInduatriesPage;

	@FindBy(xpath = "//h1[text()='Services']")
	private WebElement txtServicesPage;

	@FindBy(xpath = "//h1[text()='Technologies']")
	private WebElement txtTechnologiesPage;

	@FindBy(xpath = "//h1[text()='Contact Us']")
	private WebElement txtContactUsPage;

	public CommonMethods(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean ValidationHeaderPage() {
		try {
			if (validateHeaderAddress())
				if (validatehome())
					if (validateindustries())
						if (validateservices())
							if (validatetechnologies())
								if (validatecontact()){
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
			if (displayelement(iconMap))
				if (displayelement(txtLocationAddress))
					if (displayelement(iconEMail))
						if (validatevalueinelement(lnkEMail, "info@app-xcelerate.com"))
							if (displayelement(iconPhone))
								if (validatevalueinelement(lnkPhoneNo, "+91 9491434143")) {
									Log.info("validation of headerAddress is successfull");
									return true;
								}

		} catch (Exception e) {
			Log.info("validation of headerAddress is failed");
			Log.error(e);
		}
		return false;
	}

	public boolean validatehome() {
		try {
			if (displayelement(appxLogo))
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

	public boolean validatecontact() {
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

	public boolean validateindustries() {
		try {
			if (waitForElementToBeVisible(lnkIndustries, 10))
				if (moveToElement(lnkIndustries))
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

	public boolean validateservices() {
		try {
			if (waitForElementToBeVisible(lnkServices, 10))
				if (moveToElement(lnkServices))
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

	public boolean validatetechnologies() {
		try {
			if (waitForElementToBeVisible(lnkTechnologies, 10))
				if (moveToElement(lnkTechnologies))
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



	public boolean validateFooterXpath() {
		try {
			if (validateAboutCompanyFooter())
				if (validateQuickLinksFooter())
					if (validateContactInfoFooter())
						if (validateLocationFooter())
							if (displayelement(txtCopyright))
								if (validateChannelSoftechLnk()) {
									Log.info("validation of footer is sucessfull");
									return true;
								}

		} catch (Exception e) {
			Log.info("validation of fooder if failed " + e);
			Log.error(e);
		}
		return false;
	}

	// aboutUs in the footer
	public boolean validateAboutCompanyFooter() {

		String txtAbout = "AppXcelerate Solutions is an Information Technology Solutions and Services provider, helping organizations improve productivity by enabling digital transformation and by enabling process optimization with an unparalleled degree of agility.";
		try {
			if (displayelement(txtAboutCompany))
				if (validatevalueinelement(paraAboutCompany, txtAbout))
					if (validateFacebook())
						if (validateTwitter())
							if (validateLinkedin())
								if (validateWhatsapp())
									if (validateYoutube()) {
										Log.info("Sucessfully performed footer aboutcompany module");
										return true;
									}
		} catch (Exception e) {
			Log.info("error while performing in footer aboutcompany module " + e);
			Log.error(e);
		}
		return false;
	}

	// quick links in footer
	public boolean validateQuickLinksFooter() {
		try {
			if (displayelement(txtQuickLinks))
				if (validateHome())
					if (validateAbout())
						if (validateIndustries())
							if (validateServices())
								if (validateTechnologies())
									if (validateContact()) {
										Log.info("validation of quick links in fooder sucessfull");
										return true;
									}
		} catch (Exception e) {
			Log.info("validation of quick links in fooder failed " + e);
			Log.error(e);
		}
		return false;
	}

	// contact info in footer
	public boolean validateContactInfoFooter() {
		try {
			if (displayelement(txtContachInfo))
				if (displayelement(iconPhone))
					if (validatevalueinelement(lnkPhoneNo, "+91 9491434143"))
						if (displayelement(iconMail))
							if (validatevalueinelement(lnkMail, "info@app-xcelerate.com"))
								if (displayelement(iconAddress))
									if (displayelement(lnkAddress))
										if (validateAddress()) {
											Log.info("Validating contactInfo in footer sucessfull");
											return true;
										}
		} catch (Exception e) {
			Log.info("Validating contactInfo in footer failed " + e);
			Log.error(e);
		}
		return false;
	}

	// locations in footer
	public boolean validateLocationFooter() {
		try {
			scrollToElement(txtLocation);
			if (displayelement(txtLocation)) {
				if (displayelement(map)) {
					Log.info("Validating location in footer sucessfull");
					return true;
				}
			}
		} catch (Exception e) {
			Log.info("Validating location in footer failed " + e);
			Log.error(e);
		}
		return false;
	}

	private boolean validateFacebook() {
		try {
			scrollToElement(lnkFaceBook);
			Click(lnkFaceBook);
			if (validateDriverTitle(driver, "Facebook – log in or sign up")) {
				navigateBack(driver);
				Log.info("Validating facebook in footer sucessfull");
				return true;
			}
		} catch (Exception e) {
			Log.info("Validating facebook in footer failed " + e);
			Log.error(e);
		}
		return false;
	}

	private boolean validateTwitter() {
		try {
			String url = gittingUrl(driver);
			scrollToElement(lnkTwitter);
			Click(lnkTwitter);
			visibilityOfElement(txtTwitter, 20);
			if (validateDriverTitle(driver, "X. It’s what’s happening / X")) {
				navigateByUrl(url, driver);
				Log.info("Validating twitter in footer sucessfull");
				return true;
			}

		} catch (Exception e) {
			Log.info("Validating twitter in footer failed " + e);
			Log.error(e);
		}
		return false;
	}

	private boolean validateLinkedin() {
		try {
			scrollToElement(lnkLinkedin);
			Click(lnkLinkedin);
			if (validateDriverTitle(driver, "LinkedIn: Log In or Sign Up")) {
				navigateBack(driver);
				Log.info("Validating linkedin in footer sucessfull");
				return true;
			}
		} catch (Exception e) {
			Log.info("Validating linkedin in footer failed " + e);
			Log.error(e);
		}
		return false;
	}

	private boolean validateWhatsapp() {
		try {
			scrollToElement(lnkWhatsApp);
			Click(lnkWhatsApp);
			if (validateDriverTitle(driver, "WhatsApp | Secure and Reliable Free Private Messaging and Calling")) {
				navigateBack(driver);
				Log.info("Validating whatsapp in footer sucessfull");
				return true;
			}
		} catch (Exception e) {
			Log.info("Validating whatsapp in footer failed " + e);
			Log.error(e);
		}
		return false;
	}

	private boolean validateYoutube() {
		try {
			scrollToElement(lnkYouTube);
			Click(lnkYouTube);
			if (validateDriverTitle(driver, "YouTube")) {
				navigateBack(driver);
				Log.info("Validating youtube in footer sucessfull");
				return true;
			}

		} catch (Exception e) {
			Log.info("Validating youtube in footer failed " + e);
			Log.error(e);
		}
		return false;
	}

	private boolean validateHome() {
		try {
			scrollToElement(lnkFooterHome);
			Click(lnkFooterHome);
			if (validatevalueinelement(txtHomePage, "The Best Minds In Optimization.")) {
				Log.info("Validating home page in footer sucessfull");
				return true;
			}
		} catch (Exception e) {
			Log.info("Validating home page in footer Failed " + e);
			Log.error(e);
		}
		return false;

	}

	private boolean validateAbout() {
		try {
			scrollToElement(lnkFooterAboutUs);
			Click(lnkFooterAboutUs);
			if (validatevalueinelement(txtAboutUsPage, "About Us")) {
				Log.info("Validating about page in footer sucessfull");
				return true;
			}
		} catch (Exception e) {
			Log.info("Validating about page in footer Failed " + e);
			Log.error(e);
		}
		return false;
	}

	private boolean validateIndustries() {
		try {
			scrollToElement(lnkFooterIndustries);
			Click(lnkFooterIndustries);
			if (validatevalueinelement(txtInduatriesPage, "Industries")) {
				Log.info("Validating industries page in footer Successfull");
				return true;
			}
		} catch (Exception e) {
			Log.info("Validating industries page in footer Failed " + e);
			Log.error(e);
		}
		return false;
	}

	private boolean validateServices() {
		try {
			scrollToElement(lnkFooterServices);
			Click(lnkFooterServices);
			if (validatevalueinelement(txtServicesPage, "Services")) {
				Log.info("Validating service page in footer sucessfull");
				return true;
			}
		} catch (Exception e) {
			Log.info("Validating service page in footer Failed " + e);
			Log.error(e);
		}
		return false;
	}

	private boolean validateTechnologies() {
		try {
			scrollToElement(lnkFooterTechnology);
			Click(lnkFooterTechnology);
			if (validatevalueinelement(txtTechnologiesPage, "Technologies")) {
				Log.info("Validating technologies page in footer sucessfull");
				return true;
			}
		} catch (Exception e) {
			Log.info("Validating technologies page in footer Failed " + e);
			Log.error(e);
		}
		return false;
	}

	private boolean validateContact() {
		try {
			scrollToElement(lnkFooterContachUs);
			Click(lnkFooterContachUs);
			if (validatevalueinelement(txtContactUsPage, "Contact Us")) {
				Log.info("Validating contact us page in footer Failed");
				return true;
			}
		} catch (Exception e) {
			Log.info("Validating contactUs page in footer Failed " + e);
			Log.error(e);
		}
		return false;
	}

	public boolean validateNumber() {
		try {
			scrollToElement(lnkPhoneNo);
			Click(lnkPhoneNo);
			Alert alert = driverSwitchToAlerts(driver);
			if (alertDismiss(alert)) {
				Log.info("Validating phone number in footer sucesfull");
				return true;
			}

		} catch (Exception e) {
			Log.info("Validating phone number in footer failed " + e);
			Log.error(e);
		}
		return false;
	}

	private boolean validateAddress() {
		try {
			scrollToElement(lnkAddress);
			Click(lnkAddress);
			if (validateDriverTitle(driver, "Hustlehub SB01 - Google Maps")) {
				navigateBack(driver);
				Log.info("Validating address in footer sucessfull");
				return true;
			}
		} catch (Exception e) {
			Log.info("Validating address in footer failed " + e);
			Log.error(e);
		}
		return false;
	}

	private boolean validateChannelSoftechLnk() {
		try {
			scrollToElement(lnkChannelSoftTech);
			Click(lnkChannelSoftTech);
			if (validateDriverTitle(driver, "Web Design & Digital Marketing Company in Bangalore - Channelsoftech")) {
				navigateBack(driver);
				Log.info("validating channel soft link sucessfull");
			}
			return true;
		} catch (Exception e) {
			Log.info("validating channel soft link failed " + e);
			Log.error(e);
		}
		return false;
	}

}
