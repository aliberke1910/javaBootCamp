package business;

import dataAcces.ICourseDao;
import entities.Course;

public class CourseManager extends Course implements ICourseDao {

	@Override
	public void unitPrice(Course course) throws Exception {
		
		
		course.getCourse1Name();
		course.getCourse2Name();
		course.getCourse3Name();

		if (course.getUnitPrice1() <= 0) {

			throw new Exception("Bu kursun fiyatı 0 veya 0'dan küçük olamaz!");
		}

		if (course.getUnitPrice2() <= 0) {

			throw new Exception("Bu kursun fiyatı 0 veya 0'dan küçük olamaz!");
		}

		if (course.getUnitPrice3() <= 0) {

			throw new Exception("Bu kursun fiyatı 0 veya 0'dan küçük olamaz!");
		}

	}

}
