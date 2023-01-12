package oopWithNLayeredApp.dataAcces;

import oopWithNLayeredApp.entities.Product;

public class jdbcProductDao implements ProductDao {
	public void add(Product product) {
		// Sadece ve sadece DB erişim kodları buraya yazılır.... SQL bilmek gerekir
		// bunun için.
		System.out.println("JDBC ile veritabanına eklendi");
	}
}

//Hibernate