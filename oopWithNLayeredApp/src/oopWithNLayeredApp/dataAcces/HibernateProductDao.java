package oopWithNLayeredApp.dataAcces;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao {
	public void add(Product product) {
		// Sadece ve sadece DB erişim kodları buraya yazılır.... SQL bilmek gerekir
		// bunun için.
		System.out.println("Hibernate ile veritabanına eklendi");
	}
}
