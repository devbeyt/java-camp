package lesson_4_inheritance;

public class CustomerManager {
        public void add(Customer customer) {
        	 System.out.println(customer.customerNumber + "  savaed");
        }
        
        public void addMultiple(Customer[] customers) {
        	for(Customer customer : customers) {
        		add(customer);
        	}
        }
}
