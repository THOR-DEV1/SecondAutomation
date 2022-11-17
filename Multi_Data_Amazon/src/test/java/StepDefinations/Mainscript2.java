package StepDefinations;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import com.google.common.io.Files;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Mainscript2 {
WebDriver driver;
Random rand = new Random(); //instance of random class
int upperbound = 7;
int random = rand.nextInt(upperbound);
@Given("^I want to search a product on Amazon$")
public void i_want_to_search_a_product_on_Amazon() {
	System.out.println("Browser opened");
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	
}

@When("^Search for (.*)$")
public void search_for_Product(String un) throws InterruptedException{
	//wait
	Thread.sleep(900);
	//wait
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys(un);
	System.out.println("Search product name:"+un); 
	
}

@And("^Click on Search$")
public void click_on_Search() throws IOException, InterruptedException {
	driver.findElement(By.id("nav-search-submit-button")).click();
	System.out.println("clicked");
	WebElement logo = driver.findElement(By.xpath("/html/body/div[1]/div[2]/span/div/h1/div/div[1]/div/div/span[3]"));
    String s=logo.getText();
    //wait
    Thread.sleep(900);
  //wait
    System.out.println(s);
	String name="product"+random;
	System.out.println(name);
    File f = logo.getScreenshotAs(OutputType.FILE);
    Files.copy(f,new File("src\\test\\java\\Screenshots\\"+name+".png"));
    
  //wait
    Thread.sleep(900);
  //wait
    
	driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[3]/div[2]/div[6]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
	 System.out.println(driver.findElement(By.className("a-price-whole")).getText());
	 WebElement logo1 = driver.findElement(By.className("a-price-whole"));
	//wait
	 Thread.sleep(900);
	//wait
		String name2="price"+random;
		System.out.println(name2);
	    File f1 = logo1.getScreenshotAs(OutputType.FILE);
	    Files.copy(f1,new File("src\\test\\java\\Screenshots\\"+name2+".png"));
	  //wait
	    Thread.sleep(900);
	  //wait
}

@Then("Take Screenshot of Productname and Productprice")
public void take_Screenshot_of_Productname_and_Productprice() {
    System.out.println("Snapshot taken for name and price");
    driver.quit();
	System.out.println("---------Browser Closed----------");
 }
}
