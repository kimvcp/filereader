package filereader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * A class that read a text file one character at a time. Append all the characters to a
 * StringBuilder.
 * 
 * @author Vichaphol Thamsutikul
 *
 */
public class AppendStringBuilder implements Runnable {
	/** Creating StringBuilder object */
	private StringBuilder sBuilder = new StringBuilder();

	/**
	 * Read a file to a StringBuilder object.
	 * 
	 */
	@Override
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
				sBuilder.append((char) c);
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

	@Override
	public String toString() {
		return String.format(
				"Reading Alice-in-Wonderland (new).txt using FileReader, append to StringBuilder\nRead %d chars",
				sBuilder.length());
	}
}
