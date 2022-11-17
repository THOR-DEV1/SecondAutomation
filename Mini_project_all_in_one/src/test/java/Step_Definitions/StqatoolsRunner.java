package Step_Definitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;






@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"src\\test\\resources\\features\\stqatools.feature"},
		glue= {"Step_Definitions","Hooks"},
		dryRun = false,
		monochrome=false,
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		publish = true
		)
public class StqatoolsRunner {

}
