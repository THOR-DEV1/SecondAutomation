package Alert_StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Alert_Elements.alertElements;

import Config.BrowserDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Alert_Process {
	
	alertElements process;
	WebDriver driver =BrowserDriver.getCurrentDriver();
	@Given("open web application")
	public void open_web_application() {
	    
	}

	@When("click on alert box")
	public void click_on_alert_box() throws InterruptedException {
		process=PageFactory.initElements(BrowserDriver.getCurrentDriver(),alertElements.class);
		Thread.sleep(2000);
		process.Show_Me_Alert();
		Thread.sleep(2000);

		
	}

	@And("validate message and click ok")
	public void validate_message_and_click_ok() throws InterruptedException {
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
	}

	@When("click on first tryit button")
	public void click_on_first_tryit_button() {
		process.First_Tryit();
		
	}

	@And("validate message and click cancel")
	public void validate_message_and_click_cancel() throws InterruptedException {
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		
		//validation of  dismiss msg
		String s1=driver.findElement(By.id("demo")).getText();
        System.out.println(s1);
        String s2="You Dismissed Alert";
        System.out.println(s1.equals(s2));
        
		process.Second_Tryit();
		driver.switchTo().alert().sendKeys("sriram");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();

	}

	@Then("close the browser")
	public void close_the_browser() throws InterruptedException {
		Thread.sleep(2000);
		BrowserDriver.getCurrentDriver().close();
	}
}
