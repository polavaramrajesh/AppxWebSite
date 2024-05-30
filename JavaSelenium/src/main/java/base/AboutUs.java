package base;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.apache.logging.log4j.Logger;

import lombok.extern.slf4j.Slf4j;



@Slf4j
public class AboutUs {
	private WebDriver driver;
	private Waits wait;
	private SafeActions actions;

	private Logger logger = LogManager.getLogger(AboutUs.class);

	@FindBy(xpath = "//nav[@class='main-menu d-none d-lg-inline-block']/ul/li[2]/a")
	private WebElement aboutUsLink;

	@FindBy(xpath = "//div[@class='breadcumb-wrapper background-image']")
	private WebElement backgroundImage;

	@FindBy(xpath = "//h1[@class='breadcumb-title']")
	private WebElement maintextAboutUs;

	@FindBy(xpath = "//ul[@class='breadcumb-menu']/li/a")
	private WebElement homeLink;

	@FindBy(xpath = "//h1[text()='The Best Minds In Optimization.']")
	private WebElement homeText;

	@FindBy(xpath = "//ul[@class='breadcumb-menu']/li[2]")
	private WebElement textAboutUs;

	@FindBy(xpath = "//div[@class='img-shape icon-masking']/img")
	private WebElement backGroungImageAboutUs;

	@FindBy(xpath = "//div[@class='img-box4 tilt-active']/img")
	private WebElement imageAboutUs;

	@FindBy(xpath = "//div[@class='shadow-title']")
	private WebElement shadowTitle;

	@FindBy(xpath = "//div[@class='icon-masking me-2']/img")
	private WebElement textIcon;

	@FindBy(xpath = "//span[@class='sub-title']")
	private WebElement aboutAppxText;

	@FindBy(xpath = "//h4[@class='sec-title']")
	private WebElement WelcomeAppxText;

	@FindBy(xpath = "//p[@Class='mt-n2 mb-30 text-center text-xl-start']")
	private WebElement championPara;

	@FindBy(xpath = "//div[@class='col-xl-6 mt-40 mt-xl-0']/p[2]")
	private WebElement appxStandsPara;

	public AboutUs(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new Waits(driver);
		actions =new SafeActions(driver);
	
	}
	
	
//	elementDisplay
	public static boolean elementDisplay(WebElement element ) {
		try{
			element.isDisplayed();
			return true;
		}catch (Exception e) {
			return false;
		}
	}

	
	
	public boolean aboutUsValidate() {
		try {
			if(aboutUsHead()) {
				if(aboutUsContent()) {
					logger.info("validate the about us page sucessfull");
				}
			}
		}catch (Exception e) {
			logger.error("validate the about us page is failed "+e);
		}
		return false;
	}
	
	public boolean aboutUsHead() {
		if(elementDisplay(backgroundImage)) {
			if(maintextAboutUs.getText().equals("About Us")) {
				if(clickingHome()) {
					if(clickingAboutUs()) {
						if(textAboutUs.getText().equals("About Us")) {
							logger.error("validate About us Head sucess");
							return true;
						}
					}
				}
			}
		}
		else {
			logger.error("validate About us Head filed");
		}
		return false;
	}

	public boolean clickingAboutUs() {
		try {
			actions.Click(aboutUsLink);
			return true;
		} catch (Exception e) {
			logger.error("exception for clicking the Aboutus page " + e.getMessage());
			return false;
		}
	}

	public boolean clickingHome() {
		try {
			actions.Click(homeLink);
			if (homeText.getText().equals("The Best Minds In Optimization.")) {
				logger.error("validating for clicking the home is sucessfull");
				return true;
			}
		} catch (Exception e) {
			logger.error("exception for clicking the Home page " + e.getMessage());
		}
		return false;
	}
	
	
	String welcomeTxt = "Welcome To  AppXcelerate Solutions: Your Comprehensive Hub For CRM And IT Services.";
	String atAppxChampion = "At AppXcelerate Solutions, we champion the seamless integration of efficient customer relationship management (CRM) with a spectrum of IT services, forming a holistic approach to elevate your business. As trusted CRM specialists, we offer a comprehensive suite of solutions tailored to not only enhance your customer relationships but also propel your business into the realms of digital transformation and innovation.";
	String appxItService = "AppXcelerate Solutions stands as your beacon for comprehensive IT services, spearheading your digital transformation initiatives and bespoke app development projects. In the ever-evolving digital landscape, staying ahead requires more than just efficient customer management – it demands a strategic approach to technology. Our IT services are crafted to make your business more agile, responsive, and technologically advanced. From conceptualizing and designing digital transformation strategies to developing customized applications, AppXcelerate Solutions is your gateway to an innovative and tech-driven future.";

	
	public boolean aboutUsContent() {
		if(elementDisplay(backGroungImageAboutUs)) {
			if(elementDisplay(imageAboutUs)) {
				if(elementDisplay(shadowTitle)) {
					if(elementDisplay(textIcon)) {
						if(WelcomeAppxText.getText().equals(welcomeTxt)) {
							if (championPara.getText().equals(atAppxChampion)) {
								if(appxStandsPara.getText().equals(appxItService)) {
									logger.error("validate about Us content sucessfull");
									return true;
								}
							}
						}
					}
				}
			}
		}
		else {
			logger.error("validate about Us content failed");
		}
		return false;
	}
}






