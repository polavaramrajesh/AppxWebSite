package base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HomeMethods extends SafeActions {
	
	
	
	
	public Homepage homepage;
	public WebDriver driver;
	private Logger Log = LogManager.getLogger(HomeMethods.class);

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
	String strBestmindsinoptimization = "The Best Minds In";

	@FindBy(xpath = "//p[@class='mt-n2 mb-30 text-center text-xl-start']")
	WebElement theBestMindsinOptimizationLabletxt;
	String strBestmindsinoptimizationtxt = "At AppXcelerate Solutions we champion the seamless integration of efficient customer relationship management (CRM) with a spectrum of IT services, forming a holistic approach to elevate your business";

	@FindBy(xpath = "//div[@class='achivement-box-area filter-active-cat1']//a[@class='th-btn']")
	WebElement aboutMoreBtn;

	@FindBy(xpath = "//h1[text()='About Us']")
	WebElement aboutUsTittle;
	String aboutustittle = "About Us";

	@FindBy(xpath = "//div[@class='hero-img tilt-active']")
	WebElement appxheroimage;

	@FindBy(xpath = "//div[@class='btn-group']")
	WebElement getStartedBtn;

	@FindBy(xpath = "//h1[text()='The Best Minds In Optimization.']")
	WebElement thebestMIndsInOptimizationLable;
	String strbestMindsinoptimization = "The Best Minds In Optimization.";

	@FindBy(xpath = "//p[@class='hero-text']")
	WebElement thebestMindsinOptimizationLabletxt;
	String strbestMindsinOptimization = "At AppXcelerate Solutions we champion the seamless integration of efficient customer relationship management (CRM) with a spectrum of IT services, forming a holistic approach to elevate your business. As trusted CRM specialists, we offer a comprehensive suite of solutions tailored to not only enhance your customer relationships but also propel your business into the realms of digital transformation and innovation.";

	@FindBy(xpath = "//div[text()='ABOUT US']")
	WebElement aboutUs;
	String straboutus = "ABOUT US";

	@FindBy(xpath = "//div[text()='industriesLable']")
	WebElement industriesLable;
	String strindustries = "industriesLable";

	@FindBy(xpath = "//h5[contains(text(),' We Design Optimized And Efficient Digital')]")
	WebElement industriesLabletext;
	String strindutriestxt = "We Design Optimized And Efficient Digital";

	@FindBy(xpath = "//p[contains(text(),'We offer comprehensive and highly customizable')]")
	WebElement industriesLabletxt;
	String strindustriesLableTxt = "We offer comprehensive and highly customizable";

	@FindBy(xpath = "//div[@class='swiper-slide swiper-slide-active']//div[@class='project-grid_img']")
	// @FindBy(xpath("//div[@class='swiper-slide
	// swiper-slide-active']//img[@alt='project image']")
	WebElement healthAndLifescienceImage;

	@FindBy(xpath = "//h3[@class='box-title']//a[contains(text(),'Health Care and Life')]")
	WebElement healthAndLifescienceLable;

	@FindBy(xpath = "//p[contains(text(),'AppXcelerate Solutions deep experience in the healthcare')]")
	WebElement healthAndLifescienceLableTxt;
	String strhealthcaretxt = "AppXcelerate Solutions deep experience in the healthcare";

	@FindBy(xpath = "//p[contains(text(),'AppXcelerate Solutions deep experience in the heal')]//following-sibling::a")
	WebElement healthcareAndLifeScienceReadMoreBtn;

	@FindBy(xpath = "//div[@class='swiper-slide swiper-slide-next']//img[@alt='project image']")
	// @findBy(xpath="//div[@class='swiper-slide
	// swiper-slide-next']//div[@class='project-grid_img']
	WebElement governmentImage;

	@FindBy(xpath = "//a[text()='Government']")
	WebElement governmentLableBtn;

	@FindBy(xpath = "//p[contains(text(),'AppXcelerate Solutions Insurance Practice brings to its clients solutions')]")
	WebElement governmentText;
	String strgovernmenttxt = "AppXcelerate Solutions Insurance Practice brings to its clients solutions";

	@FindBy(xpath = "//p[contains(text(),'AppXcelerate Solutions Insurance Practice brings to its clients solutions')]//following-sibling::a")
	WebElement governmentTextReadMoreBtn;

	@FindBy(xpath = "//div[@aria-label='3 / 4']//img[@alt='project image']")
	// @FindBy(xpath="//div[@aria-label='3 / 4']//div[@class='project-grid_img']")
	WebElement bankingAndFinanceImage;

	@FindBy(xpath = "//a[text()='Banking and Finance']")
	WebElement btnBankingAndFinanceLable;

	@FindBy(xpath = "//p[contains(text(),'AppXcelerate Solutions Banking and Finance ')]")
	WebElement bankingAndFinanceTxt;
	String strbankingandfinancetxt = "AppXcelerate Solutions Banking and Finance ";

	@FindBy(xpath = "//p[contains(text(),'AppXcelerate Solutions Banking and Finance ')]//following-sibling::a")
	WebElement strbankingAndfInanceTextReadMoreBtn;

	@FindBy(xpath = "//div[@aria-label='4 / 4']//img[@alt='project image']")
	// @FindBy(xpath="//div[@aria-label='4 / 4']//div[@class='project-grid_img']")
	WebElement insuranceImage;

	@FindBy(xpath = "//a[text()='Insurance']")
	WebElement insuranceLableBtn;

	@FindBy(xpath = "//p[@class='project-grid_text'][contains(text(),'AppXcelerate Solutions has vast knowledge')]")
	WebElement insuranceText;
	String strinsurancetxt = "AppXcelerate Solutions has vast knowledge";

	@FindBy(xpath = "//p[@class='project-grid_text'][contains(text(),'AppXcelerate Solutions has vast knowledge')]//following-sibling::a")
	WebElement insuranceTextReadMoreBtn;

	@FindBy(xpath = "//span[text()='WORK PROCESS']")
	WebElement workProcessLable;
	String strworkProcesslable = "WORK PROCESS";

	@FindBy(xpath = "//h2[text()='\"How Does It ']")
	WebElement howDoesItLable;
	String strhowDoesItlable = "How Does It";

	@FindBy(xpath = "//h2[text()='Data Generated']")
	WebElement dataGeneratedLable;
	String strdatageneratedLable = "Data Generated";

	@FindBy(xpath = "//p[text()='Generate Insights, Drive Growth.']")
	WebElement dataGeneratedLableText;
	String strdatageneratedLabletxt = "Generate Insights, Drive Growth.";

	@FindBy(xpath = "//h2[text()='Data Processing']")
	WebElement dataProcessingLable;
	String strdataprocessingLable = "Data Processing";

	@FindBy(xpath = "//p[contains(text(),'Efficient Data Processing Solutions')]")
	WebElement dataProcessingLableText;
	String strdataprocessingLabletxt = "Efficient Data Processing Solutions";

	@FindBy(xpath = "//h2[text()=' Data Stored']")
	WebElement dataStoredLable;
	String strdatastoredLable = "Data Stored";

	@FindBy(xpath = "//p[contains(text(),' Secure & Accessible Data Storage')]")
	WebElement dataStoredLableText;
	String strdatastoredLabletxt = "Secure & Accessible Data Storage";

	@FindBy(xpath = "//h2[text()=' Solutions']")
	WebElement solutionsLable;
	String strsolutionslable = "Solutions";

	@FindBy(xpath = "//p[contains(text(),' Custom CRM for Business Innovation')]")
	WebElement solutionsLableText;
	String strsolutionslabletxt = "Custom CRM for Business Innovation";

	@FindBy(xpath = "//div[@class='col-lg-6 col-md-7 col-sm-10 px-xl-4']//span[@class='sub-title']")
	WebElement ourServicesLable;
	String strourserviceLable = "OUR SERVICES";

	@FindBy(xpath = "//h5[contains(text(),'Launching Into The Responsive Business Services')]")
	WebElement ourServicesLableText;
	String strourserviceLabletxt = "Launching Into The Responsive Business Services";

	@FindBy(xpath = "//p[contains(text(),'Our services are specifically designed')]")
	WebElement ourServicesLableTxt;
	String strourservicelableTxt = "Our services are specifically designed";

	@FindBy(xpath = "//h1[text()='Services']")
	WebElement servicesLable;
	String strserviceLabletxt = "Services";

	@FindBy(xpath = "//h3[@class='box-title']//a[contains(text(),'Customer Relationship')]")
	WebElement customerRelationshipManagementLableBtn;

	@FindBy(xpath = "//p[contains(text(),'At AppXcelerate Solutions, we believe in the power')]")
	WebElement customerRelationshipManagementLabletxt;
	String strcustomerrelationshipManagementLabletxt = "At AppXcelerate Solutions, we believe in the power";

	@FindBy(xpath = "//p[contains(text(),'At AppXcelerate Solutions, we believe in the power')]//following-sibling::a")
	WebElement customerRelationshipManagementTextReadMore;

	@FindBy(xpath = "//a[text()=' Digital Transformation']")
	WebElement digitalTransformationLableBtn;

	@FindBy(xpath = "//p[contains(text(),' AppXcelerate Solutions provides a digital transformation journey')]")
	WebElement digitalTransformationLableText;
	String strdigitaltransformationLableText = "AppXcelerate Solutions provides a digital transformation journey";

	@FindBy(xpath = "//p[contains(text(),' AppXcelerate Solutions provides a digital transformation journey')]//following-sibling::a")
	WebElement digitalTransformationTextReadMorebtn;

	@FindBy(xpath = "//a[text()=' App / Platform Development']")
	WebElement appPlatformDevelopmentLablebtn;

	@FindBy(xpath = "//p[contains(text(),'AppXcelerate Solutions offers customized')]")
	WebElement appPlatformDevelopmentLableText;
	String strappPlatformdevelopmentLableText = "AppXcelerate Solutions offers customized";

	@FindBy(xpath = "//p[contains(text(),'AppXcelerate Solutions offers customized')]//following-sibling::a")
	WebElement appPlatformDevelopmentTextReadMorebtn;

	@FindBy(xpath = "//a[text()=' SWAT/Triage']")
	WebElement swatTriageLablebtn;

	@FindBy(xpath = "//p[contains(text(),'AppXcelerate Solutions is your System in jeopardy')]")
	WebElement swatTriageLableText;
	String strswattriageLableText = "AppXcelerate Solutions is your System in jeopardy";

	@FindBy(xpath = "//p[contains(text(),'AppXcelerate Solutions is your System in jeopardy')]//following-sibling::a")
	WebElement swatTriageTextReadMoreBtn;

	@FindBy(xpath = "//a[text()=' System Upgrades']")
	WebElement systemUpgradesLableBtn;

	@FindBy(xpath = "//p[contains(text(),'AppXcelerate Solutions help you to update to the latest version ')]")
	WebElement systemUpgradesLableText;
	String strsystemupgradesLableText = "AppXcelerate Solutions help you to update to the latest version";

	@FindBy(xpath = "//p[contains(text(),'AppXcelerate Solutions help you to update to the latest version ')]//following-sibling::a")
	WebElement systemUpgradesTextReadMoreBtn;

	@FindBy(xpath = "//a[text()=' Center of Excellence']")
	WebElement centerOfExcellenceLableBtn;

	@FindBy(xpath = "//p[contains(text(),'AppXcelerate Solutions builds and operates both business and')]")
	WebElement centerOfExcellenceLableText;
	String strcenterofExcellenceLableText = "AppXcelerate Solutions builds and operates both business and";

	@FindBy(xpath = "//p[contains(text(),'AppXcelerate Solutions builds and operates both business')]//following-sibling::a")
	WebElement centerOfExcellenceTextReadMoreBtn;

	@FindBy(xpath = "//a[text()=' Application Testing']")
	WebElement applicationTestingLableBtn;

	@FindBy(xpath = "//p[contains(text(),'AppXcelerate Solutions is ready to facilitate your business continuity')]")
	WebElement applicationTestingLableText;
	String strapplicationtestingLableText = "AppXcelerate Solutions is ready to facilitate your business continuity";

	@FindBy(xpath = "//p[contains(text(),'AppXcelerate Solutions is ready to facilitate your business continuity')]//following-sibling::a")
	WebElement applicationTestingTextReadMoreBtn;

	@FindBy(xpath = "//a[text()='Application Maintenance Services (AMS)']")
	WebElement applicationMaintenanceServicesLableBtn;

	@FindBy(xpath = "//p[contains(text(),'AppXcelerate Solutions have a proven track record')]")
	WebElement applicationMaintenanceServicesLableText;
	String strapplicationmaintenanceServicesLableText = "AppXcelerate Solutions have a proven track record";

	@FindBy(xpath = "//p[contains(text(),'AppXcelerate Solutions have a proven track record')]//following-sibling::a")
	WebElement applicationMaintenanceServicesTextReadMoreBtn;

	@FindBy(xpath = "//a[text()='ERP Implementation']")
	WebElement erpImplementationLableBtn;

	@FindBy(xpath = "//p[contains(text(),'AppXcelerate Solutions future is ERP')]")
	WebElement erpImplementationLableText;
	String strerpimplementationLableText = "AppXcelerate Solutions future is ERP";

	@FindBy(xpath = "//p[contains(text(),'AppXcelerate Solutions future is ERP')]//following-sibling::a")
	WebElement erpImplementationTextReadMoreBtn;

	@FindBy(xpath = "//a[text()='Managed Services']")
	WebElement managedServicesLableBtn;

	@FindBy(xpath = "//p[contains(text(),'AppXcelerate Solutions Managed Services offering revolutionizes platform management')]")
	WebElement managedServicesLableText;
	String strmanagedservicesLableText = "AppXcelerate Solutions Managed Services offering revolutionizes platform management";

	@FindBy(xpath = "//p[contains(text(),'AppXcelerate Solutions Managed Services offering revolutionizes platform management')]//following-sibling::a")
	WebElement managedServicesTextReadMorebtn;

	@FindBy(xpath = "//div[text()='Technologies']")
	WebElement technoligiesLable;

	@FindBy(xpath = "//h1[text()='Technologies']")
	WebElement technologiesTittle;

	@FindBy(xpath = "//div[@class=' justify-content-lg-between justify-content-center align-items-center']//span[@class='sub-title']")
	WebElement ourTechnologies;
	String strourTechnologieslable = "OUR TECHNOLOGIES";

	@FindBy(xpath = "//h5[contains(text(),'Succeed Now And Be Ready For Tomorrow')]")
	WebElement technoligieslableTxt;
	String strtechnologieslabletxt = "Succeed Now And Be Ready For Tomorrow";

	@FindBy(xpath = "//p[contains(text(),'We harness the potential of digital technologies')]")
	WebElement technoligiesLableText;
	String strtechnoligiesLabletxt = "We harness the potential of digital technologies";

	@FindBy(xpath = "//div[@class='swiper-slide swiper-slide-active']//img[@alt='blog image']")
	WebElement generativeAiImage;

	@FindBy(xpath = "//a[text()='Generative AI']")
	WebElement generativeAiLableBtn;

	@FindBy(xpath = "//p[contains(text(),'AppXcelerate Solutions provides a Artificial intelligence (AI)')]")
	WebElement generativeAiText;
	String strgenerativeaiText = "AppXcelerate Solutions provides a Artificial intelligence (AI)";

	@FindBy(xpath = "//p[contains(text(),'AppXcelerate Solutions provides a Artificial intelligence (AI)')]//following-sibling::a")
	WebElement generativeAiTextReadMoreBtn;
	
	@FindBy(xpath ="//li[text()='Generative AI ']")
	WebElement generativeAILable;

	@FindBy(xpath = "//div[@class='swiper-slide swiper-slide-next']//img[@alt='blog image']")
	WebElement roboticAutomationImage;

	@FindBy(xpath = "//h3[@class='box-title']//a[contains(text(),'Robotic Automation')]")
	WebElement roboticAutomationLableBtn;

	@FindBy(xpath = "//p[contains(text(),'AppXcelerate Solutions knowledge and experience in Robotic Automation')]")
	WebElement roboticAutomationText;
	String strroboticautomationText = "AppXcelerate Solutions knowledge and experience in Robotic Automation";

	@FindBy(xpath = "//p[contains(text(),'AppXcelerate Solutions knowledge and experience in Robotic Automation')]//following-sibling::a")
	WebElement roboticAutomationTextReadMoreBtn;
	
	@FindBy(xpath ="//li[text()='Robotic Automation (RPA & RDA). ']")
	WebElement roboticAutomatoinLable;

	@FindBy(xpath = "//div[@aria-label='3 / 4']//img[@alt='blog image']")
	WebElement businessProcessManagementImage;

	@FindBy(xpath = "//h3[@class='box-title']//a[contains(text(),'Business Process Management (BPM / DPA)')]")
	WebElement businessProcessManagementLableBtn;

	@FindBy(xpath = "//p[contains(text(),'AppXcelerate Solutions has a breadth of knowledge and experience in Architecting')]")
	WebElement businessProcessManagementText;
	String strbusinessprocessManagementText = "AppXcelerate Solutions has a breadth of knowledge and experience in Architecting";

	@FindBy(xpath = "//p[contains(text(),'AppXcelerate Solutions has a breadth of knowledge and experience in Architecting')]//following-sibling::a")
	WebElement businessProcessManagementTextReadMoreBtn;
	
	@FindBy(xpath ="//li[text()='Business Process Management (BPM / DPA) ']")
	WebElement businessProcessManagementLable;

	@FindBy(xpath = "//div[@aria-label='4 / 4']//img[@alt='blog image']")
	WebElement apiAndMicroServicesImage;

	@FindBy(xpath = "//a[text()=' API and MicroServices']")
	WebElement apiAndMicroServicesLableBtn;

	@FindBy(xpath = "//div[@class='blog-content']//p[contains(text(),'AppXcelerate Solutions has vast knowledge and experience in ')]")
	WebElement apiAndMicroServicesText;
	String strapiAndmicroServicesText = "AppXcelerate Solutions has vast knowledge and experience in";

	@FindBy(xpath = "//div[@class='blog-content']//p[contains(text(),'AppXcelerate Solutions has vast knowledge and experience in ')]//following-sibling::a")
	WebElement apiAndMicroServicesTextReadMoreBtn;
	 
	@FindBy(xpath="//li[text()='API and MicroServices ']")
	WebElement apiAndMicroServicesLable;

	public HomeMethods(WebDriver driver) {
		super (driver);

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean validateHomepage() {
		try {

			if (displayelement(home))

				if (displayelement(enquireBoxBtn))
					if (Click(enquireBoxBtn))
						if (displayelement(contactUsTittle))
							if (Click(home))
								if (displayelement(headerLogoBtn))
									if (Click(headerLogoBtn))
										if (displayelement(aboutappximage))
											if(validatevalueinelement(theBestMIndsInOptimizationLable,strBestmindsinoptimization))
												if(validatevalueinelement(theBestMindsinOptimizationLabletxt,strBestmindsinoptimizationtxt))
													if (displayelement(getStartedBtn))
														if (Click(getStartedBtn))
															if (displayelement(aboutUsTittle))
																if (Click(home))
																	if (displayelement(appxheroimage))
																		if(validatevalueinelement(thebestMIndsInOptimizationLable,strbestMindsinoptimization))
																			if (validatevalueinelement(thebestMindsinOptimizationLabletxt,strbestMindsinOptimization))
																				if (displayelement(aboutMoreBtn))
																					if (Click(aboutMoreBtn))
																						if (displayelement(aboutUsTittle))
																							if (Click(home))
																								if (validatevalueinelement(workProcessLable,strworkProcesslable))
																									if (validatevalueinelement(howDoesItLable,strhowDoesItlable))
																										if (displayelement(dataGeneratedLable))
																											if (validatevalueinelement(dataGeneratedLableText,strdatageneratedLabletxt))
																												if (displayelement(dataProcessingLable))
																													if (validatevalueinelement(dataProcessingLableText,strdataprocessingLabletxt))
																														if (displayelement(dataStoredLable))
																															if (validatevalueinelement(dataStoredLableText,strdatastoredLabletxt))
																																if (displayelement(solutionsLable))
																																	if (validatevalueinelement(solutionsLableText,strsolutionslabletxt))
																																      if (Click(home))
																																			if (displayelement(ourTechnologies))
																																				if (validatevalueinelement(technoligieslableTxt,strtechnoligiesLabletxt))
																																					if (validatevalueinelement(technoligiesLableText,strtechnologieslabletxt))
																																						if (displayelement(generativeAiImage))
																																							if (displayelement(generativeAiLableBtn))
																																								if (validatevalueinelement(generativeAiText,strgenerativeaiText))
																																									if (displayelement(generativeAiTextReadMoreBtn))
																																													if (Click(generativeAiTextReadMoreBtn))
																																														if(Click(generativeAILable))
																																															if (Click(home))
																																																if (displayelement(roboticAutomationImage))
																																																	if (displayelement(roboticAutomationLableBtn))
																																																		if (validatevalueinelement(roboticAutomationText,strroboticautomationText))
																																																			if(displayelement(roboticAutomationTextReadMoreBtn))
																																																				if(Click(roboticAutomationTextReadMoreBtn))
																																																					if(displayelement(roboticAutomatoinLable))
																																																			      if(Click(home))
																																																			if (displayelement(businessProcessManagementImage))
																																																				if (displayelement(businessProcessManagementLableBtn))
																																																					if (validatevalueinelement(businessProcessManagementText,strbusinessprocessManagementText))
																																																				     if(displayelement(businessProcessManagementTextReadMoreBtn))
																																																				    	 if(Click(businessProcessManagementTextReadMoreBtn))
																																																				    		 if(displayelement(businessProcessManagementLable))
																																																						if (Click(home))
																																																							if (displayelement(apiAndMicroServicesImage))
																																																								if (displayelement(apiAndMicroServicesLableBtn))
																																																									if (validatevalueinelement(apiAndMicroServicesText,strapiAndmicroServicesText))
																																																										if(displayelement(apiAndMicroServicesTextReadMoreBtn))
																																																											if(Click(apiAndMicroServicesTextReadMoreBtn))
																																																												if(displayelement(apiAndMicroServicesLable))
																																																										if(Click(home))
																																																										             if (displayelement(home))
																																																																							 {
																																																																							
																																																																							Log.info("displayed homepage successfully  is Passed");		
																																																																							return true;
																																																																						}} catch(Exception e) {
																																																																							Log.info("displayed homepage successfully is failed"+e);
																																																																							Log.error(e);
																																																																						} return false;
	}

}
