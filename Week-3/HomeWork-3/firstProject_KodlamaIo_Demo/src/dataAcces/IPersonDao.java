package dataAcces;

import entities.Person;

public interface IPersonDao {
	void Add(Person person);

	void Remove(Person person);

	void Update(Person person);
}
