package filereader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 * 
 * @author Vichaphol Thamsutikul
 *
 */
public class AppendStringBuffer implements Runnable {

	public static String readFileByLine(String filename) {
		FileReader reader = null;
		BufferedReader br = null;
		String result = "";
		String line;
		try {
			reader = new FileReader(filename);
			br = new BufferedReader(reader);
			while ((line = br.readLine()) != null)
				result = result + line + '\n';
		} catch (FileNotFoundException ex) {
			System.out.println(ex.getMessage());

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		if (br != null)
			try {
				br.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		return result;
	}

	public void run() {
		String alice = readFileByLine("src/Alice-in-Wonderland (new).txt");
		System.out.printf("Read %d chars", alice.length());
	}
}
