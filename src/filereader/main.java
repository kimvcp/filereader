package filereader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javafx.beans.binding.StringBinding;

public class main {

	public static void main(String[] args) {
		
		System.out.println("Reading Alice-in-Wonderland (new).txt using FileReader, append to String");
		TaskTimer.runTask(new AppendStringTask());
		System.out.println("Reading Alice-in-Wonderland (new).txt using FileReader, append to StringBuilder");
		TaskTimer.runTask(new AppendStringBuilder());
		System.out.println("Reading Alice-in-Wonderland (new).txt using BufferedReader, append lines to String");
		TaskTimer.runTask(new AppendStringBuffer());
	}
}
