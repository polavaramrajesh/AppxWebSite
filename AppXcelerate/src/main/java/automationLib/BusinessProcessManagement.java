package automationLib;

import org.jline.utils.Log;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.extern.slf4j.Slf4j;
import synchronization.ActionMethods;

@Slf4j

public class BusinessProcessManagement extends Recentpost {
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

	@FindBy(xpath = "//div[@class='blog-img text-center']")
	WebElement bpmImg;

	@FindBy(xpath = "//h2[contains(@class,'blog-title')]")
	WebElement bpmText;

	@FindBy(xpath = "//h2[contains(@class,'blog-title')]/following-sibling::p")
	WebElement bpmPara;

	@FindBy(xpath = "//div[@class='col-md-6'][1]/img")
	WebElement servicesImg;

	@FindBy(xpath = "//div[@class='col-md-6'][2]") // findElement(By.xpath="");
	WebElement servicesBPMImg;

	@FindBy(xpath = "//p[@class='mt-3']")
	WebElement servicesTxt;

	public BusinessProcessManagement(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);// this is keyword for locating current object
	}

	public boolean valdatebusinessProcessManagement() {
		// Wrapper method
		if (ValdatebusinessProcessManagementHead()) {
			if (ValdateBPMD()) {
				if (validateBPMAi()) {
					Log.info("Validation of BusinessProcessManagement succesfully ");
					return true;
				}
			}
		}

		return false;
	}

	public boolean clickingofBusinessprocessmanagement() {
		try {
			scrollToElement(lnkTechnologies);
			mouseHoverandClick(lnkTechnologies, businessProcessManagementSubMenu);
			Log.info("clicking businessProcessManagementSubMenu is succesfull");
			return true;
		} catch (Exception e) {
			Log.info("clicking businessProcessManagementSubMenu is failed");
		}
		return false;
	}

	public boolean clickingHome() {
		try {
			Click(homebutton);
			if (validateValueinElement(homePageText, "The Best Minds In Optimization.")) {
				navigateBack(driver);
				Log.info("clicking home is succesfull");
				return true;
			}
		} catch (Exception e) {
			Log.info("clicking home is failed " + e);
			Log.error(e);
		}
		return false;
	}

	private boolean ValdatebusinessProcessManagementHead() {
		try {
			if (validateValueinElement(technologiesText, "Technologies")) {
				if (clickingHome())

					if (validateValueinElement(businessProcessManagementText,
							"Business Process Management (BPM / DPA)")) {
						Log.info("ValdatebusinessProcessManagementHead succesfully");

						return true;
					}
			}

		} catch (Exception e) {
			Log.info("ValdatebusinessProcessManagementHead failed ");
			Log.error(e);
		}
		return false;
	}

	private String AppXcelerateSolutionshasabreadthofknowledge = "AppXcelerate Solutions has a breadth of knowledge and experience in Architecting, Designing, Developing and Implementing Business Process Management (BPM) / Digital Process Automation (DPA) Solutions. It is a systematic approach to making an organization’s workflow more effective, more efficient and more capable of adapting to an ever-changing environment. Business process management provides governance of a business’s process environment to optimize agility and operational performance.";
	private String Wehaveprovenexperiencewithvarious = "We have proven experience with various Business Process Management solutions including PEGA Rules process commander (PRPC), Unqork and ServiceNow. Our dedicated team is committed to help you get the maximum return from your Business Process Management solutions.";

	private boolean ValdateBPMD() {
		try {
			scrollToElement(bpmImg);
			if (elementDisplay(bpmImg)) {
				scrollToElement(bpmText);
				if (validateValueinElement(bpmText, "Business Process Management (BPM / DPA) .")) {
					if (validateValueinElement(bpmPara, AppXcelerateSolutionshasabreadthofknowledge)) {
						Log.info("ValdateBPMD succesfully");

						return true;

					}

				}
			}
		} catch (Exception e) {
			Log.info("Validation of  GenerativeAI BPMDPAValdation failed ");
			Log.error(e);
		}
		return false;
	}

	private boolean validateBPMAi() {
		try {
			scrollToElement(servicesImg);
			if (elementDisplay(servicesImg)) {
				if (elementDisplay(servicesBPMImg)) {
					if (validateValueinElement(servicesTxt, Wehaveprovenexperiencewithvarious))
						return true;
				}
			}

		} catch (Exception e) {
			Log.info("Validation of  GenerativeAI BPMAivalidate failed ");
			Log.error(e);
		}
		return false;
	}
}
