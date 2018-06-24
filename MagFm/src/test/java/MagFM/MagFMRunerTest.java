package MagFM;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)


@CucumberOptions(
		//strict = false,
		
		format = {"pretty" , "html:target/htmlcucum" },
        features = "MagFpp",
       /*
        glue = "StepDefinitions",
        plugin ={ 
				"json:target/cucumber.json","pretty:target/cucumber-pretty.txt",
		        "usage:target/cucumber-usage.json",
		        "junit:target/cucumber-results.xml",
		        "html:target/cucumber-html-report", "pretty" },
		        */
        tags={"@MagFpp"}
                   )

public class MagFMRunerTest {

}
