package test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

public class Testrunner1 {

	
	@RunWith(Cucumber.class)
	@CucumberOptions(features = "src/Feature/Flipkart.feature", glue = { "Feature" }, tags = { "tag" }, plugin = {
			"pretty", "html:target/cucumber-html-report" })

	public class Testrun {

	}

}
