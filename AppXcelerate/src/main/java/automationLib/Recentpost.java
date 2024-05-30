package automationLib;

import org.jline.utils.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import synchronization.ActionMethods;

public class Recentpost extends ActionMethods {
	WebDriver driver;

	@FindBy(xpath = "//div[@class='widget']/h3[text()='Recent Posts']")
	WebElement recentposts;

//	@FindBy(xpath = "//a[text()='Generative AI.']")
//	WebElement generateai;
	
	@FindBy(linkText = "Generative AI.")
	WebElement generateai;

	@FindBy(xpath = "//li[text()='Generative AI ']")
	WebElement txtGenerativeAI;

	@FindBy(xpath = "//div[@class='recent-post'][2]//a[@class='text-inherit']")
	WebElement businessprocessmanagement;

	@FindBy(xpath = "//li[contains(text(),'Business Process Management (BPM / DPA) ')]")
	WebElement txtBusinessProcessManagement;

	@FindBy(xpath = "//a[text()='Robotic Automation (RPA & RDA).']")
	WebElement roboticautomation;

	@FindBy(xpath = "//li[text()='Robotic Automation (RPA & RDA). ']")
	WebElement RoboticAutomationRPARDA;

	@FindBy(xpath = "//a[text()='API and MicroServices.']")
	WebElement apimicroservies;

	@FindBy(xpath = "//li[text()='API and MicroServices ']")
	WebElement txtApi;

	@FindBy(xpath = "//div[@class='widget-banner']")
	WebElement bacgroundimg;

	@FindBy(xpath = "//span[text()='CONTACT US NOW']")
	WebElement cantactusnow;

	@FindBy(xpath = "//h2[text()='You Need Help?']")
	WebElement youneedhelp;

	@FindBy(xpath = "//div[@class='widget-banner']//a")
	WebElement contactLink;

	@FindBy(xpath = "//h1[@class='breadcumb-title']")
	WebElement txtContactpage;

	@FindBy(xpath = "//div[@class='widget']//div[@class='recent-post'][1]//img")
	WebElement blogImgGenerateAi;

	@FindBy(xpath = "//div[@class='widget']//div[@class='recent-post'][2]//img")
	WebElement blogImgBpm;

	@FindBy(xpath = "//div[@class='widget']//div[@class='recent-post'][3]//img")
	WebElement blogImgRpa;

	@FindBy(xpath = "//div[@class='widget']//div[@class='recent-post'][4]//img")
	WebElement blogImgApi;

	public Recentpost(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean recentPostvalidation() {
		try {
			if (recentpost()) {
				if (contactNow()) {
					Log.error("validation of recent Post and contact us sucessfully");
					return true;
				}
			}
		} catch (Exception e) {
			Log.error("validation of recent Post and contact us failed");
		}
		return false;
	}

	private boolean recentpost() { // methods
		scrollToElement(recentposts);
		if (validateValueinElement(recentposts,"Recent Posts")) {
			if (generateAiClick()) {
				if (BpmClick()) {
					if (roboticAutomationClick()) {
						if (aPIandMicroServicesClick()) {
							Log.error("validating for clicking recentPosts sucesssfull");
							return true;
						}
					}
				}
			}
		} else {
			Log.error("validating for clicking recentPosts failed");
		}
		return false;
	}

	private boolean contactNow() {
		if (elementDisplay(bacgroundimg)) {
			if (validateValueinElement(cantactusnow, "CONTACT US NOW")) {
				if (validateValueinElement(youneedhelp, "You Need Help?")) {
					Click(contactLink);
					if (validateValueinElement(txtContactpage, "Contact Us")) {
						Log.info("validation of contactNow sucessfull");
						return true;
					}
				}
			}
		} else {
			Log.error("validation of contactNow failed");
		}
		return false;
	}

	private boolean generateAiClick(){
		if (elementDisplay(blogImgGenerateAi)) {
			scrollToElement(recentposts);
			Click(generateai);
			if (validateValueinElement(txtGenerativeAI, "Generative AI")) {
				Log.info("validating for clicking the generateAi sucessfull");
				return true;
			}
		} else {
			Log.error("validating for clicking the generateAi failed");
		}
		return false;
	}

	private boolean BpmClick() {
		if (elementDisplay(blogImgBpm)) {
			scrollToElement(recentposts);
			Click(businessprocessmanagement);
			if (validateValueinElement(txtBusinessProcessManagement, "Business Process Management (BPM / DPA)")) {
				Log.info("validating for clicking the Business Process Management sucessfull");
				return true;
			}
		} else {
			Log.error("validating for clicking the Business Process Management failed");
		}
		return false;
	}

	private boolean roboticAutomationClick() {
		if (elementDisplay(blogImgRpa)) {
			scrollToElement(recentposts);
			Click(roboticautomation);
			if (validateValueinElement(RoboticAutomationRPARDA, "Robotic Automation (RPA & RDA).")) {
				Log.info("validating for clicking the roboticAutomation sucessfull");
				return true;
			}
		} else {
			Log.error("validating for clicking the roboticAutomation failed");
		}
		return false;
	}

	private boolean aPIandMicroServicesClick() {
		if (elementDisplay(blogImgApi)) {
			scrollToElement(recentposts);
			Click(apimicroservies);
			if (validateValueinElement(txtApi, "API and MicroServices")) {
				Log.info("validating for clicking the aPIandMicroService sucessfull");
				return true;
			}
		} else {
			Log.error("validating for clicking the aPIandMicroServices failed");
		}
		return false;
	}
}
