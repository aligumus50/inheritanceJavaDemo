package inheritanceJavaDemo;

public class StudentManager extends UserManager{

	
	public void registerCourse(Student student) {
		
		System.out.println(student.getStudentNumber() + " numaral� ��rencinin kurs kayd� al�nd�." );
	}
	
	public void profileUpdate(Student student) {
		
		System.out.println(student.getStudentNumber() + " numaral� ��renci bilgilerini g�ncelledi." );
	}

}
