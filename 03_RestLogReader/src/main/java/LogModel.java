import java.time.LocalDateTime;

/**
 * @author JefeMaestro
 * @since 02.05.2016
 * Definition of the Log Model that will be use on printed on the console
 *
 */
public class LogModel {

	private LocalDateTime timestamp;

	private String logLevel;

	private String className;

	private String taskName;

	private String message;

	private String exceptionMessage;

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public String getLogLevel() {
		return logLevel;
	}

	public void setLogLevel(String logLevel) {
		this.logLevel = logLevel;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getExceptionMessage() {
		return exceptionMessage;
	}

	public void setExceptionMessage(String exceptionMessage) {
		this.exceptionMessage = exceptionMessage;
	}

	@Override
	public String toString() {
		return "LogModel{" +
				"timestamp=" + timestamp +
				", logLevel='" + logLevel + '\'' +
				", className='" + className + '\'' +
				", taskName='" + taskName + '\'' +
				", message='" + (exceptionMessage == null ?  message : exceptionMessage) + '\'' +
				//", message='" +  message  + '\'' +
				", exceptionMessage='" + exceptionMessage+ '\'' +
				'}';
	}
}
