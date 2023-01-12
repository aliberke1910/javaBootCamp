package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		//Product product = new Product(1, "Laptop", "Monster Abra A5 V17.2", 3000, 2, "Siyah");
		
		Product product = new Product ();
		product.setName("Laptop");
		product.setId(1);
		product.description = "Monster Abra A5 V17.2";
		product.price = 5000;
		product.stockAmount = 3;
		
		ProductManager productManager = new ProductManager ();
		productManager.Add(product);

		System.out.println(product.getName());
		System.out.println(product.getKod());
	}

}
