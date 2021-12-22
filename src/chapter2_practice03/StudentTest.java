package chapter2_practice03;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
		//멤버변수 초기화 됨. 
		
		Student studentKim = new Student(123456,"Kim",3);
		System.out.println(studentKim.showStudentInfo());
		
		System.out.println(studentLee.showStudentInfo());

	}

}
