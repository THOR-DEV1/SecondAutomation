package Step_Definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Components.sqtatoolsComponents;
import Mini_project_all_in_one.BrowserDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StqatoolsMain {
	sqtatoolsComponents fields;
	WebDriver driver=BrowserDriver.getCurrentDriver();
	@Given("^launch browser and Navigate to Url$")
	public void launch_browser_and_navigate_to_url() {
	    System.out.println("<====Browser opened====>"+'\n');
	}

	@When("^Click on Basic Alert$")
	public void click_on_basic_alert() throws InterruptedException {
		Thread.sleep(2000);
		 System.out.println("Clicked Alerts"+'\n');
		 fields=PageFactory.initElements(BrowserDriver.getCurrentDriver(), sqtatoolsComponents.class);
		 fields.Alert();
		 
	}

	@And("^Close Alert$")
	public void close_alert() throws InterruptedException {
		Thread.sleep(1000);
		 System.out.println("closed Alert"+'\n');
		 Thread.sleep(2000);
		 fields.close();
	}

	@When("^Navigate to Url2$")
	public void navigate_to_url2() throws InterruptedException {
		Thread.sleep(1000);
		 System.out.println("Url opened"+'\n');
		 fields.url2();
	}

	@And("^Fill the Name as (.*)$")
	public void fill_the_name_as_amol(String name) throws InterruptedException {
		Thread.sleep(1000);
		 System.out.println("name entered: "+name+'\n');
		 fields.name(name);
	}

	@When("^Fill the Father Name as (.*)$")
	public void fill_the_father_name_as_father(String name) throws InterruptedException {
		Thread.sleep(1000);
		 System.out.println("father entered: "+name+'\n');
		 fields.name1(name);
	}

	@And("Fill the Postal Address as (.*)$")
	public void fill_the_postal_address_as_postal(String name) throws InterruptedException {
		Thread.sleep(1000);
		 System.out.println("postal entered: "+name+'\n');
		 fields.postal(name);
	}

	@When("^Fill the Personal Address as (.*)$")
	public void fill_the_personal_address_as_personal(String name) throws InterruptedException {
		Thread.sleep(1000);
		 System.out.println("personal entered: "+name+'\n');
		 fields.personal(name);
	}

	@And("^Select proper gender$")
	public void select_proper_gender() throws InterruptedException {
		Thread.sleep(1000);
		 System.out.println("gender clicked"+'\n');
		 fields.male();
	}

	@When("^Select any City$")
	public void select_any_city() throws InterruptedException {
		Thread.sleep(1000);
		 System.out.println("Test Passed"+'\n');
		 fields.dropdown1();
	}

	@And("^Select any Course$")
	public void select_any_course() throws InterruptedException {
		Thread.sleep(1000);
		 System.out.println("course selected"+'\n');
		 fields.course();
	}

	@When("^Select any District$")
	public void select_any_district() throws InterruptedException {
		Thread.sleep(1000);
		 System.out.println("district selected"+'\n');
		 fields.district();
	}

	@And("^Select any State$")
	public void select_any_state() throws InterruptedException {
		Thread.sleep(1000);
		 System.out.println("state selected"+'\n');
		 fields.state();
	}

	@When("^Fill the pin code as (.*)$")
	public void fill_the_pin_code_as_pincode(String name) throws InterruptedException {
		Thread.sleep(1000);
		 System.out.println("pincode entered: "+name+'\n');
		 fields.pincode(name);
	}

	@And("^Fill the Email Id as (.*)$")
	public void fill_the_email_id_as_email(String name) throws InterruptedException {
		Thread.sleep(1000);
		 System.out.println("email entered: "+name+'\n');
		 fields.email(name);
	}

	@When("^Scroll to bottom$")
	public void scroll_to_bottom() throws InterruptedException {
		Thread.sleep(1000);
		 System.out.println("Scrolled down"+'\n');
		 fields.scroll();
	}

	@And("^Click on reset$")
	public void click_on_reset() throws InterruptedException {
		Thread.sleep(2000);
		 System.out.println("reset button clicked"+'\n');
		 fields.reset();
	}

	@When("^Verify if Data is reset or not$")
	public void verify_if_data_is_reset_or_not() {
		String s=driver.findElement(By.xpath("//*[@id=\"studentname\"]")).getAttribute("value");
		
		if(s.isEmpty()) {
			System.out.println("Reset successful"+'\n');
		}
		else {
			System.out.println("Reset not Successful: "+s+'\n');
		}
	}

	@Then("^close Browser$")
	public void close_browser() {
		 System.out.println("<=====Browser Closed======>");
	}
}
