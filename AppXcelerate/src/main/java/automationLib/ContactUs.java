package automationLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUs {
	//Prudhvi
	WebDriver driver;
	@FindBy(xpath="//nav[contains(@class,'main-menu d-none d-lg-inline-block')]//a[text()='Contact']")
	WebElement linkContact;
	
	@FindBy(xpath="//a[@class='th-btn shadow-none']")
	WebElement linkEnquire;
	
	@FindBy(xpath="//div[@class='breadcumb-wrapper background-image']")
	WebElement imgBackground;
	
	@FindBy(xpath="//h1[@class='breadcumb-title']")
	WebElement headerContactUs;
	
	@FindBy(xpath="//ul[contains(@class,'breadcumb-menu')]//a[text()='Home']")
	WebElement linkHome;
	
	@FindBy(xpath="//ul[contains(@class,'breadcumb-menu')]//li[text()='Contact Us']")
	WebElement txtcontact;
	
	@FindBy(xpath="//i[@class='fas fa-location-dot']")
	WebElement iconLocation;
	
	@FindBy(xpath="//h4[text()='Our Office Address']")
	WebElement headerOurOfficeAddress;
	
	@FindBy(xpath="//h4[contains(text(),'Our Office Address')]/../span[@class='contact-info_text']")
	WebElement txtAddress;
	
	@FindBy(xpath="//div[contains(@class,'col-xl-4 col-md-4')]//i[@class='fas fa-phone']")
	WebElement iconPhone;
	
	@FindBy(xpath="//h4[text()='Call Us Anytime']")
	WebElement headerCallUsAnyTime;
	
	@FindBy(xpath="//div[contains(@class,'col-xl-4 col-md-4')]//a[text()='+91 9491434143']")
	WebElement txtPhoneNumber;
	
	@FindBy(xpath="//div[@class='col-xl-4 col-md-4']//i[@class='fas fa-envelope']")
	WebElement iconSendAnEmail;
	
	@FindBy(xpath="//h4[text()='Send An Email']")
	WebElement headerSendAnEmail;
	
	@FindBy(xpath="//span[contains(@class,'contact-info_text')]//a[text()='info@app-xcelerate.com']")
	WebElement txtSendAnEmail;
	
	@FindBy(xpath="//div[@class='bg-smoke space background-image']")
	WebElement imgSmokeSpaceBackgroundImage;
	
	@FindBy(xpath="//span[contains(@class,'sub-title')]")
	WebElement logoTxtContactUs;
	
	@FindBy(xpath="//h2[text()='Have Any Questions?']")
	WebElement textHaveAnyQuestions;
	
	@FindBy(xpath="//p[@class='sec-text']")
	WebElement txtFillUpTheFormAndOurTeamWillGetBackToYouWithin24Hours;
	
	@FindBy(xpath="//input[@placeholder='Your Name *']")
	WebElement txtYourName;
	
	@FindBy(xpath="//i[@class='fal fa-user']")
	WebElement iconYourName;
	
	@FindBy(xpath="//input[@placeholder='Email Address*']")
	WebElement txtEmailAddress;
	
	@FindBy(xpath="//i[@class='fal fa-envelope']")
	WebElement iconEmailAddress;
	
	@FindBy(xpath="//input[@placeholder='Phone Number*']")
	WebElement txtPhonenumber;
	
	@FindBy(xpath="//i[@class='fal fa-phone']")
	WebElement iconPhoneNumber;
	
	@FindBy(xpath="//input[@placeholder='Subject']")
	WebElement textSubject;
	
	@FindBy(xpath="//i[@class='fal fa-book']")
	WebElement iconSubject;
	
	@FindBy(xpath="//textarea[@placeholder='Your Message']")
	WebElement txtYourMessage;
	
	@FindBy(xpath="//i[@class='fal fa-comment']")
	WebElement iconYourMessage;
	
	@FindBy(xpath="//div[@class='recaptcha-checkbox-borderAnimation']")
	WebElement checkboxIAmNotARobot;
	
	@FindBy(xpath="//label[@class='rc-anchor-center-item rc-anchor-checkbox-label']")
	WebElement lableIAmNotARobot;
	
	@FindBy(xpath="//div[@class='rc-anchor-logo-img rc-anchor-logo-img-portrait']")
	WebElement iconIAmNotARobot;
	
	@FindBy(xpath="//div[@class='rc-anchor-logo-text']")
	WebElement txtRecaptcha;
	
	@FindBy(xpath="th-btn")
	WebElement btnSendMessage;
	
	@FindBy(xpath="//div[@class='scroll-top show']")
	WebElement scrollupScrollTopShow;
	
	
	
	
	
	

}