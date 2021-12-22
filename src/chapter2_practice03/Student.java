package chapter2_practice03;

public class Student {
	public int studentNumber;
	public String studentName;
	public int grade;
	
	public Student() {
		System.out.println("student 생성");
	}
	
	public Student(int studentNumber, String studentName, int grade) {
		this.studentName= studentName;
		this.grade = grade;
		this.studentNumber = studentNumber;
	}
	
	public String showStudentInfo() {
		return studentName+"학생의 학번은 "+studentNumber+"이고, "+grade+"학년 입니다.";
		
	}
}
