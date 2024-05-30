package appxwebsite;

import org.jline.utils.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import lombok.extern.slf4j.Slf4j;
import sychronization.ActionMethods;

@Slf4j
public class Homepage extends ActionMethods {
	public WebDriver driver;
	public Actions actions;

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
	String bestmindsinoptimization = "The Best Minds In";

	@FindBy(xpath = "//p[@class='mt-n2 mb-30 text-center text-xl-start']")
	WebElement theBestMindsinOptimizationLabletxt;
	String bestmindsinoptimizationtxt = "At AppXcelerate Solutions we champion the seamless integration of efficient customer relationship management (CRM) with a spectrum of IT services, forming a holistic approach to elevate your business";

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
	String bestMindsinoptimization = "The Best Minds In Optimization.";

	@FindBy(xpath = "//p[@class='hero-text']")
	WebElement thebestMindsinOptimizationLabletxt;
	String bestMindsinOptimization = "At AppXcelerate Solutions we champion the seamless integration of efficient customer relationship management (CRM) with a spectrum of IT services, forming a holistic approach to elevate your business. As trusted CRM specialists, we offer a comprehensive suite of solutions tailored to not only enhance your customer relationships but also propel your business into the realms of digital transformation and innovation.";

	@FindBy(xpath = "//div[text()='ABOUT US']")
	WebElement aboutUs;
	String about = "ABOUT US";

	@FindBy(xpath = "//h1[text()='Industries']")
	WebElement industries;

	@FindBy(xpath = "//div[@class='title-area text-center']//div[text()='Industries']")
	WebElement industriesLable;

	@FindBy(xpath = "//h5[contains(text(),'We Design Optimized And Efficient Digital Environments To Future-Proof Your Business.')]")
	WebElement industriesLabletext;
	String indutriestxt = "We Design Optimized And Efficient Digital Environments To Future-Proof Your Business.";

	@FindBy(xpath = "//p[contains(text(),'We offer comprehensive and highly customizable digital solutions for various industries to Increase the')]")
	WebElement industriesLabletxt;
	String industriesLableTxt = "We offer comprehensive and highly customizable digital solutions for various industries to Increase the speed and agility of your organization to Future-Proof your business.";

	@FindBy(xpath = "//div[@class='swiper-slide swiper-slide-active']//div[@class='project-grid_img']")
	WebElement healthAndLifescienceImage;

	@FindBy(xpath = "//h3[@class='box-title']//a[contains(text(),'Health Care and Life')]")
	WebElement healthAndLifescienceLable;

	@FindBy(xpath = "//p[contains(text(),'AppXcelerate Solutions deep experience in the healthcare')]")
	WebElement healthAndLifescienceLableTxt;
	String healthcaretxt = "AppXcelerate Solutions deep experience in the healthcare";

	@FindBy(xpath = "//p[contains(text(),'AppXcelerate Solutions deep experience in the heal')]//following-sibling::a[text()='Read More']")
	WebElement healthcareAndLifeScienceReadMoreBtn;

	@FindBy(xpath = "//li[text()=' Health Care and Life Sciences']")
	WebElement healthCareandLifeSciencesLable;

	@FindBy(xpath = "//div[@class='swiper-slide swiper-slide-next']//img[@alt='project image']")
	// @findBy(xpath="//div[@class='swiper-slide
	// swiper-slide-next']//div[@class='project-grid_img']
	WebElement governmentImage;

	@FindBy(xpath = "//h3[@class='box-title']/a[text()='Government']")
	WebElement governmentLableBtn;

	@FindBy(xpath = "//li[text()=' Government']")
	WebElement GovernmentLable;

	@FindBy(xpath = "//p[contains(text(),'AppXcelerate Solutions Insurance Practice brings to its clients solutions')]")
	WebElement governmentText;
	String governmenttxt = "AppXcelerate Solutions Insurance Practice brings to its clients solutions to ensure high value creation and further growth by analyzing the dynamics of the insurance industry .";

	@FindBy(xpath = "//p[contains(text(),'AppXcelerate Solutions Insurance Practice brings to its clients solutions')]//following-sibling::a")
	WebElement governmentTextReadMoreBtn;

	@FindBy(xpath = "//li[text()='Banking and Finance']")
	WebElement BankingandFinanceLable;

	@FindBy(xpath = "//div[@aria-label='3 / 4']//img[@alt='project image']")
	// @FindBy(xpath="//div[@aria-label='3 / 4']//div[@class='project-grid_img']")
	WebElement bankingAndFinanceImage;

	@FindBy(xpath = "//a[text()='Banking and Finance']")
	WebElement bankingAndFinanceLableBtn;

	@FindBy(xpath = "//p[contains(text(),'AppXcelerate Solutions Banking and Finance ')]")
	WebElement bankingAndFinanceTxt;
	String bankingandfinancetxt = "AppXcelerate Solutions Banking and Finance practice works with leading financial institutions around the world to improve their competitive advantage during these challenging times.";

	@FindBy(xpath = "//p[contains(text(),'AppXcelerate Solutions Banking and Finance ')]//following-sibling::a")
	WebElement bankingAndfInanceTextReadMoreBtn;

	@FindBy(xpath = "//li[text()='Banking and Finance']")
	WebElement bankingandFinanceLable;

	@FindBy(xpath = "//div[@aria-label='4 / 4']//img[@alt='project image']")
	// @FindBy(xpath="//div[@aria-label='4 / 4']//div[@class='project-grid_img']")
	WebElement insuranceImage;

	@FindBy(xpath = "//a[text()='Insurance']")
	WebElement insuranceLableBtn;

	@FindBy(xpath = "//p[@class='project-grid_text'][contains(text(),'AppXcelerate Solutions has vast knowledge')]")
	WebElement insuranceText;
	String insurancetxt = "AppXcelerate Solutions has vast knowledge and experience in Service-oriented architecture Requirements, Principles, approaches, and governance. Service-oriented architecture (SOA).";

	@FindBy(xpath = "//p[@class='project-grid_text'][contains(text(),'AppXcelerate Solutions has vast knowledge')]//following-sibling::a")
	WebElement insuranceTextReadMoreBtn;

	@FindBy(xpath = "//li[text()=' Insurance']")
	WebElement InsuranceLable;

	@FindBy(xpath = "//span[text()='WORK PROCESS']")
	WebElement workProcessLable;
	String workProcesslable = "WORK PROCESS";

	@FindBy(xpath = "//h2[text()='\"How Does It ']")
	WebElement howDoesItLable;
	String howDoesItlable = "How Does It";

	@FindBy(xpath = "//h2[text()='Data Generated']")
	WebElement dataGeneratedLable;
	String datageneratedLable = "Data Generated";

	@FindBy(xpath = "//p[text()='Generate Insights, Drive Growth.']")
	WebElement dataGeneratedLableText;
	String datageneratedLabletxt = "Generate Insights, Drive Growth.";

	@FindBy(xpath = "//h2[text()='Data Processing']")
	WebElement dataProcessingLable;
	String dataprocessingLable = "Data Processing";

	@FindBy(xpath = "//p[contains(text(),'Efficient Data Processing Solutions')]")
	WebElement dataProcessingLableText;
	String dataprocessingLabletxt = "Efficient Data Processing Solutions";

	@FindBy(xpath = "//h2[text()=' Data Stored']")
	WebElement dataStoredLable;
	String datastoredLable = "Data Stored";

	@FindBy(xpath = "//p[contains(text(),' Secure & Accessible Data Storage')]")
	WebElement dataStoredLableText;
	String datastoredLabletxt = "Secure & Accessible Data Storage";

	@FindBy(xpath = "//h2[text()=' Solutions']")
	WebElement solutionsLable;
	String solutionslable = "Solutions";

	@FindBy(xpath = "//p[contains(text(),' Custom CRM for Business Innovation')]")
	WebElement solutionsLableText;
	String solutionslabletxt = "Custom CRM for Business Innovation";

	@FindBy(xpath = "//div[@class='col-lg-6 col-md-7 col-sm-10 px-xl-4']//span[@class='sub-title']")
	WebElement ourServicesLable;

	@FindBy(xpath = "//h5[contains(text(),'Launching Into The Responsive Business Services')]")
	WebElement ourServicesLableText;
	String ourserviceLabletxt = "Launching Into The Responsive Business Services To Maximize Operational Efficiency.";

	@FindBy(xpath = "//p[contains(text(),'Our services are specifically designed')]")
	WebElement ourServicesLableTxt;
	String ourservicelableTxt = "Our services are specifically designed to Maximize Operational Efficiency by improving the productivity of your organization. Our deep understanding and expertise of the entire process lifecycle brings profound improvements to meet the Current Challenges faster and adapt instantly for the Future.";

	@FindBy(xpath = "//h1[text()='Services']")
	WebElement servicesLable;
	String serviceLabletxt = "Services";

	@FindBy(xpath = "//h3[@class='box-title']//a[contains(text(),'Customer Relationship')]")
	WebElement customerRelationshipManagementLableBtn;

	@FindBy(xpath = "//p[contains(text(),'At AppXcelerate Solutions, we believe in the power')]")
	WebElement customerRelationshipManagementLabletxt;
	String customerrelationshipManagementLabletxt = "At AppXcelerate Solutions, we believe in the power of seamless and efficient customer relationship management (CRM). As your trusted CRM specialists,";

	@FindBy(xpath = "//p[contains(text(),'At AppXcelerate Solutions, we believe in the power')]//following-sibling::a")
	WebElement customerRelationshipManagementreadMorebtn;

	@FindBy(xpath = "//li[text()='Customer Relationship Management(CRM) ']")
	WebElement CustomerRelationshipManagement;

	@FindBy(xpath = "//a[text()=' Digital Transformation']")
	WebElement digitalTransformationLableBtn;

	@FindBy(xpath = "//p[contains(text(),' AppXcelerate Solutions provides a digital transformation journey')]")
	WebElement digitalTransformationLableText;
	String digitaltransformationLableText = "AppXcelerate Solutions provides a digital transformation journey with a staged approach and a clear roadmap, involving a variety of stakeholders.";

	@FindBy(xpath = "//p[contains(text(),' AppXcelerate Solutions provides a digital transformation journey')]//following-sibling::a")
	WebElement digitalTransformationTextReadMorebtn;

	@FindBy(xpath = "//li[text()='Digital Transformation']")
	WebElement DigitalTransformation;

	@FindBy(xpath = "//a[text()=' App / Platform Development']")
	WebElement appPlatformDevelopmentLablebtn;

	@FindBy(xpath = "//p[contains(text(),'AppXcelerate Solutions offers customized')]")
	WebElement appPlatformDevelopmentLableText;
	String appPlatformdevelopmentLableText = "AppXcelerate Solutions offers customized, innovative, and affordable Design & Development services. AppXcelerate Solutions offers custom application.";

	@FindBy(xpath = "//p[contains(text(),'AppXcelerate Solutions offers customized')]//following-sibling::a")
	WebElement appPlatformDevelopmentTextReadMorebtn;

	@FindBy(xpath = "//li[text()='App / Platform Development ']")
	WebElement AppPlatformDevelopment;

	@FindBy(xpath = "//a[text()=' SWAT/Triage']")
	WebElement swatTriageLablebtn;

	@FindBy(xpath = "//p[contains(text(),'AppXcelerate Solutions is your System in jeopardy')]")
	WebElement swatTriageLableText;
	String swattriageLableText = "AppXcelerate Solutions is your System in jeopardy and need immediate attention? We will “Get in there and fix it” by bringing it immediately to the \"Emergency.";

	@FindBy(xpath = "//p[contains(text(),'AppXcelerate Solutions is your System in jeopardy')]//following-sibling::a")
	WebElement swatTriageTextReadMoreBtn;

	@FindBy(xpath = "//li[text()='SWAT/Triage ']")
	WebElement SWATTriage;

	@FindBy(xpath = "//a[text()=' System Upgrades']")
	WebElement systemUpgradesLableBtn;

	@FindBy(xpath = "//p[contains(text(),'AppXcelerate Solutions help you to update to the latest version ')]")
	WebElement systemUpgradesLableText;
	String systemupgradesLableText = "AppXcelerate Solutions help you to update to the latest version and leverage the latest capabilities Stay current with frequently lightweight application updates";

	@FindBy(xpath = "//p[contains(text(),'AppXcelerate Solutions help you to update to the latest version ')]//following-sibling::a")
	WebElement systemUpgradesTextReadMoreBtn;

	@FindBy(xpath = "//li[text()='System Upgrades ']")
	WebElement SystemUpgrades;

	@FindBy(xpath = "//a[text()=' Center of Excellence']")
	WebElement centerOfExcellenceLableBtn;

	@FindBy(xpath = "//p[contains(text(),'AppXcelerate Solutions builds and operates both business and')]")
	WebElement centerOfExcellenceLableText;
	String centerofExcellenceLableText = "AppXcelerate Solutions builds and operates both business and technology Centers of Excellence (CoE). The lack of a cross-functional team that.";

	@FindBy(xpath = "//p[contains(text(),'AppXcelerate Solutions builds and operates both business')]//following-sibling::a")
	WebElement centerOfExcellenceTextReadMoreBtn;

	@FindBy(xpath = "//li[text()='Center Of Excellence (COE) ']")
	WebElement CenterOfExcellence;

	@FindBy(xpath = "//a[text()=' Application Testing']")
	WebElement applicationTestingLableBtn;

	@FindBy(xpath = "//p[contains(text(),'AppXcelerate Solutions is ready to facilitate your business continuity')]")
	WebElement applicationTestingLableText;
	String applicationtestingLableText = "AppXcelerate Solutions is ready to facilitate your business continuity with proven experience in software quality analysis services. Our Quality Analysts.";

	@FindBy(xpath = "//p[contains(text(),'AppXcelerate Solutions is ready to facilitate your business continuity')]//following-sibling::a")
	WebElement applicationTestingTextReadMoreBtn;

	@FindBy(xpath = "//li[text()='Application Testing ']")
	WebElement ApplicationTesting;

	@FindBy(xpath = "//a[text()='Application Maintenance Services (AMS)']")
	WebElement applicationMaintenanceServicesLableBtn;

	@FindBy(xpath = "//p[contains(text(),'AppXcelerate Solutions have a proven track record')]")
	WebElement applicationMaintenanceServicesLableText;
	String applicationmaintenanceServicesLableText = "AppXcelerate Solutions have a proven track record in managing applications and providing comprehensive maintenance services to our customers at AppXcelerate Solutions.";

	@FindBy(xpath = "//p[contains(text(),'AppXcelerate Solutions have a proven track record')]//following-sibling::a")
	WebElement applicationMaintenanceServicesTextReadMoreBtn;

	@FindBy(xpath = "//li[text()='Application Maintenance Services (AMS) ']")
	WebElement ApplicationMaintenanceServices;

	@FindBy(xpath = "//a[text()='ERP Implementation']")
	WebElement erpImplementationLableBtn;

	@FindBy(xpath = "//p[contains(text(),'AppXcelerate Solutions future is ERP')]")
	WebElement erpImplementationLableText;
	String erpimplementationLableText = "AppXcelerate Solutions future is ERP, and one of the best and robust ERP is Oracle JD Edwards, keeping the needs and want of the Enterprise at the forefront. We implement JD Edwards ERP systems.";

	@FindBy(xpath = "//p[contains(text(),'AppXcelerate Solutions future is ERP')]//following-sibling::a")
	WebElement erpImplementationTextReadMoreBtn;

	@FindBy(xpath = "//li[text()='ERP Implementation ']")
	WebElement ERPImplementation;

	@FindBy(xpath = "//a[text()='Managed Services']")
	WebElement managedServicesLableBtn;

	@FindBy(xpath = "//p[contains(text(),'AppXcelerate Solutions Managed Services offering revolutionizes platform management')]")
	WebElement managedServicesLableText;
	String managedservicesLableText = "AppXcelerate Solutions Managed Services offering revolutionizes platform management by leveraging our deep technical knowledge and global delivery model. We support your organization's transition from legacy systems to modern cloud-based solutions";

	@FindBy(xpath = "//p[contains(text(),'AppXcelerate Solutions Managed Services offering revolutionizes platform management')]//following-sibling::a")
	WebElement managedServicesReadMorebtn;

	@FindBy(xpath = "//li[text()='Managed Services ']")
	WebElement ManagedServices;

	@FindBy(xpath = "//div[text()='Technologies']")
	WebElement technoligiesLable;

	@FindBy(xpath = "//h1[text()='Technologies']")
	WebElement technologiesTittle;

	@FindBy(xpath = "//div[@class=' justify-content-lg-between justify-content-center align-items-center']//span[@class='sub-title']")
	WebElement ourTechnologies;
	String ourTechnologieslable = "OUR TECHNOLOGIES";

	@FindBy(xpath = "//h5[contains(text(),'Succeed Now And Be Ready For Tomorrow')]")
	WebElement technoligieslableTxt;
	String technologieslabletxt = "Succeed Now And Be Ready For Tomorrow";

	@FindBy(xpath = "//p[contains(text(),'We harness the potential of digital technologies')]")
	WebElement technoligiesLableText;
	String technoligiesLabletxt = "We harness the potential of digital technologies";

	@FindBy(xpath = "//div[@class='swiper-slide swiper-slide-active']//img[@alt='blog image']")
	WebElement generativeAiImage;

	@FindBy(xpath = "//a[text()='Generative AI']")
	WebElement generativeAiLableBtn;

	@FindBy(xpath = "//p[contains(text(),'AppXcelerate Solutions provides a Artificial intelligence (AI)')]")
	WebElement generativeAiText;
	String generativeaiText = "AppXcelerate Solutions provides a Artificial intelligence (AI)";

	@FindBy(xpath = "//p[contains(text(),'AppXcelerate Solutions provides a Artificial intelligence (AI)')]//following-sibling::a")
	WebElement generativeAiTextReadMoreBtn;

	@FindBy(xpath = "//div[@class='swiper-slide swiper-slide-next']//img[@alt='blog image']")
	WebElement roboticAutomationImage;

	@FindBy(xpath = "//h3[@class='box-title']//a[contains(text(),'Robotic Automation')]")
	WebElement roboticAutomationLableBtn;

	@FindBy(xpath = "//p[contains(text(),'AppXcelerate Solutions knowledge and experience in Robotic Automation')]")
	WebElement roboticAutomationText;
	String roboticautomationText = "AppXcelerate Solutions knowledge and experience in Robotic Automation";

	@FindBy(xpath = "//p[contains(text(),'AppXcelerate Solutions knowledge and experience in Robotic Automation')]//following-sibling::a")
	WebElement roboticAutomationTextReadMoreBtn;

	@FindBy(xpath = "//div[@aria-label='3 / 4']//img[@alt='blog image']")
	WebElement businessProcessManagementImage;

	@FindBy(xpath = "//h3[@class='box-title']//a[contains(text(),'Business Process Management (BPM / DPA)')]")
	WebElement businessProcessManagementLableBtn;

	@FindBy(xpath = "//p[contains(text(),'AppXcelerate Solutions has a breadth of knowledge and experience in Architecting')]")
	WebElement businessProcessManagementText;
	String businessprocessManagementText = "AppXcelerate Solutions has a breadth of knowledge and experience in Architecting";

	@FindBy(xpath = "//p[contains(text(),'AppXcelerate Solutions has a breadth of knowledge and experience in Architecting')]//following-sibling::a")
	WebElement businessProcessManagementTextReadMoreBtn;

	@FindBy(xpath = "//div[@aria-label='4 / 4']//img[@alt='blog image']")
	WebElement apiAndMicroServicesImage;

	@FindBy(xpath = "//a[text()=' API and MicroServices']")
	WebElement apiAndMicroServicesLableBtn;

	@FindBy(xpath = "//div[@class='blog-content']//p[contains(text(),'AppXcelerate Solutions has vast knowledge and experience in ')]")
	WebElement apiAndMicroServicesText;
	String apiAndmicroServicesText = "AppXcelerate Solutions has vast knowledge and experience in";

	@FindBy(xpath = "//div[@class='blog-content']//p[contains(text(),'AppXcelerate Solutions has vast knowledge and experience in ')]//following-sibling::a")
	WebElement apiAndMicroServicesTextReadMoreBtn;

	public Homepage(WebDriver driver) {
		super(driver);
		this.driver = driver;//present object driver we are initializing with other driver
		PageFactory.initElements(driver, this);
	}

	public boolean homevalidation() {
		if (healthCareandLifeSciencesvalidation())
			if (governmentvalidation())
				if (bankingandfinancevalidation())
					if (insurancevalidation())
						if (customerrelationshipmanagementValidation())
							if (digitaltransformationvalidation())
								if (appPlatformDevelopmentvalidation())
									if (swattriagevalidation())
										if (systemupgradesvalidation())
											if (centerofexcellencevalidation())
												if (applicationtestingvalidation())
													if (applicationmaitananceservicesvalidation())
														if (erpimplementationvalidation())
															if (managedservicesvalidation()) {

																Log.info("Displayed  Homepage is passed");
																return true;
															}
		return false;

	}

	public boolean healthCareandLifeSciencesvalidation() {
		try {
			if (Click(home)) {
				scrollToElement(industriesLable);
				if (elementDisplay(industriesLable))
					if (validateValueinElement(industriesLabletext, indutriestxt))
						if (validateValueinElement(industriesLabletxt, industriesLableTxt)) {
							scrollToElement(healthAndLifescienceImage);
							if (elementDisplay(healthAndLifescienceImage))
								if (elementDisplay(healthAndLifescienceLable))
									if (elementDisplay(healthAndLifescienceLableTxt))
										if (elementDisplay(healthcareAndLifeScienceReadMoreBtn))
											if (Click(healthAndLifescienceLable))
												if (elementDisplay(healthCareandLifeSciencesLable)) {
													Log.info("displayed healthCareandLifeSciences is passed");
													return true;
												}
						}

			}
		} catch (Exception e) {
			Log.info("displayed healthCareandLifeSciences is failed" + e);
			Log.error(e);
		}
		return false;
	}

	public boolean governmentvalidation() {
		try {
			if (Click(home)) {
				scrollToElement(governmentImage);
				if (elementDisplay(governmentImage))
					if (elementDisplay(governmentLableBtn))
						if (validateValueinElement(governmentText, governmenttxt))
							if (elementDisplay(governmentTextReadMoreBtn))
								if (Click(governmentLableBtn))
									if (elementDisplay(GovernmentLable)) {
										Log.info("displayed government on homepage is passed");
										return true;
									}
			}
		} catch (Exception e) {
			Log.info("displayed government on homepage is failed" + e);
			Log.error(e);
		}
		return false;
	}

	public boolean bankingandfinancevalidation() {
		try {
			if (Click(home)) {
				scrollToElement(bankingAndFinanceImage);
				if (elementDisplay(bankingAndFinanceImage))
					if (elementDisplay(bankingAndFinanceLableBtn))
						if (validateValueinElement(bankingAndFinanceTxt, bankingandfinancetxt))
							if (elementDisplay(bankingAndfInanceTextReadMoreBtn))
								if (Click(bankingAndFinanceLableBtn))
									if (elementDisplay(bankingandFinanceLable)) {
										Log.info("displayed bankingandfinance on homepage is passed");
										return true;
									}
			}
		} catch (Exception e) {
			Log.info("displayed bankingandfinance on homepage is failed" + e);
			Log.error(e);
		}
		return false;
	}

	public boolean insurancevalidation() {
		try {
			if (Click(home)) {
				scrollToElement(insuranceImage);
				if (elementDisplay(insuranceImage))
					if (elementDisplay(insuranceLableBtn))
						if (validateValueinElement(insuranceText, insurancetxt))
							if (elementDisplay(insuranceTextReadMoreBtn))
								if (Click(insuranceLableBtn))
									if (elementDisplay(InsuranceLable))
										if (Click(home))
											if (elementDisplay(home)) {
												Log.info("Displayed  insurance successfully on Homepage is passed");
												return true;
											}
			}

		} catch (Exception e) {
			Log.info("Displayed  insurance successfully on Homepage is failed" + e);
			Log.error(e);
		}
		return false;

	}

	public boolean customerrelationshipmanagementValidation() {
		try {
			if (Click(home)) {
				scrollToElement(ourServicesLable);
				if (elementDisplay(ourServicesLable))
					if (validateValueinElement(ourServicesLableTxt, ourservicelableTxt))
						if (validateValueinElement(ourServicesLableText, ourserviceLabletxt))
							if (elementDisplay(customerRelationshipManagementLableBtn))
								if (validateValueinElement(customerRelationshipManagementLabletxt,
										customerrelationshipManagementLabletxt))
									if (elementDisplay(customerRelationshipManagementreadMorebtn))
										if (Click(customerRelationshipManagementLableBtn))
											if (elementDisplay(CustomerRelationshipManagement)) {
												Log.info(
														"Displayed  customerrelationshipmanagement successfully on Homepage is passed");
												return true;
											}
			}
		} catch (Exception e) {
			Log.info("Displayed  customerrelationshipmanagement successfully on Homepage is failed" + e);
			Log.error(e);
		}
		return false;
	}

	public boolean digitaltransformationvalidation() {
		try {
			if (Click(home)) {
				scrollToElement(digitalTransformationLableBtn);
				if (elementDisplay(digitalTransformationLableBtn))
					if (validateValueinElement(digitalTransformationLableText, digitaltransformationLableText))
						if (elementDisplay(digitalTransformationTextReadMorebtn))
							if (Click(digitalTransformationLableBtn))
								if (elementDisplay(DigitalTransformation)) {
									Log.info("Displayed  digitaltransformation successfully on Homepage is passed");
									return true;
								}
			}
		} catch (Exception e) {
			Log.info("Displayed  digitaltransformation successfully on Homepage is failed" + e);
			Log.error(e);
		}
		return false;
	}

	public boolean appPlatformDevelopmentvalidation() {
		try {
			if (Click(home)) {
				scrollToElement(appPlatformDevelopmentLablebtn);
				if (elementDisplay(appPlatformDevelopmentLablebtn))
					if (validateValueinElement(appPlatformDevelopmentLableText, appPlatformdevelopmentLableText))
						if (elementDisplay(appPlatformDevelopmentTextReadMorebtn))
							if (Click(appPlatformDevelopmentLablebtn))
								if (elementDisplay(AppPlatformDevelopment)) {
									Log.info("Displayed  appPlatformDevelopment successfully on Homepage is passed");
									return true;
								}
			}
		} catch (Exception e) {
			Log.info("Displayed  appPlatformDevelopment successfully on Homepage is failed" + e);
			Log.error(e);
		}
		return false;
	}

	public boolean swattriagevalidation() {
		try {
			if (Click(home)) {
				scrollToElement(swatTriageLablebtn);
				if (elementDisplay(swatTriageLablebtn))
					if (validateValueinElement(swatTriageLableText, swattriageLableText))
						if (elementDisplay(swatTriageTextReadMoreBtn))
							if (Click(swatTriageLablebtn))
								if (elementDisplay(SWATTriage)) {
									Log.info("Displayed  swattriage successfully on Homepage is passed");
									return true;
								}
			}
		} catch (Exception e) {
			Log.info("Displayed  swattriage successfully on Homepage is failed" + e);
			Log.error(e);
		}
		return false;
	}

	public boolean systemupgradesvalidation() {
		try {
			if (Click(home)) {
				scrollToElement(systemUpgradesLableBtn);
				if (elementDisplay(systemUpgradesLableBtn))
					if (validateValueinElement(systemUpgradesLableText, systemupgradesLableText))
						if (elementDisplay(systemUpgradesTextReadMoreBtn))
							if (Click(systemUpgradesLableBtn))
								if (elementDisplay(SystemUpgrades)) {
									Log.info("Displayed  systemupgrades successfully on Homepage is passed");
									return true;
								}
			}
		} catch (Exception e) {
			Log.info("Displayed  systemupgrades successfully on Homepage is failed" + e);
			Log.error(e);
		}
		return false;
	}

	public boolean centerofexcellencevalidation() {
		try {
			if (Click(home)) {
				scrollToElement(centerOfExcellenceLableBtn);
				if (elementDisplay(centerOfExcellenceLableBtn))
					if (validateValueinElement(centerOfExcellenceLableText, centerofExcellenceLableText))
						if (elementDisplay(centerOfExcellenceTextReadMoreBtn))
							if (Click(centerOfExcellenceLableBtn))
								if (elementDisplay(CenterOfExcellence)) {
									Log.info("Displayed  centerofexcellence successfully on Homepage is passed");
									return true;
								}
			}
		} catch (Exception e) {
			Log.info("Displayed  centerofexcellence successfully on Homepage is failed" + e);
			Log.error(e);
		}
		return false;
	}

	public boolean applicationtestingvalidation() {
		try {
			if (Click(home)) {
				scrollToElement(applicationTestingLableBtn);
				if (elementDisplay(applicationTestingLableBtn))
					if (validateValueinElement(applicationTestingLableText, applicationtestingLableText))
						if (elementDisplay(applicationTestingTextReadMoreBtn))
							if (Click(applicationTestingLableBtn))
								if (elementDisplay(servicesLable)) {
									Log.info("Displayed services successfully on Homepage is passed");
									return true;
								}
			}
		} catch (Exception e) {
			Log.info("Displayed services on Homepage is failed" + e);
			Log.error(e);
		}
		return false;
	}

	public boolean applicationmaitananceservicesvalidation() {
		try {
			if (Click(home)) {
				scrollToElement(applicationMaintenanceServicesLableBtn);
				if (elementDisplay(applicationMaintenanceServicesLableBtn))
					if (validateValueinElement(applicationMaintenanceServicesLableText,
							applicationmaintenanceServicesLableText)) {
						scrollToElement(applicationMaintenanceServicesTextReadMoreBtn);
						if (elementDisplay(applicationMaintenanceServicesTextReadMoreBtn))
							if (Click(applicationMaintenanceServicesLableBtn))
								if (elementDisplay(ApplicationMaintenanceServices)) {
									Log.info(
											"Displayed applicationmaitananceservices successfully on Homepage is passed");
									return true;
								}
					}
			}
		} catch (Exception e) {
			Log.info("Displayed applicationmaitananceservices on Homepage is failed" + e);
			Log.error(e);
		}
		return false;
	}

	public boolean erpimplementationvalidation() {
		try {
			if (Click(home)) {
				scrollToElement(erpImplementationLableBtn);
				if (elementDisplay(erpImplementationLableBtn))
					if (validateValueinElement(erpImplementationLableText, erpimplementationLableText))
						if (elementDisplay(erpImplementationTextReadMoreBtn))
							if (Click(erpImplementationLableBtn))
								if (elementDisplay(ERPImplementation)) {
									Log.info("Displayed erpimplementation successfully on Homepage is passed");
									return true;
								}
			}
		} catch (Exception e) {
			Log.info("Displayed erpimplementation on Homepage is failed" + e);
			Log.error(e);
		}
		return false;
	}

	public boolean managedservicesvalidation() {
		try {
			if (Click(home)) {
				scrollToElement(managedServicesLableBtn);
				if (elementDisplay(managedServicesLableBtn))
					if (validateValueinElement(managedServicesLableText, managedservicesLableText))
						if (elementDisplay(managedServicesReadMorebtn))
							if (Click(managedServicesLableBtn))
								if (elementDisplay(ManagedServices))
									if (Click(home))
										if (elementDisplay(home)) {
											Log.info("Displayed managedservices successfully on Homepage is passed");
											return true;
										}
			}
		} catch (Exception e) {
			Log.info("Displayed managedservices on Homepage is failed" + e);
			Log.error(e);
		}
		return false;
	}
}
