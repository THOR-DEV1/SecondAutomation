package InputElements;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Config.BrowserDriver;
import junit.framework.Assert;


public class CreateElements {
	WebDriver driver=BrowserDriver.getCurrentDriver();
	
	@FindBy(xpath="//*[@id=\"tblcrtac\"]/tbody/tr[36]/td/a[1]")  WebElement TermsCondtionsLink;
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div[1]") WebElement TermsTitle;
	
	
	public CreateElements CreateLinks() {
        driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		return this;
		
	}
	
	public CreateElements CountLinks() {
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println("Total no.of links: "+allLinks.size()+"\n");
		for(WebElement link:allLinks){
			 System.out.println(link.getText() + " - " + link.getAttribute("href")+'\n');
			 }
		return this;
		
	}
	public  CreateElements ClickOnTerms() throws InterruptedException {
		TermsCondtionsLink.click();
		Thread.sleep(2000);
		return this;
		
	}
	public CreateElements Switch(int un) {
		ArrayList<String> wid = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(wid.get(un));
		return this;
		
	}
}
