package utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import base.Test_Base;
public class TestUtil extends Test_Base{
	public static String screenshotPath=System.getProperty("user.dir") + "\\src\\test\\resources\\snapshots\\";
    public static String screenshotName;
	public static void capturescreenshot() throws IOException{
		Date dobj = new Date();
    	System.out.println(dobj);
    	String timestamp = dobj.toString().replace(" ","_").replace(" ",":");
    	screenshotName = timestamp+".jpg";
    	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	FileUtils.copyFile(scrFile, new File(screenshotPath + screenshotName));
	}
}
