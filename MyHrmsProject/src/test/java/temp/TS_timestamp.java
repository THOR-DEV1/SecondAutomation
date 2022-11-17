package temp;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TS_timestamp {

	public static void main(String[] args) {
		Date dobj=new Date();
		System.out.println(dobj);
		String timestamp=dobj.toString().replace(" ","_").replace(":", "_");
		System.out.println(timestamp);
		DateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy h-m-s");
		Date date=new Date();
		System.out.println(dateFormat.format(date));
		String s = dateFormat.format(date);
    	String timestamp1 = s.replace(" ","_").replace("-","_");
    	System.out.println(timestamp1);
	}
	

}
