package StepDefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import browserClose.Close;
import browserInitialization.BrowserInitialization;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import urlPackage.UrlProvied;
import xpath.AboutUs;
import xpath.FooterXpath;
import xpath.HeaderAppx;

public class StepDefinition {
	WebDriver driver;
	UrlProvied url;
	HeaderAppx header;
	AboutUs aboutUs;
	FooterXpath footer;
	Close close;

	@Given("user open the AppXcelerate website with given URL...BrowserInitialization:browserIntialization")
	public void user_open_the_app_xcelerate_website_with_given_url_url_provied_appx() throws IOException {
		BrowserInitialization browser = new BrowserInitialization();
		driver = browser.browserIntialization("Browser");
	}

	@Then("validate the header...HeaderAppx:ValidateionHeaderPage")
	public void validate_the_header_header_appx_validateion_header_page() {
		header = new HeaderAppx(driver);
		header.ValidateionHeaderPage();
	}

	@When("user navigate to the About Us page...AboutUs:validateClickingAboutUsPage")
	public void user_navigate_to_the_about_us_page_about_us_validate_clicking_about_us_page() {
		aboutUs = new AboutUs(driver);
		aboutUs.validateClickingAboutUsPage();
	}

	@Then("Validate the About Us page content...AboutUs:validateAboutUsPage")
	public void validate_the_about_us_page_content_about_us_validate_about_us_page() {
		aboutUs.validateAboutUsPage();
	}

	@Then("validate the Footer...FooterXpath:validateFooterXpath")
	public void validate_the_footer_footer_xpath_validate_footer_xpath() {
		footer = new FooterXpath(driver);
		footer.validateFooterXpath();
	}

	@Then("close the browser...Close:CloseBrowser")
	public void close_the_browser_close_CloseBrowser() {
		close = new Close();
		try {
			close.CloseBrowser(driver);
		} catch (Exception e) {
		}
	}

}
