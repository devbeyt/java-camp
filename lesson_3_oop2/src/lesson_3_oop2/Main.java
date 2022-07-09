package lesson_3_oop2;


public class Main {

	public static void main(String[] args) {
		   Product product1 = new Product(1,"Acer",1200,"8 GB RAM",5,1000);
	       Product product2 = new Product();
	       Category category1 = new Category();
	       
	       product2.setId(2);
	       product2.setName("Samsung");
	       product2.setUnitPrice(750);
	       product2.setDiscount(4);
	       product2.setDetail("4 GB");       
	       category1.setId(1);
	       category1.setName("Notebooks");
	       
	       
	      System.out.println("Category id: " + category1.getId());
	      System.out.println("Category name: " + category1.getName());
	      System.out.println("Product name: " + product2.getName());
	      System.out.println("Unit Price after discout: " + product2.getUnitPriceAfterDsicount());
	       
	       
	       
	       System.out.println("***************** Add to cart method **********************");
	       
	       ProductManager productManager = new ProductManager();
	       productManager.AddToCart(product2);

	}

}
