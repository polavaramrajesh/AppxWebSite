package automationLib;

import static org.junit.Assert.fail;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.extern.slf4j.Slf4j;
import synchronization.WaitMethods;

@Slf4j
public class GenerativeAI extends Recentpost { // inhertance using to call the recent post class
	private org.apache.logging.log4j.Logger Log = LogManager.getLogger(GenerativeAI.class);
	private WaitMethods waits;
	WebDriver driver;

	@FindBy(xpath = "//li[@class='menu-item-has-children']/a[text()='Technologies']")
	WebElement lnkTechnologies;

	@FindBy(xpath = "//ul[@class='sub-menu']//a[text()='Generative AI ']")
	WebElement generativeAISubmenu;
	@FindBy(xpath = "//h1[text()='Technologies']")
	WebElement technologiesText;
	@FindBy(xpath = "//div[@class='breadcumb-content']//a[text()='Home']")
	WebElement homepage;
	@FindBy(xpath = "//h1[text()='The Best Minds In Optimization.']")
	WebElement homepageText;

	@FindBy(xpath = "//li[text()='Generative AI ']")
	WebElement generativeAIText;
	@FindBy(xpath = "//div[@class='blog-img text-center']")
	WebElement backgroundImg;
	@FindBy(xpath = "//h2[@class='blog-title']")
	WebElement generativeAITextAI;
	@FindBy(xpath = "//div[@class='blog-content']/p")
	WebElement paragraphText;

	@FindBy(xpath = "//div[@class='project-inner-box']/p[1]")
	WebElement IntodayrapidlyParagraph;
	@FindBy(xpath = "//div[@class='col-md-6'][1]/img[@class='w-100 rounded-3']") // no other option
	WebElement robotImg;
	@FindBy(xpath = "//div[@class='col-md-6'][2]/img[@class='w-100 rounded-3']") // no other option
	WebElement AIimg;
	@FindBy(xpath = "//p[@class='mt-3']")
	WebElement AtAppXcelerateSolutionsParagraph;
	@FindBy(xpath = "//p[@class='mt-3']/following-sibling::p[1]")
	WebElement WeassistourcustomersParagraph;
	@FindBy(xpath = "//p[@class='mt-3']/following-sibling::p[2]")
	WebElement OptimizeyourbusinessParagraph;

	public GenerativeAI(WebDriver driver) { // Constructor
		super(driver);       //super called statement 
		this.driver = driver;   
		PageFactory.initElements(driver, this);         //to implement the POM 
	}

	public boolean generateAIValdation() {// Wrapper method
		if (generateAiHead())
			if (aboutGenerateAI())
				if (aboutRoboticAI())
					if (recentPostvalidation()) { // calling the recent post validation from the recent post by
													// using inheritances directly we call the method
						Log.info("Validation of  GenerativeAI succesfully ");
						return true;
					}

		return false;
	}

	private boolean generateAiHead() {
		try {
			if (validateValueinElement(technologiesText, "Technologies"))
				if (clickingHome())
					if (clickingofGenerateAi())
						if (validateValueinElement(generativeAIText, "Generative AI ")) {
							Log.info("generateAiHead is succesfull");
							return true;
						}

		} catch (Exception e) {
			Log.info("Validation of  GenerativeAI Head failed ");
			Log.error(e);
		}
		return false;
	} 

	public boolean clickingofGenerateAi() {
		try {
			mouseHoverandClick(lnkTechnologies, generativeAISubmenu);
			Log.info("clicking generateAi is succesfull");
			return true; 
		} catch (Exception e) {
			Log.info("clicking generateAi is failed");
		}
		return false;
	}

	public boolean clickingHome() {
		try {
			Click(homepage);
			if (validateValueinElement(homepageText, "The Best Minds In Optimization.")) {
				Log.info("clicking home is succesfull");
				return true;
			}
		} catch (Exception e) {
			Log.info("clicking home is failed " + e);
			Log.error(e);
		}
		return false;
	}

	String artificialintelligenceAITxt = "AppXcelerate Solutions provides a Artificial intelligence (AI), sometimes referred to as machine intelligence, involves machines augmenting human intelligence to complement the natural intelligence displayed by humans. The term \"artificial intelligence\" is commonly used to describe machines or computers that emulate \"cognitive\" functions associated with the human mind, such as learning and problem-solving.";
    // compare expected value to the original value 
	private boolean aboutGenerateAI() {
		try {
			if (elementDisplay(backgroundImg))
				if (validateValueinElement(generativeAITextAI, "Generative AI. "))
					if (validateValueinElement(paragraphText, artificialintelligenceAITxt)) {
						Log.info("Validation of  GenerativeAI Head is successfull ");
						return true;

					}

		} catch (Exception e) {
			Log.info("Validation of  GenerativeAI Head failed ");
			Log.error(e);
		}
		return false;
	}

	private boolean aboutRoboticAI() {
		String Intodayrapidlyevolvingbusinesslandscape = " In today's rapidly evolving business landscape, Artificial Intelligence (AI) has become an essential foundation for success. With recent advancements in AI, the possibilities have expanded, with conversational bots like ChatGPT setting new standards and shaping consumer expectations. Generative AI responses can be seamlessly integrated into model-driven architectures, allowing for workflows where low-code developers can easily configure and adapt suggested prompts, leading to unlimited possibilities and outcomes.";
		String AtAppXcelerateSolutionsourextensiveknowledge = "At AppXcelerate Solutions, our extensive knowledge base and experience in Artificial Intelligence (AI) drive value for organizations. By leveraging AI integration, we empower businesses to reinvent every aspect of their operations. Our AI solutions provide a roadmap to optimize business functions, enhance productivity, and reduce costs.";
		String Weassistourcustomersinfinding = "We assist our customers in finding the right approach to leveraging AI and LLM (Language Model) technologies. Through proper planning, design, and execution, we simplify processes and help reduce costs, enabling businesses to accelerate their growth and unlock the full potential of AI.";
		String Optimizeyourbusinessfunctions = "Optimize your business functions and drive innovation while reducing operational expenditure using our AI solutions. Our expertise spans various areas, including Sales, Marketing, Customer Service, Finance, Talent Acquisition, and more. By harnessing the power of AI, we enable you to transform and excel in today's competitive landscape.";

		try {
			if (validateValueinElement(IntodayrapidlyParagraph, Intodayrapidlyevolvingbusinesslandscape))
				if (elementDisplay(robotImg))
					if (elementDisplay(AIimg))
						if (validateValueinElement(AIimg, AtAppXcelerateSolutionsourextensiveknowledge))
							if (validateValueinElement(WeassistourcustomersParagraph, Weassistourcustomersinfinding))
								if (validateValueinElement(OptimizeyourbusinessParagraph,
										Optimizeyourbusinessfunctions))
									Log.info("Validation of  aboutRoboticAI Head is successfull ");
			return true;

		} catch (Exception e) {
			Log.info("Validation of  aboutRoboticAI Head failed ");
			Log.error(e);
		}
		return false;
 
	}

}
