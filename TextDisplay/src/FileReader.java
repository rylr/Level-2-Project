import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class FileReader {
	
	BufferedReader bufferedReader;
	
	public static String setFile(File f) {
		String output = "";
		try {
			output = new Scanner(f).useDelimiter("\\z").next();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return output;
	}
}
