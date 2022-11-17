package temp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TS_readproperties {
	static FileInputStream fis;
	static Properties obj;
	public static void main(String[] args) throws IOException {
		obj=new Properties();
		fis =new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\Config.properties");
		obj.load(fis);
		System.out.println(obj.getProperty("testurl"));
		System.out.println(obj.getProperty("browser"));
		
		//OR
		fis =new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\OR.properties");
		obj.load(fis);
		System.out.println(obj.getProperty("txtun"));
		System.out.println(obj.getProperty("txtpwd"));
	}

}
