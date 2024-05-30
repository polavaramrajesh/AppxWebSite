package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


import org.junit.runner.RunWith;


@RunWith(Cucumber.class)   
@CucumberOptions( 
		features = "D:\\workspace\\AppxFeature\\Feature_File\\HomeFeature\\Home.feature",//feature file location path
      //  glue =" {"stepDefinition"},
		glue = "stepDefinition",//stedefinition package name
        plugin = {"pretty", "html:target/cucumber-reports.html"},// generating of reports 
		tags= "@Home-feature"// feature file tag name
)

	


public class Runner { 
	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
       
}
