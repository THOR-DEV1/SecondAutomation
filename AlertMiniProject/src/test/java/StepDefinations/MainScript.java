package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import Alerts_pro.Browserge;
import AppElements.AllElements;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainScript {
	WebDriver driver=Browserge.getCurrentDriver();
	AllElements Input;
	@Given("Hovering on switch to menu and click on alert box")
	public void hovering_on_switch_to_menu_and_click_on_alert_box() throws InterruptedException {
		Thread.sleep(500);
		Input=PageFactory.initElements(Browserge.getCurrentDriver(), AllElements.class);
		Input.Hover();
		Thread.sleep(2000);
		Input.alert();


	}

	@Given("Checking the alert message")
	public void checking_the_alert_message() throws InterruptedException {
		Input.alertboxbtn();
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());  
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		System.out.println("1");
	}

	@When("Opening the Confirm box")
	public void opening_the_confirm_box() throws InterruptedException {
		Input.Cofmbtn();
		Thread.sleep(2000);
		Input.confirmbox();
	}

	@When("checking the confirm box")
	public void checking_the_confirm_box() {
		driver.switchTo().alert().dismiss();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText());

	}

	@Then("opening the prompt box")
	public void opening_the_prompt_box() throws InterruptedException {
		Input.Alerttext();
		Thread.sleep(2000);
		Input.Promptbtn();
		driver.switchTo().alert().sendKeys("Vineel");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();

	}

	@Then("Checking the prompt box")
	public void checking_the_prompt_box() {
		System.out.println(driver.findElement(By.xpath("//*[@id=\"demo1\"]")).getText());



		System.out.println("Done");
	}


}
