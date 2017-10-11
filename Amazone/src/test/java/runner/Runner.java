package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)


@CucumberOptions(
		strict = false,
        features = "AmazoneFeature",
        glue = "StepDefinition",
        plugin ={ 
				"json:target/cucumber.json","pretty:target/cucumber-pretty.txt",
		        "usage:target/cucumber-usage.json",
		        "junit:target/cucumber-results.xml",
		        "html:target/cucumber-html-report", "pretty"},
        tags={"@Amazone1"}
                 )
public class Runner {

}
