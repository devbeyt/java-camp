package lesson_6_interface;

public class CustomerManager {
	 
//	    private Logger loggers;
	
//  public CustomerManager(Logger logger) {
//	this.logger = logger;
//    }
	
	    private Logger[] loggers;
	 
	    
	    public CustomerManager(Logger[] loggers) {
	    	this.loggers = loggers;
	    }
	    

	   public void add(Customer customer){
    	   System.out.println("Customer added: " + customer.getFirstName()); 
    	   Utils.RunLoggers(loggers, customer.getFirstName());
    	   
       }
       
       public void delete(Customer customer) {
    	   System.out.println("Customer deleted: "+ customer.getFirstName());   
    	   Utils.RunLoggers(loggers, customer.getFirstName());
       }
} 
