package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class elements {
	@FindBy(xpath="//*[@id=\\\"app\\\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input") WebElement username;
	@FindBy(xpath="//*[@id=\\\"app\\\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input") WebElement Password;
	@FindBy(xpath="//*[@id=\\\"app\\\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button") WebElement button;
	@FindBy(xpath="//*[@id=\\\"app\\\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p") WebElement Error;
	@FindBy(xpath="//*[@id=\\\"app\\\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p") WebElement User;
	@FindBy(xpath="//*[@id=\\\"app\\\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a") WebElement Logout;
	public void username(String s) {
		username.sendKeys(s);
		
	}
	public void password(String s) {
		Password.sendKeys(s);
		
	}
	public void login() {
		button.click();
		
	}
	public void user() {
		User.click();
		
	}
	public void logout() {
		Logout.click();
		
	}
	public void login(String username,String password) {
		this.username(username);
		this.password(password);
		this.login();
	}
}
