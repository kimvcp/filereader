package filereader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * A class that read a text file one character at a time. Append all the characters to a
 * String.
 * 
 * @author Vichaphol Thamsutikul
 *
 */
public class AppendStringTask implements Runnable {
	/**
	 * Read a text file one character at a time. Append all the characters to a
	 * String and return the String.
	 * 
	 * @param filename
	 * @return the data
	 */
	public String readFileToString(String filename) {
		String data = "";
		InputStream in = null;
		try {
			in = new FileInputStream(filename);
			InputStreamReader reader = new InputStreamReader(in);
			int c;
			while (true) {
				c = reader.read();
				if (c < 0)
					break;
				data += (char) c;
			}
		} catch (FileNotFoundException ex) {
			System.out.println(ex.getMessage());

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		if (in != null)
			try {
				in.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		return data;
	}

	public void run() {
		String alice = readFileToString("src/Alice-in-Wonderland (new).txt");
		System.out.printf("Read %d chars", alice.length());
	}

}
