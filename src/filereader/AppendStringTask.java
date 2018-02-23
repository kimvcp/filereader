package filereader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * A class that read a text file one character at a time. Append all the
 * characters to a String and return the String.
 * 
 * @author Vichaphol Thamsutikul
 *
 */
public class AppendStringTask implements Runnable {
	/** Creating String data */
	private String data = "";

	/**
	 * Read a text file one character at a time. Append all the characters to a
	 * String.
	 * 
	 */
	public void run() {
		InputStream in = null;
		try {
			in = new FileInputStream("src/Alice-in-Wonderland (new).txt");
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
	}

	/**
	 * Print the words
	 * 
	 * @return the words
	 */
	@Override
	public String toString() {
		return String.format("Reading Alice-in-Wonderland (new).txt using FileReader, append to String\nRead %d chars",
				data.length());
	}
}
