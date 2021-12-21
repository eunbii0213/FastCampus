package chapter2_practice02;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student();
		//student 객체 하나 생성
		studentLee.studentID=12345;
		studentLee.setStudentName("Lee");
		studentLee.address="울산 삼산동";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student();
		studentKim.studentID = 54321;
		studentKim.studentName="Kim";
		studentKim.address="경주 석장동";
		
		studentKim.showStudentInfo();
	}

}
