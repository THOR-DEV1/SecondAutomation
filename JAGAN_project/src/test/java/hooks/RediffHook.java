package hooks;

import Config.BrowserDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class RediffHook {
@Before
public void StartBrowser() {
	BrowserDriver.getCurrentDriver("chrome").get("https://www.rediff.com/");
	
}
@After
public void close(){
		BrowserDriver.getCurrentDriver().close();
	}

}

