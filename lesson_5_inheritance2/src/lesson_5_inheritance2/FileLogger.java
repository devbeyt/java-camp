package lesson_5_inheritance2;

public class FileLogger extends Logger{
	 @Override  // not important!
	 public void log() {
     	System.out.println("logged to FIle");
     }
}
