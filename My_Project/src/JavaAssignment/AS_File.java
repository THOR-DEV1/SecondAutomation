package JavaAssignment;

import java.io.File;

public class AS_File {

	public static void main(String[] args) {
		File file=new File("JAVAfile.java");
		try {
			boolean value=file.createNewFile();
			if(value) {
				System.out.println("New Java file is created");
			}
			else {
				System.out.println("file already exists");
			}
		}
			catch(Exception e) {
				e.getStackTrace();
			}
	}

}
