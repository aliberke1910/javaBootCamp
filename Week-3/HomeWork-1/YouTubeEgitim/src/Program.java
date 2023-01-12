import java.io.Console;

public class Program {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager());
		customerManager.GiveCredit();

	}

}

class CreditManager {
	public void Calculate() {
		System.out.println("Hesaplandı");
	}

	public void Save() {
		System.out.println("Kredi verildi");
	}
}

interface ICreditManager {
	void Calculate();

	void Save();
}

abstract class BaseCreditManager implements ICreditManager {

	public abstract void Calculate();

	public void Save() {
		System.out.println("Kaydedildi");
	}
}

class TeacherCreditManager extends BaseCreditManager implements ICreditManager {

	public void Calculate() {
		System.out.println("Öğretmen kredisi hesaplandı");

	}
}

class MilitaryCreditManager implements ICreditManager {

	public void Calculate() {
		System.out.println("Asker kredisi hesaplandı");

	}

	public void Save() {

	}

}

class Customer {

	public Customer() // Constructor bloğu.
	{
		System.out.println("Müşteri nesnesi başlatıldı.");
	}

	public int id;
	public String city;
}

class Person extends Customer {
	public String firstName;
	public String lastName;
	String nationalIdentity;
}

class Company extends Customer {
	String companyName;
	public String taxNumber;
}

class CustomerManager {

	private Customer _customer;
	private ICreditManager _creditManager;

	public CustomerManager(Customer customer, ICreditManager creditManager) {
		_customer = customer;
		_creditManager = creditManager;
	}

	public void Save() {
		System.out.println("Müşteri kaydedildi : ");
	}

	public void Delete() {
		System.out.println("Müşteri silindi : ");
	}

	public void GiveCredit() {
		_creditManager.Calculate();

		System.out.println("Kredi verildi");
	}
}