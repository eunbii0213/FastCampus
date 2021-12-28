package chapter2.practice06;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student(100,"Lee");
		studentLee.setKoreaSubject("국어", 100);
		studentLee.setMathSubject("수학", 90);
		
		Student studentKim = new Student(101,"Kim");
		studentKim.setKoreaSubject("국어", 80);
		studentKim.setMathSubject("영어", 95);
		
		studentLee.showStudentScore();
		studentKim.showStudentScore();
		
	}

}
