package naukari.Naukari.com;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)


@CucumberOptions(
		strict = false,
        features = "Featurefile", //full only 'file' path where feature is kept
        glue = "naukari.Naukari.com", //only package name
        plugin ={ 
				"json:target/cucumber.json","pretty:target/cucumber-pretty.txt",
		        "usage:target/cucumber-usage.json",
		        "junit:target/cucumber-results.xml",
		        "html:target/cucumber-html-report", "pretty"},
        tags={"@first"}
                 )

public class NaukarirunnerTest {

}
