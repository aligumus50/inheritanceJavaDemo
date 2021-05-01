package inheritanceJavaDemo;

public class Main {

	public static void main(String[] args) {

		String[] courses = { "Java", "C#" };

		Student student1 = new Student();
		student1.setId(1);
		student1.setFirstName("Ali");
		student1.setLastName("Gms");
		student1.setEmailAddress("aaa@hotmail.com");
		student1.setPassword("123456");
		student1.setCourses(courses);
		student1.setCity("İstanbul");
		student1.setCountry("Türkiye");
		//System.out.println("Ad: " + student1.getFirstName() + " Kod: " + student1.getStudentNumber());

		Instructor instructor1 = new Instructor();
		instructor1.setId(1);
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiroğ");
		instructor1.setEmailAddress("ddd@hotmail.com");
		instructor1.setPassword("654321");
		instructor1.setCourses(courses);
		instructor1.setCity("Ankara");
		instructor1.setCountry("Türkiye");

		//System.out.println("Ad: " + instructor1.getFirstName() + " Kod: " + instructor1.getInstructorNumber());

		UserManager userManager = new UserManager();
		userManager.add(student1);
		userManager.login(student1);
		
		
		StudentManager studentManager = new StudentManager();
		studentManager.registerCourse(student1);
		studentManager.profileUpdate(student1);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.updateCourse(instructor1);
	
		
		
	}

}
