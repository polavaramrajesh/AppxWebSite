package automationLib;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class Home {
	WebDriver driver;
	
	//MANEENDRA
	
	//WebDriver driver = new ChromeDriver();
	
	@FindBy(xpath="//div//img[@src='assets/img/appx-logo.png']")
	WebElement appxLogo;
	
	@FindBy(xpath="//div[@class='header-links']//i[@class='fas fa-map-location']")
	WebElement logoMap;
	
	@FindBy(xpath="//li[contains(text(),'AppXcelerate')]")
	WebElement textAddress;
	
	@FindBy(xpath="//div[@class='header-links']//i[@class='fas fa-envelope']")
	WebElement infoLogo;
	
	@FindBy(xpath="//a[text()='info@app-xcelerate.com']")
	WebElement infoMail;
	
	@FindBy(xpath="//div[@class='header-links']//i[@class='fas fa-phone']")
	WebElement PhoneLogo;
	
	@FindBy(xpath="//a[text()='+91 9491434143']")
	WebElement phNumber;
	
	@FindBy(xpath="//a[text()='Enquire Now']")
	WebElement btnEnquire;
	
	@FindBy(xpath="//h1[text()='The Best Minds In Optimization.']")
	WebElement textBestMinds;
	
	@FindBy(xpath="//p[@class='hero-text']")
	WebElement textAppx;
	
	@FindBy(xpath="//img[@src='assets/img/hero/hero_img_4_1.png']")
	WebElement getStartImg;
	
	@FindBy(xpath="//a[text()='Get Started']")
	WebElement getStarted;
	
	@FindBy(xpath="//nav[contains(@class,'main-menu d-none d-lg-inline-block')]//a[text()='About Us']") 
	WebElement home;
	
	@FindBy(xpath="//div[@class='img-shape icon-masking']")
	WebElement aboutMoreImg;
	
	@FindBy(xpath="//div[@class='title-area mb-35 text-center text-xl-start']//span[@class='mask-icon bg-mask']")
	WebElement logoAbout;
	
	@FindBy(xpath="//h2[text()='The Best Minds In ']")
	WebElement textBest;
	
	@FindBy(xpath="//span[text()='Optimization.']")
	WebElement textOpti;
	
	@FindBy(xpath="//p[@class='mt-n2 mb-30 text-center text-xl-start']")
	WebElement textAppxc;
	
	@FindBy(xpath="//a[text()='About More']")
	WebElement aboutMore;
	
	
	//INDUSTRIES:
	
	@FindBy(xpath="//div[@class='title-area text-center']//img[@src='assets/img/theme-img/title_shape_2.svg']")
	WebElement logoIndustries;
	
	@FindBy(xpath="//div[@class='title-area text-center']//h5[contains(text(),'We Design Optimized And Efficient Digital Environments To Future-Proof Your Business.')]")
	WebElement txtUnderIndustries;
	
	@FindBy(xpath="//p[contains(text(),'We offer comprehensive and highly customizable digital solutions ')]")
	////div[@class='title-area text-center']//p
	WebElement paraIndustries;
	
	@FindBy(xpath="//div[contains(@class,'swiper-slide swiper-slide-active')]//div[@class='project-grid_img']")
	WebElement imgHealthCareAndLifeSciences;
	
	@FindBy(xpath="//div[@class='project-grid_content']//a[contains(text(),'Health Care and Life')]")
	WebElement headerHealthCareAndLifeScience;
	
	@FindBy(xpath="//p[contains(text(),'AppXcelerate Solutions deep experience in the healthcare and Life Sciences industr')] ")
	WebElement txtHealthCare;
	
	@FindBy(xpath="//div[@class='project-grid_content']//a[contains(@href,'i-health-care-and-life-sciences.php') and @class='line-btn pt-3']")
	WebElement btnHealthCare;
	
	@FindBy(xpath="//img[@src='assets/img/i-2.png']")
	WebElement imgGovernment;
	
	@FindBy(xpath="//a[text()='Government']")
	WebElement headGovernment;
	
	@FindBy(xpath="//p[contains(text(),'AppXcelerate Solutions Insurance Practice brings to its clients solutions to ensure')]")
	WebElement txtGovernment;
	
	@FindBy(xpath="//div[@class='project-grid_content']//a[contains(@href,'i-government.php') and @class='line-btn pt-3']")
    WebElement btnGovernment;
	
	@FindBy(xpath="//img[@src='assets/img/i-3.png']")
	WebElement imgBanking;
	
	@FindBy(xpath="//h3[@class='box-title']//a[text()='Banking and Finance']")
	WebElement headerBanking;
	
	@FindBy(xpath="//p[contains(text(),'AppXcelerate Solutions Banking and Finance practice works with leading financial')]")
	WebElement txtBanking;
	
	@FindBy(xpath="//div[@class='project-grid_content']//a[contains(@href,'i-banking-and-finance.php') and @class='line-btn pt-3']")
	WebElement btnBanking;
	
	@FindBy(xpath="//img[@src='assets/img/i-4.png']")
	WebElement imgInsurace;
	
	@FindBy(xpath="//a[text()='Insurance']")
	WebElement headerInsurance;
	
	@FindBy(xpath="//div[@id='projectSlider2']//p[contains(text(),'AppXcelerate Solutions has vast knowledge and experience ')]")
	WebElement txtInsurance;
	
	@FindBy(xpath="//div[@class='project-grid_content']//a[contains(@href,'i-insurance.php') and @class='line-btn pt-3']")
	WebElement btnInsurance;
	//SSSS
	@FindBy(xpath="//span[text()='WORK PROCESS']")
	WebElement txtWorkProcess;
	
	@FindBy(xpath="//div[contains(@class,'title-area text-center')]//h2[@class='sec-title']")
	WebElement headerHowDoesItworks;
	
	@FindBy(xpath="//div[contains(@class,'process-line position-top')]")
	WebElement imgProcessline;
	
	@FindBy(xpath="//img[@src='assets/img/icon/process_box_1.png']")
	WebElement imgDataGenerated;
	
	@FindBy(xpath="//h2[text()='Data Generated']")
	WebElement headerDataGenerated;
	
	@FindBy(xpath="//p[text()='Generate Insights, Drive Growth.']")
	WebElement txtGenerateInsightsDriveGrowth;
	
	@FindBy(xpath="//img[@src='assets/img/icon/process_box_2.png']")
	WebElement imgDataProcessing;
	
	@FindBy(xpath="//h2[text()='Data Processing']")
	WebElement headerDataProcessing;
	@FindBy(xpath="//p[contains(text(),'Efficient Data Processing Solutions.')]")
	WebElement txtDataProcessing;
	
	@FindBy(xpath="//img[@src='assets/img/icon/process_box_3.png']")
	WebElement imgDataStored;
	
	@FindBy(xpath="//h2[text()=' Data Stored']")
	WebElement headerDataStored;
	
	@FindBy(xpath="//p[contains(text(),'Secure & Accessible Data Storage.')]")
	WebElement txtDataStored;
	
	@FindBy(xpath="//img[@src='assets/img/icon/process_box_4.png']")
	WebElement imgSolutions;
	
	@FindBy(xpath="//h2[text()=' Solutions']")
	WebElement headerSolutions;
	
	@FindBy(xpath="//p[contains(text(),'Custom CRM for Business Innovation.')]")
	WebElement txtSolutions;
	
	//
	@FindBy(xpath="//span[text()[normalize-space()='OUR SERVICES']]")
	WebElement iconOurServices;
	
	@FindBy(xpath="//h5[text()=' Launching Into The Responsive Business Services To Maximize Operational Efficiency.']")
	WebElement header;
	
	@FindBy(xpath="//div[@class='row justify-content-center text-center']//p")
	WebElement txtourservices;
	
	// SERVICES:
	@FindBy(xpath="//a[contains(text(),' Customer Relation')]/../../..//img[@src='assets/img/icon/service_card_6.svg']")
	WebElement imgcrm;
	
	@FindBy(xpath="//h3[@class='box-title']//a[@href='s-customer-relationship-management-(CRM).php']")
    WebElement headercrm;
	
	@FindBy(xpath="//div[@class='service-card']//a[contains(@href,'s-customer-relationship-management-(CRM).php') and @class='th-btn']")
	WebElement btnCRM;
	
	@FindBy(xpath="//div[@class='service-card']//a[contains(@href,'s-digital-transformation.php') and @class='th-btn']")
	WebElement btnDigital;
	
	@FindBy(xpath="//div[@class='service-card']//a[contains(@href,'s-app-platform-development.php') and @class='th-btn']")
	WebElement btnAppPlatform;
	
	@FindBy(xpath="//div[@class='service-card']//a[contains(@href,'s-swat-triage.php') and @class='th-btn']")
	WebElement btnSwat;
	
	@FindBy(xpath="//div[@class='service-card']//a[contains(@href,'s-system-upgrades.php') and @class='th-btn']")
	WebElement btnSysUpgrade;
	
    @FindBy(xpath="//div[@class='service-card']//a[contains(@href,'s-center-of-excellence.php') and @class='th-btn']")
    WebElement btncentreExcellence;
    
    @FindBy(xpath="//div[@class='service-card']//a[contains(@href,'s-application-testing.php') and @class='th-btn']")
    WebElement btnAppTest;
    
    @FindBy(xpath="//div[@class='service-card']//a[contains(@href,'s-application-maintenance-Services-(AMS).php') and @class='th-btn']")
    WebElement btnAMS;
    
    @FindBy(xpath="//div[@class='service-card']//a[contains(@href,'s-ERP-implementation.php') and @class='th-btn']")
    WebElement btnCenterOfExe;
    
    @FindBy(xpath="//div[@class='service-card']//a[contains(@href,'s-managed-services.php') and @class='th-btn']")
    WebElement btnManageServices;
    
    //TECHNOLOGIES
    @FindBy(xpath="//div[@class='blog-content']//a[contains(@href,'t-generative-ai.php') and @class='line-btn']")
    WebElement btnGenerative;
    
    @FindBy(xpath="//div[@class='blog-content']//a[contains(@href,'t-robotic-automation.php') and @class='line-btn']")
    WebElement btnRobotic;
    
    @FindBy(xpath="//div[@class='blog-content']//a[contains(@href,'t-business-process-management.php') and @class='line-btn']")
	WebElement btnBPM;
    
    @FindBy(xpath="//div[@class='blog-content']//a[contains(@href,'t-api-and-microServices.php') and @class='line-btn']")
    WebElement btnMicroServices;
    
    
    //HOME PAGE ENQUIRE NOW
    @FindBy(xpath="//input[@placeholder='Enter Your Name*']")
    WebElement btnName;
    
    @FindBy(xpath="//input[@placeholder='Enter Your Email*']")
    WebElement btnEmail;
    
    @FindBy(xpath="//input[@placeholder='Phone Number*']")
    WebElement btnPhone;
    
    @FindBy(xpath="//input[@placeholder='Subject']")
    WebElement btnSubject;
    
    @FindBy(xpath="//textarea[@placeholder='Write Your Message']")
    WebElement btnOwnMsg;
    
	
	@FindBy(xpath="//button[text()='Submit']")
	WebElement btnSubmi;
	
	
	@FindBy(xpath="//a[text()='CONTACT US']")
	WebElement btnContactus;
	
	
	
	
	//jyothi
	//OUR TECHNOLOGIES
	
		@FindBy(xpath="//section[@class='bg-top-center z-index-common space-top background-image arrow-wrap']//span[@class='sub-title']")
		WebElement txtOurTechnologies;
		
		@FindBy(xpath="//h5[@style='color: #fff;']")
		WebElement txtSucceedNowAndBeReadyForTomorrowByUsingNextGenerationDigitalTechnologies;
		
		@FindBy(xpath="//p[@style='color: #fff;']")
		WebElement txtWeharnessthepotentialofdigitaltechnologiestoalloworganizations;
		
		@FindBy(xpath="//img[@src='assets/img/t-1.png']")
		WebElement imgForGenerativeAI;
		
		@FindBy(xpath="//a[text()='Generative AI']")
		WebElement linkTxtGenerativeAI;
		
		@FindBy(xpath="//a[@href='t-generative-ai.php']/../p[@class='blog-text']")
		WebElement txtAppXcelerateSolutionsprovidesaArtificialintelligenceAI;
		
		@FindBy(xpath="//a[contains(text(),'Generative AI')]/../../a[text()='Read More']")
		WebElement linkGenerativeAIReadmore;
		
		
		@FindBy(xpath="//img[@src='assets/img/t-3.png']")
		WebElement imgforRoboticAutomationRDARBA; 
		
		@FindBy(xpath="//h3[@class='box-title']//a[@href='t-robotic-automation.php']")
		WebElement linkTxtRoboticAutomationRDARBA;
		
		@FindBy(xpath="//a[@href='t-robotic-automation.php']/../p[@class='blog-text']")
		WebElement txtAppXcelerateSolutionsknowledgeandExperienceinRoboticAutomation;
		
		@FindBy(xpath="//a[contains(text(),'Robotic Automation')]/../../a[text()='Read More']")
		WebElement linkRoboticAutomationRPARDAReadmore;
		
		@FindBy(xpath="//img[@src='assets/img/t-2.png']")
		WebElement imgForBusinessProcessManagement;
		
		@FindBy(xpath="//h3[@class='box-title']//a[@href='t-business-process-management.php']")
		WebElement linkTxtBusinessProcessManagement;
		
		@FindBy(xpath="//a[@href='t-business-process-management.php']/../p[@class='blog-text']")
		WebElement txtAppXcelerateSolutionsHasAbreadthofknowledgeandExperienceinArchitecting;
		
		@FindBy(xpath="//a[contains(text(),'Business Process Management')]/../../a[text()='Read More']")
		WebElement linkBusinessProcessManagementBPMDPAReadmore;
		
		@FindBy(xpath="//img[@src='assets/img/t-4.png']")
		WebElement imgForAPIAndMicroServices;
		
		@FindBy(xpath="//a[text()=' API and MicroServices']")
		WebElement linkTxtAPIAndMicroServices;
		
		@FindBy(xpath="//a[@href='t-api-and-microServices.php']/../p[@class='blog-text']")
		WebElement txtAppXcelerateSolutionshasvastknowledgeandExperienceInService;
		
		@FindBy(xpath="//a[contains(text(),' API and MicroServices')]/../../a[text()='Read More']")
		WebElement linkApiAndMicroServicesReadmore;
		
		//ICON AND CONTACTUS
		
		@FindBy(xpath="//div[@class='space background-image']//span[@class='mask-icon bg-mask']")
		WebElement iconContactUs;
		
		@FindBy(xpath="//div[@class='space background-image']//span[@class='sub-title']")
		WebElement txtContactUs;
		
		@FindBy(xpath="//div[contains(@class,'space background-image')]//h2[@class='sec-title']")
		WebElement txtWeAreReadyToTalkAboutYourOpportunities;

		
		@FindBy(xpath="//img[@src='assets/img/contact.png']")
		WebElement imgContactUs;
		
		
		//ENQUIRE NOW FIELD
		
		@FindBy(xpath="//h3[text()='Enquire Now']")
		WebElement txtEnquireNow;
		
		@FindBy(xpath="//input[@placeholder='Enter Your Name*']")
		WebElement textFieldEnterYourName;

		@FindBy(xpath="//input[@placeholder='Enter Your Email*']")
		WebElement textFieldEnterYourEmail;

		@FindBy(xpath="//input[@placeholder='Phone Number*']")
		WebElement textFieldPhoneNumber;

		@FindBy(xpath="//input[@placeholder='Subject']")
		WebElement textFieldSubject;

		@FindBy(xpath="//textarea[@placeholder='Write Your Message']")
		WebElement textFieldEnterYourMessage;
		
		@FindBy(xpath="//button[text()='Submit']")
		WebElement btnSubmit;
		
		//ICON AND kEY SERVICES FEATURES
		
		@FindBy(xpath="//div[@class='space-top background-image']//span[@class='mask-icon bg-mask']")
		WebElement iconForKeyServicesFeatures;
		
		@FindBy(xpath="//div[@class='space-top background-image']//span[@class='sub-title']")
		WebElement txtKeyServicesFeatures;
		
		@FindBy(xpath="//h2[text()='We Deal With The Aspects Professional ']")
		WebElement txtWeDealWithTheAspectsProfessionalServices;
		
		@FindBy(xpath="//img[@src='assets/img/normal/why_1_1.jpg']")
		WebElement imgKeyServicesFeatures;
		
		@FindBy(xpath="//li[text()=' Robotic Automation']//i[@class='far fa-check']")
		WebElement iconFarFACheckForRoboticAutomation;
		
		@FindBy(xpath="//li[text()=' Robotic Automation']")
		WebElement txtRoboticAutomation;
		
		@FindBy(xpath="//li[text()=' Intelligent Data Analysis']//i[@class='far fa-check']")
		WebElement iconFarFACheckForIntelligentDataAnalysis; 
		
		@FindBy(xpath="//li[text()=' Intelligent Data Analysis']")
		WebElement txtIntelligentDataAnalysis;
		
		@FindBy(xpath="//li[text()=' Al For Cloud Services']//i[@class='far fa-check']")
		WebElement iconFarFACheckForAlForCloudServices;
		
		@FindBy(xpath="//li[text()=' Al For Cloud Services']")
		WebElement txtAlForCloudServices;
		
		@FindBy(xpath="//li[text()=' Machine Learning']//i[@class='far fa-check']")
		WebElement iconFarFACheckForMachineLearning;
		
		@FindBy(xpath="//li[text()=' Machine Learning']")
		WebElement txtMachineLearning;
		
		@FindBy(xpath="//li[text()=' Cognitive Computing']//i[@class='far fa-check']")
		WebElement iconFarFACheckForCognitiveComputing;
		
		@FindBy(xpath="//li[text()=' Cognitive Computing']")
		WebElement txtCognitiveComputing;
		
		@FindBy(xpath="//li[text()=' Deep Learning']//i[@class='far fa-check']")
		WebElement iconFarFACheckForDeepLearning;
		
		@FindBy(xpath="//li[text()=' Deep Learning']")
		WebElement txtDeepLearning;
		
		//LET"S CONSULTATION
		
		@FindBy(xpath="//div[@class='col-lg-7']//span[@class='mask-icon bg-mask']")
		WebElement iconForLetsConsultation;
		
		@FindBy(xpath="//div[@class='col-lg-7']//span[@class='sub-title']")
		WebElement txtLetsConsultation;
		
		
		@FindBy(xpath="//div[@class='cta-box_content']//h2[@class='sec-title']")
		WebElement txtLetsTalkAboutBusinessSolutionsWithUs;
		
		@FindBy(xpath="//img[@src='assets/img/normal/customer_support.jpg']")
		WebElement imgForLetsConsultation;

		
		//CLICK CONTACTUS
		
		@FindBy(xpath="//a[text()='CONTACT US']")
		WebElement btnContactUs;
		
		
		
				
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void a() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.app-xcelerate.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		
	
	
	
	//@FindBy(xpath="//nav[contains(@class,'main-menu d-none d-lg-inline-block')]//a[text()='Industries']")
	//WebElement Industries;
	
	//@FindBy(xpath="//a[text()='Health Care and Life Sciences ']")
	// WebElement Aboutus;
	
	}
	
	
	
	
	
}

