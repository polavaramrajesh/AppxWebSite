package base;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;	
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Homepage extends SafeActions {
	public Homepage homepage;    // declaration for creating an object
	public WebDriver driver;     
	private Logger logger= LogManager.getLogger(Homepage.class);//initialization and declaration of logger

	@FindBy(xpath = "//nav[@class='main-menu d-none d-lg-inline-block']//a[text()='Home']")
	WebElement home;

	@FindBy(xpath = "//a[@class='th-btn shadow-none']")
	WebElement enquireBoxBtn;

	@FindBy(xpath = "//h1[text()='Contact Us']")
	WebElement contactUsTittle;
	String contactUs = "Contact Us";

	@FindBy(xpath = "//div[@class='header-logo']//img[@alt='Webteck']")
	WebElement headerLogoBtn;

	@FindBy(xpath = "//div[@class='img-shape icon-masking']")
	WebElement aboutappximage;

	@FindBy(xpath = "//h2[text()='The Best Minds In ']")
	WebElement theBestMIndsInOptimizationLable;
	String strBestmindsinoptimization = "The Best Minds In Optimization.";

	@FindBy(xpath = "//div[@class='col-xl-6 mt-40 mt-xl-0']//p[contains(text(),'At AppXcelerate Solutions we champion the seamless')]")
	WebElement theBestMindsinOptimizationLabletxt;
	String strBestmindsinoptimizationtxt = "At AppXcelerate Solutions we champion the seamless integration of efficient customer relationship management (CRM) with a spectrum of IT services, forming a holistic approach to elevate your business. As trusted CRM specialists, we offer a comprehensive suite of solutions tailored to not only enhance your customer relationships but also propel your business into the realms of digital transformation and innovation.";
	
	@FindBy(xpath = "//div[@class='achivement-box-area filter-active-cat1']//a[@class='th-btn']")
	WebElement aboutMoreBtn;

	@FindBy(xpath = "//li[text()='About Us']")
	WebElement aboutUsTittle;
	String aboutustittle ="About Us";

	@FindBy(xpath = "//div[@class='hero-img tilt-active']")
	WebElement appxheroimage;

	@FindBy(xpath = "//div[@class='btn-group']/a")
	WebElement getStartedBtn;

	@FindBy(xpath = "//h1[text()='The Best Minds In Optimization.']")
	WebElement thebestMIndsInOptimizationLable;
	String strbestMindsinoptimization = "The Best Minds In Optimization.";

	@FindBy(xpath = "//p[@class='hero-text']")
	WebElement thebestMindsinOptimizationLabletxt;
	String strbestMindsinOptimization = "At AppXcelerate Solutions we champion the seamless integration of efficient customer relationship management (CRM) with a spectrum of IT services, forming a holistic approach to elevate your business.";

	@FindBy(xpath = "//h1[text()='About Us']")
	WebElement aboutUsLable;
	String aboutusLable = "About Us";
	
	@FindBy(xpath = "//span[text()='WORK PROCESS']")
	WebElement workProcessLable;
	String strworkProcesslable = "WORK PROCESS";

	@FindBy(xpath = "//h2[text()='\"How Does It ']")
	WebElement howDoesItLable;
	String strhowDoesItlable = "How Does It ";

	@FindBy(xpath ="//h2[text()='Data Generated']")
	WebElement dataGeneratedLable;
	String strDataGeneratedLable ="Data Generated";

	@FindBy(xpath = "//p[text()='Generate Insights, Drive Growth.']")
	WebElement dataGeneratedLableText;
	String strdatageneratedLabletxt = "Generate Insights, Drive Growth.";

	@FindBy(xpath = "//h2[text()='Data Processing']")
	WebElement dataProcessingLable;
	String strdataprocessingLable = "Data Processing";

	@FindBy(xpath = "//p[contains(text(),'Efficient Data Processing Solutions.')]")
	WebElement dataProcessingLableText;
	String strdataprocessingLabletxt = "Efficient Data Processing Solutions.";
	
    @FindBy(xpath ="//h2[text()=' Data Stored']")
    WebElement dataStoredLable;
    String strDataStoredLable ="Data Stored";

	
	@FindBy(xpath = "//p[contains(text(),'Secure & Accessible Data Storage.')]")
	WebElement dataStoredLableText;
	String strdatastoredLabletxt = "Secure & Accessible Data Storage.";

	@FindBy(xpath = "//h2[text()=' Solutions']")
	WebElement solutionsLable;
	String strsolutionslable = "Solutions";

	@FindBy(xpath = "//p[contains(text(),'Custom CRM for Business Innovation.')]")
	WebElement solutionsLableText;
	String strsolutionslabletxt = "Custom CRM for Business Innovation.";

	@FindBy(xpath = "//div[text()='Technologies']")
	WebElement technoligiesLable;

	@FindBy(xpath = "//h1[text()='Technologies']")
	WebElement technologiesTittle;

	@FindBy(xpath = "//div[@class=' justify-content-lg-between justify-content-center align-items-center']//span[@class='sub-title']")
	WebElement ourTechnologies;
	String strourTechnologieslable = "OUR TECHNOLOGIES";

	@FindBy(xpath = "//h5[contains(text(),'Succeed Now And Be Ready For Tomorrow By Using Next Generation Digital Technologies.')]")
	WebElement technoligiesLableTxt;
	String strTechnologiesLableTxt = "Succeed Now And Be Ready For Tomorrow By Using Next Generation Digital Technologies.";

	@FindBy(xpath = "//p[contains(text(),'We harness the potential of digital technologies')]")
	WebElement technoligiesLableText;
	String strTechnoligiesLableText = "We harness the potential of digital technologies to allow organizations to get the most from our intellectual capital to Succeed Now and Be Ready For Tomorrow. Our deep knowledge of the business process enables us to use a blend of technical disciplines to elegantly solve a host of issues enterprises face for a great return on investment.";

	@FindBy(xpath = "//div[@class='swiper-slide swiper-slide-active']//img[@alt='blog image']")
	WebElement generativeAiImage;

	@FindBy(xpath = "//a[text()='Generative AI']")
	WebElement generativeAiLableBtn;

	@FindBy(xpath = "//p[contains(text(),'AppXcelerate Solutions provides a Artificial intelligence (AI), sometimes referred ')]")
	WebElement generativeAiText;
	String strGenerativeAiText ="AppXcelerate Solutions provides a Artificial intelligence (AI), sometimes referred to as machine intelligence, involves machines augmenting human intelligence to complement the natural intelligence displayed by humans.The term \"artificial intelligence\" is commonly used to";
	@FindBy(xpath = "//p[contains(text(),'AppXcelerate Solutions provides a Artificial intelligence (AI)')]//following-sibling::a")
	WebElement generativeAiTextReadMoreBtn;
	
	@FindBy(xpath ="//li[text()='Generative AI ']")
	WebElement generativeAILable;
	String strGenerativeAiLable ="Generative AI";

	@FindBy(xpath = "//div[@class='swiper-slide swiper-slide-next']//img[@alt='blog image']")
	WebElement roboticAutomationImage;

	@FindBy(xpath = "//h3[@class='box-title']//a[contains(text(),'Robotic Automation')]")
	WebElement roboticAutomationLableBtn;

	@FindBy(xpath = "//p[contains(text(),'AppXcelerate Solutions knowledge and experience in Robotic Automation')]")
	WebElement roboticAutomationText;
	String strRooticAutomationText ="AppXcelerate Solutions knowledge and experience in Robotic Automation helps organizations to understand what RPA & RDA is, what value RPA & RDA can deliver, and how to apply RPA & RDA.";

	@FindBy(xpath = "//p[contains(text(),'AppXcelerate Solutions knowledge and experience in Robotic Automation')]//following-sibling::a")
	WebElement roboticAutomationTextReadMoreBtn;
	
	@FindBy(xpath ="//li[text()='Robotic Automation (RPA & RDA). ']")
	WebElement roboticAutomatoinLable;
	String strRoboticAutomationLable ="Robotic Automation (RPA & RDA).";

	@FindBy(xpath = "//div[@aria-label='3 / 4']//img[@alt='blog image']")
	WebElement businessProcessManagementImage;

	@FindBy(xpath = "//h3[@class='box-title']//a[contains(text(),'Business Process Management (BPM / DPA)')]")
	WebElement businessProcessManagementLableBtn;

	@FindBy(xpath = "//p[contains(text(),'AppXcelerate Solutions has a breadth of knowledge and experience in Architecting')]")
	WebElement businessProcessManagementText;
	String strBusinessProcessManagementText ="AppXcelerate Solutions has a breadth of knowledge and experience in Architecting, Designing, Developing and Implementing Business Process Management (BPM).";
	
	@FindBy(xpath = "//p[contains(text(),'AppXcelerate Solutions has a breadth of knowledge and experience in Architecting')]//following-sibling::a")
	WebElement businessProcessManagementTextReadMoreBtn;
	
	@FindBy(xpath ="//li[text()='Business Process Management (BPM / DPA) ']")
	WebElement businessProcessManagementLable;
	String strBusinessProcessManagementLable ="Business Process Management (BPM / DPA)";

	@FindBy(xpath = "//div[@aria-label='4 / 4']//img[@alt='blog image']")
	WebElement apiAndMicroServicesImage;

	@FindBy(xpath = "//a[text()=' API and MicroServices']")
	WebElement apiAndMicroServicesLableBtn;

	@FindBy(xpath = "//div[@class='blog-content']//p[contains(text(),'AppXcelerate Solutions has vast knowledge and experience in ')]")
	WebElement apiAndMicroServicesText;
	String strApiAndMicroServicesText ="AppXcelerate Solutions has vast knowledge and experience in Service-oriented architecture Requirements, Principles, approaches, and governance. Service-oriented architecture (SOA) is a flexible set of design principles";
	
	@FindBy(xpath = "//div[@class='blog-content']//p[contains(text(),'AppXcelerate Solutions has vast knowledge and experience in ')]//following-sibling::a")
	WebElement apiAndMicroServicesTextReadMoreBtn;
	 
	@FindBy(xpath="//li[text()='API and MicroServices ']")
	WebElement apiAndMicroServicesLable;
	String strApiAndMicroServicesLable ="API and MicroServices";

	public Homepage(WebDriver driver) {  
		super(driver);     //to call the super class constructor in the sub class constructor//super call statement

		this.driver = driver;    // present driver we are initializaing with another driver
		PageFactory.initElements(driver, this); // initialialization of pageelment and page is nothing but web page 
	}

																																																																																																																																																																																																												
	public boolean homepagemethodsvalidation() {
				if (getstartedvalidation())
				if(aboutmorevalidation())
					if (workprocessvalidation())
						if(generativeaivalidation()) 
						  if(roboticautomationvalidation())
							  if(businessprocessmanagementvalidation())
								  if(apiandmicroservicesvalidation()) {
							logger.info("validated homePageMethods successfully  is passed");
							return true;
						} 
				return false;
	}

	public boolean getstartedvalidation() {
		try {
			if(displayelement(appxheroimage))
				if(displayelement(thebestMIndsInOptimizationLable))
				if(validatevalueinelement(thebestMIndsInOptimizationLable,strbestMindsinoptimization))
					if (validatevalueinelement(thebestMindsinOptimizationLabletxt,strbestMindsinOptimization))
						if (displayelement(getStartedBtn))
							if (Click(getStartedBtn))
								if (displayelement(aboutUsLable))
								   if(validatevalueinelement(aboutUsLable,aboutusLable))
								{
									logger.info("Displayed  getstarted on Homepage is passed");
									return true;

								}
} catch (Exception e) {
	logger.info("Displayed  getstarted on Homepage is failed " + e);
	logger.error(e);
}
return false;

	}

	public boolean aboutmorevalidation() {
		try {
								
									if (Click(home))
										if (displayelement(aboutappximage))
											if(displayelement(theBestMIndsInOptimizationLable))
											  if(validatevalueinelement(theBestMIndsInOptimizationLable,strBestmindsinoptimization))
												if(validatevalueinelement(theBestMindsinOptimizationLabletxt,strBestmindsinoptimizationtxt))
													if(scrollToElement(aboutMoreBtn))
													  if (displayelement(aboutMoreBtn))
														if (Click(aboutMoreBtn))
															if (displayelement(aboutUsTittle))
																if(validatevalueinelement(aboutUsTittle,aboutustittle))
																{
																logger.info("Displayed  aboutmore successfully on Homepage is passed");
																return true;

															}
		} catch (Exception e) {
			logger.info("Displayed   aboutmore successfully on Homepage is failed" + e);
			logger.error(e);
		}
		return false;

	}

	public boolean workprocessvalidation() {
		try {
			if (Click(home))
				if(scrollToElement(workProcessLable))
		          if(displayelement(workProcessLable))
		        	  if(validatevalueinelement(workProcessLable,strworkProcesslable))
					 if(displayelement(howDoesItLable))
					    if(displayelement(dataGeneratedLable))
					    	if(validatevalueinelement(dataGeneratedLable,strDataGeneratedLable))
						   if (validatevalueinelement(dataGeneratedLableText,strdatageneratedLabletxt))
							  if (displayelement(dataProcessingLable))
								  if(validatevalueinelement(dataProcessingLable,strdataprocessingLable))
							 	 if (validatevalueinelement(dataProcessingLableText,strdataprocessingLabletxt))
									  if(displayelement(dataStoredLable))
										  if(validatevalueinelement(dataStoredLable,strDataStoredLable))
									    if (validatevalueinelement(dataStoredLableText,strdatastoredLabletxt))
										   if (displayelement(solutionsLable))
											   if(validatevalueinelement(solutionsLable,strsolutionslable))
											   if (validatevalueinelement(solutionsLableText,strsolutionslabletxt)) {
											 logger.info("Displayed workprocess successfully on Homepage is passed");
								           return true;

													                                            }
		} catch (Exception e) {
			logger.info("Displayed  workprocess successfully on Homepage is failed" + e);
			logger.error(e);
		}
		return false;

	}

	public boolean generativeaivalidation() {
		try {

			if (Click(home))
				if(scrollToElement(ourTechnologies))
				if (displayelement(ourTechnologies))
					if (validatevalueinelement(technoligiesLableTxt,strTechnologiesLableTxt))
						if (validatevalueinelement(technoligiesLableText,strTechnoligiesLableText))
							if(scrollToElement(generativeAiImage))
							if (displayelement(generativeAiImage))
								if (displayelement(generativeAiLableBtn))
									if (displayelement(generativeAiText))
										if(validatevalueinelement(generativeAiText,strGenerativeAiText))
										if (displayelement(generativeAiTextReadMoreBtn))
									       if (Click(generativeAiTextReadMoreBtn))
											 if(displayelement(generativeAILable))
											   if(validatevalueinelement(generativeAILable,strGenerativeAiLable))
												 {
							logger.info("displayed generativeai successsfully on homepage is passed");
							return true;
						}} catch (Exception e) {
			                logger.info("displayed generativeai successsfully on homepage is failed" + e);
			                  logger.error(e);
	                            	}
		                          return false;
                             	}
	
	
	public boolean roboticautomationvalidation() {
		try {
			
						if (Click(home))
							if(scrollToElement(roboticAutomationImage))
						   if (displayelement(roboticAutomationImage))
								if (displayelement(roboticAutomationLableBtn))
									if (displayelement(roboticAutomationText))
										if(validatevalueinelement(roboticAutomationText,strRooticAutomationText))
										if(displayelement(roboticAutomationTextReadMoreBtn))
											if(Click(roboticAutomationTextReadMoreBtn)) 
												 if(displayelement(roboticAutomatoinLable)) 
												    if(validatevalueinelement(roboticAutomatoinLable,strRoboticAutomationLable)){
							logger.info("displayed roboticautomation successfully on homepage  is passed");
							return true;
						 } } catch (Exception e) {
						  logger.info("  displayed roboticautomation successfully on homepage is failed" + e);
					     logger.error(e);
						    }
						    return false;
					             }
												                  
	public boolean businessprocessmanagementvalidation() {
					try {
	                       if(Click(home))
	                    	  if( scrollToElement(businessProcessManagementImage))
							  if (displayelement(businessProcessManagementImage))
								 if (displayelement(businessProcessManagementLableBtn))
									 if (displayelement(businessProcessManagementText))
										 if(validatevalueinelement(businessProcessManagementText,strBusinessProcessManagementText))
										 if(displayelement(businessProcessManagementTextReadMoreBtn))
											 if(Click(businessProcessManagementTextReadMoreBtn))
												if(displayelement(businessProcessManagementLable))
												    if(validatevalueinelement(businessProcessManagementLable,strBusinessProcessManagementLable)){
							logger.info("displayed businessprocessmanagement successfully on homepage is passed");
							return true;
													}
						       } catch (Exception e) {
							   logger.info("displayed businessprocessmanagement successfully on homepage is failed" + e);
						          	logger.error(e);
						                      }
						             return false;
					                      }													    	 
																					    	 
	public boolean apiandmicroservicesvalidation() {
				try {
																					    	 
						if (Click(home))
							if(scrollToElement(apiAndMicroServicesImage))
						   if (displayelement(apiAndMicroServicesImage))
								if (displayelement(apiAndMicroServicesLableBtn))
									if (displayelement(apiAndMicroServicesText))
										if(validatevalueinelement(apiAndMicroServicesText,strApiAndMicroServicesText))
										if(displayelement(apiAndMicroServicesTextReadMoreBtn))
											if(Click(apiAndMicroServicesTextReadMoreBtn))
										    	if(displayelement(apiAndMicroServicesLable))
										    		if(validatevalueinelement(apiAndMicroServicesLable,strApiAndMicroServicesLable))
													 if(Click(home))
													     if (displayelement(home))
													         {
							 logger.info("Displayed apiAndMicroServices successfully on Homepage is Passed");
								 return true;
															}
						     } catch (Exception e) {
							   logger.info("displayed apiAndMicroServices successfully on homepage is failed" + e);
							    logger.error(e);
						               }
						           return false;
}
}