package filereader;
/**
 * 
 * 
 * @author Vichaphol Thamsutikul
 *
 */
public class TaskTimer {

	private static Stopwatch stopwatch = new Stopwatch();

	public static void runTask(Runnable task) {
		stopwatch.start();
		task.run();
		stopwatch.stop();
		System.out.printf(" %.6f sec.\n", stopwatch.getElapsed());
	}

}
