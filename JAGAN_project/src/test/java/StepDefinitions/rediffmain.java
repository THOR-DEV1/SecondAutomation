package StepDefinitions;

import java.util.ArrayList;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Config.BrowserDriver;
import InputElements.CreateElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class rediffmain {
	
	CreateElements input;
	WebDriver driver=BrowserDriver.getCurrentDriver();
	//Urls
	String MainUrl="http://register.rediff.com/register/register.php?FormName=user_details";
	String ChildUrl="http://register.rediff.com/help/terms.htm";
	String ATItle="Terms and Conditions";
	
	//Starts here
	@Given("^Open chrome and Navigate url$")
	public void open_chrome_and_Navigate_url() throws InterruptedException {
	    System.out.println("--->Browser Opened & Url opened<---"+'\n');
	    Thread.sleep(2000);
	}

	@When("^Click on Create Account$")
	public void click_on_Create_Account() throws InterruptedException {
		input = PageFactory.initElements(BrowserDriver.getCurrentDriver(), CreateElements.class);
		
		input.CreateLinks();
		
		System.out.println("===>Clicked on Create Account"+'\n');
		String Currurl1=driver.getCurrentUrl();
		Assert.assertEquals(MainUrl, Currurl1);
		System.out.println("\t"+"Validation Successfull"+"\n");
		Thread.sleep(400);
		
	}

	@And("^find Total link in Create account page$")
	public void find_Total_link_in_Create_account_page() throws InterruptedException {
		input.CountLinks();
		Thread.sleep(2000);
	}

	@When("^Click on Terms and Conditions$")
	public void click_on_Terms_and_Conditions() throws InterruptedException {
		
		input.ClickOnTerms();
		System.out.println("===>Terms and Condition Clicked"+"\n");
		String Currurl1=driver.getCurrentUrl();
		Assert.assertEquals(MainUrl, Currurl1);
		System.out.println("\t"+"Validation Successfull"+"\n");
		
		Thread.sleep(400);
	}

	@When("^Get the title of the child window$")
	public void get_the_title_of_the_child_window() throws InterruptedException {
		input.Switch(1);
		driver.manage().window().maximize();
		String Title=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]")).getText();
		System.out.println("Title: "+Title+"\n");
		Assert.assertEquals(ATItle, Title);
		System.out.println("\t"+"Title Validation Sucessful"+"\n");
		Thread.sleep(2000);
		driver.close();
		
		Thread.sleep(2000);
		input.Switch(0);
	}

	@Then("^Close the Browser$")
	public void close_the_Browser() {
		System.out.println("--->Close Browser<---");
	}
}
