package stepdefinition;

import org.openqa.selenium.WebDriver;

import automationLib.GenerativeAI;
import automationLib.HeaderPage;
import automationLib.Recentpost;
import automationLib.footerclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import url.UrlProvied;

public class GenerateAiStepDefinition {
	WebDriver driver;
	UrlProvied url;
	HeaderPage header;
	GenerativeAI generate;
	footerclass footer;
	Recentpost recent;

	@Given("user open the AppXcelerate Solutions Pvt Ltd website...UrlProvied:appx")
	public void open_the_app_xcelerate_solutions_pvt_ltd_website_url_provied_appx() {
		url = new UrlProvied();
		driver = url.appx();
	}

	@Then("validating the header in appx ...HeaderPage:ValidateionHeaderPage")
	public void validating_the_header_header_page_validateion_header_page() {
		header = new HeaderPage(driver);
		header.ValidateionHeaderPage();
	}

	@When("User navigates to the Generative AI section...GenerativeAI:clickingofGenerateAi")
	public void user_navigates_to_the_generative_ai_section_generative_ai_clickingof_generate_ai() {
		generate = new GenerativeAI(driver);
		generate.clickingofGenerateAi();
	}

	@Then("validate generate Ai content...GenerativeAI:generateAIValdation")
	public void validate_generate_ai_content_generative_ai_generate_ai_valdation() {
		generate.generateAIValdation();
	}

	@Then("validate recent posts...Recentpost:recentPostvalidation")
	public void validate_recent_posts_recentpost_recent_postvalidation() {
		recent = new Recentpost(driver);
		recent.recentPostvalidation();
	}

	@Then("validate footer in appx ...footerclass:validateFooterXpath")
	public void validate_footer_footerclass_validate_footer_xpath() {
		footer = new footerclass(driver);
		footer.validateFooterXpath();
	}
}
