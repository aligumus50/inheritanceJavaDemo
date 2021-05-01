package inheritanceJavaDemo;

public class InstructorManager extends UserManager{

	public void addCourse(User user) {
		System.out.println(user.getFirstName() +  " eðitmeni yeni kurs ekledi");
	}
	
	public void removeCourse(User user) {
		System.out.println(user.getFirstName() + " eðitmeni kursu sildi");
	}
	
	public void updateCourse(User user) {
		System.out.println(user.getFirstName() +" "+ user.getLastName() + " eðitmeni kursu güncelledi");
	}
	
}
