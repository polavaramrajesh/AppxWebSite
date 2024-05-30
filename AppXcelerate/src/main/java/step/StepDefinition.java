package step;

import org.openqa.selenium.WebDriver;

import automationLib.Apiandmicroservies;
import automationLib.BusinessProcessManagement;
import automationLib.FooterXpath;
import automationLib.GenerativeAI;
import automationLib.HeaderPage;
import automationLib.Recentpost;
import automationLib.RobaticAutomation;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import url.UrlProvied;

public class StepDefinition {
	WebDriver driver;
	UrlProvied url;
	HeaderPage header;
	GenerativeAI generate;
	FooterXpath footer;
	Apiandmicroservies apiandMicroServies;
	BusinessProcessManagement businessProcessManagement;
	Recentpost recent;
	RobaticAutomation robatic;

	@Given("open the AppXcelerate Solutions Pvt Ltd website...UrlProvied:appx")
	public void open_the_app_xcelerate_solutions_pvt_ltd_website_url_provied_appx() {
		url = new UrlProvied();
		driver = url.appx();
	}

	@Then("validating the header in appx ...HeaderPage:ValidationHeaderPage")
	public void validating_the_header_header_page_validation_header_page() {
		header = new HeaderPage(driver);
		header.ValidationHeaderPage();
	}
	
	@Then("validate recent posts...Recentpost:recentPostvalidation")
	public void validate_recent_posts_recentpost_recentPostvalidation() {
		recent=new Recentpost(driver);
		recent.recentPostvalidation();
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
	
	@Then("validate footer in appx ...footerclass:validateFooterXpath")
	public void validate_footer_footerclass_validate_footer_xpath() {
		footer = new FooterXpath(driver);
		footer.validateFooterXpath();
	}

    @When("User navigates to the API and Microservices section...Apiandmicroservies:clickingofApiandmicroservies")
    public void navigateToApiAndMicroservices() {
    	apiandMicroServies = new Apiandmicroservies(driver);
    	apiandMicroServies.clickingofApiandmicroservies();  
    }

    @Then("validate API and Microservices content...Apiandmicroservies:ApiandmicroserviesValidate")
    public void validateApiAndMicroservicesContent() {
    	apiandMicroServies.ApiandmicroserviesValidate();
    }
    
    @When("User navigates to the Business Process Management section...BusinessProcessManagement:clickingofBusinessprocessmanagement")
    public void user_navigates_to_the_business_process_management_section_business_process_management_clicking_of_business_process_management() {
        businessProcessManagement = new BusinessProcessManagement(driver);
        businessProcessManagement.clickingofBusinessprocessmanagement();
    }

    @Then("validate generate BusinessProcessManagement...BusinessProcessManagement:valdatebusinessProcessManagement")
    public void validate_generate_business_process_management_business_process_management_valdate_business_process_management() {
        businessProcessManagement.valdatebusinessProcessManagement();
    }
    
       
    @When("User navigates to the  Robotic Automation  section...RobaticAutomation:clickingofRobaticAutomation")
    public void user_navigates_to_the_robotic_automation_section_robaticAutomation_clickingofRobaticAutomation() {
    	robatic = new RobaticAutomation(driver);
    	robatic.clickingofRobaticAutomation();
    
    }
    
    @Then("validate  Robotic Automation  content...RobaticAutomation:validaterobaticautomation")
    public void validate_robotic_automation_content_robaticAutomation_validaterobaticautomation() {
    	robatic.validaterobaticautomation();
    }
}