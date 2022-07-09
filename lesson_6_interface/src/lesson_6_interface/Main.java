package lesson_6_interface;

public class Main {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer(1,"Jhone","Doe");
	
		 Logger[] loggers = {new DataBaseLogger(),new EmailLogger(),new SmsLogger()};
		
         CustomerManager customerManager = new CustomerManager(loggers);
         customerManager.add(customer1);
	}

}
