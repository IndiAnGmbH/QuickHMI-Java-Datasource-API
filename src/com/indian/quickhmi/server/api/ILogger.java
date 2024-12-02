package com.indian.quickhmi.server.api;

/**
 * Interface for logging messages to the instances log.
 */
public interface ILogger {

	/**
	 * Logs an informational message to the instances log.
	 * @param message: The message to be logged.
	 */
	public void logInfo(String message);

	/**
	 * Logs a warning message to the instances log.
	 * @param message: The message to be logged.
	 */
	public void logWarn(String message);

	/**
	 * Logs an error message to the instances log.
	 * @param message: The message to be logged.
	 */
	public void logError(String message);

	/**
	 * Logs an error message together with an exception to the instances log.
	 * @param message: The message to be logged.
	 * @param ex: The exception to be logged.
	 */
	public void logError(String message, Exception ex);

	/**
	 * Logs an exception to the instances log.
	 * @param ex: The exception to be logged.
	 */
	public void logError(Exception ex);
	
}
