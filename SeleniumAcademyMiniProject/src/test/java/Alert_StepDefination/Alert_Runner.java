package Alert_StepDefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"src\\test\\resources\\alert.feature"},
		glue= {"Alert_StepDefination","Alert_Hooks"},
		dryRun = false,
		monochrome=true,		
		stepNotifications = true,
				//plugin = { "pretty", "html:target/cucumber-reports" }
				//plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json"}
				//plugin = { "pretty", "junit:target/cucumber-reports/Cucumber.xml" },
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)

public class Alert_Runner {

}
