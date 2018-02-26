# Filereader
## by Vichaphol Thamsuthikul 6010545897

- This project is to testing how fast the file's readers can read in second, containing String, String Builder, and Buffered Reader. 

----------------------------------------------------|-----------------:
|													
|	Read file 1-char at a time to String 			| 0.681183 second
|														
|	Read file 1-char at a time to StringBuilder 	| 0.002982 second
|														
|	Read file line at a time using BufferedReader 	| 0.019300 second 
|													
----------------------------------------------------|-----------------:

## Explanation of Results

- StringBuilder is the fastest file reader because it collects data as the array so when it invokes the data, it doesn't need to create a new string and remove the old data like String. Actually BufferReader is the fastest, but it read as String in the method so it can be slower than StringBuilder. If you make it read as StringBuilder, it will be the fastest.
  