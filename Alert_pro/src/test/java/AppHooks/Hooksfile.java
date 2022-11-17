package AppHooks;

import Alerts_pro.Browserge;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooksfile {
@Before
public void startbrowser() {
	Browserge.getCurrentDriver("chrome").get("http://demo.automationtesting.in/Alerts.html");
}
@After
public void closebrowser() {
	Browserge.getCurrentDriver("chrome").close();
}

}