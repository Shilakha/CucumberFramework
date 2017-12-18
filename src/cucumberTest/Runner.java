package cucumberTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\shilakha\\eclipse-workspace\\Flipkart\\Feature\\Feature.feature", glue = {
		"C:\\Users\\shilakha\\eclipse-workspace\\Flipkart\\src\\stepDefination\\TestSteps.java" },plugin = {"pretty", "html:target/cucumber"})

public class Runner {

}