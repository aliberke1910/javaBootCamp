package entities;

public class Person {

	int _id = 1;
	String _name = "Engin";
	String _lastName = "DEMIROG";

	int _id2 = 2;
	String _name2 = "Derin";
	String _lastName2 = "DEMIROG";

	public Person() {
		this._id = _id;
		this._name = _name;
		this._lastName = _lastName;

		this._id2 = _id2;
		this._name2 = _name2;
		this._lastName2 = _lastName2;
	}

	public int getId() {
		return _id;
	}

	public void setId(int id) {
		this._id = id;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		this._name = name;
	}

	public String getLastName() {
		return _lastName;
	}

	public void setLastName(String lastName) {
		this._lastName = lastName;
	}

	public int get_id2() {
		return _id2;
	}

	public void set_id2(int _id2) {
		this._id2 = _id2;
	}

	public String get_name2() {
		return _name2;
	}

	public void set_name2(String _name2) {
		this._name2 = _name2;
	}

	public String get_lastName2() {
		return _lastName2;
	}

	public void set_lastName2(String _lastName2) {
		this._lastName2 = _lastName2;
	}

}