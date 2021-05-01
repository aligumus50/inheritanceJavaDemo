package inheritanceJavaDemo;

public class UserManager {
	
	public void add(User user) {

		System.out.println(user.getFirstName() + " " + user.getLastName() + " kullan�c�s� eklendi.");
	}

	public void delete(User user) {

		System.out.println(user.getFirstName() + " " + user.getLastName() + " kullan�c�s� silindi.");
	}

	public void update(User user) {

		System.out.println(user.getFirstName() + " " + user.getLastName() + " kullan�c�s�n�n bilgileri g�ncellendi.");
	}
	
	public void login(User user) {
		
		System.out.println(user.getFirstName() + " kullan�c�s� sisteme giri� yapt�.");
	}
	
	public void logout(User user) {
		
		System.out.println(user.getFirstName() + " kullan�c�s� sistemden ��k�� yapt�.");
	}
}
