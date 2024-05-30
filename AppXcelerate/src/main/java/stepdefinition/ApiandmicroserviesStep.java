package stepdefinition;

import org.openqa.selenium.WebDriver;

import automationLib.Apiandmicroservies;
import automationLib.HeaderPage;
import automationLib.Recentpost;
import automationLib.footerclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import url.UrlProvied;

public class ApiandmicroserviesStep {
    WebDriver driver;
    UrlProvied url;
    HeaderPage header;
    Apiandmicroservies apiAndMicroservices;
    Recentpost recentPosts;
    footerclass footer;

    @Given("open the AppXcelerate Solutions Pvt Ltd website...UrlProvied:appx")
    public void open_the_app_xcelerate_solutions_pvt_ltd_website_url_provied_appx() {
        url = new UrlProvied();
        driver = url.appx();
    }

    @Then("validating the header ...HeaderPage:ValidateionHeaderPage")
    public void validating_the_header_header_page_validateion_header_page() {
        header = new HeaderPage(driver);
        header.ValidateionHeaderPage();
    }

    @When("User navigates to the API and Microservices section...Apiandmicroservies:clickingofApiandmicroservies")
    public void user_navigates_to_the_api_and_microservices_section_api_and_microservices_clickingof_api_and_microservices() {
    	apiAndMicroservices = new Apiandmicroservies(driver);
        apiAndMicroservices.clickingofApiandmicroservies();
    }

    @Then("validate API and Microservices content...Apiandmicroservies:ApiandmicroserviesValidate")
    public void validate_api_and_microservices_content_api_and_microservices_api_and_microservices_validate() {
        apiAndMicroservices.ApiandmicroserviesValidate();
    }

    @Then("validate recent posts...Recentpost:recentPostvalidation")
    public void validate_recent_posts_recentpost_recent_postvalidation() {
        recentPosts = new Recentpost(driver);
        recentPosts.recentPostvalidation();
    }

    @Then("validate footer...footerclass:validateFooterXpath")
    public void validate_footer_footerclass_validate_footer_xpath() {
        footer = new footerclass(driver);
        footer.validateFooterXpath();
    }
}
