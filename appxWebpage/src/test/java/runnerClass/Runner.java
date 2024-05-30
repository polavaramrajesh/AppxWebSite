package runnerClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\91630\\eclipse-workspace\\Appxcelerate\\featurefile\\Homefeaturefile", 
					glue = "stepDefinitions",	
					plugin = {"pretty", "html:target/cucumber-reports" }, 
					tags = "@Home"
				)
public class Runner {
}
