package inheritanceJavaDemo;

public class InstructorManager extends UserManager{

	public void addCourse(User user) {
		System.out.println(user.getFirstName() +  " e�itmeni yeni kurs ekledi");
	}
	
	public void removeCourse(User user) {
		System.out.println(user.getFirstName() + " e�itmeni kursu sildi");
	}
	
	public void updateCourse(User user) {
		System.out.println(user.getFirstName() +" "+ user.getLastName() + " e�itmeni kursu g�ncelledi");
	}
	
}
