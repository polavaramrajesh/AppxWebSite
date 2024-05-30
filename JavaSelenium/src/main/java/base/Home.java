package base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Home {
	 Homepage Home;
	 WebDriver driver;
	 Actions actions;

	
	 Logger logger = LogManager.getLogger(Homepage.class);
	@FindBy(xpath="//h1[text()='Technologies']")
	WebElement technologies;
	
	@FindBy(xpath="//div[@class='breadcumb-content']//a[text()='Home']")
	WebElement home;
	
	@FindBy(xpath="//li[text()='API and MicroServices ']")
	WebElement apiandmicroserviestittle;
	
	@FindBy(xpath="//div[@class='breadcumb-wrapper background-image']")
	WebElement apiandmicrobackgroungimge;
	
	@FindBy(xpath="//div[@class='blog-img text-center']")
	WebElement apibackgroungimage;
	
	@FindBy(xpath="//h2[text()='API and MicroServices.']")
	WebElement apiAndmicroservices;
	
	@FindBy(xpath="//h2[contains(@class,'blog-title')]//following-sibling::p")
	WebElement text;
	
	@FindBy(xpath="//div[@class='row gy-4 align-items-center'][1]/div[1]/img[1]")
	WebElement apiimage;
	
	@FindBy(xpath="//div[@class='row gy-4 align-items-center'][1]/div[2]/img[1]")
	WebElement apisimage;
	
	@FindBy(xpath="//p[contains(text(),'Application program interface (API) is a set of routines')]")
	WebElement apistext;
	
	@FindBy(xpath="//h3[text()='Recent Posts']")
	WebElement recentposts;
	
	@FindBy(xpath="//a[text()='Generative AI.']")
	WebElement generateai;
	
	@FindBy(xpath="//a[text()='Business Process Management (BPM / DPA). ']")
	WebElement businessprocessmanagement;
	
	@FindBy(xpath="//a[text()='Robotic Automation (RPA & RDA).']")
	WebElement roboticautomation;
	
	@FindBy(xpath="API and MicroServices.")
	WebElement apimicroservies;
	
	@FindBy(xpath="//div[@class='widget-banner']")
	WebElement bacgroundimg;
	
	@FindBy(xpath="//span[text()='CONTACT US NOW']")
	WebElement cantactusnow;
	
	@FindBy(xpath="//h2[text()='You Need Help?']")
	WebElement youneedhelp;
	

}

