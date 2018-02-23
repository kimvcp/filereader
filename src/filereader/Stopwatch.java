package filereader;

import java.sql.Time;
import java.util.Timer;

/**
 * 
 * 
 * @author Vichaphol Thamsutikul
 *
 */
public class Stopwatch {
	/** the value of nanosecond */
	private static final double NANOSECOND = 1.0E-9;
	/** the start time of the watch */
	private long startTime;
	/** the stop time of the watch */
	private long stopTime;
	/** for checking if it's running or not */
	private boolean running;

	/**
	 * Reset the stop watch and start if if stop watch is not running. If the stop
	 * watch is already running then start does nothing.
	 * 
	 */
	public void start() {
		if (running)
			return;
		running = true;
		startTime = System.nanoTime();
	}

	/**
	 * Stop the stop watch. If the stop watch is already stopped, then stop does
	 * nothing.
	 */
	public void stop() {
		if (!running)
			return;
		stopTime = System.nanoTime();
		running = false;
	}

	/**
	 * Test if the stop watch is running or not.
	 * 
	 * @return true if the stop watch is running, false if stop watch is stopped.
	 */
	public boolean isRunning() {
		return running;
	}

	/**
	 * Get the elapsed time in second
	 * 
	 * @return the elapsed time in seconds, as accurately as possible.
	 */
	public double getElapsed() {
		if (running)
			return (System.nanoTime() - startTime) * NANOSECOND;
		else
			return (stopTime - startTime) * NANOSECOND;
	}
}
