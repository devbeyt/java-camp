package lesson_5_inheritance2;

public class EmailLogger extends Logger {
	@Override  // not important!
	public void log() {
     	System.out.println("Email logged");
     }
}
