package inheritance.ch7_3;

public class Student extends People {
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		// People.java��  People() ������ ȣ��
		super(name, ssn);
		this.studentNo = studentNo;
	}
}
