package business;

import dataAcces.IPersonDao;
import entities.Person;

public class PersonManager extends Person implements IPersonDao {

	Person person;

	@Override
	public void Add(Person person ) {
		System.out.println("Eğitmeniniz Eklendi : " + person.getName() + " " + person.getLastName());

	}

	@Override
	public void Remove(Person person) {
		System.out.println("Eğitmeniniz Kaldırıldı : " + person.get_name2() + " " + person.get_lastName2());

	}

	@Override
	public void Update(Person person) {
		System.out.println("Eğitmeniniz Güncellendi : " + person.get_name2() + " " + person.get_lastName2());

	}

}
