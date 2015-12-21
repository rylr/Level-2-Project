import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class FileReader {
	
	BufferedReader bufferedReader;
	
	public FileReader(File f) {
		try {
			String text = new Scanner(f).useDelimiter("\\z").next();
			System.out.println(text);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
