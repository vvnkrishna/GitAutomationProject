package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features= { "features" },
glue= { "com.facebook.stepDefinations" },
tags= { "@Login" },
monochrome= true, dryRun= false)


public class TestRunner {
	

}
