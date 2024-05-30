package base;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.apache.logging.log4j.Logger;
import org.testng.asserts.SoftAssert;

import lombok.extern.slf4j.Slf4j;
	

	@Slf4j
	public class Footer {

		private WebDriver driver;
		private SafeActions actions;
		private Logger logger = LogManager.getLogger(Footer.class);
		Waits wait = new Waits(driver);
		SoftAssert softAssert = new SoftAssert();

		@FindBy(xpath = "//h3[text()='About Company']")
		private WebElement aboutCompany;

		@FindBy(xpath = "//div[@class='th-widget-about']/p")
		private WebElement aboutCompanyPara;

		@FindBy(xpath = "//div[@class='th-social']/a[1]")
		private WebElement faceBook;

		@FindBy(xpath = "//div[@class='th-social']/a[2]")
		private WebElement twitter;

		@FindBy(xpath = "//div[@class='th-social']/a[3]")
		private WebElement linkedin;

		@FindBy(xpath = "//div[@class='th-social']/a[4]")
		private WebElement whatsApp;

		@FindBy(xpath = "//div[@class='th-social']/a[5]")
		private WebElement youTube;

		@FindBy(xpath = "//div[@class='col-md-6 col-xl-2']//h3")
		private WebElement quickLinks;

		@FindBy(xpath = "//div[@class='col-md-6 col-xl-2']//ul/li[1]/a")
		private WebElement footerHome;

		@FindBy(xpath = "//div[@class='col-md-6 col-xl-2']//ul/li[2]/a")
		private WebElement footerAboutUs;

		@FindBy(xpath = "//div[@class='col-md-6 col-xl-2']//ul/li[3]/a")
		private WebElement footerIndustries;

		@FindBy(xpath = "//div[@class='col-md-6 col-xl-2']//ul/li[4]/a")
		private WebElement footerServices;

		@FindBy(xpath = "//div[@class='col-md-6 col-xl-2']//ul/li[5]/a")
		private WebElement footerTechnology;

		@FindBy(xpath = "//div[@class='col-md-6 col-xl-2']//ul/li[6]/a")
		private WebElement footerContactUs;

		@FindBy(xpath = "//div[@class='col-md-6 col-xl-3'][1]//h3")
		private WebElement contachInfo;

		@FindBy(xpath = "//div[@class='col-md-6 col-xl-3'][1]/div/div//li[1]/a/i")
		private WebElement phoneIcon;

		@FindBy(xpath = "//div[@class='col-md-6 col-xl-3'][1]/div/div//li[1]/a")
		private WebElement phoneNo;

		@FindBy(xpath = "//div[@class='col-md-6 col-xl-3'][1]/div/div//li[2]/a/i")
		private WebElement mailIcon;

		@FindBy(xpath = "//div[contains(@class,'col-md-6 col-xl-3')][1]//div//li[2]")
		private WebElement mail;

		@FindBy(xpath = "//div[@class='col-md-6 col-xl-3'][1]/div/div//li[3]/a/i")
		private WebElement addressIcon;

		@FindBy(xpath = "//div[@class='col-md-6 col-xl-3'][1]/div/div//li[3]/a")
		private WebElement address;

		@FindBy(xpath = "//div[@class='col-md-6 col-xl-3'][2]//h3")
		private WebElement location;

		@FindBy(xpath = "//div[@class='recent-post-wrap']")
		private WebElement map;

		@FindBy(xpath = "//div[contains(@class,'place-name')]")
		private WebElement sb01;

		@FindBy(xpath = "//div[contains(@class,'google-maps-link')]/a")
		private WebElement viewLargeMap;

		@FindBy(xpath = "//div[@class='text-center']/p")
		private WebElement footText;

		@FindBy(xpath = "//div[@class='text-center']/p/i")
		private WebElement footIcon;

		@FindBy(xpath = "//div[@class='text-center']/p//a")
		private WebElement channelSoftTech;

		@FindBy(xpath = "//h1[text()='The Best Minds In Optimization.']")
		private WebElement homePageText;

		@FindBy(xpath = "//h1[text()='About Us']")
		private WebElement AboutUsPageText;

		@FindBy(xpath = "//h1[text()='Industries']")
		private WebElement induatriesPageText;

		@FindBy(xpath = "//h1[text()='Services']")
		private WebElement servicesPageText;

		@FindBy(xpath = "//h1[text()='Technologies']")
		private WebElement technologiesPageText;

		@FindBy(xpath = "//h1[text()='Contact Us']")
		private WebElement contactUsPageText;

		public Footer(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
			wait = new Waits(driver);
			actions =new SafeActions(driver);
		}

		

		public boolean footerMethods() {
			wait.implicitlyWait(10);
			try
			{
				if(aboutCompanyFooter()) {
					if(quickLinksFooter()) {
						if(contactInfoFooter()) {
							if(locationFooter()) {
								if(AboutUs.elementDisplay(footText)) {
									logger.info("validation of fooder is passed");
									return true;
								}
							}
						}
					}
				}
			}catch (Exception e) {
				logger.info("validation of fooder is failed");
				logger.error(e);
			}
			return false;
		}
		
		
		//aboutUs in the footer
		public boolean aboutCompanyFooter() {
			
			String txt = "AppXcelerate Solutions is an Information Technology Solutions and Services provider, helping organizations improve productivity by enabling digital transformation and by enabling process optimization with an unparalleled degree of agility.";
			
			if (aboutCompany.getText().equals("About Company")) {
				if (aboutCompanyPara.getText().equals(txt)) {
					if (facebook()) {
						if (twitter()) {
							if (linkedin()) {
								if (whatsapp()) {
									if (youtube()) {
										logger.info("Sucessfully performed footer aboutcompany module");
										return true;
									}
								}
							}
						}
					}
				}
			} else {
				logger.error("error while performing in footer aboutcompany module");
			}
			return false;
		}
		
		//quick links in footer
		public boolean quickLinksFooter() {
			
			if (quickLinks.getText().equals("Quick Links")) {
				if (home()) {
					if (about()) {
						if (industries()) {
							if (services()) {
								if(technologies()) {
									if(contact()) {
										logger.error("validation of quick links in fooder sucessfull");
										return true;
									}
								}
							}
						}
					}
				}
			}else {
				logger.error("validation of quick links in fooder failed");
			}
			return false;
		}
		
		//contact info in footer
		public boolean contactInfoFooter() {
			
			if(contachInfo.getText().equals("Contact Info")) {
				if(AboutUs.elementDisplay(phoneIcon)) {
					if(phoneNo.getText().equals("+91 9491434143")) {
						 if(number()) {
							 if(AboutUs.elementDisplay(mailIcon)) {
								 if(mail.getText().equals("info@app-xcelerate.com")) {
									 if(AboutUs.elementDisplay(addressIcon)) {
										 if(AboutUs.elementDisplay(address)) {
											 logger.error("Validating contactInfo in footer sucessfull");
											 return true;
										 }
									 }
								 }
							 }
						 }
					}
				}
			}
			else {
				logger.error("Validating contactInfo in footer failed");
			}
			return false;
		}
		
		//locations in footer
		public boolean locationFooter() {
			if(location.getText().equals("Location")) {
				if(AboutUs.elementDisplay(map)) {
					logger.error("Validating location in footer sucessfull");
					return true;
				}
			}
			else {
				logger.error("Validating location in footer failed");
			}
			return false;
		}

		
		
		public boolean facebook() {
			try {
			   actions.Click(faceBook);
				if (driver.getTitle().equals("Facebook – log in or sign up")) {
					driver.navigate().back();
					logger.error("Validating facebook in footer sucessfull");
					return true;
				}
			} catch (Exception e) {
				logger.error("Validating facebook in footer failed");
			}
			return false;
		}

		public boolean twitter() {
			try {
				actions.Click(twitter);
				if (driver.getTitle().equals("X. It’s what’s happening / X")) {
					driver.navigate().back();
					logger.error("Validating twitter in footer sucessfull");
					return true;
				}

			} catch (Exception e) {
				logger.error("Validating twitter in footer failed");
			}
			return false;
		}

		public boolean linkedin() {
			try {
				actions.Click(linkedin);
				if (driver.getTitle().equals("LinkedIn: Log In or Sign Up")) {
					driver.navigate().back();
					logger.error("Validating linkedin in footer sucessfull");
					return true;
				}
			} catch (Exception e) {
				logger.error("Validating linkedin in footer failed");
			}
			return false;
		}

		public boolean whatsapp() {
			try {
				actions.Click(whatsApp);
				if (driver.getTitle().equals("WhatsApp | Secure and Reliable Free Private Messaging and Calling")) {
					driver.navigate().back();
					logger.error("Validating whatsapp in footer sucessfull");
					return true;
				}
			} catch (Exception e) {
				logger.error("Validating whatsapp in footer failed");
			}
			return false;
		}

		public boolean youtube() {
			try {
				actions.Click(youTube);
				if (driver.getTitle().equals("YouTube")) {
					driver.navigate().back();
					logger.error("Validating youtube in footer sucessfull");
					return true;
				}

			} catch (Exception e) {
				logger.error("Validating youtube in footer failed");
			}
			return false;
		}

		
		
		public boolean home() {
			try {
				actions.Click(footerHome);
				if (homePageText.getText().equals("The Best Minds In Optimization.")) {
					logger.error("Validating home page in footer sucessfull");
					return true;
				}
			} catch (Exception e) {
				logger.error("Validating home page in footer Failed");
			}
			return false;

		}

		public boolean about() {
			try {
				actions.Click(footerAboutUs);
				if (AboutUsPageText.getText().equals("About Us")) {
					logger.error("Validating about page in footer sucessfull");
					return true;
				}
			} catch (Exception e) {
				logger.error("Validating about page in footer Failed");
			}
			return false;
		}

		public boolean industries() {
			try {
				actions.Click(footerIndustries);
				if (induatriesPageText.getText().equals("Industries")) {
					logger.error("Validating industries page in footer Successfull");
					return true;
				}
			} catch (Exception e) {
				logger.error("Validating industries page in footer Failed");
			}
			return false;
		}

		public boolean services() {
			try {
				actions.Click(footerServices);
				if (servicesPageText.getText().equals("Services")) {
					logger.error("Validating service page in footer sucessfull");
					return true;
				}
			} catch (Exception e) {
				logger.error("Validating service page in footer Failed");

			}
			return false;
		}

		public boolean technologies() {
			try {
				actions.Click(footerTechnology);
				if(technologiesPageText.getText().equals("Technologies")) {
					logger.error("Validating technologies page in footer sucessfull");
					return true;
				}
			} catch (Exception e) {
				logger.error("Validating technologies page in footer Failed");
			}
			return false;
		}

		public boolean contact() {
			try {
				actions.Click(footerContactUs);
				if(contactUsPageText.getText().equals("Contact Us")) {
					logger.error("Validating contact us page in footer Failed");
					return true;
				}
			} catch (Exception e) {
				logger.error("Validating contactUs page in footer Failed");
			}
			return false;
		}

		
		
		public boolean number() {
			try {
			      actions.Click(phoneNo);
				if (wait.isAlertsPresent(10)) {
					Alert alert = driver.switchTo().alert();
					alert.dismiss();
					logger.error("Validating phone number in footer sucesfull");
					return true;
				}
			} catch (Exception e) {
				logger.error("Validating phone number in footer failed");
			}
			return false;
		}

		public boolean address() {
			try {
				actions.Click(address);
				if(driver.getTitle().equals("Hustlehub SB01 - Google Maps")) {
					logger.error("Validating address in footer sucessfull");
					driver.navigate().back();
					return true;
				}
			} catch (Exception e) {
				logger.error("Validating address in footer failed");
			}
			return false;
		}
	}


