package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\resources\\features\\logindemo.feature",plugin= {"json:target/cucumber__report"},
		glue="stepdefinitions",monochrome = true
		)
public class demorunner {

}
