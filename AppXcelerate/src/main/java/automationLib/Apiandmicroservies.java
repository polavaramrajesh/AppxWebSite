package automationLib;

import org.apache.logging.log4j.LogManager;
import org.jline.utils.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.extern.slf4j.Slf4j;
import synchronization.ActionMethods;

@Slf4j
public class Apiandmicroservies extends Recentpost {
	private org.apache.logging.log4j.Logger Log = LogManager.getLogger(Apiandmicroservies.class);
	WebDriver driver;

	@FindBy(xpath = "//li[@class='menu-item-has-children']/a[text()='Technologies']")
	WebElement lnkTechnologies;

	@FindBy(xpath = "//ul[@class='sub-menu']//a[text()='API and MicroServices ']")
	WebElement apiandmicroserviesSubMenu;

	@FindBy(xpath = "//h1[text()='Technologies']")
	WebElement technologies;

	@FindBy(xpath = "//div[@class='breadcumb-content']//a[text()='Home']")
	WebElement home;
	@FindBy(xpath = "//h1[text()='The Best Minds In Optimization.']")
	WebElement txtHomepage;
	@FindBy(xpath = "//li[text()='API and MicroServices ']")
	WebElement apiandmicroserviestittle;

	@FindBy(xpath = "//div[@class='breadcumb-wrapper background-image']")
	WebElement apiandmicrobackgroungimge;

	@FindBy(xpath = "//div[@class='blog-img text-center']")
	WebElement apibackgroungimage;

	@FindBy(xpath = "//h2[text()='API and MicroServices.']")
	WebElement apiAndmicroservices;

	@FindBy(xpath = "//h2[contains(@class,'blog-title')]//following-sibling::p")
	WebElement text;

	@FindBy(xpath = "//div[@class='row gy-4 align-items-center'][1]/div[1]/img[1]")
	WebElement apiImage;

	@FindBy(xpath = "//div[@class='row gy-4 align-items-center'][1]/div[2]/img[1]")
	WebElement apisimage;

	@FindBy(xpath = "//p[contains(text(),'Application program interface (API) is a set of routines')]")
	WebElement apistext;

	public Apiandmicroservies(WebDriver driver) {
		super(driver); // constructer
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean ApiandmicroserviesValidate() {// wrapper method

		if (ValdateAPIandMicroServicesHead()) {
			if (ValdateApiandmicroserviesContent()) {
				if (vadlateAPIimg()) {
					Log.info("Validation of APIandMicroServices page sucessfull ");
					return true;
				}
			}
		}
		return false;
	}

	public boolean clickingofApiandmicroservies() {
		try {
			hoverClick(lnkTechnologies, apiandmicroserviesSubMenu);
			Log.info("clicking roboticautomationMenu is succesfull");
			return true;
		} catch (Exception e) {
			Log.info("clicking roboticautomationMenu is failed");
		}
		return false;
	}

	public boolean clickingHome() {
		try {
			Click(home);
			if (validateValueinElement(txtHomepage, "The Best Minds In Optimization.")) {
				Log.info("clicking home is succesfull");
				return true;
			}
		} catch (Exception e) {
			Log.info("clicking home is failed " + e);
			Log.error(e);
		}
		return false;
	}

	private boolean ValdateAPIandMicroServicesHead() {
		try {
			if (validateValueinElement(technologies, "Technologies")) {
				if (clickingHome()) {
					navigateBack(driver);
					if (validateValueinElement(apiandmicroserviestittle, "API and MicroServices")) {
						Log.info("Validation of APIandMicroServices  Head is sucessfull ");
						return true;
					}
				}
			}

		} catch (Exception e) {

			Log.info("Validation of APIandMicroServices  Head failed ");
			Log.error(e);
		}
		return false;
	}

	String AppXcelerateSolutions = "AppXcelerate Solutions has vast knowledge and experience in Service-oriented architecture Requirements, Principles, approaches, and governance. Service-oriented architecture (SOA) is a flexible set of design principles. A system based on a SOA will package functionality as a suite of interoperable services that can be used within multiple separate systems from several business domains.";

	private boolean ValdateApiandmicroserviesContent() {
		try {
			if (elementDisplay(apibackgroungimage)) {
				if (validateValueinElement(apiAndmicroservices, "API and MicroServices ")) {
					if (validateValueinElement(text, AppXcelerateSolutions)) {
						Log.info("Validation of Api and microservies Content is sucessfull ");
						return true;
					}
				}
			}
		} catch (Exception e) {
			Log.info("Validation of Api and microservies Content failed ");
			Log.error(e);
		}
		return false;
	}

	private boolean vadlateAPIimg() {

		String ApplicationProgram = "Application program interface (API) is a set of routines, protocols, and tools for building software applications. An API specifies how software components should interact. A good API makes it easier to develop a program by providing all the building blocks. A programmer then puts the blocks together.";

		try {
			scrollToElement(apiImage);
			if (elementDisplay(apiImage)) {
				if (elementDisplay(apisimage)) {
					if (validateValueinElement(apistext, ApplicationProgram)) {
						Log.info("Validation of APIimg is sucessfull ");
						return true;
					}
				}
			}
		} catch (Exception e) {
			Log.info("Validation of APIimg failed ");
			Log.error(e);
		}
		return false;
	}

}
