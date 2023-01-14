package firstProject_KodlamaIo_Demo;

import business.CategoryManager;
import business.CourseManager;
import business.PersonManager;
import core.BaseLogger;
import core.DatabaseLogger;
import core.FileLogger;
import core.MailLogger;
import dataAcces.BaseApi;
import dataAcces.PersonDaoForHibernate;
import dataAcces.PersonDaoForJdbc;
import entities.Course;

public class Main {

	public static void main(String[] args) throws Exception {
		
		//Eğitmenlerimizi çağırabiliriz. İstenilen eğitmen, "PersonManager" class'ından değiştirilebilir.
		PersonManager personManager = new PersonManager();
		personManager.Add(personManager);

		
		//JDBC ile yazdırılmak istenilirse, "PersonDaoForJdbc" ile new'lersek yazdırabiliriz.
		BaseApi apiManager = new PersonDaoForHibernate(); 
		apiManager.Add();

		
		//İstenilen loglama şekli ile loglama yapılabilir. Loglama sistemi arttırılabilir veya azaltılabilir şekildedir.
		BaseLogger baseLogger = new FileLogger(); 
		BaseLogger baseLogger2 = new MailLogger();
		BaseLogger baseLogger3 = new DatabaseLogger();
		baseLogger.Log("Loglandı!");
		baseLogger2.Log("Loglandı!");
		baseLogger3.Log("Loglandı");
		
		
		//Kategori isimlerimizi çağırabiliriz.
		CategoryManager categoryManager = new CategoryManager(); 
		categoryManager.Select(categoryManager);
		
		
		//Kurs isim, açıklama ve fiyatı ile çağırabiliriz. Kurs fiyatını, "Course" class'ından <=0 yaparsak hata fırlatma ile karşılaşılır.
		Course course = new Course(); 
		CourseManager courseManager = new CourseManager();
		courseManager.unitPrice(courseManager);
		System.out.println(course.getCourse1Name() + " // " + course.getCourse1Description() + " // Fiyatı : " + course.getUnitPrice1());
		System.out.println(course.getCourse2Name() + " // " + course.getCourse2Description() + " // Fiyatı : " + course.getUnitPrice2());
		System.out.println(course.getCourse3Name() + " // " + course.getCourse3Description() + " // Fiyatı : " + course.getUnitPrice3());
		
		
		
		
	}

}
