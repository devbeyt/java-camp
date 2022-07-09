package lesson_6_interface;

public class DataBaseLogger implements Logger {

	@Override
	public void log(String message) {
		
		System.out.println("Logged to Db: " + message);
	}

}
