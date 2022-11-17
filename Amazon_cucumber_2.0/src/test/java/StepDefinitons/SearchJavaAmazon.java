package StepDefinitons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchJavaAmazon {
WebDriver driver;
	
	
    @Given("^Open Amazon$")
    public void Open_Amazon() {
        WebDriverManager.chromedriver().setup();
        //launch browser
        driver=new ChromeDriver();

        System.out.println("website Amazon.in is open");
        //maximize browser
        driver.manage().window().maximize();        
        driver.get("https://www.amazon.in/");
        System.out.println("browser running and website loaded");
        
        

    

    }
    @When("^I given serach string as$")
    public void search()  {
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        //enter a string in search field
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung Galaxy M13 5G");
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

    	
    	
               

    }
    @And("^Click on search button$")
    public void click_search_button()  {
        //click on the submit button
        driver.findElement(By.id("nav-search-submit-button")).click();
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("searching");
       
    }
    @Then("^the Price is displayed$")
    public void Search_result() {
        driver.findElement(By.partialLinkText("Samsung Galaxy M13 5G")).click();
        System.out.println(driver.findElement(By.className("a-price-whole")).getText());
        System.out.println("price printed");
        driver.close();
        
        
    }

}
