package xpath;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.jline.utils.Log;
import lombok.extern.slf4j.Slf4j;
import synchronization.ActionMethods;

@Slf4j
public class AboutUs extends ActionMethods {
	private WebDriver driver;
	private static Logger Log = LogManager.getLogger(FooterXpath.class);

	@FindBy(xpath = "//div[@class='col-auto']//ul/li/a[text()='About Us']")
	private WebElement lnkAboutUs;

	@FindBy(xpath = "//div[@class='breadcumb-wrapper background-image']")
	private WebElement imgBackground;

	@FindBy(xpath = "//h1[@class='breadcumb-title']")
	private WebElement maintextAboutUs;

	@FindBy(xpath = "//ul[@class='breadcumb-menu']/li/a")
	private WebElement lnkHome;

	@FindBy(xpath = "//h1[text()='The Best Minds In Optimization.']")
	private WebElement txtHome;

	@FindBy(xpath = "//ul[@class='breadcumb-menu']/li[text()='About Us']")
	private WebElement txtAboutUs;

	@FindBy(xpath = "//div[@class='img-shape icon-masking']/img")
	private WebElement backGroungImageAboutUs;

	@FindBy(xpath = "//div[@class='img-box4 tilt-active']/img")
	private WebElement imgAboutUs;

	@FindBy(xpath = "//div[@class='shadow-title']")
	private WebElement shadowTitle;

	@FindBy(xpath = "//div[@class='icon-masking me-2']/img")
	private WebElement iconText;

	@FindBy(xpath = "//span[@class='sub-title']")
	private WebElement txtAboutAppx;

	@FindBy(xpath = "//h4[@class='sec-title']")
	private WebElement txtWelcomeAppx;

	@FindBy(xpath = "//p[@Class='mt-n2 mb-30 text-center text-xl-start']")
	private WebElement paraChampion;

	@FindBy(xpath = "//p[@class='mt-n2 mb-30 text-center text-xl-start']/following-sibling::p-")
	private WebElement paraAppxStands;

	public AboutUs(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean validateAboutUsPage() {
		  
		try {
			if (validateAboutUsHead())
				if (validateAboutUsContent()) {
					Log.info("validate the about us page sucessfull");
					return true;
				}
			

		} catch (Exception e) {
			Log.info("validate the about us page is failed " + e);
			Log.error(e);
		}
		return false;
	}

	private boolean validateAboutUsHead() {
		try {
			if (elementDisplay(imgBackground))
				if (validateValueinElement(maintextAboutUs, "About Us"))
					if (validateClickingHome())
						if (validateClickingAboutUsPage())
							if (validateValueinElement(txtAboutUs, "About Us")) {
								Log.info("validate About us Head sucess");
								return true;
							}
		} catch (Exception e) {
			Log.info("validate About us Head filed " + e);
			Log.error(e);
		}
		return false;
	}

	public boolean validateClickingAboutUsPage() {
		try {
			Click(lnkAboutUs);
			return true;
		} catch (Exception e) {
			Log.info("exception for clicking the Aboutus page " + e);
			Log.error(e);
		}
		return false;
	}

	private boolean validateClickingHome() {
		try {
			Click(lnkHome);
			if (validateValueinElement(txtHome, "The Best Minds In Optimization.")) {
				Log.info("validating for clicking the home is sucessfull");
				return true;
			}
		} catch (Exception e) {
			Log.info("exception for clicking the Home page " + e);
			Log.error(e);
		}
		return false;
	}

	private String welcomeTxt = "Welcome To  AppXcelerate Solutions: Your Comprehensive Hub For CRM And IT Services.";
	private String atAppxChampion = "At AppXcelerate Solutions, we champion the seamless integration of efficient customer relationship management (CRM) with a spectrum of IT services, forming a holistic approach to elevate your business. As trusted CRM specialists, we offer a comprehensive suite of solutions tailored to not only enhance your customer relationships but also propel your business into the realms of digital transformation and innovation.";
	private String appxItService = "AppXcelerate Solutions stands as your beacon for comprehensive IT services, spearheading your digital transformation initiatives and bespoke app development projects. In the ever-evolving digital landscape, staying ahead requires more than just efficient customer management – it demands a strategic approach to technology. Our IT services are crafted to make your business more agile, responsive, and technologically advanced. From conceptualizing and designing digital transformation strategies to developing customized applications, AppXcelerate Solutions is your gateway to an innovative and tech-driven future.";

	private boolean validateAboutUsContent() {
		try {
			scrollToElement(backGroungImageAboutUs);
			if (elementDisplay(backGroungImageAboutUs))
				if (elementDisplay(imgAboutUs))
					if (elementDisplay(shadowTitle))
						if (elementDisplay(iconText))
							if (validateValueinElement(txtWelcomeAppx, welcomeTxt))
								if (validateValueinElement(paraChampion, atAppxChampion))
									if (validateValueinElement(paraAppxStands, appxItService)) {
										Log.info("validate about Us content sucessfull");
										return true;
									}
		} catch (Exception e) {
			Log.info("validate about Us content failed " + e);
			Log.error(e);
		}
		return false;
	}

}