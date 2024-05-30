package automationLib;

import org.jline.utils.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.extern.slf4j.Slf4j;
import synchronization.ActionMethods;

@Slf4j   //created a object intend of Slf4j
public class RobaticAutomation extends Recentpost {
	WebDriver driver;

	@FindBy(xpath = "//li[@class='menu-item-has-children']/a[text()='Technologies']")
	WebElement lnkTechnologies;
	@FindBy(xpath = "//ul[@class='sub-menu']//a[text()='Robotic Automation (RPA & RDA) ']")
	WebElement roboticautomationMenu;
	@FindBy(xpath = "//div[@class='breadcumb-wrapper background-image']")
	WebElement backgroundImg;
	@FindBy(xpath = "//h1[text()='Technologies']")
	WebElement txtTechnologies;
	@FindBy(xpath = "//div[@class='breadcumb-content']//a[text()='Home']")
	WebElement homepage;
	@FindBy(xpath = "//h1[text()='The Best Minds In Optimization.']")
	WebElement txthHomepage;
	@FindBy(xpath = "//li[text()='Robotic Automation (RPA & RDA). ']")
	WebElement RoboticAutomationRPARDA;
	@FindBy(xpath = "//div[@class='blog-img text-center']")
	WebElement Robotimg;
	@FindBy(xpath = "//h2[@class='blog-title']")
	WebElement txtRoboticAutomationRPARDA;
	@FindBy(xpath = "//P[contains(text(),'AppXcelerate Solutions knowledge and experience')]                                                        ")
	WebElement appxcelerateParagraph;
	@FindBy(xpath = "//p[contains(text(),' Digital transformation varies')]")
	WebElement txtDigitalTransformation;
	@FindBy(xpath = "//p[contains(text(),' Digital transformation varies')]/following-sibling::div/div[1]")
	WebElement robotimg;
	@FindBy(xpath = "//p[contains(text(),' Digital transformation varies')]/following-sibling::div/div[2]")
	WebElement AIimg;

	@FindBy(xpath = "//div[@class='project-inner-box']/p[@class='mt-3']")
	WebElement txtroboticsProcessAutomation;

	@FindBy(xpath = "//div[@class='project-inner-box']/p[@class='mt-3']/following-sibling::p")
	WebElement txtRoboticsDesktopAutomation;

	public RobaticAutomation(WebDriver driver) {
		super(driver); // constructer
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	private String AppXcelerateSolutions = "AppXcelerate Solutions knowledge and experience in Robotic Automation "
			+ "helps organizations to understand what RPA & RDA is, what value RPA & RDA can deliver, "
			+ "and how to apply RPA & RDA. Companies utilizing manual labor on a large scale for general knowledge process work,"
			+ " where people are performing high-volume, highly transactional process functions, will boost their capabilities"
			+ " as well as time with robotic automation."; // Validating complete string with original string

	private String Digitaltransformationvaries = "Digital transformation varies on the basis of complexity of tasks to be automated, "
			+ "which may span across basic user interface automation to advance decision making. "
			+ "Automation classifications also mainly differ based on compatibility with the type of input ranging from "
			+ "simple text to complex audio.";

	private String RoboticsProcessAutomation = "Robotics Process Automation (RPA) : RPA enables you with tools to create your own software ROBOTs to automate any business or technology process. "
			+ "Your \"bots\" are configurable software set up to perform the tasks you assign and control. "
			+ "You can configure a \"bot\" to capture and interpret existing applications for processing a transaction, "
			+ "manipulating data, triggering responses, and communicating with other digital systems. Accelerate automation of high volume, "
			+ "repetitive tasks, scheduling, and document digitization are handled in this enhanced automation, deploy robotic automation to "
			+ "automate high-volume, rules-based tasks with centralized Management Console.";

	private String RoboticsDesktopAutomation = "Robotic DesktopAutomation(RDA):accelerates productivity by optimizing the way work is performed. "
			+ "RDA helps people work faster and more efficiently by simplifying key tasks and automating business processes and transactions. "
			+ "Tasks like data capture can be automated to improve efficiency, solves the problem of the"
			+ "\"messy desktop\", personal Robot for every employee, accelerated time to value/ROI with out of the box automation brings "
			+ "10-20% improvement across large groups of employees.";

	public boolean validaterobaticautomation() {
		if (valdateRobaticAutomationHead()) {
			if (valdateRoboticAutomationContent()) {
				if (ValdateRoboticsProcessAutomationcontent()) {
					Log.info("validaterobaticautomation succesfull");
					return true;
				}
			}
		}

		return false;
	}

	public boolean clickingofRobaticAutomation() {
		try {
			mouseHoverandClick(lnkTechnologies, roboticautomationMenu);
			Log.info("clicking roboticautomationMenu is succesfull");
			return true;
		} catch (Exception e) {
			Log.info("clicking roboticautomationMenu is failed");
		}
		return false;
	}

	public boolean clickingHome() {
		try {
			Click(homepage);
			if (validateValueinElement(txthHomepage, "The Best Minds In Optimization.")) {
				Log.info("clicking home is succesfull");
				return true;
			}
		} catch (Exception e) {
			Log.info("clicking home is failed " + e);  //
			Log.error(e);  //it will highlight the error 
		}
		return false;
	}

	private boolean valdateRobaticAutomationHead() {
		try {

			if (validateValueinElement(txtTechnologies, "Technologies")) {
				if (clickingHome()) {
					navigateBack(driver);
					if (validateValueinElement(RoboticAutomationRPARDA, "Robotic Automation (RPA & RDA).")) {
						Log.info("valdateRobaticAutomationHead succesfull");
						return true;
					}
				}
			}

		} catch (Exception e) {
			Log.info("Validation of  Robatic Automation Head failed ");
			Log.error(e);
		}
		return false;
	}

	private boolean valdateRoboticAutomationContent() {
		try {
			scrollToElement(Robotimg);
			if (elementDisplay(Robotimg)) {
				if (validateValueinElement(txtRoboticAutomationRPARDA, "Robotic Automation (RPA & RDA).")) {
					if (validateValueinElement(appxcelerateParagraph, AppXcelerateSolutions)) {
						Log.info("valdateRoboticAutomationContent succesfull ");

						return true;
					}
				}
			}
		} catch (Exception e) {
			Log.info("validation of RoboticAutomation Content is failed");
			Log.error(e);
		}
		return false;
	}

	private boolean ValdateRoboticsProcessAutomationcontent() {
		try {
			scrollToElement(txtDigitalTransformation);
			if (validateValueinElement(txtDigitalTransformation, Digitaltransformationvaries)) {
				if (elementDisplay(robotimg)) {
					if ((elementDisplay(AIimg))) {
						if (validateValueinElement(txtroboticsProcessAutomation, RoboticsProcessAutomation)) {
							if (validateValueinElement(txtRoboticsDesktopAutomation, RoboticsDesktopAutomation)) {
								Log.info("ValdateRoboticsProcessAutomationcontent succesfull");
								return true;
							}
						}
					}
				}
			}
		} catch (Exception e) {
			Log.info("validation of RoboticsProcess Automation content failed");
			Log.error(e);

		}
		return false;
	}

}
