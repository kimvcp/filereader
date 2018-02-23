package filereader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * A class that read a text file one character at a time. Append all the
 * characters to a String.
 * 
 * @author Vichaphol Thamsutikul
 *
 */
public class AppendStringBuffer implements Runnable {
	/** Creating String result */
	private String result = "";

	/**
	 * Read the file as text one line at a time using a BufferedReader, and append
	 * the result to a String.
	 * 
	 */
	@Override
	public void run() {
		FileReader reader = null;
		BufferedReader br = null;
		String result = "";
		String line;
		try {
			reader = new FileReader("src/Alice-in-Wonderland (new).txt");
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
	}

	/**
	 * Print the words
	 * @return the words
	 */
	@Override
	public String toString() {
		return String.format(
				"Reading Alice-in-Wonderland (new).txt using BufferedReader, append lines to String\nRead %d chars",
				result.length());
	}

}
