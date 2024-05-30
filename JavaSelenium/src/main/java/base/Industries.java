package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Industries {
	WebDriver driver;
	public Industries(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	
	@FindBy(xpath="//div[@class='swiper-slide swiper-slide-active']//div[@class='project-grid_img']")
	//@FindBy(xpath("//div[@class='swiper-slide swiper-slide-active']//img[@alt='project image']")
	WebElement healthcareimage;


	@FindBy(xpath="//h3[@class='box-title']//a[contains(text(),'Health Care and Life')]")
	WebElement HealthAndLifeScience;

	@FindBy(xpath="//p[contains(text(),'AppXcelerate Solutions deep experience in the healthcare')]")
	WebElement healthCaretext;

	@FindBy(xpath="//p[contains(text(),'AppXcelerate Solutions deep experience in the heal')]//following-sibling::a")
	WebElement readMore;

	@FindBy(xpath="//div[@class='swiper-slide swiper-slide-next']//img[@alt='project image']")
	//@findBy(xpath="//div[@class='swiper-slide swiper-slide-next']//div[@class='project-grid_img']
	WebElement governmentImage;

	@FindBy(xpath="//a[text()='Government']")
	WebElement government;

	@FindBy(xpath="//p[contains(text(),'AppXcelerate Solutions Insurance Practice brings to its clients solutions')]")
	WebElement governmentText;

	@FindBy(xpath="//p[contains(text(),'AppXcelerate Solutions Insurance Practice brings to its clients solutions')]//following-sibling::a")
	WebElement governmentTextReadMore;

	@FindBy(xpath="//div[@aria-label='3 / 4']//img[@alt='project image']")
	//@FindBy(xpath="//div[@aria-label='3 / 4']//div[@class='project-grid_img']")
	WebElement bankingAndFinanceImage;

	@FindBy(xpath="//a[text()='Banking and Finance']")
	WebElement bankingAndFinance;

	@FindBy(xpath="//p[contains(text(),'AppXcelerate Solutions Banking and Finance ')]")
	WebElement bankingAndFinanceText;

	@FindBy(xpath="//p[contains(text(),'AppXcelerate Solutions Banking and Finance ')]//following-sibling::a")
	WebElement bankingAndFinanceTextReadmore;

	@FindBy(xpath="//div[@aria-label='4 / 4']//img[@alt='project image']")
	//@FindBy(xpath="//div[@aria-label='4 / 4']//div[@class='project-grid_img']")
	WebElement insuranceimage;

	@FindBy(xpath="//a[text()='Insurance']")
	WebElement insurance;

	@FindBy(xpath="//p[@class='project-grid_text'][contains(text(),'AppXcelerate Solutions has vast knowledge')]")
	WebElement insurancetext;

	@FindBy(xpath="//p[@class='project-grid_text'][contains(text(),'AppXcelerate Solutions has vast knowledge')]//following-sibling::a")
	WebElement insurancetextreadmore;

	public void healthCareImage() {
		healthcareimage.click();
	}
	
}


