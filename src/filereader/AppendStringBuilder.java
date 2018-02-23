package filereader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class AppendStringBuilder implements Runnable {

	public static String readFileToStringBuilder(String filename) {
		StringBuilder sBuilder = null;
		InputStream in = null;
		try {
			sBuilder = new StringBuilder();
			in = new FileInputStream(filename);
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
		return sBuilder.toString();
	}

	public void run() {
		String alice = readFileToStringBuilder("src/Alice-in-Wonderland (new).txt");
		System.out.printf("Read %d chars", alice.length());
	}
}
