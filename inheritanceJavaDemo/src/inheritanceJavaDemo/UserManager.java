package inheritanceJavaDemo;

public class UserManager {
	
	public void add(User user) {

		System.out.println(user.getFirstName() + " " + user.getLastName() + " kullanýcýsý eklendi.");
	}

	public void delete(User user) {

		System.out.println(user.getFirstName() + " " + user.getLastName() + " kullanýcýsý silindi.");
	}

	public void update(User user) {

		System.out.println(user.getFirstName() + " " + user.getLastName() + " kullanýcýsýnýn bilgileri güncellendi.");
	}
	
	public void login(User user) {
		
		System.out.println(user.getFirstName() + " kullanýcýsý sisteme giriþ yaptý.");
	}
	
	public void logout(User user) {
		
		System.out.println(user.getFirstName() + " kullanýcýsý sistemden çýkýþ yaptý.");
	}
}
