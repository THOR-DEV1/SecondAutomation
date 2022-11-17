import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class screenshot {
 public void shot(WebDriver driver) throws IOException {
	 TakesScreenshot shot=(TakesScreenshot) driver;
		File file=shot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file,new File("./pics/snot.png"));
 }
}
