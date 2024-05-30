
package xpath;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class  BusinessProcessManagement {
	
	@FindBy(xpath="//li[@class='menu-item-has-children'][3]/a")
	WebElement technologiesMenu;
	
	@FindBy(xpath="//div[@class='breadcumb-wrapper background-image']")
	WebElement backGroundImg;
	
	@FindBy(xpath="//h1[@class='breadcumb-title']")
	WebElement technologiesText;
	
	@FindBy(xpath="//ul[@class='breadcumb-menu']//a[contains(text(),'Home')]")
	WebElement homeText;
	
	@FindBy(xpath="//li[contains(text(),'Business Process Management (BPM / DPA) ')]")
	WebElement businessProcessManagementText;
	
	
	@FindBy(xpath="//div[@class='blog-img text-center']")
	WebElement bpmImg;
	
	@FindBy(xpath="//h2[contains(@class,'blog-title')]")
	WebElement bpmText;

	@FindBy(xpath="//h2[contains(@class,'blog-title')]/following-sibling::p")
	WebElement bpmPara;
	
	
	
	@FindBy(xpath="//div[@class='col-md-6'][1]/img")
	WebElement servicesImg;
	
	@FindBy(xpath="//div[@class='col-md-6'][2]")
	WebElement servicesBPMImg;
	
	@FindBy(xpath="//p[@class='mt-3']")
	WebElement servicesTxt;
	
	


}
