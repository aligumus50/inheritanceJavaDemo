package inheritanceJavaDemo;

public class Student extends User{

	String studentNumber;

	public String getStudentNumber() {
		return this.studentNumber = "ST" + this.id;
	}

}
