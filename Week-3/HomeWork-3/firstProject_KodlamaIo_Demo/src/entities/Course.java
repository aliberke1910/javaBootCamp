package entities;

public class Course {
	
	String course1Name = "Kurs Adı : C# ";
	String course1Description = "C# Yazılımcı Yetiştirme Kampı";
	int unitPrice1 = 1910;
	
	String course2Name = "Kurs Adı : Java ";
	int unitPrice2 = 1995;
	String course2Description = "Java Yazılımcı Yetiştirme Kampı";
	
	String course3Name = "Kurs Adı : JavaScript ";
	String course3Description = "JavaScript Yazılımcı Yetiştirme Kampı";
	int unitPrice3 = 2023;
	public int setUnitPrice1;
	
	public Course() {
		this.course1Name = course1Name;
		this.course1Description = course1Description;
		this.unitPrice1 = unitPrice1;
		
		this.course2Name = course2Name;
		this.course2Description = course2Description;
		this.unitPrice2 = unitPrice2;
		
		this.course3Name = course3Name;
		this.course3Description = course3Description;
		this.unitPrice3 = unitPrice3;
	}
	
	
	public String getCourse1Name() {
		return course1Name;
	}
	public void setCourse1Name(String course1Name) {
		this.course1Name = course1Name;
	}
	public String getCourse1Description() {
		return course1Description;
	}
	public void setCourse1Description(String course1Description) {
		this.course1Description = course1Description;
	}
	public int getUnitPrice1() {
		return unitPrice1;
	}
	public void setUnitPrice1(int unitPrice1) {
		this.unitPrice1 = unitPrice1;
	}
	public String getCourse2Name() {
		return course2Name;
	}
	public void setCourse2Name(String course2Name) {
		this.course2Name = course2Name;
	}
	public int getUnitPrice2() {
		return unitPrice2;
	}
	public void setUnitPrice2(int unitPrice2) {
		this.unitPrice2 = unitPrice2;
	}
	public String getCourse2Description() {
		return course2Description;
	}
	public void setCourse2Description(String course2Description) {
		this.course2Description = course2Description;
	}
	public String getCourse3Name() {
		return course3Name;
	}
	public void setCourse3Name(String course3Name) {
		this.course3Name = course3Name;
	}
	public String getCourse3Description() {
		return course3Description;
	}
	public void setCourse3Description(String course3Description) {
		this.course3Description = course3Description;
	}
	public int getUnitPrice3() {
		return unitPrice3;
	}
	public void setUnitPrice3(int unitPrice3) {
		this.unitPrice3 = unitPrice3;
	}
			
	
}
