package inheritanceJavaDemo;

public class StudentManager extends UserManager{

	
	public void registerCourse(Student student) {
		
		System.out.println(student.getStudentNumber() + " numaralý öðrencinin kurs kaydý alýndý." );
	}
	
	public void profileUpdate(Student student) {
		
		System.out.println(student.getStudentNumber() + " numaralý öðrenci bilgilerini güncelledi." );
	}

}
