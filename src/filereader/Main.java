package filereader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javafx.beans.binding.StringBinding;

/**
 * Main class for creating task objects, creates a TaskTimer, and then uses
 * TaskTimer to run the tasks.
 * 
 * @author Vichaphol Thamsuthikul
 *
 */
public class Main {

	public static void main(String[] args) {
		TaskTimer taskTimer = new TaskTimer();
		System.out.println("Reading Alice-in-Wonderland (new).txt using FileReader, append to String");
		taskTimer.runTask(new AppendStringTask());
		taskTimer.runTask(new AppendStringBuilder());
		System.out.println("Reading Alice-in-Wonderland (new).txt using BufferedReader, append lines to String");
		taskTimer.runTask(new AppendStringBuffer());
	}
}
