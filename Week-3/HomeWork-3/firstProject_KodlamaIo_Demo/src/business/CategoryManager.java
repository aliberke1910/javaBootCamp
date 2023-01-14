package business;

import dataAcces.ICategoryDao;
import entities.Category;

public class CategoryManager extends Category implements ICategoryDao {

	@Override
	public void Select(Category category) {
		System.out.println("Kategori secildi : " + category.get_category());

	}

}
