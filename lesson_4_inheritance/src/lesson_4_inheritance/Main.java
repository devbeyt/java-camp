package lesson_4_inheritance;

public class Main {

	public static void main(String[] args) {
		
          individualCustomer individual = new individualCustomer();
          individual.customerNumber = "123456789";
          
          corporateCustomer corporate = new corporateCustomer();
          corporate.customerNumber ="987654321";
          
          Customer [] customers = {individual,corporate};
          
          CustomerManager customerManager = new CustomerManager();
          customerManager.add(corporate);
          System.out.println("******* Add Multiple ***********");
          customerManager.addMultiple(customers);
          
          
	}

}
