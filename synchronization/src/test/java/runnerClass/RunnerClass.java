package runnerClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="D:\\selenium workspace\\appx\\feature_files\\aboutUsFeature",
        glue = "StepDefinition",
        plugin = {"pretty", "html:target/cucumber-reports"},
        tags = "@AboutUsFeature"  
)
public class RunnerClass {
}

 