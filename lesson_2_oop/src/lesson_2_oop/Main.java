package lesson_2_oop;

public class Main {

	public static void main(String[] args) {
		
		// products
		Product product1 = new Product(1,"Notebook",750,"8 GB RAM");
		
		
		Product product2 = new Product();
		product2.id = 2;
		product2.name = "Notebook";
		product2.unitPrice = 1200;
		
		Product product3 = new Product();
		product3.id = 3;
		product3.name = "Table";
		product3.unitPrice = 745.50;
		
				
		Product[] products = {
			 	product1,
			 	product2,
			 	product3
		};
		
		
		
		for(Product product : products) {
			System.out.println(product.name + " - " + product.unitPrice);
		}
		
		
		ProductManager productManager = new ProductManager();
		productManager.AddToCart(product1);
		productManager.AddToCart(product2);

	}

}
