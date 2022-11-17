package Components;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Mini_project_all_in_one.BrowserDriver;



public class sqtatoolsComponents {
	WebDriver driver=BrowserDriver.getCurrentDriver();
	@FindBy(xpath="//*[@id=\"btnAlert\"]") WebElement alert;
	@FindBy(xpath="//*[@id=\"ezAlerts-footer\"]/button") WebElement closeBtn;
	@FindBy(xpath="/html/body/div[1]/div/div/form/table/tbody/tr[7]/td[2]") WebElement City;
	@FindBy(xpath="/html/body/div[1]/div/div/form/table/tbody/tr[7]/td[2]/select/option[3]") WebElement option;
	@FindBy(xpath="//*[@id=\"studentname\"]") WebElement name;
	@FindBy(xpath="//*[@id=\"fathername\"]") WebElement father;
	@FindBy(xpath="//*[@id=\"paddress\"]") WebElement postal;
	@FindBy(xpath="//*[@id=\"personaladdress\"]") WebElement personal;
	@FindBy(xpath="/html/body/div[1]/div/div/form/table/tbody/tr[6]/td[2]/input[1]") WebElement male;
	@FindBy(xpath="/html/body/div[1]/div/div/form/table/tbody/tr[8]/td[2]/select/option[2]") WebElement course;
	@FindBy(xpath="/html/body/div[1]/div/div/form/table/tbody/tr[9]/td[2]/select/option[2]") WebElement District;
	@FindBy(xpath="/html/body/div[1]/div/div/form/table/tbody/tr[10]/td[2]/select/option[2]") WebElement state;
	@FindBy(xpath="//*[@id=\"pincode\"]") WebElement pincode;
	@FindBy(xpath="//*[@id=\"emailid\"]") WebElement email;
	@FindBy(xpath="/html/body/div[1]/div/div/form/table/tbody/tr[13]/td[1]/input") WebElement resetbtn;
	public sqtatoolsComponents Alert() {
		if(alert.isDisplayed()) {
			alert.click();
		}else {
			System.out.println("No Alert");
		}
	return this;
	
}
	public sqtatoolsComponents close() {
		closeBtn.click();
		return this;
	}
	public sqtatoolsComponents url2() {
		driver.get("https://stqatools.com/demo/");
		return this;
		
	}
	public sqtatoolsComponents name1(String value) {
		father.sendKeys(value);
		return this;
	}
	public sqtatoolsComponents name(String value) {
		name.sendKeys(value);
		return this;
		
	}
	public sqtatoolsComponents postal(String value) {
		postal.sendKeys(value);
		return this;
		
	}
	public sqtatoolsComponents personal(String value) {
		personal.sendKeys(value);
		return this;
	}
	public sqtatoolsComponents male() {
		male.click();
		return this;
	}
	public sqtatoolsComponents course() {
		course.click();
		return this;
	}
	public sqtatoolsComponents district() {
		District.click();
		return this;
	}
	public sqtatoolsComponents state() {
		state.click();
		return this;
	}
	public sqtatoolsComponents pincode(String value) {
		pincode.sendKeys(value);
		return this;
		
	}
	public sqtatoolsComponents email(String value) {
		email.sendKeys(value);
		return this;
	}
	public sqtatoolsComponents dropdown1() throws InterruptedException {
		City.click();
		Thread.sleep(2000);
		option.click();
		return this;
	}
	public sqtatoolsComponents scroll() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,900)");
		return this;
	}
	public sqtatoolsComponents reset() {
		resetbtn.click();
		return this;
	}
}
