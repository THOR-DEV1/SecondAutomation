package stepdefinitions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoMainscript {
	WebDriver driver;
	@Given("open browser and navigate the url")
	public void open_browser_and_navigate_the_url() {
	    System.out.println("Browser opened");
	    WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://testphp.vulnweb.com/login.php");
	}

	@When("^enter (.*) and (.*)$")
	public void enter_username_and_password(String us,String pwd) throws InterruptedException {
		 System.out.println("enter username:"+us+" enter password:"+pwd);
		 driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/form/table/tbody/tr[1]/td[2]/input")).sendKeys(us);
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/form/table/tbody/tr[2]/td[2]/input")).sendKeys(pwd);
	}

	@And("Click on Login button")
	public void click_on_Login_button() throws InterruptedException {
		System.out.println("clicked login button");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/form/table/tbody/tr[3]/td/input")).click();
	}

	@Then("user should login and close browser")
	public void user_should_login_and_close_browser() throws InterruptedException, MalformedURLException, IOException {
		System.out.println("browser closed");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"sectionLinks\"]/ul/li[6]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/form/textarea")).sendKeys("Test Successfull");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/form/input[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"globalNav\"]/table/tbody/tr/td[2]/a")).click();
		Thread.sleep(4000);
		driver.quit();
	}
}
