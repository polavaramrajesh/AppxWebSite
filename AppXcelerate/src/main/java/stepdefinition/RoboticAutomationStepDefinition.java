package stepdefinition;

import org.openqa.selenium.WebDriver;

import automationLib.GenerativeAI;
import automationLib.HeaderPage;
import automationLib.RobaticAutomation;
import automationLib.footerclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import url.UrlProvied;

public class RoboticAutomationStepDefinition {

	WebDriver driver;
	UrlProvied url;
	HeaderPage header;
	RobaticAutomation RoboticAutomation;
	footerclass footer;

	@Given("open the AppXcelerate Solutions Pvt Ltd website...UrlProvied:appx")
	public void openWebsite() {
		url = new UrlProvied();
		driver = url.appx();
	}

	@Then("validating the header ...HeaderPage:ValidateionHeaderPage")
	public void validateHeader() {
		header = new HeaderPage(driver);
		header.ValidateionHeaderPage();
	}

	@When("User navigates to the  Robotic Automation  section... valdateRobaticAutomationHead: clickingofRobaticAutomation")
	public void navigateToRoboticAutomationSection() {
		RoboticAutomation = new RobaticAutomation(driver);
		RoboticAutomation.clickingofRobaticAutomation();
	}

	@Then("validate  Robotic Automation  content... Robotic Automation: validaterobaticautomation")
	public void validateRoboticAutomationContent() {
		RoboticAutomation.validaterobaticautomation();
	}

	@Then("validate footer...footerclass:validateFooterXpath")
	public void validateFooter() {
		footer = new footerclass(driver);
		footer.validateFooterXpath();
	}
	}

