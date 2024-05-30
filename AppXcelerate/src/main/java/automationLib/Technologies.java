package automationLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Technologies {
	
	WebDriver driver;
	@FindBy(xpath="//nav[contains(@class,'main-menu d-none d-lg-inline-block')]//a[text()='Technologies']")
	WebElement btntech;
	
	//GENERATIVE AI
	@FindBy(xpath="//div[@class='breadcumb-wrapper background-image']")
	WebElement backgroundimage ;
	
	@FindBy(xpath="//h1[@class='breadcumb-title']")
	WebElement Technologies;
	
	@FindBy(xpath="//li[text()='Generative AI ']")
	WebElement GenerativeAI;
	
	//ROBOTICS
	
	@FindBy(xpath="Robotic Automation (RPA & RDA) ")
	WebElement btnrobo;
	
	@FindBy(xpath="//a[@class=\"th-btn style3\"]")
	WebElement btnContactrobo;
	
	@FindBy(xpath="//div[@class='scroll-top show']")
	WebElement btnscrooltop1;
	
	//BPM
	@FindBy(xpath="//a[text()='Business Process Management (BPM / DPA) ']")
	WebElement btnbpm;
	
	@FindBy(xpath="//a[@class=\"th-btn style3\"]")
	WebElement btnContactbpm;
	
	@FindBy(xpath="//div[@class='scroll-top show']")
	WebElement btnscrooltop2;
	
	//API
	@FindBy(xpath="//ul[contains(@class,'sub-menu th-submenu')]//a[text()='API and MicroServices ']")
	WebElement btnapi;
	
	@FindBy(xpath="//a[@class='th-btn style3']")
	WebElement btncontactapi;
	
	@FindBy(xpath="//div[@class='scroll-top show']")
	WebElement btnscrooltop3;
}
	
	
	
	
	
	
	
	
	

	
	




