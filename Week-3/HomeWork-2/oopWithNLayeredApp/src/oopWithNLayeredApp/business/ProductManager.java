package oopWithNLayeredApp.business;

import java.util.Iterator;
import java.util.List;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAcces.HibernateProductDao;
import oopWithNLayeredApp.dataAcces.ProductDao;
import oopWithNLayeredApp.dataAcces.jdbcProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	private ProductDao productDao;
	private Logger[] loggers;

	public ProductManager(ProductDao productDao, Logger[] loggers) {
		this.productDao = productDao;
		this.loggers = loggers;
	}

	public void add(Product product) throws Exception {
		// İş kurallarını buraya yazıyoruz.
		if (product.getUnitPrice() < 10) {
			throw new Exception("Ürün fiyatı 10'dan küçük olamaz");
		}
		productDao.add(product);
		
		for (Logger logger : loggers) {
			logger.log(product.getName());
		}

	}
}
