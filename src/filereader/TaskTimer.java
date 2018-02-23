package filereader;

/**
 * A class that performs Runnable task and print the result.
 * 
 * @author Vichaphol Thamsutikul
 *
 */
public class TaskTimer {
	
	/** Creating Stopwatch's object */
	private static Stopwatch stopwatch = new Stopwatch();
	
	/**
	 * Perform the task and print the time in second. 
	 * 
	 * @param task
	 *            Runnabla's object
	 */
	public static void runTask(Runnable task) {
		stopwatch.start();
		task.run();
		stopwatch.stop();
		System.out.printf("%s %.6f sec.\n",task.toString(), stopwatch.getElapsed());
	}

}
