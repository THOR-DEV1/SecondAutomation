package eduStep_definitions;

import org.openqa.selenium.support.PageFactory;

import Components.EduvidyaComponents;
import Mini_project_all_in_one.BrowserDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EduMain {
	EduvidyaComponents input;
	@Given("open browser and navigate to url")
	public void open_browser_and_navigate_to_url() {
	    System.out.println("test");
	}

	@When("Click on college")
	public void click_on_college() {
		System.out.println("test");
		input=PageFactory.initElements(BrowserDriver.getCurrentDriver(), EduvidyaComponents.class);
		input.collegebox();
	}

	@And("Select course")
	public void select_course() throws InterruptedException {
		System.out.println("test");
		input.corseList();
		Thread.sleep(2000);
	}

	@When("Select city")
	public void select_city() {
		System.out.println("test");
		input.cities();
	}

	@And("click on search")
	public void click_on_search() {
		System.out.println("test");
		input.searchbtn();
	}

	@When("Verify search result is displayed")
	public void verify_search_result_is_displayed() {
		System.out.println("test");
		input.verify();
	}

	@Then("Close Browser")
	public void close_browser() {
		System.out.println("test");
	}
}
