package StepDefinitions;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"src\\test\\resources\\feature\\rediffs.feature"},
		glue= {"StepDefinitions","hooks"},
		dryRun = false,
		monochrome=false
		)
public class rediffrunner2 {

}
