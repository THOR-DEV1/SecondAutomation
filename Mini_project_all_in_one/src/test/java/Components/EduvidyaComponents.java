package Components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class EduvidyaComponents {
@FindBy(xpath="//*[@id=\"cssmenu\"]/ul/li[2]/a") WebElement college;
@FindBy(xpath="//*[@id=\"ddl_Category\"]/option[18]") WebElement course;
@FindBy(xpath="//*[@id=\"ddl_Category\"]") WebElement list;
@FindBy(xpath="//*[@id=\"ddl_City\"]") WebElement city;
@FindBy(xpath="//*[@id=\"btnSearch\"]") WebElement search;
@FindBy(xpath="//*[@id=\"pnllist\"]/div[2]/ul/li[1]/div[2]/a") WebElement text;
public EduvidyaComponents collegebox() {
	college.click();
	return this;
	
}
public EduvidyaComponents corseList() throws InterruptedException {
	list.click();
	Select select = new Select(list);
	Thread.sleep(1000);
	select.selectByValue("22");
	return this;
	
}
public EduvidyaComponents cities() {
	city.click();
	Select select = new Select(city);
	select.selectByValue("7");
	return this;
	
}
public EduvidyaComponents searchbtn() {
	search.click();
	return this;
	
}
public EduvidyaComponents verify() {
	String s=text.getText();
	String s2="Asan Memorial College of Arts and Science";
	if(s.equals(s2)) {
		System.out.println("true");
	}else {
		System.out.println("false");
	}
	return this;
	
}
}
