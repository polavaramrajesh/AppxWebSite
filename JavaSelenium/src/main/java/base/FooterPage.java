package base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class FooterPage extends SafeActions {
	
	
		private WebDriver driver;
		private static Logger Log = LogManager.getLogger(FooterPage.class);

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

		@FindBy(xpath = "//ul[@class='menu']//a[text()='About Us']")
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

		public FooterPage(WebDriver driver) {
			super(driver);
			this.driver = driver;
			PageFactory.initElements(driver, this);
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
	


