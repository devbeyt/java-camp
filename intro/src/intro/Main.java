package intro;

public class Main {

	public static void main(String[] args) {
		
		//variables !!!
		String productName = "Notebook";
		double price = 124.50;
		int unitsInStock = 15;
		boolean isLoading = false;
		
		System.out.println("Product Name is " + productName );
        System.out.println("Product Price is " + price );
        System.out.println("Product UnitsInStock " + unitsInStock );
        
        
        
        System.out.println("******************** Array (referans type) *************************");
   		
        
		String[] products = {"Notebook","Phone","ByCicle","Table"};	
		
		int[] numbers = {10,20,30,40,50};
       
       if(isLoading) {
    	   System.out.println("Loading...");
       }else {
    	   // for 1
    	   for(String product : products) {
    		   System.out.println(product);
    	   }
       }
       
       
       // for 2 
       for(int i = 0; i < products.length; i++) {
    	   System.out.println(products[i]);
       }
       
	}

}
