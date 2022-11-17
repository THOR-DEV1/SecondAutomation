package StepDefinations;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\resources\\Features\\Test2.feature",plugin= {"json:target/cucumber__report"},
		glue="StepDefinations",monochrome = true
		)
public class MainRunner {

}
