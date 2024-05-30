package stepDefinitions;

import org.openqa.selenium.WebDriver;

import appxwebsite.FooterXpath;
import appxwebsite.HeaderAppx;
import appxwebsite.Homepage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import urlClass.Url;

public class StepDefinition {
	WebDriver driver;
	Url url;
	Homepage home;
	HeaderAppx header;
	FooterXpath footer;

	@Given("user wants to open Appxcelerate solutions website with URL...Url:appx")
	public void user_wants_to_open_appxcelerate_solutions_website_with_url_url_appx() {
		url = new Url();
		driver = url.appx();
		home= new Homepage(driver);
	}
	
	@Then("validate the header...HeaderAppx:ValidateionHeaderPage")
	public void validate_the_header_header_appx_ValidateionHeaderPage() {
		header=new HeaderAppx(driver);
		header.ValidateionHeaderPage();
	}

	@Then("validate Home page content...HomePage:homevalidation")
	public void validate_home_page_content_home_page_homevalidation() {
		home.homevalidation();
	}

	@Then("validate the footer...FooterXpath:validateFooterXpath")
	public void validate_the_footer_footer_xpath_validate_footer_xpath() {
		 footer=new FooterXpath(driver);
		 footer.validateFooterXpath();
	}

}

