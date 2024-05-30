package stepDefinition;

import org.openqa.selenium.WebDriver;

import base.FooterPage;
import base.HeaderPage;
import base.Homepage;
import base.Url;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class stepDefinitions {

	WebDriver driver;
	Url url = new Url();  //
	Homepage homepage;
	HeaderPage header;
	FooterPage footerxpath;

	@Given("user open the AppXcelerate website with given URL...Url:appx")
	public void user_open_the_app_xcelerate_website_with_given_url_url_appx() {
		driver = url.appx();
	}
	
	@Then("validate the header...HeaderPage:ValidationHeaderPage")
	public void validate_the_header_header_page_validation_header_page() {
		header =new HeaderPage(driver);
		header.ValidationHeaderPage();
	}
	@Then("validate the homepage...Homepage:homepagemethodsvalidation")
	public void validate_the_homepage_homepage_homepagemethodsvalidation() {
		homepage = new Homepage(driver);
		
		homepage.homepagemethodsvalidation();
	}
	
	@Then("validate the Footer...FooterPage:validateFooterXpath")
	public void validate_the_footer_footer_page_validate_footer_xpath() {
		footerxpath = new FooterPage(driver);
		footerxpath.validateFooterXpath();
	}

}
