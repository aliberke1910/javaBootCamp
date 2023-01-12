package classesWithAttributes;

public class Product {

	public Product (int id, String name, String description, double price, int stockAmount, String Renk) {
		System.out.println("Yapıcı blok çalıştı");
		this.id=id;
		this.renk=renk;
		this.name=name;
		this.description=description;
		this.price=price;
		this.stockAmount=stockAmount;
	}
	
	public Product () {
		
	}
	
	// Attribute | Field = Özellikler
	private int id;
	private String name;
	String description;
	double price;
	int stockAmount;
	String renk;
	String kod;

	// getter
	public int getId() {
		return id;
	}

	// setter
	public void setId(int id) {
		id = id;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public String getKod() {
		return this.name.substring(0,1) + id;
	
	}
}
