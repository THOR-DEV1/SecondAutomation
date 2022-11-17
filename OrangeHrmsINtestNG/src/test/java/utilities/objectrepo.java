package utilities;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class objectrepo {

	public Properties obj() throws IOException {
		Properties obj=new Properties();
		FileInputStream objfile=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\OR.properties");
		obj.load(objfile);
		return obj;
	}
	
	public void demo() {
		System.out.println("Called");
	}
}
