package StepDefinitions;





import javax.lang.model.util.Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.support.PageFactory;

import Config.BrowserDriver;

import elements1.elements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class SearchMain_Amazon {
	elements input;
	
	@Given("Open Browser and navigate URL")
	public void open_browser_and_navigate_url() {
	   System.out.println("----Browser opened & Navigated----"+"\n");
	}

	@When("Search mobiles and select Under {int}")
	public void search_mobiles_and_select_under(Integer int1) throws InterruptedException {
		System.out.println("Selected mobiles under 15000"+"\n");
		input = PageFactory.initElements(BrowserDriver.getCurrentDriver(), elements.class);
		input.Searchbox();
		Thread.sleep(2000);
		input.AutoSearch();
	}

	@And("Verify Search result")
	public void verify_search_result() {
		System.out.println("Verified Search result"+"\n");
		input.verify();
	}

	@When("In filter Select Select price range {int}")
	public void in_filter_select_select_price_range(Integer int1) throws InterruptedException {
		System.out.println("Selected price range 5000-10000"+"\n");
		input.price();
		Thread.sleep(2000);
		input.version();
		Thread.sleep(2000);
	}

	@And ("Select newest first")
	public void select_newest_first() throws InterruptedException {
		System.out.println("Selected Newest first"+"\n");
		input.feature();
		Thread.sleep(2000);
		input.first();
		Thread.sleep(2000);
	}

	@When("Display price and name for five mobiles")
	public void display_price_and_name_for_five_mobiles() throws InterruptedException {
		System.out.println("Display 5 products name and price"+"\n");
	
		input.fiveproduct();
		Thread.sleep(2000);
		input.Listofprices();
	}

	@And("Validate price less than 30k")
	public void validate_price_less_than_30k() {
		System.out.println("Verified 1st product price less 30k"+"\n");
		input.check();
	}

	@Then("Close the Browser")
	public void close_the_browser() {
		System.out.println("---->Browser Close<----");
	}
}
