package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\manee\\eclipse-workspace\\AppxFeature\\Feature_file\\TechnologiesFeature\\Business Process Management.feature", 
				glue = "step",                        
				plugin = {"pretty", "html:target/cucumber-reports" }, 
				tags = "@BusinessProcessManagement"
				)
public class TestRunner { 
	
}           
                 










